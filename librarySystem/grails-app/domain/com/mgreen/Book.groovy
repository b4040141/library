package com.mgreen

class Book {

String bookID //added by me as PK, not in brief
String title
String subject
String author
String isbn
Date dateBorrowed
Date returnDate
Student student
Boolean overdue
Library library //added by me as FK, not in brief

String toString(){
return bookID
}

    static constraints = {

    bookID blank:false, nullable:false //added by me as PK, not in brief
    title blank:false, nullable:false
    subject blank:false, nullable:false
    author blank:false, nullable:false
    isbn blank:false, nullable:false
    dateBorrowed blank:false, nullable:false
    returnDate blank:false, nullable:false    //make it so this can be blank if book not returned yet?
    student blank:false, nullable:false
    overdue blank:false, nullable:false
    library blank:false, nullable:false //added by me as FK, not in brief

    }
}
