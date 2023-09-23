Android Boilerplate
===================
Hello 👋 I've created an Android project template, written completely in Kotlin. 🙂

The project is setup using:

- Functional tests with [Espresso](https://developer.android.com/training/testing/espresso?hl=pt-br)
- Unit tests with [Mockk](https://mockk.io/), [MockWebserver](https://github.com/square/okhttp/tree/master/mockwebserver) and [Koin-test](https://insert-koin.io/docs/quickstart/android/)
- [Courotines](https://developer.android.com/kotlin/coroutines?hl=pt-br)
- [Retrofit](http://square.github.io/retrofit/) and [OkHttp](https://github.com/square/okhttp)
- [Koin](https://insert-koin.io/docs/quickstart/android/)
- [Ksp](https://developer.android.com/build/migrate-to-ksp)
- [Android Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Room](https://developer.android.com/jetpack/androidx/releases/room)


## Requirements
------------

 - Kotin: 1.9.10
 - Compile SDK: 34
 - MinSDK: 33
 - TargetSDK: 34
 - Gradle JDK: 17.0.6
 - Gradle Version: 8.0.2

## Features

- ** Kotlin-only template**.
- ** Gradle Kotlin DSL setup**.
- KSP [Kotlin Symbol Processing](https://developer.android.com/build/migrate-to-ksp)
- Kotlin Static Analysis using [`ktlint`](https://github.com/pinterest/ktlint) & [`detekt`](https://github.com/detekt/detekt).
- CI setup with GitHub Actions.

## Building
--------

To build, install and run a debug version, run this from the root of the project:

    ./gradlew assembleDebug

Testing
--------

To run **unit** tests on your machine:

    ./gradlew testDebugUnitTest
    
    
## Static Analysis
-------------------
This template is using [**ktlint**](https://github.com/pinterest/ktlint) with the [ktlint-gradle](https://github.com/jlleitschuh/ktlint-gradle) plugin to format your code. To reformat all the source code as well as the buildscript you can run the `ktlintFormat` gradle task.

Run `./gradlew ktlintCheck` to check if the there are any lint issues.

Run `./gradlew ktlintFormat` to format the code across the project.

This template is using [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with the configuration that is stored in the [config.yml](.detekt/config.yml) file (the file has been generated with the `detektGenerateConfig` task).

Run `./gradlew detekt` to analyze the code.
