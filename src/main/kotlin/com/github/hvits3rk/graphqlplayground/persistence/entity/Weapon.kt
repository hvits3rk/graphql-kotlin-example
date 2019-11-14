package com.github.hvits3rk.graphqlplayground.persistence.entity

import javax.persistence.*

enum class WeaponType {
    SWORD,
    SPEAR
}

@Table
@Entity
class Weapon(@Enumerated(EnumType.STRING)
             var type: WeaponType,

             var name: String,

             var damage: Long = 1) {
    @Id
    @GeneratedValue
    var id: Long? = null
}