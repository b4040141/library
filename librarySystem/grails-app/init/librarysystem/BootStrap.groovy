package com.mgreen

class BootStrap {

    def init = { servletContext ->


        def BA_History = new Course(title:'BA History',
                         code:'HS473',
                         leader:'Dr Heatherington',
                         department:'D&S',
                         description:'A course on History',
                         studyMode:'Full-Time').save()

        def BSc_Engineering = new Course(title:'BSc Engineering',
                              code:'EN290',
                              leader:'Mr Pickering',
                              department:'ACES',
                              description:'A course on Engineering',
                              studyMode:'Full-Time').save()

        def Adsetts = new Library(nameOfBuilding:'Adsetts',
                      address:'Arundel Gate',
                      openingHours:'24/7',
                      location:'City Centre',
                      studySpaces:'67').save()

        def Collegiate = new Library(nameOfBuilding:'Collegiate',
                         address:'Collegiate Crescent',
                         openingHours:'24/7',
                         location:'Sharrow',
                         studySpaces:'29').save()

        def JSaunders = new Librarian(name:'Jonathan Saunders',
                        email:'jsaunders@gmail.com',
                        office:'20.0.1',
                        username:'jsaunders',
                        password:'Password657',
                        telephone:'0114 239 5619',
                        library:Collegiate).save()

        def CDarcy = new Librarian(name:'Charlotte Darcy',    //no second librarian coming up for some reason?
                     email:'cdarcy@gmail.com',
                     office:'20.0.2',
                     username:'cdarcy',
                     password:'Password369',
                     telephone:'0114 256 2169',
                     library:Adsetts).save()

        def b1234567 = new Student(name:'John Smith',
                       email:'johnsmith@gmail.com',
                       username:'jsmith12',
                       password:'Password123',
                       studentid:'b1234567',
                       course:BSc_Engineering,
                       library:Collegiate).save()

        def b7654321 = new Student(name:'Sarah Chapman',
                       email:'sarahchapman@gmail.com',
                       username:'schapman3',
                       password:'Password67',
                       studentid:'b7654321',
                       course:BA_History,
                       library:Adsetts).save()

        def Great_Expectations = new Book(bookID:'X385723953',
                                 title:'Great Expectations',
                                 subject:'English',
                                 author:'Charles Dickens',
                                 isbn:'9781501075445',
                                 dateBorrowed:new Date('07/03/2017'),
                                 returnDate:new Date('25/05/2017'),
                                 student:b7654321,
                                 overdue:false,
                                 library:Collegiate).save()

        def nineteen_eighty_four = new Book(bookID:'X572857375',
                                   title:'1984',
                                   subject:'Politics',
                                   author:'George Orwell',
                                   isbn:'9780451518651',
                                   dateBorrowed:new Date('06/01/2017'),
                                   returnDate:new Date('08/02/2017'),
                                   student:b1234567,
                                   overdue:true,
                                   library:Collegiate).save()


      def Great_Expectations_b7654321_review = new BookReview(book:Great_Expectations,
                                               dateCreated:new Date('28/03/2017'),
                                               student:b7654321,
                                               review:'Insert review of Great Expectations here').save()

      def nineteen_eighty_four_b1234567_review = new BookReview(book:nineteen_eighty_four,
                                                 dateCreated:new Date('6/04/2017'),
                                                 student:b1234567,
                                                 review:'Insert review of 1984 here').save()



    }
    def destroy = {
    }
}
