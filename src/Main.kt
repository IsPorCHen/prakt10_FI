fun main() {
    print("Введите имя 1 оператора: ")
    val yota = Yota(readln())
    yota.Input()

    print("Введите имя 2 оператора: ")
    val motiv = Motiv(readln())
    motiv.Input()

    print("Хотите переименовать оператор (да/нет): ")
    if (readln() == "да"){
        motiv.Rename()
    }

    println("----------------------------------------------------")
    println("Оператор 1:")
    yota.Print()

    println("----------------------------------------------------")
    println("Оператор 2:")
    motiv.Print()
}