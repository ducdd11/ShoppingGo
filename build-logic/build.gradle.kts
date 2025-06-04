plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("ShoppingGoApplicationConventionPlugin") {
            id = "shopping-go-android-application"
            implementationClass = "ShoppingGoApplicationConventionPlugin"
        }
        register("ShoppingGoLibraryConventionPlugin") {
            id = "shopping-go-android-library"
            implementationClass = "ShoppingGoLibraryConventionPlugin"
        }
        register("ShoppingGoHiltConventionPlugin") {
            id = "shopping-go-hilt"
            implementationClass = "ShoppingGoHiltConventionPlugin"
        }
    }
}