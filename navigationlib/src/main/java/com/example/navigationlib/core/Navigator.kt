package com.example.navigationlib.core

open class Navigator {

    fun loadIntent(packageName: String, module: String) = ClassRegistry.loadIntent(packageName, module)
}