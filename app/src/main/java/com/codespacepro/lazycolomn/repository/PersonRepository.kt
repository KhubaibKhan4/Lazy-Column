package com.codespacepro.lazycolomn.repository

import com.codespacepro.lazycolomn.model.Person

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 0,
                firstName = "A",
                lastName = "B",
                age = 10
            ),
            Person(
                id = 1,
                firstName = "C",
                lastName = "D",
                age = 11
            ),
            Person(
                id = 2,
                firstName = "E",
                lastName = "F",
                age = 12
            ),
            Person(
                id = 3,
                firstName = "G",
                lastName = "H",
                age = 13
            ),
            Person(
                id = 4,
                firstName = "I",
                lastName = "J",
                age = 14
            ),
            Person(
                id = 5,
                firstName = "K",
                lastName = "L",
                age = 15
            ),
            Person(
                id = 6,
                firstName = "M",
                lastName = "N",
                age = 16
            ),
            Person(
                id = 7,
                firstName = "O",
                lastName = "P",
                age = 15
            ),
            Person(
                id = 8,
                firstName = "Q",
                lastName = "R",
                age = 16
            ),
            Person(
                id = 9,
                firstName = "S",
                lastName = "T",
                age = 17
            ),
            Person(
                id = 10,
                firstName = "U",
                lastName = "V",
                age = 18
            ),
            Person(
                id = 11,
                firstName = "W",
                lastName = "X",
                age = 19
            ),
            Person(
                id = 12,
                firstName = "Y",
                lastName = "Z",
                age = 20
            ),

            )
    }
}