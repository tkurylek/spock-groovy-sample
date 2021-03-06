package com.gmaslowski.spock.sample

import spock.lang.Specification


class GroovyBlocksTest extends Specification {

    def "should explain spock approach to test #1"() {

        expect: "you can write description here"
        Math.max(a, b) == c

        where: "you can write description here"
        a = 1
        b = 2
        c = 2
    }

    def "should explain spock approach to test #2"() {
        setup:
        def a = 1
        def b = 2
        def c = 2

        when:
        def max = Math.max(a, b)

        then:
        max == c
    }
}