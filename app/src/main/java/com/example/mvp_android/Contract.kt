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

        /* Sets the text of the view with the String */
        fun setString(string : String?)
    }

    interface Model
    {
        interface OnFinished
        {
            fun finish(string : String?)
        }

        // This function is used to check if the String is set
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