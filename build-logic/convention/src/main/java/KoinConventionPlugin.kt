import com.android.build.gradle.api.AndroidBasePlugin
import com.ideatecnologia.simuladospmmg.buildlogic.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class KoinConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("io.insert-koin")

            dependencies {
                add("implementation", libs.findLibrary("koin.core").get())
                add("implementation", libs.findLibrary("koin.android").get())
                add("implementation", libs.findLibrary("koin.compose").get())
            }

            /** Add support for Android modules, based on [AndroidBasePlugin] */
            pluginManager.withPlugin("com.android.base") {
                dependencies {
                    add("implementation", libs.findLibrary("koin.androidx").get())
                }
            }
        }
    }
}