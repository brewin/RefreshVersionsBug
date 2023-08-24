// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") apply false
    id("org.jetbrains.kotlin.android") apply false
}

// Workaround for https://github.com/jmfayard/refreshVersions/issues/624
// Does not work as of refreshVersions 0.60.0.
buildscript { dependencies { classpath("com.android.tools.build:gradle:_") } }