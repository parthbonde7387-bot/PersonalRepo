# Write a program to fill in a letter template given below with name and data

letter = '''
       Dear <|Name|>
       you are selected!
       <|Date|>
       '''

print(letter.replace("<|Name|", "Parth").replace("<|Date|>", "5 NOV 2025"))