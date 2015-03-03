Spaghetti Haxe ADT Generator
============================

## How to build

    ./gradlew install

## How to use

```groovy
buildscript {
    // ...
    repositories {
        mavenLocal()
        mavenCentral()
        // ...
    }
    dependencies {
        // ...
        classpath "com.prezi.spaghetti:spaghetti-haxe-adt-generator:0.1-SNAPSHOT"
    }
}

task generateAdtHeaders(type: com.prezi.spaghetti.gradle.GenerateHeaders) {
    language "haxe-adt"
    outputDirectory "build/spaghetti/generated-headers"
}
```
