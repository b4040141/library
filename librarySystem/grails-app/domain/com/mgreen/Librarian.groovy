package com.mgreen

class Librarian {

string name
string email
string office
string username
string password
string telephone
string library

    static constraints = {

    name blank:false, nullable:false
    email blank:false, nullable:false, email:true
    office blank:false, nullable:false
    username blank:false, nullable:false, unique:true
    password blank:false, nullable:false
    telephone blank:false, nullable:false
    library blank:false, nullable:false

    }
}
