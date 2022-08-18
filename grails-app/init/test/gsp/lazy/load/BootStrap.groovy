package test.gsp.lazy.load

class BootStrap {

    def bookService

    def init = { servletContext ->
        bookService.createData()
    }
    def destroy = {
    }
}
