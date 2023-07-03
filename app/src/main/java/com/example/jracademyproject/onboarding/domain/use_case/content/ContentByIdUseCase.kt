/*package com.example.jracademyproject.onboarding.domain.use_case.content

import com.example.jracademyproject.items.SpecificGameItem
import com.example.jracademyproject.onboarding.domain.repository.ContentRepository
import javax.inject.Inject

class ContentByIdUseCase @Inject constructor(private val contentRepository: ContentRepository) {
    suspend operator fun invoke(id:Int): SpecificGameItem
    {
        return contentRepository.getContentById(id)
    }
}*/