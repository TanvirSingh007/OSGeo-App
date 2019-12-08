package com.example.osgeo

data class PROJECTS(var title: String, var preferance: Int)

//object like as static in java
object ProjectSupplier {

    val projects = listOf(
        PROJECTS("deegree", 0),
        PROJECTS("GDAL/OGR", 1),
        PROJECTS("GeoMoose", 2),
        PROJECTS("GeoNetwork", 3),
        PROJECTS("GeoNode", 4)

    )
}