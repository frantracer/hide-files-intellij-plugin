package com.github.frantracer.hidefilesintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.frantracer.hidefilesintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
