import java.sql.DriverManager.println

fun testaCondicoes(saldo: Double) {
         when {
             saldo > 0.0 -> {
                 println("conta positiva")
             }

             saldo == 0.0 -> {
                 println("conta é neutra")
             }

             else -> {
                 println("conta é negativa")
             }
         }
     }