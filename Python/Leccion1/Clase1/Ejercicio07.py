# Ejercicio 7: Juego adivina el numero
# Realizar un juego para adivinar un numero. Para ello
# generar un numero aleatorio entre 1-100, y luego ir pidiendo
# numeros indicando "es mayor" o "es menor" segun sea mayor o menor
# con respecto a N. El proceso termina cuandp el usuario acierta
# y alli se debe mostrar el numero de intentos
import random
print("\t,:Juego adivina el numero:,")
aleatorio = random.randint(0,100) #Toma de 0 a 100 literal, generamos un numero aleatorio
contador = 0
while True:
    numero  = int(input("Digite un numero: "))
    contador += 1
    if numero > aleatorio:
        print("\tNo es el numero, digite un numero menor: ")
    elif numero < aleatorio:
        print("\tNo es el numero, digite un numero mayor: ")
    else:
        print(f"FELICIDADES, acabas de adivinar el numero {aleatorio} ")
        break #Rompe el ciclo
print(f"\nnumero de intentos: {contador}")

