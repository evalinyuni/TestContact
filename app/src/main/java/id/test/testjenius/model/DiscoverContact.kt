package id.test.testjenius.model

class DiscoverContact {

    var page: Int = 0
    var totalResult: Long = 0
    var totalPages: Long = 0
    var results: List<Result> = ArrayList()

    class Result {
        var id: Int = 0
        var voteCount: Int = 0
        var video: Boolean = true
        var voteAverage: Double = 0.0
        var title: String = ""
        var popularity: Double = 0.0
        var posterPath: String = ""
        var originalLanguage: String = ""
        var originalTitle: String = ""
        var genreIds: List<Long> = ArrayList()
        var backdropPath: String = ""
        var adult: Boolean = false
        var overview: String = ""
        var releaseDate: String = ""
    }
}