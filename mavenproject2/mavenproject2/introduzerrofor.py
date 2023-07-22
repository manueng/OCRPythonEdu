


import random
from  Interface import *

def dividetrocar(trocar,trocado,max,n):
  x=random.sample(range(max),n)

  i1=0 
  n2=n-1
  vet=[]
  soma=0
  resultado2=[]
  for i in range(n2):
     resultado2.append(trocar.split(")",x[i1]))

  for i  in range(n2):
      saida(x[i])
      saida("xxxx")
      saida(resultado2[i])




def  introduzerro(trocar , trocado): 

  i=0
  tamanholista=len(trocado)
  contfor=tamanholista-1
  linha=0
  colunatrocar=0
  colunatrocado=1
  linharesultado=0
  i=0
  resultado=[]
  resultado.append(trocar.replace(trocado[0][colunatrocar],trocado[0][colunatrocado]))
  for  linha in range(0,contfor):
       linha=linha+1       
       linharesultado=linha-1
       resultado.append(resultado[linharesultado].replace(trocado[linha][colunatrocar],trocado[linha][colunatrocado]))     

def retornaarquivo2(texto): 
  with open(texto, "r") as arquivo:
    return str(arquivo.read())

trocar=retornaarquivo2(retornaParametros())
trocado=[[":","\n"],["==","="],["(","["],[")","]"],['"',"'"]]
dividetrocar(trocar,trocado,6,3)

    

    
