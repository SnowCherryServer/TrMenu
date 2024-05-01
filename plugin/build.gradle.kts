taboolib {
    description {
        name(rootProject.name)
        desc("Modern & Advanced Menu-Plugin for Minecraft Servers")
        contributors {
            name("Arasple")
            name("Score2")
            name("lilingfeng")
            name("Dreeam-qwq")
            name("FxRayHughes")
            name("TheFloodDragon")
        }
        dependencies {
            name("PlaceholderAPI").with("bukkit").optional(true)
            name("Zaphkiel").with("bukkit").optional(true)
            name("Skulls").with("bukkit").optional(true)
            name("Vault").with("bukkit").optional(true)
            name("PlayerPoints").with("bukkit").optional(true)
            name("HeadDatabase").with("bukkit").optional(true)
            name("Oraxen").with("bukkit").optional(true)
            name("SkinsRestorer").with("bukkit").optional(true)
            name("ItemsAdder").with("bukkit").optional(true)
            name("floodgate").with("bukkit").optional(true)
            name("FastScript").with("bukkit").optional(true)
            name("Triton").with("bukkit").optional(true)
        }
    }
    relocate("trplugins.menu", group.toString().lowercase())

}

repositories {
    mavenCentral()
    maven("https://repo.tabooproject.org/repository/releases")
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven("https://repo.codemc.org/repository/maven-public")
    maven("https://repo.rosewooddev.io/repository/public/")
    maven("https://repo.opencollab.dev/main/")
    maven("https://repo.oraxen.com/releases")
    maven("https://jitpack.io")
}

dependencies {
    taboo(project(":common"))
    taboo(project(":api:receptacle"))
    taboo(project(":api:action"))

    // Libraries
    compileOnly("org.apache.commons:commons-lang3:3.14.0")

    // Server Core
    compileOnly("ink.ptms.core:v12002:12002-minimize:mapped")
    compileOnly("ink.ptms.core:v12002:12002-minimize:universal")
    compileOnly("ink.ptms.core:v11904:11904-minimize:mapped")
    compileOnly("ink.ptms.core:v11904:11904-minimize:universal")
    compileOnly("ink.ptms.core:v11701:11701-minimize:mapped")
    compileOnly("ink.ptms.core:v11701:11701-minimize:universal")
    compileOnly("ink.ptms.core:v11605:11605")

    // Hook Plugins
    compileOnly("me.clip:placeholderapi:2.11.5") { isTransitive = false }
    compileOnly("ink.ptms:Zaphkiel:2.0.14") { isTransitive = false }
    compileOnly("ca.tweetzy:skulls:3.10.0") { isTransitive = false }
    compileOnly("com.github.MilkBowl:VaultAPI:8bad2c479f") { isTransitive = false }
    compileOnly("org.black_ixx:playerpoints:3.2.6") { isTransitive = false }
    compileOnly("com.arcaniax:HeadDatabase-API:1.3.2") { isTransitive = false }
    compileOnly("io.th0rgal:oraxen:1.165.0") { isTransitive = false }
    compileOnly("net.skinsrestorer:skinsrestorer-api:15.0.0") { isTransitive = false }
    compileOnly("com.github.LoneDev6:api-itemsadder:3.6.1") { isTransitive = false }
    compileOnly("org.geysermc.floodgate:api:2.2.3-SNAPSHOT") { isTransitive = false }
    compileOnly("com.github.tritonmc.Triton:core:v3.9.5") { isTransitive = false }
    compileOnly("com.github.tritonmc.Triton:api:v3.9.5") { isTransitive = false }
    compileOnly("de.tr7zw:item-nbt-api-plugin:2.12.2") { isTransitive = false }
    compileOnly("com.github.FrancoBM12:API-MagicCosmetics:2.2.7") { isTransitive = false }

    compileOnly(fileTree("libs"))
}