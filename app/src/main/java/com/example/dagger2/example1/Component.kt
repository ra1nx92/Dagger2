package com.example.dagger2.example1

import com.example.learningdagger2.example1.Activity
import com.example.learningdagger2.example1.Keyboard
import com.example.learningdagger2.example1.Monitor
import com.example.learningdagger2.example1.Mouse
import dagger.Component
//при использовании модуля, его указываем в аннотации Component
//Компонент - интерфейс который отвечает за создание обьекта зависимости. Пометив интерфейс аннотацией
//@Component дагер сам напишет реализацию этого интерфейса, и под капотом создаст необходимые обьекты
@Component
interface Component {
    fun getKeyboard():Keyboard
    fun getMouse():Mouse
    fun getMonitor():Monitor
    fun inject(activity: Activity)
}