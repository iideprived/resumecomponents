package com.iideprived.resumecomponenets.data

import org.jetbrains.compose.web.dom.ContentBuilder
import org.w3c.dom.HTMLDivElement

data class HeaderAndSummary(
    val name: String,
    val title: String,
    val content: ContentBuilder<HTMLDivElement>?
)