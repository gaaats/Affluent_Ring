package com.tiramisu.driftmaxw.beeestscooore

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tiramisu.driftmaxw.R
import com.tiramisu.driftmaxw.databinding.SingleUserLeaderBinding
import kotlin.random.Random


class Ijfirjrfijrfjrf() :
    ListAdapter<JIfjijirf, Ijfirjrfijrfjrf.UserRaitListVievHolder>(NJfrnnfrnrfnrf()) {

    private var onItemClickListenerrr: ((person: JIfjijirf) -> Unit)? = null
    private var addToFavorite: ((recipe: JIfjijirf) -> Unit)? = null

    class UserRaitListVievHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bindinggg = SingleUserLeaderBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserRaitListVievHolder {
        LayoutInflater.from(parent.context)
            .inflate(R.layout.single_user_leader, parent, false).also {
                return UserRaitListVievHolder(it)
            }
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: UserRaitListVievHolder, position: Int) {
        val currentItem = getItem(position)
        val listImagessss = listOf(
            R.drawable.voin,
            R.drawable.voin2,
            R.drawable.volk,
        )
        holder.bindinggg.apply {
            val currentImg = listImagessss.random()
            val currentScore = Random.nextInt(1, 5000)
            tvName.text = currentItem.nameeee
            tvScore.text = currentScore.toString()
            imgPersonAvataer.setImageResource(currentImg)
            root.setOnClickListener {
                onItemClickListenerrr?.invoke(currentItem)
            }

        }
    }

    fun setOnItemClickListener(listener: (person: JIfjijirf) -> Unit) {
        onItemClickListenerrr = listener
    }
}