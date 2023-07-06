package com.example.vehicle_breakdownapp

class Mechanicservice {
    var location:String = ""
    var service:String = ""
    var id:String = ""

    constructor(location: String, service: String, id: String) {
        this.location = location
        this.service = service
        this.id = id
    }
    constructor()
}