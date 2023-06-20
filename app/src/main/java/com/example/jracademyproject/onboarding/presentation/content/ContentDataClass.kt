package com.example.jracademyproject.onboarding.presentation.content

data class ContentDataClass(val id: String, val title: String, val description: String)

val contentList = listOf(
    ContentDataClass("1", "Başlık 1", "Açıklama 1"),
    ContentDataClass("2", "Başlık 2", "Açıklama 2"),
    // Diğer içerikler...
)

fun getContentById(id: String): ContentDataClass? {
    return contentList.find { it.id == id }
}

