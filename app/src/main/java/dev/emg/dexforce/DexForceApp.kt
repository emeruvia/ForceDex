package dev.emg.dexforce

import android.app.Application
import timber.log.Timber
import timber.log.Timber.DebugTree

class DexForceApp : Application() {

  override fun onCreate() {
    super.onCreate()

    if (BuildConfig.DEBUG) {
      Timber.plant(DebugTree())
    }
  }

}