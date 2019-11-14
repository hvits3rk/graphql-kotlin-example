package com.github.hvits3rk.graphqlplayground.persistence.repository

import com.github.hvits3rk.graphqlplayground.persistence.entity.Goblin
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GoblinRepo : JpaRepository<Goblin, Long>