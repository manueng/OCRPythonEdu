from Interface import *
from difflib import SequenceMatcher
import os

"""
def pegaParametros():
   str=retonaParametrosArquivo()
   c=0
   i=0
   j=0
   b=""
   while(j<42):
     while(str[i]!= 'w'): 
        b=b+str[i]
        i=i+1
     print(b)   
     ref=retornaarquivo2(b)  
     j=j+1
     b=""
     i=i+2
     print(ref)
pegaParametros()  
"""

#print(str())
STRING_INDEX_RESPOSTA_BASE = "respostaBase"
STRING_INDEX_RESPOSTA_GERADA = "respostaGerada"
STRING_EXTENSAO_TXT = ".txt"

def retornarPercentualDeIgualdadeCharequenceMatcher(string1,string2):
   return SequenceMatcher(None, string1, string2).ratio()

def retornarPercentualDeIgualdadeFastWerChar(stringRef, stringOut):
   return fastwer.score_sent(stringRef, StringOut, char_level=true)
def retornarPercentualDeIgualdadeFastWerGlobal(stringRef, stringOut):
   return fastwer.score_sent(stringRef, StringOut, char_level=true)
   


def processarPastaEspecificaDict(prog1,caminhoDaPasta):
   i=0
   listaDeArquivosNaPasta = os.listdir(caminhoDaPasta)
   quantidadeDeArquivosNaPasta = len(listaDeArquivosNaPasta)
   listaDePercentuais = []
   while(i<quantidadeDeArquivosNaPasta):
      nomeArquivoRespostaBase = STRING_INDEX_RESPOSTA_BASE + str(i) + STRING_EXTENSAO_TXT
      caminhoTotalArquivoRespostaBase = caminhoDaPasta + "/" + nomeArquivoRespostaBase
      nomeArquivoRespostaGerada = STRING_INDEX_RESPOSTA_GERADA + str(i) + STRING_EXTENSAO_TXT
      caminhoTotalArquivoRespostaGerada = caminhoDaPasta + "/" + nomeArquivoRespostaGerada

      if((nomeArquivoRespostaBase in listaDeArquivosNaPasta) and (nomeArquivoRespostaGerada in listaDeArquivosNaPasta)):
         percentualDeIgualdade = 0.00000
         try:
            conteudoRespostaBase = retornaarquivo2(caminhoTotalArquivoRespostaBase)
            conteudoRespostaGerada = retornaarquivo2(caminhoTotalArquivoRespostaGerada)
            percentualDeIgualdade = prog1(conteudoRespostaBase,conteudoRespostaGerada)
         except:
            print("Caso "+str(i)+" caiu no except")
            percentualDeIgualdade = 0.00000

         dicionario = dict()
         dicionario[i] = percentualDeIgualdade
         listaDePercentuais.append(dicionario)
            
      #print(caminhoTotalArquivoRespostaBase + " --- " + caminhoTotalArquivoRespostaGerada)
      
      i=i+1

   return listaDePercentuais
   
def processarPastaGeral(prog1,caminhoDaPasta):
   i=0
   listaDeArquivosNaPasta = os.listdir(caminhoDaPasta)
   quantidadeDeArquivosNaPasta = len(listaDeArquivosNaPasta)
   listaDePercentuais = []
   conteudoRespostaBaseGeral=""
   conteudoRespostaGeradaGeral=""
   while(i<quantidadeDeArquivosNaPasta):
      nomeArquivoRespostaBase = STRING_INDEX_RESPOSTA_BASE + str(i) + STRING_EXTENSAO_TXT
      caminhoTotalArquivoRespostaBase = caminhoDaPasta + "/" + nomeArquivoRespostaBase
      nomeArquivoRespostaGerada = STRING_INDEX_RESPOSTA_GERADA + str(i) + STRING_EXTENSAO_TXT
      caminhoTotalArquivoRespostaGerada = caminhoDaPasta + "/" + nomeArquivoRespostaGerada
        
      if((nomeArquivoRespostaBase in listaDeArquivosNaPasta) and (nomeArquivoRespostaGerada in listaDeArquivosNaPasta)):
         percentualDeIgualdade = 0.00000
         try:
            conteudoRespostaBaseGeral =conteudoRespostaBaseGeral+retornaarquivo2(caminhoTotalArquivoRespostaBase)+"\n"
            conteudoRespostaGeradaGeral =conteudoRespostaGeradaGeral+retornaarquivo2(caminhoTotalArquivoRespostaGerada)+"\n"
            
         except:
            print("Caso "+str(i)+" caiu no except")
            percentualDeIgualdade = 0.00000   
      #print(caminhoTotalArquivoRespostaBase + " --- " + caminhoTotalArquivoRespostaGerada)
      
      i=i+1
   return prog1(conteudoRespostaBaseGeral,conteudoRespostaGeradaGeral) 
def calculamedia(lista_de_percentuais):
       n=0
       quantidade=0
       for l in lista_de_percentuais:
         for  key  in l.keys():
          n=n+l[key]
          quantidade=quantidade+len(l);
         
       return float(n)/float(quantidade)

def analisaErros(prog1):
    percentual = processarPastaGeral(prog1,"pasta_de_arquivos")
    saida(str(percentual))
    lista_de_percentuais=processarPastaEspecificaDict(prog1,"pasta_de_arquivos")
    print(str(lista_de_percentuais))
   
print("percentual de acertos geral")

saida(analisaErros(retornarPercentualDeIgualdadeCharequenceMatcher))
#analisaErros(retornarPercentualDeIgualdadeFastWerChar)
#analisaErros(retornarPercentualDeIgualdadeFastWerGlobal)



