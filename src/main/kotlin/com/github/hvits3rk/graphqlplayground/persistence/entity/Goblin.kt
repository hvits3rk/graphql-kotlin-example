package com.github.hvits3rk.graphqlplayground.persistence.entity

import javax.persistence.*

@Table
@Entity
class Goblin(var name: String = "Goblin",
             @ManyToOne
             var weapon: Weapon,
             var health: Long = 10L) {
    @Id
    @GeneratedValue
    var id: Long? = null
}