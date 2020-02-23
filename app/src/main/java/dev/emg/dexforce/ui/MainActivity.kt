package dev.emg.dexforce.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import dev.emg.dexforce.R.layout
import dev.emg.dexforce.ui.people.PeopleViewModel
import kotlinx.android.synthetic.main.activity_main.test_button
import timber.log.Timber

class MainActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)

    val viewModel = ViewModelProvider(this).get(PeopleViewModel::class.java)


    test_button.setOnClickListener {
      viewModel.getPeople()
    }
  }

}
