package com.example.a19442641_levanhau_ad_todoapp

interface UpdateAndDelete {
    fun modifyItem(itemUID:String,isDone:Boolean)
    fun onItemDelete(iemUID:String)
}