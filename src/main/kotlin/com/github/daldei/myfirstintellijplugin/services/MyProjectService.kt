package com.github.daldei.myfirstintellijplugin.services

import com.github.daldei.myfirstintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
