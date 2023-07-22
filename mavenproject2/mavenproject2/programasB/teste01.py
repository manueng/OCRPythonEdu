from tesseract_for_code import *
import cv2

print("Chamada do Tesseract em Python alterando suas configurações")
print("Resultado:\n")

img = cv2.imread('foto01.png')
print(tesseract_with_config(img, 'eng', 4, 0, '.', 100))