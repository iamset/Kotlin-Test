

abstract class Book{
 abstract fun display()   
}

class Solution{
    val book:Book = Book()
    book = MyBook("Paulo Coelho", "Paulo Coelho", 248)
    book.display();
    
    
    
}

class MyBook(title:String, author:Sting, price:Int):Book{
    override fun display(obj:Book){
        println()
        println(obj)
    }
}

fun main() {
    
}
