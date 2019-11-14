package com.github.hvits3rk.graphqlplayground.graphql.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.github.hvits3rk.graphqlplayground.persistence.entity.Goblin
import com.github.hvits3rk.graphqlplayground.persistence.repository.GoblinRepo
import org.springframework.stereotype.Component

@Component
class GoblinQuery(private val goblinRepo: GoblinRepo) : GraphQLQueryResolver {

    fun goblin(id: Long) : Goblin? {
        return goblinRepo.findById(id).orElse(null)
    }

}