
class Coche(color: String?, marca: String?, modelo: String?,
            private val cv: Int?, private val matricula: String?, private val numPuertas: Int?) {


    private var color: String? = color
        set(value) {
            if (value == null) throw IllegalArgumentException("El color no puede ser nulo")
            field = value
        }

    private var marca: String? = marca
        get() = field?.lowercase()?.replaceFirstChar { it.uppercase() }

    private var modelo: String? = modelo
        get() = field?.lowercase()?.replaceFirstChar { it.uppercase() }



    init {
        require(!marca.isNullOrEmpty()) { "El campo 'marca' no puede ser nula ni vacía.\nMarca introducida: $marca" }
        require(!modelo.isNullOrEmpty()) { "El campo 'modelo' no puede ser nula ni vacía.\nMarca introducida: $modelo" }
        require(matricula?.length == 7) { "El campo 'matrícula' no puede contener una cantidad de caracteres diferente a 7.\nCaracteres introducidos: ${matricula?.length}" }
        require(cv in 70..700) { "El campo 'caballos de fuerza' debe de estar entre 70 y 700.\nCv introducidos: $cv" }
        require(numPuertas in 3..5) { "El campo 'numero de puertas' debe de estar entre 3 y 5.\nNumero de puertas introducido: $numPuertas" }
        require(color != null) { "El campo 'color' no puede ser nulo.\nColor introducido: $color" }
    }

    override fun toString(): String {
        return "|Coche| Color: $color, Marca: $marca, Modelo: $modelo, Número de caballos: $cv, Matrícula: $matricula, Número de puertas: $numPuertas"
    }
}
