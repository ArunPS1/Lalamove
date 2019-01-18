package com.app.delivery.ui.base

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

/**
 *
 * Created by Arun PS on 16-01-2019.
 */

open class BaseActivity : AppCompatActivity(), FragmentManager.OnBackStackChangedListener {

    private val backStackCount: Int = 1
    private var toolBarHolder: View? = null

    protected fun hideToolBarHolder() {
        toolBarHolder?.visibility = View.GONE
    }

    protected fun setToolBarHolder(view: View) {
        this.toolBarHolder = view
    }


    fun addFragment(tag: String, fragment: Fragment, frameId: Int) {
        if (null == supportFragmentManager.findFragmentByTag(tag)) {
            supportFragmentManager.beginTransaction().add(frameId, fragment, tag).commit()
        }
    }

    fun initializeToolBar(toolBar: Toolbar?, title: String) {
        toolBar?.title = ""
        setSupportActionBar(toolBar)
        supportActionBar?.title = title
    }


    protected fun setToolBarHolder(view: View, visibility: Boolean) {
        this.toolBarHolder = view
        val state: Int = if (visibility) View.VISIBLE else View.GONE
        toolBarHolder?.visibility = state
    }


    protected fun enableBackButton() {
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onBackStackChanged() {
        supportActionBar?.setHomeButtonEnabled(supportFragmentManager.backStackEntryCount > backStackCount)
    }

    override fun onBackPressed() {
        manageBack()
    }

    override fun onSupportNavigateUp(): Boolean {
        manageBack()

        return true
    }

    protected fun registerBackStackListener() {
        supportFragmentManager.addOnBackStackChangedListener {}
    }

    private fun manageBack() {
        finish()
    }


}




