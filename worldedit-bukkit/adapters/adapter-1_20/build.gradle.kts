import io.papermc.paperweight.userdev.PaperweightUserDependenciesExtension

plugins {
    java
}

applyPaperweightAdapterConfiguration()

repositories {
    gradlePluginPortal()
}

dependencies {
    // https://repo.papermc.io/service/rest/repository/browse/maven-public/io/papermc/paper/dev-bundle/
    the<PaperweightUserDependenciesExtension>().paperDevBundle("1.20.1-R0.1-20230617.023453-15")
    compileOnly("io.papermc:paperlib")
}
