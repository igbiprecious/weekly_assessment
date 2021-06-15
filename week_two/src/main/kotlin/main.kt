fun main(){
//    QUESTION 1

    var num1 : Int = 20
    var num2 : Int = 10
    var num3 : Double = 5.00
    var num4 : Double = 7.58
    var pwd1 : String = "Invincible"
    var sent2 : String = "James Bond"
    var bool1 : Boolean = true
    var bool2 : Boolean = false

    if(num1 > num2){

    }
    if(num2 < num1){

    }
    if(num2 == num1){

    }
    if(num2 >= 0 || num2 >= 0){

    }
    if(pwd1.length >= 8){

    }
    if(sent2.isEmpty()){

    }
    if(!bool1){

    }
    if( bool1 == true && bool2 == true ){

    }
    if( num3 != num4){

    }
    if( num4 <= num3){

    }

    var passwordStrength : String = when {
        pwd1.length == 0 -> "Password Cannot be Empty"
        pwd1.length <= 4 -> "Very Poor"
        pwd1.length <= 7 -> "Fair"
        pwd1.length == 8 -> "Good"
        pwd1.length <= 10 -> "Strong"
        else -> "Your Password is very Strong"
    }

//    QUESTION 2
    var i : Int = 1
    var s : Int = 0
    while ( i <= 100){
        println(i)
        i++
    }
    while ( s < 10){
        s++
        if(s == 4 || s == 5 ){
            continue
        }
        println(s)
    }

//    QUESTION 3
    var k = 10
    while( k <= 30 ){
        if( k <= 20){
            if( k % 2 == 0){
                println(k)
            }
        }
        if( k >= 20 ){
            if( k % 2 != 0 ){
                print("\n"+k)
            }
        }
        k++
    }


    var lap : Laptop = Laptop("", "", false, 0.0, 0)
    lap.setLaptopName("MacBook Air")
    lap.setLaptopOs("Mac OS")
    lap.setLaptopActivated(true)
    lap.setLaptopInches(15.5)
    lap.setLaptopCore(8)

    println(lap.getLaptopName())
    println(lap.getLaptopOs())
    println(lap.getLaptopActivated())
    println(lap.getLaptopInches())
    println(lap.getLaptopCore())

    var prod : Product = Product("", 0, "", 0.0, 0)
    prod.setProductName("Jean")
    prod.setProductId(22)
    prod.setProductPrice(6500.50)
    prod.setProductQuality("Original")
    prod.setProductQuantitiy(15)

    println(prod.getProductName())
    println(prod.getProductId())
    println(prod.getProductPrice())
    println(prod.getProductQuality())
    println(prod.getProductQuantitiy())

    var emp : Employee = Employee("", 0, "", "", 0.0)
    emp.setEmployeeAge(29)
    emp.setEmployeeDiscipline("Accountancy")
    emp.setEmployeeName("Mary")
    emp.setEmployeePosition("Financial Accountant")
    emp.setEmployeeSalary(85000.00)

    println(emp.getEmployeeAge())
    println(emp.getEmployeeDiscipline())
    println(emp.getEmployeeName())
    println(emp.getEmployeePosition())
    println(emp.getEmployeeSalary())

    var car : Car = Car("", 0,"",0,0)
    car.setCarColor("Blue")
    car.setCarDoor(4)
    car.setCarName("Lexus RX330")
    car.setCarSeat(5)
    car.setCarYear(2005)

    println(car.getCarColor())
    println(car.getCarDoor())
    println(car.getCarName())
    println(car.getCarSeat())
    println(car.getCarYear())

    var person : Human = Human(0,0,0,0,0, "")
    person.setHumanEar(2)
    person.setHumanEye(2)
    person.setHumanHand(2)
    person.setHumanHead(1)
    person.setHumanLeg(2)
    person.setHumanName("John")

    println(person.getHumanEar())
    println(person.getHumanEye())
    println(person.getHumanHand())
    println(person.getHumanHead())
    println(person.getHumanLeg())
    println(person.getHumanName())
}

//QUESTION 4 & 5
class Laptop(name : String, os: String, activated : Boolean, inches : Double, core : Int){
    var name : String = ""
    var os : String = ""
    var activated : Boolean = true
    var inches : Double = 0.00
    var core : Int = 0

