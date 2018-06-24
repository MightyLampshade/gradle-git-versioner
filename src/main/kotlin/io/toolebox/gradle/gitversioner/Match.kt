package io.toolebox.gradle.gitversioner

import org.gradle.api.Action

class Match(action: Action<Match>) {

    var major = "\\[major\\]"
    var minor = "\\[minor\\]"
    var patch = "\\[patch\\]"

    init {
        action.execute(this)
    }
}