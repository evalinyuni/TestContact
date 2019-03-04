package id.test.testjenius.networking

import android.content.Context
import android.util.Log
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class APIClient(val context: Context) {

    private val TAG = APIClient::class.java.simpleName

    val GET = "get"
    val POST = "post"

    companion object {
        val contectType = MediaType.parse("application/json; charset=utf-8")
        val contectTypeText = MediaType.parse("application/x-www-form-urlencoded")
    }

    private var okHttpClient: OkHttpClient = OkHttpSingleton.getInstance(context)
    private var call: Call? = null

    fun callRestAPI(url: String, jObjParameters: JSONObject?, strMethod: String, delegateAPIRequest: DelegateAPIRequest) {
        var request: Request? = null
        request = if (strMethod.equals(GET, ignoreCase = true)) {
            Request.Builder()
                .url(url)
                .build()
        } else {
            val body = RequestBody.create(contectTypeText, jObjParameters.toString())
            Request.Builder()
                .url(url)
                .post(body)
                .build()
        }

        call = okHttpClient.newCall(request)
        call?.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                try {
                    if (jObjParameters != null) {
                        Log.d("onServiceCall-onFailure", "URL : $url, Params : $jObjParameters")
                    } else {
                        Log.d("onServiceCall-onFailure", "URL : $url")
                    }
                } catch (e1: Exception) {
                    e1.printStackTrace()
                }
//                delegateAPIRequest.onCallFailed(e.toString(), "911"/*, enumApiType*/)
            }

            @Throws(IOException::class)
            override fun onResponse(call: Call, response: Response) {
//                Log.d("onServiceCall-onResponse", "sukses")
                val strResponse = response.body()?.string()
                if (response.isSuccessful && response.code() == 200) {
//                    Log.d("onServiceCall-onResponse", "onCallSuccess")
//                    delegateAPIRequest.onCallSuccess(strResponse.toString()/*, enumApiType*/)
                    response.body()?.close()
                } else {
//                    Log.d("onServiceCall-onResponse", "onCallFailed")
//                    delegateAPIRequest.onCallFailed(strResponse.toString(), response.code().toString()/*, enumApiType*/)
                }
            }
        })

    }

}
