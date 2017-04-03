package com.mgreen

class Library {

string name/building
string address
string openingHours
string location
string studySpaces

    static constraints = {

    name/building blank:false, nullable:false
    address blank:false, nullable:false
    openingHours blank:false, nullable:false
    location blank:false, nullable:false
    studySpaces blank:false, nullable:false

    }
}
