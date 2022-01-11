package com.example.mvp_android

interface Contract
{
    /* This interface is used for view */
    interface View
    {
        /* Shows the progress bar */
        fun showProgressBar()
        /* Hides the progress bar */
        fun hideProgressBar()
        /* */
        fun setString(string : String?)
    }

    interface Model
    {
        interface OnFinished
        {
            fun finish(string : String?)
        }
        //
        fun goNext(onFinished : OnFinished)
    }

    interface Presenter
    {
        /* This function is used for the button of view */
        fun onNextClick()
        /* This function is used to destroy the view */
        fun onDestroy()
    }

}