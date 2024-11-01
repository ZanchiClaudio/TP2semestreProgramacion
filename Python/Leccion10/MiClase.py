class MiClase:
    # Variable de clase, este atributo dara a cada onjeto el mismo valor
    variable_clase = "Esta es una variable de clase"
    #contexto dinamico
    def __init__(self, varieble_intancia): #La variable de instancia da diferentes valores
        self.variable_instancia = varieble_intancia

    #contexto esatico
    @staticmethod
    def metodo_estatico(): #metodo estatico se asocia a la clase
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls):  # el cls es una referencia a la clase
       print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)

 
print(MiClase.variable_clase)

miClase1 = MiClase('esta es una variable de instancia')
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase('Esta es otra prueba de variable de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_clase)

MiClase.variable_clase2 = 'Valor de variable de clase 2' #si o si le tenemos que dar un valor.
print(MiClase.variable_clase2)
print(miClase1.variable_clase2)

MiClase.metodo_estatico()

MiClase.metodo_clase()
miObjeto1 = MiClase('Variable de instancia')
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()
