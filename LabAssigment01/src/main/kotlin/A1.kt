package main.kotlin

fun main(args: Array<String>) {
    val doc1 = Doctor("Chris", 10, "87654312")
    val doc2 = Doctor("Michael", 32, "8765433219")
    val hDoc1 = HospitalDoctor("Shaun", 1, "9024356789", "12")
    val hDoc2 = HospitalDoctor("Brad", 2, "9024321234", "15")
    val hDoc3 = HospitalDoctor("Tom", 4, "7834562378", "19")
    val doctor: MutableList<String> = mutableListOf()
    doctor.add("Shaun")
    doctor.add("Brad")
    doctor.add("Tom")
    doctor.add("Philip")
    doctor.add("Adam")
    for (doc in doctor) {
        println(doc)
    }
    println(doc1.getPhoneNumber("7688908976"))
    println(doc1.setPhoneNumber())
    println(doc1.toString())
    println(doc2.toString())
    println(hDoc1.toString())
    println(hDoc2.toString())
    println(hDoc3.toString())
    println(hDoc1.operateOnPatient("Shaun Murphy"))
}
