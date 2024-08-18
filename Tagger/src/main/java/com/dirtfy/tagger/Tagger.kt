package com.dirtfy.tagger

interface Tagger {

    val TAG: String
        get() {
            return this::class.simpleName + "." +
                    Thread.currentThread().stackTrace[4].methodName
        }

}