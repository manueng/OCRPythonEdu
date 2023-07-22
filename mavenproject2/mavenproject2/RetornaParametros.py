import sys

def retornaarquivo2(texto): 
  with open(texto, "r") as arquivo:
    return str(arquivo.read())
def retornaParametros
  param = sys.argv[1:]
  return retornaarquivo2(param[0])
   