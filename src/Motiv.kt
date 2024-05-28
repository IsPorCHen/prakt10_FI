class Motiv(name:String) : Yota(name){
    override var Name = name
    override var Min = 0.0
    override var S = 0.0
    override var P = false

    fun Rename(){
        println("Введите новое имя")
        Name = readln()
    }
    override fun Qp(p:Boolean):Double{
        if (p){
            return Q(S,Min)*0.7
        }
        else{
            return Q(S,Min)*1.5
        }
    }
    }