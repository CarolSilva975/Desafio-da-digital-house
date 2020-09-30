class Curso(var nomeCurso: String, var codCurso: Int, var qtdAlunos: Int) {

    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    var listaAluno: MutableList<Aluno> = mutableListOf()


    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Curso) return false

        if (codCurso != other.codCurso) return false
        return true

    }

    override fun toString(): String {
        return "Curso: $nomeCurso código $codCurso quatitade de vagas $qtdAlunos"
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaAluno.size == qtdAlunos)
            return false
        else
            listaAluno.add(umAluno)
        return true


    }

    fun excluirAluno(umAluno: Aluno) {
        listaAluno.remove(umAluno)
    }


}
