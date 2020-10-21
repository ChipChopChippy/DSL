package com.github.chipchopchippy.dsl.services

import com.intellij.openapi.project.Project
import com.github.chipchopchippy.dsl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
