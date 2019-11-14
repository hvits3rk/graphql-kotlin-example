package com.github.hvits3rk.graphqlplayground.persistence.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table
@Entity
class Goblin(var name: String = "Goblin", var health: Long = 10L) {
    @Id
    var id: Long? = null
}