from tesseract_for_code import *
import cv2
from  Interface import *
img = cv2.imread(retornaParametros())
saida(tesseract_with_resizing(img, 300, 'eng', 4, 0, '.', 100))

