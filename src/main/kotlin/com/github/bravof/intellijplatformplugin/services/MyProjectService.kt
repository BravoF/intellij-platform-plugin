package com.github.bravof.intellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.bravof.intellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
