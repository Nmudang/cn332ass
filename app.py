from Custommer import Customer
from ICustom import Business,Other


if __name__ == '__main__':
	customer = Customer()
	bus = Business("Business 1")
	oth = Other("Other 1")
	customer.add(bus)
	customer.add(oth)
	bus.editName("Businessman 2",customer)
	oth.editName("Other Boy",customer)
	customer.notify()


