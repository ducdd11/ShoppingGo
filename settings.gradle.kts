pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ShoppingGo"
include(":app")
include(":core-network")
include(":core-localstorage")
include(":core-data")
include(":core-model")
include(":core-common")
include(":core-theme")
include(":core-designSystem")
include(":core-navigation")
 
include(":core-common")
include(":core-model")
include(":core-theme")
include(":core-designSystem")
include(":core-data")
include(":core-navigation")