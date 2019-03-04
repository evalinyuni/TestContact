package id.test.testjenius.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import id.test.testjenius.R
import kotlinx.android.synthetic.main.activity_main.*

class ContactView : AppCompatActivity() {

    private val TAG = ContactView::class.java.simpleName

    lateinit var presenter: ContactPresenter

    lateinit var adapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        onAttach()
        initView()

//        presenter.discoverMovie()
    }

    private fun initView() {
        supportActionBar?.title = title

        val gridLayoutManager = GridLayoutManager(
            this,
            3,
            LinearLayoutManager.VERTICAL,
            false
        )
        val linearLayoutManager = LinearLayoutManager(this)
        rvContact.apply {
            layoutManager = linearLayoutManager
            setHasFixedSize(true)
        }
//        rvContact.apply {
//            layoutManager = gridLayoutManager
//
////            RecyclerView.addItemDecoration(DividerItemDecoration(this@ContactView, DividerItemDecoration.VERTICAL))
////            addItemDecoration(ItemDecoration(
////                convertDpToPx(10),
////                convertDpToPx(10),
////                true
////            ))
//            setHasFixedSize(true)
//        }
    }

}
