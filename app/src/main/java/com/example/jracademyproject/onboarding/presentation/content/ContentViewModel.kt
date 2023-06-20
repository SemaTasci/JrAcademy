package com.example.jracademyproject.onboarding.presentation.content

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jracademyproject.items.GameItem
import com.example.jracademyproject.items.SpecificGameItem
import com.example.jracademyproject.onboarding.domain.use_case.content.ContentByIdUseCase
import com.example.jracademyproject.onboarding.domain.use_case.content.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContentViewModel @Inject constructor(
    private val getContentUseCase: UseCase,
    private val getContentByIdUseCase: ContentByIdUseCase
):ViewModel() {
    private val _content=MutableLiveData<List<GameItem>>()
    val content:LiveData<List<GameItem>>get() = _content

    private val _contents = MutableLiveData<SpecificGameItem>()
    val contents: LiveData<SpecificGameItem> get() = _contents
    init {
        getContent()
    }
    private fun getContent(){
        viewModelScope.launch {
            try {
                val contents=getContentUseCase()
                _content.value=contents
            }catch (_:java.lang.Exception){

            }
        }
    }

    fun getContentById(id: Int) {

        viewModelScope.launch {

            try {

                val contents_ = getContentByIdUseCase(id)
                _contents.value =contents_
            } catch (_: Exception) {}

        }

    }
}