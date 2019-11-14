package com.github.hvits3rk.graphqlplayground.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.github.hvits3rk.graphqlplayground.persistence.entity.Goblin
import com.github.hvits3rk.graphqlplayground.persistence.repository.GoblinRepo
import org.springframework.stereotype.Component

@Component
class GoblinMutation(private val goblinRepo: GoblinRepo) : GraphQLMutationResolver {

    fun createGoblin(name: String, health: Long = 10L): Goblin {
        return goblinRepo.save(Goblin(name, health))
    }

}