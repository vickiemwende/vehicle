package com.example.vehicle_breakdownapp

class UsersActivity {
    var name:String = ""
    var email:String = ""
    var password:String = ""
    var confirm:String = ""
    var time_id:String =""

    constructor(name: String, email: String, password: String, confirm: String, time_id: String) {
        this.name = name
        this.email = email
        this.time_id = time_id
        this.password = password
        this.confirm = confirm
    }
    constructor()
}