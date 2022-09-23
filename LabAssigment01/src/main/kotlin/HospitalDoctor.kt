package main.kotlin

open class HospitalDoctor(override var name: String,
                          override var registry: Int,
                          var phoneNumber: String,
                          var badgeNumber: String) : Doctor(name=name,registry=registry,phoneNumber=phoneNumber),ICanOperate {

         override fun toString(): String {

          return "$name ($registry) - $phoneNumber" +
                  " Badge: $badgeNumber"
                }
}