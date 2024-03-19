import os
import re

def convert_dotuml_to_openxava(input_file, output_dir):
    with open(input_file, 'r') as f:
        dotuml_content = f.read()

    classes = parse_dotuml(dotuml_content)

    # Créer le dossier de sortie s'il n'existe pas
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    for class_name, class_content in classes.items():
        output_file = os.path.join(output_dir, f'{class_name}.java')
        with open(output_file, 'w') as f:
            f.write(class_content)

def parse_dotuml(dotuml_content):
    # Mettre en correspondance les classes dans le contenu du fichier dotuml
    class_pattern = r'class\s+(\w+)\s+\{\s*(.*?)\s*\}'
    classes = re.findall(class_pattern, dotuml_content, re.DOTALL)

    class_dict = {}

    for class_name, attributes_str in classes:
        openxava_code = f'@Entity\n'
        openxava_code += f'public class {class_name} ' + '{\n'

        # Mettre en correspondance les attributs de classe
        attribute_pattern = r'(\w+)\s*:\s*(\w+)'
        attributes = re.findall(attribute_pattern, attributes_str)
        for attribute_name, attribute_type in attributes:
            openxava_code += f'\t@Column\n'
            openxava_code += f'\t{attribute_type} {attribute_name};\n'

        # Mettre en correspondance les méthodes de classe (si présentes)
        method_pattern = r'public\s+(\w+)\s*\([^)]*\)'
        methods = re.findall(method_pattern, attributes_str)
        for method_name in methods:
            openxava_code += f'\tpublic void {method_name}();\n'

        openxava_code += '}\n\n'

        class_dict[class_name] = openxava_code

    return class_dict

# Utilisation :
input_file = r'GENERATEUR_DE_CODE\input.txt'
output_dir = 'GENERATEUR_DE_CODE\output'
convert_dotuml_to_openxava(input_file, output_dir)
