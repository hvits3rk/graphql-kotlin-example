package com.github.hvits3rk.graphqlplayground.graphql.input

import com.github.hvits3rk.graphqlplayground.persistence.entity.WeaponType

data class InputCreateGoblin(var name: String, var weaponId: Long?, var health: Long?)

data class InputCreateWeapon(var name: String, var weaponType: WeaponType, var damage: Long?)