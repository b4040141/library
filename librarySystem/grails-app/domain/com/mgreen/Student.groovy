package com.mgreen

class Student {

String name
String email
String username
String password
String studentid
String course

    static constraints = {

    name blank:false, nullable:false
    email blank:false, nullable:false, email:true
    username blank:false, nullable:false
    password blank:false, nullable:false
    studentid blank:false, nullable:false, unique:true
    course blank:false, nullable:false

    }
}
