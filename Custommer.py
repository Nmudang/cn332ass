from Logfile import LoggingFile
from Googlefile import Googlefile

# Publisher
class Customer():

	def __init__(self):
		self.custom = []
		print("create Customer")
		self.log = LoggingFile()
		self.google = Googlefile()

	def add(self,custom_user):
		print("add " +custom_user.getName())
		self.custom.append(custom_user)
		self.log.wirte("add "+custom_user.getName())
		self.google.wirte("add "+custom_user.getName())

	def editCus(self,custom_user):
		content = "edit: from {0} to {1}".format(custom_user.getBeforename(),custom_user.getName())
		print(content)
		self.log.wirte(content)
		self.google.wirte(content)

	def notify(self):
		for i in self.custom:
			i.notify()
		

