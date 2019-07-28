package com.github.conorburke.magnetar.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")

data class User (
    var password_hash: String,
    var first_name: String?,
    var last_name: String?,
    var email: String?,
    var phone_number: String?,
    var birth_date: Double?,
    var loan_rating: Double?,
    var borrow_rating: Double?
) {
    @Id
    var id: Int = -1
}