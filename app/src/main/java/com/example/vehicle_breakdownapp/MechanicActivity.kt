package com.example.vehicle_breakdownapp

class MechanicActivity {


    var location:String = ""
    var service:String = ""
    var price:String = ""
    var mechanic_id:String = ""

    constructor( location: String, service: String, price: String, mechanic_id: String) {
        this.location =location
        this.service = service
        this.price = price
        this.mechanic_id = mechanic_id
    }

    constructor()
}