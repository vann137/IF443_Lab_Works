package oop_00000119085_IvanMichaelLawrenceSanjaya.week08

class City(val name: String)
class Adress(val city: City?)
class DeliveryDetails(val address: Adress?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)