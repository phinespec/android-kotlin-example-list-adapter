package com.example.tempapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class ExampleAdapter (
    ): ListAdapter<ItemTypeWeAreAdapting, ExampleAdapter.ExampleViewHolder>(ExampleListDiffCallback()) {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExampleAdapter.ExampleViewHolder {
        val view =
            ExampleItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExampleViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ExampleAdapter.ExampleViewHolder,
        position: Int
    ) {
        holder.bind(position)
    }

    inner class ExampleViewHolder(val binding: ExampleItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {

            // MOST OF YOUR VARIABLE DECLARATIONS AND ADAPTER LOGIC CAN GO HERE
            // val item = getItem(position)

            // WE CAN ALSO USE DATABINDING HERE TO BIND OUR XML VIEWS TO LOCAL VARIABLES
            // val toggle = binding.gameToggleButton

            // toggle.setOnClickListener {
            //......
            // ...
            // }

        }
    }

}

class ExampleListDiffCallback : DiffUtil.ItemCallback<ItemTypeWeAreAdapting>() {

    override fun areItemsTheSame(oldItem: ItemTypeWeAreAdapting, newItem: ItemTypeWeAreAdapting): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ItemTypeWeAreAdapting, newItem: ItemTypeWeAreAdapting): Boolean {
        return oldItem.id == newItem.id
    }

}

