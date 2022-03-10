from dataclasses import asdict
from pickletools import string1
from re import A


nombres = ([])
for i in range(3):
    nombre = input()
    nombres.append(nombre)

print(nombres)

for i in nombres:
    if i[0] == "a":
        nombres.remove(i)

print(nombres)