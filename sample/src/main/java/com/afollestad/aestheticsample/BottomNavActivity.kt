/*
 * Licensed under Apache-2.0
 *
 * Designed and developed by Aidan Follestad (@afollestad)
 */
package com.afollestad.aestheticsample

import android.graphics.Color
import android.os.Bundle
import com.afollestad.aesthetic.Aesthetic.Companion.get
import com.afollestad.aesthetic.AestheticActivity
import kotlinx.android.synthetic.main.activity_bottom_nav.center_body
import kotlinx.android.synthetic.main.activity_bottom_nav.toolbar

/** @author Aidan Follestad (afollestad) */
class BottomNavActivity : AestheticActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_bottom_nav)

    toolbar.setNavigationOnClickListener { finish() }

    center_body.setOnClickListener {
      get().colorAccent(Color.YELLOW)
    }
  }
}
