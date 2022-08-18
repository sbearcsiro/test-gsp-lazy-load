package test.gsp.lazy.load

class BookTagLib {

    static namespace = "book"

    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def books = { attrs, body ->
        Author author = attrs.remove('author')
        log.error("books for {}: {}", author.name, author.books.collect{ "${it.title}:${it.isbn}"})
    }
}
