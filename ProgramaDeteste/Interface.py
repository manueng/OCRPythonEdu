import sys
import pyperclip as pc 
def retornaarquivo2(texto): 
  with open(texto, "r") as arquivo:
    return str(arquivo.read())
def retornaParametros():
  param = sys.argv[1:]
  return param[0]
def retornaParametrosLista():
  param = sys.argv[1:]
  return param
def saida(texto):
   pc.copy(str(texto))
   print(texto)
def retonaParametrosArquivo():
   return retornaarquivo2(retornaParametros())
def retornaArquivoporParametro():
    retornaarquivo2(retornaparametros)
 
def recebe():
    texto=pc.paste()
    print(texto)

  
