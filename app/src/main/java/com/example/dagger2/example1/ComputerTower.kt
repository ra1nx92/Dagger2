package com.example.learningdagger2.example1

import javax.inject.Inject
//здесь реализация при помощи модуля, этот класс имитирует класс на который нельзя навесить аннотацию @Inject
class ComputerTower (
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
    )