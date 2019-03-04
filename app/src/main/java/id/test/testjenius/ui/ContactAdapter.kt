package id.test.testjenius.ui

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import id.test.testjenius.R
import id.test.testjenius.model.Contact
import kotlinx.android.synthetic.main.item_contact.view.*


class ContactAdapter(private val context: Context,
                     private var arrContact: ArrayList<Contact>,
                     private val listener: ContactAdapterListener
) : RecyclerView.Adapter<ContactAdapter.ContactHolder>() {

    private var arrStrContact: ArrayList<String> = ArrayList()
    private val gson = Gson()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder = ContactHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_contact,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        holder.bindView(arrContact[position], listener)
    }


    override fun getItemCount(): Int {
        return arrContact.size
    }

    inner class ContactHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(contact: Contact,
                     listener: ContactAdapterListener) {

            itemView.tvNameContact.text = contact.firstName
            itemView.tvAge.text = contact.age

        }


    }

    interface ContactAdapterListener {

        fun onClick(contact: Contact)
    }
}