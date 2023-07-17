package com.codespacepro.lazycolomn.repository

import com.codespacepro.lazycolomn.model.Contact

class ContactRepository {

    fun getAllContacts(): List<Contact> {
        return listOf(
            Contact(
                id = 0,
                firstName = "Khubaib",
                lastName = "Khan",
                phoneNo = +923047373533
            ),
            Contact(
                id = 0,
                firstName = "Umair",
                lastName = "Khan",
                phoneNo = +923014210047
            ),
            Contact(
                id = 0,
                firstName = "Zain",
                lastName = "Khan",
                phoneNo = +923023406308
            ),
            Contact(
                id = 0,
                firstName = "Zohaib",
                lastName = "Khan",
                phoneNo = +923019610206
            ),
            Contact(
                id = 0,
                firstName = "Zaibe",
                lastName = "Dev",
                phoneNo = +923000000000
            ),
            Contact(
                id = 0,
                firstName = "Android",
                lastName = "Dev",
                phoneNo = +923011111111
            ),
            Contact(
                id = 0,
                firstName = "Jetpack",
                lastName = "Compose",
                phoneNo = +923022222222
            ),
            Contact(
                id = 0,
                firstName = "Clean",
                lastName = "Dev",
                phoneNo = +923044444444
            ),
            Contact(
                id = 0,
                firstName = "Developer",
                lastName = "Android",
                phoneNo = +923055555555
            ),
            Contact(
                id = 0,
                firstName = "Web",
                lastName = "Dev",
                phoneNo = +923045555555
            ),
            Contact(
                id = 0,
                firstName = "Java",
                lastName = "Script",
                phoneNo = +92307777777
            ),
            Contact(
                id = 0,
                firstName = "Web",
                lastName = "3.0",
                phoneNo = +92308888888
            ),
            Contact(
                id = 0,
                firstName = "Activity",
                lastName = "Clean",
                phoneNo = +923099999999
            ),
            Contact(
                id = 0,
                firstName = "Developer",
                lastName = "Clone",
                phoneNo = +923012345678
            ),
            Contact(
                id = 0,
                firstName = "Mac",
                lastName = "Book",
                phoneNo = +923098765432
            )
        )
    }

}