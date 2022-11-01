package com.ervalsa.jetheroes.data

import com.ervalsa.jetheroes.model.Hero
import com.ervalsa.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}