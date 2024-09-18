package com.translator.translate.domain.translate

import com.translator.core.domain.language.Language

interface TranslateClient {
    suspend fun translate (
        fromLanguage: com.translator.core.domain.language.Language,
        fromText: String,
        toLanguage: com.translator.core.domain.language.Language
    ): String
}