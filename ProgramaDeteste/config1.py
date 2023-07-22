import platform 
def retornaarquivo2(texto): 
  with open(texto, "r") as arquivo:
    return str(arquivo.read()).strip()
def retornaarquivo():
    return retornaarquivo2("arquivo.txt")
def retornaarquivos():
   so=platform.system()
   if(so=="Linux"):
      return retornaarquivo2("Linux.txt")
   else:
      return retornaarquivo2("Windows.txt")
             
nome=retornaarquivos()
print(nome)  
