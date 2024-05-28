open class Yota (name:String) :abstr(name) {
    override var Name = name
    override var Min = 0.0
    override var S = 0.0
    override var P = false

    override fun Input() {
        super.Input()
        try {
            println("Введите минуты:")
            Min = readln().toDouble()
            Error()

            println("Введите стоимость:")
            S = readln().toDouble()

            println("Есть ли оплата за каждое соединение? (да/нет)")
            val response = readln()
            P = response.equals("да", ignoreCase = true)
        } catch (a: Exception) {
            println("Введено некорректное значение, запись начата с начала")
            Input()
        }
    }

    fun Error(){
        if (Min>100.0){
            println("Дорого! Уменьшаем на 90")
            Min-=90.0
        }
    }
    override fun Qp(p:Boolean):Double{
        return 0.0
    }
    override fun Q(s:Double,min:Double):Double{
        return 100*S*Min
    }
}