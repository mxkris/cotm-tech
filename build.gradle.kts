import voodoo.util.unixPath
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("voodoo") version "0.5.0-SNAPSHOT"
//    kotlin("jvm") version "1.3.70"
}

voodoo {
    addTask(name = "build") {
            build()
    }
    addTask(name = "build_mmc_test"){
        build()
        test().multimc()
    }
    addTask(name = "pack_sk") {
        pack().sklauncher()
    }
    addTask(name = "pack_mmc") {
        pack().multimcSk()
    }
    addTask(name = "pack_mmc-fat") {
        pack().multimcFat()
    }
    addTask(name = "pack_server") {
        pack().server()
    }
    addTask(name = "pack_curse") {
        pack().curse()
    }
    addTask(name = "test_mmc") {
        test().multimc()
    }
    addTask(name = "pack_all") {
        pack().sklauncher()
        pack().server()
        pack().multimcSk()
    }

    generateForge("Forge", "1.12.2", "1.12.1", "1.12")
    generateCurseforgeMods("Mod", "1.12.2", "1.12.1", "1.12")
    generateCurseforgeTexturepacks("TexturePack", "1.12.2", "1.12.1", "1.12")

}

tasks.create("syncConfigs") {
    group = "cotm"
    doFirst {
        val testInstance = File("C:\\Users\\chris\\Documents\\MultiMC\\instances\\voodoo_test_cotm\\.minecraft")
     // val testInstance = File("/home/nikky/.local/share/multimc/instances/cotm/.minecraft/")
        val configFolder = testInstance.resolve("config")

        val sourceFolder = configFolder
        val targetFolder = project.file("cotm").resolve("config")
        sourceFolder.walkTopDown().forEach { file ->
            val relativeLocation = file.relativeTo(sourceFolder)
            val targetLocation = targetFolder.resolve(relativeLocation)
            if(targetLocation.exists()) {
                if(targetLocation.isFile && targetLocation.readText() != file.readText()) {
                    logger.lifecycle("updating $relativeLocation")
//                     targetLocation.writeText(file.readText())
                }
            }
        }
    }
}

tasks.create("listConfigs") {
    group = "cotm"
    doFirst {
        val sourceFolder = project.file("cotm").resolve("config")
        val paths = sourceFolder.walkTopDown().filter {
            it.isFile && !it.toPath().contains(File("_SERVER").toPath())
        }.map { file ->
            "\"" + file.relativeTo(sourceFolder).path.replace("\\", "/") + "\""
        }
        val result = paths.joinToString(",\n")
        logger.lifecycle("config paths: \n $result")
    }
}
//val compileKotlin: KotlinCompile by tasks
//compileKotlin.kotlinOptions {
//    jvmTarget = "1.8"
//}
//val compileTestKotlin: KotlinCompile by tasks
//compileTestKotlin.kotlinOptions {
//    jvmTarget = "1.8"
//}