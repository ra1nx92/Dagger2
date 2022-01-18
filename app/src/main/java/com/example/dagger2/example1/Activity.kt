package com.example.learningdagger2.example1

import com.example.dagger2.example1.DaggerComponent
import java.security.Key
import javax.inject.Inject

//если для работы какого то класса необходим другой обьект, то этот класс зависит от этого обьекта,
// а обьект является зависимостью данного класса
//Если какому то классу небходимо использовать зависимости, то не нужно создавать эти зависимости
// внутри самого класса
class Activity() {
    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var mouse: Mouse
    @Inject
    lateinit var keyboard: Keyboard
    init {
        DaggerComponent.create().inject(this)
    }
}