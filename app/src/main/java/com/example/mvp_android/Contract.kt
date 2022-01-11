package com.example.mvp_android

interface Contract
{
    /* This interface is used to */
    interface View
    {
        fun showProgressBar()
        fun hideProgressBar()
        fun setString(string : String?)
    }

    interface Model
    {
        interface OnFinished
        {
            fun finish(string : String?)
        }

        fun goNext(onFinished : OnFinished)
    }

    interface Presenter
    {
        fun onButtonClick()
        fun onDestroy()
    }

}