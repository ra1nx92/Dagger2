package com.example.learningdagger2.example1

import javax.inject.Inject

//иньекция в конструктор с помощью Dagger 2
//есть пустой конструктор, сообщаем дагеру что если какому то компоненту необходима зависимость Monitor,
//необходимо создать его вызвав конструктор (аннотация @Inject constructor())
//здесь реализация при помощи модуля, этот класс имитирует класс на который нельзя навесить аннотацию @Inject
class Monitor @Inject constructor(){
}