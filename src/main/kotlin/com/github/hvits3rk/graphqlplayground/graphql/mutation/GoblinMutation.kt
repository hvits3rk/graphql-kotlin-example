package com.github.hvits3rk.graphqlplayground.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.github.hvits3rk.graphqlplayground.graphql.input.InputCreateGoblin
import com.github.hvits3rk.graphqlplayground.persistence.entity.Goblin
import com.github.hvits3rk.graphqlplayground.persistence.entity.Weapon
import com.github.hvits3rk.graphqlplayground.persistence.entity.WeaponType
import com.github.hvits3rk.graphqlplayground.persistence.repository.GoblinRepo
import com.github.hvits3rk.graphqlplayground.persistence.repository.WeaponRepo
import org.springframework.stereotype.Component

@Component
class GoblinMutation(private val goblinRepo: GoblinRepo,
                     private val weaponRepo: WeaponRepo) : GraphQLMutationResolver {

    fun createGoblin(input: InputCreateGoblin): Goblin? {
        val weapon = if (input.weaponId != null && input.weaponId!! > 0) {
            weaponRepo.findById(input.weaponId!!).orElse(null) ?: return null
        } else {
            Weapon(WeaponType.SWORD, "Basic sword", 1L)
        }
        return goblinRepo.save(Goblin(input.name, weapon, input.health ?: 10L))
    }

}