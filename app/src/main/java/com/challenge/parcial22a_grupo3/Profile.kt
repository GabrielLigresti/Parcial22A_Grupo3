package com.challenge.parcial22a_grupo3

data class Profile(val name: String) {
    var profileName : String = ""

    init {
        this.profileName = name
    }
}