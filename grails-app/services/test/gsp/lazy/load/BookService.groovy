package test.gsp.lazy.load

import grails.gorm.transactions.Transactional

@Transactional
class BookService {

    def createData() {
        def author = new Author(name: "Some Guy")
        def book1 = new Book(title: "Book 1", isbn: "123412341234")
        def book2 = new Book(title: "Book 2", isbn: "678967896789")
        author.save()
        author.addToBooks(book1)
        author.addToBooks(book2)
        book1.save()
        book2.save()
        author.save()
    }
}
