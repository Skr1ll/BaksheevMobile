pluginManagement {
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

rootProject.name = "ru.mirea.Baksheev.Lesson2"
include(":app")
include(":activitylifistyle")
include(":myapplication")
include(":multiactivity")
include(":intentfilter")
include(":toastapp")
include(":notificationapp")
include(":dialog")
