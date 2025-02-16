class Book(var title: String, var author: String,var yearPublished: Int, var genre: String ){
//    var title: String = ""
//    var author: String = ""
//    var yearPublished: Int = 0

    fun getBookInfo():String {
        return " $title by $author ( $yearPublished ) Book genre : $genre"
    }
}


fun main() {
val myBook = Book("Atomic Habits", "James Clear", 2018, "Self-help")
//    myBook.title = "Atomic Habits"
//    myBook.author = "James Clear"
//    myBook.yearPublished = 2018

    var bookInfo = myBook.getBookInfo()
    println(bookInfo)


}

