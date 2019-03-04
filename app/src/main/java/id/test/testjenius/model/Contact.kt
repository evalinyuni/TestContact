package id.test.testjenius.model

import android.os.Parcelable
import eu.amirs.JSON
import kotlinx.android.parcel.Parcelize

@Parcelize
class Contact(var firstName: String  = "",
                 var lastName: String   = "",
                 var age: String   = "",
                 var photo: String  = ""
) : Parcelable {
    constructor(data: JSON) : this() {
        this.firstName = data.jsonObject.getString("firstName")
        this.lastName = data.jsonObject.getString("lastName")
        this.age = data.jsonObject.getString("age")
        this.photo = data.jsonObject.getString("photo")

    }
}