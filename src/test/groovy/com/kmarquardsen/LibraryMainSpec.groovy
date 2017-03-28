package com.kmarquardsen

import spock.lang.Specification

class LibraryMainSpec extends Specification {

    def "test lib"() {
        expect:
        new LibraryMain("New Library").getMessage() == "Hello, New Library!"
    }

}
