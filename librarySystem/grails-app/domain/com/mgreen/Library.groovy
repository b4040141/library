package com.mgreen

class Library {

String nameOfBuilding
String address
String openingHours
String location
String studySpaces

    static constraints = {

    nameOfBuilding blank:false, nullable:false
    address blank:false, nullable:false
    openingHours blank:false, nullable:false
    location blank:false, nullable:false
    studySpaces blank:false, nullable:false

    }
}
