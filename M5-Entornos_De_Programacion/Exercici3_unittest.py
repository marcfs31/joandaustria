import unittest
import Exercici3

class main(unittest.TestCase):
	def test_capitalize1(self):
		#cas 1:
		self.assertEqual(Exercici3.capitalize("marc fors"),"Marc Fors")
	def test_capitalize2(self):
		#cas 2:
		self.assertNotEqual(Exercici3.capitalize("marc fors"),"marc fors")

unittest.main()
