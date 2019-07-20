plugins {
    `kotlin-multiplatform`
    `kotlinx-serialization`
    `kotlinx-atomicfu`
}

group = "com.github.viktorbll"

repositories {
    jcenter()
}

kotlinCompileOpts()

kotlin {
    targets {
        jvm()
        mingwX64("native") {
            binaries {
                executable(buildTypes = setOf(DEBUG))
            }
        }
    }

    sourceSets {
        val commonMain by existing
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common", kotlin_version))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:$kotlinx_serialization_version")
            }
        }
        val jvmMain by existing
        jvmMain {
            dependencies {
                implementation(kotlin("stdlib-jdk8", kotlin_version))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:$kotlinx_serialization_version")
                compileOnly("org.jetbrains.kotlinx:atomicfu:$atomicfu_version")
            }
        }
    }
}

