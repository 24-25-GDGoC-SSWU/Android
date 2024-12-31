package com.example.mysololife22.board

class BoardModel (
    val title : String = "",
    val content : String = "",
    val uid : String = "",
    val time : String = ""
)
{
    override fun toString(): String {
        return "BoardModel(title='$title', content='$content', uid='$uid', time='$time')"
    }
}