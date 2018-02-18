package com.frankdaza.pokemon.model

import android.location.Location

/**
 * Created by Frank Edward Daza González on 2/18/18.
 */
class Pokemon {

    var name: String
    var description: String
    var image: Int
    var power: Double
    var location: Location
    var isCatch: Boolean

    constructor(name: String, image: Int, description: String, power: Double, latitude: Double, longitude: Double) {
        this.name = name
        this.image = image
        this.description = description
        this.power = power
        this.location = Location(this.name)
        this.location.latitude = latitude
        this.location.longitude = longitude
        this.isCatch = false
    }

}
