package com.github.chenmingpengpg.myfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.chenmingpengpg.myfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
