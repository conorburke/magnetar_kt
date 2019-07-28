package com.github.conorburke.magnetar.repository

import com.github.conorburke.magnetar.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Int>