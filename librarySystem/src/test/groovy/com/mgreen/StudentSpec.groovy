package com.mgreen

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }
/*
    void toString() {

        when: "A Student has username, name and email"

        def student1 = new Student (name: 'John Smith',                //define instance of class here
                                    email: 'johnsmith@gmail.com',
                                    username: 'jsmith12',
                                    password: 'Password123',
                                    studentid: 'b1234567',
                                    course: 'BSc Engineering',
                                    library: 'Collegiate').save()

        then: "The toString method will merge them."

        student1.toString()=='jsmith12,John Smith,johnsmith@gmail.com'     //line 32 - calls toString method for instance of class
*/
        expect:"fix me"
            true == false
    }
}
