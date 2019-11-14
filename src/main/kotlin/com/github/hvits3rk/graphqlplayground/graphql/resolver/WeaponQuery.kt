package com.github.hvits3rk.graphqlplayground.graphql.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.github.hvits3rk.graphqlplayground.graphql.input.InputQueryWeapon
import com.github.hvits3rk.graphqlplayground.persistence.entity.Weapon
import com.github.hvits3rk.graphqlplayground.persistence.repository.WeaponRepo
import org.springframework.stereotype.Component

@Component
class WeaponQuery(private val weaponRepo: WeaponRepo) : GraphQLQueryResolver {

    fun weapon(input: InputQueryWeapon): Weapon? {
        return weaponRepo.findById(input.id).orElse(null)
    }

}