import org.gradle.util.GUtil.*

plugins {
    `kotlin-dsl`
}

repositories {
    maven(url = "https://dl.bintray.com/kotlin/kotlinx/")
    jcenter()
}

val parentDir = projectDir.parentFile
private val parentProps = loadProperties(parentDir.resolve(Project.GRADLE_PROPERTIES))

val kotlin_version: String by parentProps
val atomicfu_version: String by parentProps

dependencies {
    implementation(kotlin("gradle-plugin", kotlin_version))
    implementation(kotlin("serialization", kotlin_version))
    implementation("org.jetbrains.kotlinx:atomicfu-gradle-plugin:$atomicfu_version")
}
