package id.test.testjenius.networking

import eu.amirs.JSON
import id.test.testjenius.model.StatusResponse

interface DelegateAPIRequest {
    fun onCallSuccess(response: JSON)
    fun onCallFailed(statusResponse: StatusResponse)
}
