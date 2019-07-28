package com.github.conorburke.magnetar.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.github.conorburke.magnetar.entity.User
import com.github.conorburke.magnetar.repository.UserRepository
import org.springframework.stereotype.Component

@Component
class UserQueryResolver(val userRepository: UserRepository) : GraphQLQueryResolver {
    fun users(): List<User> {
        return userRepository.findAll()
    }
}