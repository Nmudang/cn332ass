import abc
from Custommer import Customer

# interface Customer
class ICustom(abc.ABC):

	@abc.abstractmethod
	def notifytoCus(self):
		pass
	@abc.abstractmethod	
	def getName(self):
		pass

	@abc.abstractmethod	
	def editName(self):
		pass

	@abc.abstractmethod	
	def getBeforename(self):
		pass

	@abc.abstractmethod	
	def notify(self):
		pass

""" customer tpye 1"""
class Business(ICustom):

	def __init__(self,name_user):
		self.beforename = name_user
		self.name = name_user
		print("create Customer type Business " + self.name)

	def notifytoCus(self):
		print("Hello (Business) ,"+ self.name )

	def getName(self):
		return self.name


	def editName(self,edit_name,customer):
		self.beforename = self.name
		self.name = edit_name
		customer.editCus(self)

	def getBeforename(self):
		return self.beforename

	def notify(self):
		print("from app to "+ self.name)


""" customer tpye 2"""
class Other(ICustom):
	def __init__(self,name_user):
		self.beforename = name_user
		self.name = name_user
		print("create Customer type Other " + self.name)

	def notifytoCus(self):
		print("Hello (Other) ,"+ self.name )

	def getName(self):
		return self.name


	def editName(self,edit_name,customer):
		self.beforename = self.name
		self.name = edit_name
		customer.editCus(self)

	def getBeforename(self):
		return self.beforename

	def notify(self):
		print("from app to "+ self.name)
