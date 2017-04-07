package com.mgreen

class Student {

String name
String email
String username
String password
String studentid
Course course
Library library //suggested FK by me, not in brief


String toString(){
return studentid
}

/*
String toString(){ //unit test to merge username, name and email via concatenation

    return username + name + email

}
*/

    static constraints = {

    name blank:false, nullable:false
    email blank:false, nullable:false, email:true
    username blank:false, nullable:false, username:true
    password blank:false, nullable:false, password:true
    studentid blank:false, nullable:false, unique:true
    course blank:false, nullable:false
    library blank:false, nullable:false //added as FK by me, not in brief

    }
}
