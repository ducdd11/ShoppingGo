package com.example.shoppinggo

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

internal fun Project.configBuildType(commonExtension: CommonExtension<*,*,*,*>) {
    commonExtension.apply {
        signingConfigs {

        }
        buildTypes {
            getByName("debug") {
                isMinifyEnabled = true
            }
            getByName("release") {
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
    }
}