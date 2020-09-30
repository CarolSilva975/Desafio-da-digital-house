class Aluno(var nome: String, var sobrenome: String, var codAluno: Int) {

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Aluno) return false

        if (codAluno != other.codAluno) return false
        return true
    }

    override fun toString(): String {
        return "$nome $sobrenome $codAluno"
    }

}