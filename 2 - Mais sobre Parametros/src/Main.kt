//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    endereco("street", "city", "sp", "23187")
    println(media(10f,2f,3f,5.76f, 4f, 7f))
}

fun endereco( rua: String, cidade: String, estado: String, cep: String, num: Int = 0){

}

fun media( vararg notas: Float): Float{
    var soma = 0f;
    for(n in notas){
        soma += n
    }
    return (soma / notas.size)
}
