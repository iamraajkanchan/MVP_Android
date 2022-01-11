package com.example.mvp_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , Contract.View
{
    private var presenter : Presenter? = null
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = Presenter(this , Model())
        btnNext.setOnClickListener {
            presenter !!.onButtonClick()
        }
    }

    override fun showProgressBar()
    {
        progressBar !!.visibility = View.VISIBLE
        textView !!.visibility = View.VISIBLE
    }

    override fun hideProgressBar()
    {
        progressBar !!.visibility = View.GONE
        textView !!.visibility = View.VISIBLE
    }

    override fun setString(string : String?)
    {
        textView !!.text = string
    }
}