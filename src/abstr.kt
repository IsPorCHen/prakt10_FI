abstract class abstr (name:String) : IOperatorInformation {
    open var Name = name
    abstract var Min:Double
    abstract var S:Double
    abstract var P:Boolean

    override fun Input() {}

    override fun Print() {
        println("Оператора: $Name\n" +
                "Стоимость за минуту: $Min\n" +
                "Площадь покрытия: $S\n" +
                "Q = ${Q(S,Min)}\n" +
                "Qp = ${Qp(P)} (при P = $P)"
        )
    }
    override fun Qp(p:Boolean):Double {
        return 0.0
    }
    override fun Q(s:Double,min:Double):Double {
        return 0.0
    }
}