import pytesseract
import cv2
caminho= "C:\Users\Emanuel\AppData\Local\Packages\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\LocalCache\local-packages\Python311\site-packages\pytesseract\pytesseract.py"

whitelist = '''0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM\\'\\"	 -.:()<>[]{}*/+-_,='''

def tesseract_with_config(img, lang, psm, oem, tessdata_dir, dpi):
	tess_cfg = '''--psm %d --oem %d --tessdata-dir "%s" --dpi %d -c tessedit_char_whitelist="%s"''' % (psm, oem, tessdata_dir, dpi, whitelist)
	return pytesseract.image_to_string(img, lang=lang, config=tess_cfg)

def tesseract_with_resizing(img, scale_percent, lang, psm, oem, tessdata_dir, dpi):
	width = int(img.shape[1] * scale_percent / 100)
	height = int(img.shape[0] * scale_percent / 100)
	dim = (width, height)
	resized_img = cv2.resize(img, dim, interpolation = cv2.INTER_LANCZOS4)
	return tesseract_with_config(resized_img, 'eng', 4, 0, '.', 100)
