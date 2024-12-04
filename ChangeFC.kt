fun main() {
    print("Sıcaklık türünü seçin (C -> F veya F -> C): ")
    val conversionType = readLine()
    print("Sıcaklık değerini girin: ")
    val temperature = readLine()?.toDoubleOrNull()

    if (temperature == null || (conversionType != "C -> F" && conversionType != "F -> C")) {
        println("Geçersiz giriş.")
        return
    }

    val convertedTemperature = when (conversionType) {
        "C -> F" -> temperature * 9 / 5 + 32
        "F -> C" -> (temperature - 32) * 5 / 9
        else -> null
    }

    if (convertedTemperature != null) {
        println("Dönüştürülmüş sıcaklık: $convertedTemperature")
    }
}
