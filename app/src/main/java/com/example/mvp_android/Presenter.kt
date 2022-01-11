package com.example.mvp_android

class Presenter(private var mainView : Contract.View? , private val model : Contract.Model) :
    Contract.Presenter , Contract.Model.OnFinished
{
    override fun onNextClick()
    {
        if (mainView != null)
        {
            mainView !!.showProgressBar()
        }
        model.goNext(this)
    }

    override fun onDestroy()
    {
        mainView = null
    }

    override fun finish(string : String?)
    {
        if (mainView != null)
        {
            mainView?.setString(string)
            mainView?.hideProgressBar()
        }
    }
}