def retornaArquivo2(nomeArquivo): 
  with open(nomeArquivo, "r") as arquivo:
    return str(arquivo.read())
def printarLista(lista):
    for l in lista:
       print(l) 
def recebelista(nomeArquivo,numeroDeCasos):
     lista=retornaArquivo2(nomeArquivo)
     caso=[]
     lista3=lista.split(":")
     
     i=0
     listaValor=[]
     while(i<numeroDeCasos+2):
        iDivide=i+1 
        lista2=lista3[iDivide].split("\n") 
        listaValor.append(float(lista2[0]))      
        i=i+1
     return listaValor
def recebeLista2(nomeArquivo,numeroDeCasos):
     lista=retornaArquivo2(nomeArquivo)
     caso=[]
     lista3=lista.split(":")
     
     i=0
     listaValor=[]
     while(i<numeroDeCasos+2):
        iDivide=i 
        lista2=lista3[iDivide].split("\n") 
        listaValor.append(float(lista2[0]))      
        i=i+1
     return listaValor
def listaEquitativa(numeroDeCasos):
   i=0
   n=1
   while(i<numeroDeCasos):
      listaQuantidades.append(n)
      i=i+1   
def retornaResultado(prog1,listaValores,listaQuantidades):
   i=0
   soma=0.00000
   while(i<numeroDeCasos):
       soma=soma+prog1(listaValores[i],listaQuantidades[i])
       i=i+1
   return soma 
def media(l,listaQuantidades):
    return l*listaQuantidades
numeroDeCasos=20
listaValores=recebelista("tempoderespostatxt.txt",numeroDeCasos)
listaQuantidades=recebeLista2("listaQuantidades.txt",numeroDeCasos)
soma=0.000000
soma=retornaResultado(media,listaValores,listaQuantidades)
media=soma/numeroDeCasos
print(media)
 
