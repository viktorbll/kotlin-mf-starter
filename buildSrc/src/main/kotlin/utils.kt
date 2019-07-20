import org.gradle.api.*
import org.gradle.kotlin.dsl.*
import org.gradle.util.GUtil.*
import org.jetbrains.kotlin.gradle.tasks.*
import java.io.*


private val props = loadProperties(File(Project.GRADLE_PROPERTIES))

val kotlin_version: String by props
val kotlin_jvm_target: String by props
val kotlinx_serialization_version: String by props
val atomicfu_version: String by props

fun Project.kotlinCompileOpts() {
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = kotlin_jvm_target
    }
}