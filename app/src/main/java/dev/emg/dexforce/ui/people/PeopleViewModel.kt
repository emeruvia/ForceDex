package dev.emg.dexforce.ui.people

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.emg.dexforce.data.model.People
import dev.emg.dexforce.data.repository.PeopleRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import timber.log.Timber

class PeopleViewModel : ViewModel() {

  private val repository: PeopleRepository = PeopleRepository()

  fun getPeople() {
    viewModelScope.launch {
      withContext(Dispatchers.IO) {
        val people = repository.getPeople()
        Timber.d("People: ${people.name}")
      }
    }
  }

}