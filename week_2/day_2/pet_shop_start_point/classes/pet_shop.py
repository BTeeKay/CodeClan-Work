class PetShop:

    def __init__(self, name, pets, cash):
        self.name = name
        self.pets = pets
        self.total_cash = cash
        self.pets_sold = 0
    
    def stock_count(self):
        return len(self.pets)
    
    def increase_pets_sold(self):
        self.pets_sold += 1
    
    def increase_total_cash(self, cash):
        self.total_cash += cash

    def remove_pet(self, animal):
        self.pets.remove(animal)

    def find_pet_by_name(self, name):
        for pet in self.pets:
            if pet.name == name:
                return pet
    
    def sell_pet_to_customer(self, pet_name, customer):
        pet = self.find_pet_by_name(pet_name)
        if pet != None:
            customer.reduce_cash(pet.price)
            self.increase_total_cash(pet.price)
            self.increase_pets_sold()
            self.remove_pet(pet)
            customer.add_pet(pet)