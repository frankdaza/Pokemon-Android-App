package com.frankdaza.pokemon.model

/**
 * Created by Frank Edward Daza González on 2/18/18.
 */
class Pokemon {

    var name: String = ""
    var description: String = ""
    var image: Int = 0
    var power: Double = 0.0
    var latitude: Double = 0.0
    var longitude: Double = 0.0
    var isCatch: Boolean = false

    constructor(name: String, image: Int, description: String, power: Double, latitude: Double, longitude: Double) {
        this.name = name
        this.image = image
        this.description = description
        this.power = power
        this.latitude = latitude
        this.longitude = longitude
        this.isCatch = false
    }

}
