fun main() {
    val names:ArrayList<String> = ArrayList<String>()
    val phoneNumbers:ArrayList<String> = ArrayList<String>()
    val phoneBook:HashMap<String, String> = HashMap<String, String>()
    // this assumes that names and corresponding phone numbers are in corresponding indexes.
    fun fillPhoneBook(){
        names.forEachIndexed{index, el -> 
        	phoneBook.put(el, phoneNumbers.get(index))
        }
    }
    
    fun queryPhoneBook(name:String):String{
        var result:String="Not found"
        if(phoneBook.containsKey(name)){
           val phoneNumber = phoneBook.getValue(name)
           result = "$name = $phoneNumber"
        }
        return result
    }
    fillPhoneBook();
    println(phoneBook.size())
    println(queryPhoneBook("Name"))
    
    
}
