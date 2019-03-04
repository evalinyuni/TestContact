package id.test.testjenius.networking

import android.content.Context
import android.util.Log
import eu.amirs.JSON
import id.test.testjenius.ext.Constants
import id.test.testjenius.model.Contact
import id.test.testjenius.model.StatusResponse
import org.json.JSONObject

class API(val context: Context) {

    private val TAG = API::class.java.simpleName
    private val BASE_URL = "https://simple-contact-crud.herokuapp.com"

    private val apiClient: APIClient = APIClient(context)


    fun getContact(callback: (ArrayList<Contact>) -> Unit) {
        apiClient.callRestAPI("$BASE_URL/contact",
            JSONObject(), apiClient.GET, object : DelegateAPIRequest {
                override fun onCallSuccess(response: JSON) {
                    var arrContact: ArrayList<Contact> = ArrayList()
//                    for (_data in response.jsonObject("data")) {
//                        arrContact.add(Contact(_data))
//                    }

                    callback(arrContact)
                }
                override fun onCallFailed(statusResponse: StatusResponse) {
                    callback(ArrayList())
                }
            })
    }

}