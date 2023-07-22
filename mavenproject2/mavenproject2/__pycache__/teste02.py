from tesseract_for_code import *
import cv2

print("Chamada do Tesseract em Python alterando a DPI")
print("Resultado:\n")

img = cv2.imread('foto01.png')
for dpi in range(100,1100,100):
	s = "| DPI = %d |" % dpi
	print("-"*len(s))
	print(s)
	print("-"*len(s))
	print(tesseract_with_config(img, 'eng', 4, 0, '.', dpi))
