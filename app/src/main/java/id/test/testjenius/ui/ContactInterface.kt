package id.test.testjenius.ui

import id.test.testjenius.model.Contact

interface ContactInterface {
    fun onProgress()

    fun onSuccess(response: Contact)

    fun onFailed()

    fun onOpenContactDetail(contact: Contact)
}