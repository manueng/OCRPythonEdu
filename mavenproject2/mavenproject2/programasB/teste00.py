import pytesseract
import cv2

print("Chamada simples do Tesseract em Python")
print("Resultado:\n")

pytesseract.pytesseract.tesseract_cmd = "C://Program Files//Tesseract-OCR//tesseract.exe"

img = cv2.imread('foto01.png')
print(pytesseract.image_to_string(img))