import com.android.build.gradle.LibraryExtension
import com.example.shoppinggo.configBuildType
import com.example.shoppinggo.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class ShoppingGoLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }
            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
                configBuildType(this)
                buildFeatures {
                    buildConfig = true
                }
            }
        }
    }
}