    //    GETTERS
    fun getLaptopName():String {
        return this.name
    }
    fun getLaptopOs():String {
        return this.os
    }
    fun getLaptopActivated():Boolean {
        return this.activated
    }
    fun getLaptopInches():Double {
        return this.inches
    }
    fun getLaptopCore():Int {
        return this.core
    }
    //    SETTERS
    fun setLaptopName(name: String) {
        this.name = name
    }
    fun setLaptopOs(os : String) {
        this.os = os
    }
    fun setLaptopActivated(activated: Boolean) {
        this.activated = activated
    }
    fun setLaptopInches(inches: Double) {
        this.inches = inches
    }
    fun setLaptopCore(core: Int) {
        this.core = core
    }
}

class Product{
    var name : String = ""
    var id : Int = 0
    var quality : String = ""
    var price : Double = 0.0
    var quantity : Int = 0

    constructor(name: String, id : Int, quality : String, price : Double, quantity : Int){
        this.name = name
        this.id = id
        this.quality = quality
        this.price = price
        this.quantity = quantity
    }

    fun getProductName():String{
        return this.name
    }
    fun getProductId(): Int{
        return this.id
    }
    fun getProductQuality(): String{
        return this.quality
    }
    fun getProductPrice(): Double{
        return this.price
    }
    fun getProductQuantitiy(): Int{
        return this.quantity
    }

    fun setProductName(name: String){
        this.name = name
    }
    fun setProductId(id : Int){
        this.id = id
    }
    fun setProductQuality(quality: String){
        this.quality = quality
    }
    fun setProductPrice(price: Double){
        this.price = price
    }
    fun setProductQuantitiy(quantity: Int){
        this.quantity = quantity
    }


}
class Employee{
    var name : String = ""
    var age : Int = 0
    var position : String = ""
    var discipline : String = ""
    var salary : Double = 0.00

    constructor(name : String, age : Int, position: String, discipline : String, salary : Double){
        this.name = name
        this.age = age
        this.position = position
        this.discipline = discipline
        this.salary = salary
    }

    fun getEmployeeName():String{
        return this.name
    }
    fun getEmployeeAge(): Int{
        return this.age
    }
    fun getEmployeePosition(): String{
        return this.position
    }
    fun getEmployeeDiscipline(): String{
        return this.discipline
    }
    fun getEmployeeSalary(): Double{
        return this.salary
    }

    fun setEmployeeName(name: String){
        this.name = name
    }
    fun setEmployeeAge(age : Int){
        this.age = age
    }
    fun setEmployeePosition(position: String){
        this.position = position
    }
    fun setEmployeeDiscipline(discipline: String){
        this.discipline = discipline
    }
    fun setEmployeeSalary(salary: Double){
        this.salary = salary
    }
}

class Car{
    var name : String = ""
    var year : Int = 0
    var color : String = ""
    var seat : Int = 0
    var door : Int = 0

    constructor( name: String, year : Int, color : String, seat : Int, door : Int){
        this.name = name
        this.year = year
        this.color = color
        this.seat = seat
        this.door = door
    }

    fun getCarName():String{
        return this.name
    }
    fun getCarYear(): Int{
        return this.year
    }
    fun getCarColor(): String{
        return this.color
    }
    fun getCarSeat(): Int{
        return this.seat
    }
    fun getCarDoor(): Int{
        return this.door
    }

    fun setCarName(name: String){
        this.name = name
    }
    fun setCarYear(year : Int){
        this.year = year
    }
    fun setCarColor(color: String){
        this.color = color
    }
    fun setCarSeat(seat: Int){
        this.seat = seat
    }
    fun setCarDoor(door: Int){
        this.door = door
    }

}

class Human(head: Int, hand : Int, leg : Int, eye: Int, ear: Int, name: String){
    var head : Int = 0
    var hand : Int = 0
    var leg : Int = 0
    var eye : Int = 0
    var ear : Int = 0
    var name : String = ""

    fun getHumanHead():Int{
        return this.head
    }
    fun getHumanHand(): Int{
        return this.hand
    }
    fun getHumanLeg(): Int{
        return this.leg
    }
    fun getHumanEye(): Int{
        return this.eye
    }
    fun getHumanEar(): Int{
        return this.ear
    }
    fun getHumanName(): String{
        return this.name
    }

    fun setHumanHead(head: Int){
        this.head = head
    }
    fun setHumanHand(hand : Int){
        this.hand = hand
    }
    fun setHumanLeg(leg: Int){
        this.leg = leg
    }
    fun setHumanEye(eye: Int){
        this.eye = eye
    }
    fun setHumanEar(ear: Int){
        this.ear = ear
    }
    fun setHumanName(name: String){
        this.name = name
    }
}