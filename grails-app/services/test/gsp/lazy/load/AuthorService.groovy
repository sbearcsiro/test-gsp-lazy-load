package test.gsp.lazy.load

import grails.gorm.transactions.Transactional
import test.gsp.lazy.load.Author

@Transactional
class AuthorService {

    Author find(Long id) {
        return Author.findById(id)
    }
}
