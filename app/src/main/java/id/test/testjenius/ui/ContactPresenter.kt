package id.test.testjenius.ui

import android.content.Context
import android.os.Handler
import android.os.Looper
import id.test.testjenius.model.Contact
import id.test.testjenius.networking.API

class ContactPresenter(private val context: Context) {

    private var view: ContactInterface? = null
    lateinit var API: API

//    override fun onAttach(view: ContactInterface) {
//        this.view = view
//        API = API(context)
//    }
//
//    override fun onDetach() {
//        view = null
//    }
//
//    fun discoverMovie() {
//        view?.onProgress()
//
//        @Configs val apiKey = Config.API_KEY
//        @Configs val defaultSort = Config.DEFAULT_SORT
//
//        API.discoverMovie(apiKey, defaultSort,
//            object : NetworkCallback<DiscoverMovie> {
//                override fun onSuccess(response: DiscoverMovie) {
//                    val mainHandler = Handler(Looper.getMainLooper())
//                    mainHandler.post(Runnable {
//                        view?.onSuccess(response)
//                    })
//                }
//
//                override fun onError(strResponse: String, strErrorCode: String) {
//                    val mainHandler = Handler(Looper.getMainLooper())
//                    mainHandler.post(Runnable {
//                        view?.onFailed()
//                    })
//                }
//            })
//
//    }
//
//    fun openContactDetail(contact: Contact) {
//        view?.onOpenContactDetail(contact)
//    }
}