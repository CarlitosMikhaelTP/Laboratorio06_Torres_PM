package com.minombre.ejemploslayout

import java.io.Serializable

data class Pelicula (
    var idImagen: Int,
    var titulo: String,
    var director: String,
    var genero: String,
    var calificacion: Double,
    var duracion: Int,
    var fecha: String,
    var sinopsis: String
) : Serializable
