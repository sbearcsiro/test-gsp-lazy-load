package test.gsp.lazy.load

class Author {

    String name

    static hasMany = [books: Book]

    static constraints = {
    }
}
