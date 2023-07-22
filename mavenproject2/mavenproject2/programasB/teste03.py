from tesseract_for_code import *
import cv2

print("Chamada do Tesseract em Python aumentando a resolução da imagem de entrada")
print("Resultado:\n")

img = cv2.imread('foto01.png')
for scale_percent in range(100,450,50):
	s = "| RESIZE = %d%% |" % scale_percent
	print("-"*len(s))
	print(s)
	print("-"*len(s))
	print(tesseract_with_resizing(img, scale_percent, 'eng', 4, 0, '.', 100))
