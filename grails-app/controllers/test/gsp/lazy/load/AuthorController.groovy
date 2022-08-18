package test.gsp.lazy.load

class AuthorController {

    def authorService

    def index() { }

    def show() {
        def author = authorService.find(params.long('id'))
        respond author
    }
}
