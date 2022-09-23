package main.kotlin

open class Doctor(open val name: String, open val registry: Int, private var phoneNumber: String) {

    open fun getPhoneNumber(phoneNumber: String) : String {
        return phoneNumber;
    }

    open fun setPhoneNumber(): Boolean{
        if(phoneNumber.length==10){
            return true;
        }
       return false;
    }

    override fun toString():String{
        return "$name ($registry) - $phoneNumber"
    }
}