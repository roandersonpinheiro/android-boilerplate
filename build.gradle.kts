buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.23.1")
    }
}
plugins {
    id("io.gitlab.arturbosch.detekt") version ("1.23.1")
    id("org.jlleitschuh.gradle.ktlint-idea") version ("11.6.0")
}

subprojects {
    apply("../buildscripts/ktlint.gradle.kts")
    apply("../config/detekt/detekt.gradle.kts")
}

detekt {
    toolVersion = "1.23.1"
    source.setFrom("src/main/java", "src/main/kotlin")
    parallel = false
    config.setFrom("path/to/config.yml")
    buildUponDefaultConfig = false
    allRules = false
    baseline = file("path/to/baseline.xml")
    disableDefaultRuleSets = false
    debug = false
    ignoreFailures = false
    ignoredBuildTypes = listOf("release")
    ignoredFlavors = listOf("production")
    ignoredVariants = listOf("productionRelease")
    basePath = projectDir.absolutePath
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
