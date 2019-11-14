package com.github.hvits3rk.graphqlplayground.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.github.hvits3rk.graphqlplayground.persistence.entity.Weapon
import com.github.hvits3rk.graphqlplayground.persistence.entity.WeaponType
import com.github.hvits3rk.graphqlplayground.persistence.repository.WeaponRepo
import org.springframework.stereotype.Component

@Component
class WeaponMutation(private val weaponRepo: WeaponRepo) : GraphQLMutationResolver {

    fun createWeapon(type: WeaponType, name: String, damage: Long = 1L): Weapon {
        return weaponRepo.save(Weapon(type, name, damage))
    }

}