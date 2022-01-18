package com.example.learningdagger2.example1

import javax.inject.Inject
//иньекция в конструктор с помощью Dagger 2
//есть пустой конструктор, сообщаем дагеру что если какому то компоненту необходима зависимость Computer,
//необходимо создать его вызвав конструктор (аннотация @Inject constructor() у обьектов в
// конструкторе так же необоходимо сделать аннотацию @Inject constructor() )
//здесь реализация при помощи модуля, этот класс имитирует класс на который нельзя навесить аннотацию @Inject

class Computer (
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
) {
}