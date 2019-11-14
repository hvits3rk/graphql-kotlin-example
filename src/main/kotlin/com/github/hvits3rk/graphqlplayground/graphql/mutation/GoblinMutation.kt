package com.github.hvits3rk.graphqlplayground.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.github.hvits3rk.graphqlplayground.persistence.entity.Goblin
import com.github.hvits3rk.graphqlplayground.persistence.repository.GoblinRepo
import com.github.hvits3rk.graphqlplayground.persistence.repository.WeaponRepo
import org.springframework.stereotype.Component

@Component
class GoblinMutation(private val goblinRepo: GoblinRepo,
                     private val weaponRepo: WeaponRepo) : GraphQLMutationResolver {

    fun createGoblin(name: String, weaponId: Long, health: Long = 10L): Goblin? {
        val weapon = weaponRepo.findById(weaponId).orElse(null) ?: return null
        return goblinRepo.save(Goblin(name, weapon, health))
    }

}