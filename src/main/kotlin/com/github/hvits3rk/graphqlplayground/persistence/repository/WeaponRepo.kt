package com.github.hvits3rk.graphqlplayground.persistence.repository

import com.github.hvits3rk.graphqlplayground.persistence.entity.Weapon
import org.springframework.data.jpa.repository.JpaRepository

interface WeaponRepo : JpaRepository<Weapon, Long>