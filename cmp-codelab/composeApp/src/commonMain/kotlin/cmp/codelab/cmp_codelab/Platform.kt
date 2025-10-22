package cmp.codelab.cmp_codelab

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform