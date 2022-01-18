package com.example.learningdagger2.example1

import dagger.Module
import dagger.Provides

@Module
//Модуль позволяет предоставлять реализацию интерфейсов, или экземпляры каких то классов, если на
// них нельзя навесить аннотацию Inject, и необходимо самому создавать экземпляр класса
class ComputerModule {
}