/*package com.example.jracademyproject.onboarding.domain.use_case.content

import com.example.jracademyproject.items.GameItem
import com.example.jracademyproject.onboarding.domain.repository.ContentRepository
import javax.inject.Inject

class UseCase @Inject constructor(private val contentRepository: ContentRepository){

    suspend operator fun invoke():List<GameItem>{
        return contentRepository.getContent().shuffled()
    }
}
*/