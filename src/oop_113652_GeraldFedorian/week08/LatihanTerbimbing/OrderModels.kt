package oop_113652_GeraldFedorian.week08.LatihanTerbimbing

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)