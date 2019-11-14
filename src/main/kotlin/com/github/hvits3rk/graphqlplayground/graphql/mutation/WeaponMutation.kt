package com.github.hvits3rk.graphqlplayground.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.github.hvits3rk.graphqlplayground.graphql.input.InputCreateWeapon
import com.github.hvits3rk.graphqlplayground.persistence.entity.Weapon
import com.github.hvits3rk.graphqlplayground.persistence.repository.WeaponRepo
import org.springframework.stereotype.Component

@Component
class WeaponMutation(private val weaponRepo: WeaponRepo) : GraphQLMutationResolver {

    fun createWeapon(input: InputCreateWeapon): Weapon {
        return weaponRepo.save(Weapon(input.weaponType, input.name, input.damage ?: 1L))
    }

}