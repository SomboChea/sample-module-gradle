### Sample Module Gradle

[![](https://jitpack.io/v/com.cubetiqs.git.CUBETIQ/sample-module-gradle.svg)](https://jitpack.io/#com.cubetiqs.git.CUBETIQ/sample-module-gradle)

### Gradle
<b>Step 1</b>. Add the JitPack repository to your build file.
```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
<b>Step 2</b>. Add the dependency.
```groovy
dependencies {
    implementation 'com.cubetiqs.git.CUBETIQ:sample-module-gradle:0.0.1-SNAPSHOT'
}
```