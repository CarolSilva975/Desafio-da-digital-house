class DigitalHouseManager() {

    var listaCurso = mutableMapOf<Int, Curso>()
    var listaProfessor = mutableMapOf<Int, Professor>()
    var listaAluno = mutableMapOf<Int, Aluno>()
    var listaMatricula = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codCurso: Int, quantidadeMaximaDeAlunos: Int) = listaCurso.put(codCurso, Curso(nome, codCurso, quantidadeMaximaDeAlunos))

    fun excluirCurso(codigoCurso: Int) {// exclui um curso pelo codigo informado
        try {
            if (!listaCurso.containsKey(codigoCurso)) {
                throw Exception("Curso nao encontrado na lista")

            } else {
                listaCurso.remove(codigoCurso)
                println("Curso excluido com sucesso")
            }


        } catch (e: Exception) {
            println("\n ${e.message}\n")
        }
    }


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        listaProfessor.put(codigoProfessor, ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        listaProfessor.put(codigoProfessor, ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) {
        try {
            if (!listaProfessor.containsKey(codigoProfessor)) {
                throw Exception("Professor não encontrado")
            } else {
                listaProfessor.remove(codigoProfessor)
            }

        } catch (e: Exception) {
            println("\n ${e.message}\n")


        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) = listaAluno.put(codigoAluno, Aluno(nome, sobrenome, codigoAluno))

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        try {
            val aluno = listaAluno[codigoAluno]
            val curso = listaCurso[codigoCurso]


            if (curso != null) {
                if (aluno?.let { curso.adicionarUmAluno(it) }!!) {
                    listaMatricula.add(Matricula(aluno, curso))
                    println("${aluno.nome} matriculado com sucesso no curso ${curso.nomeCurso}")
                } else {
                    println("${aluno.nome} Infelismente não ah mais vagas no curso desejado")
                }
            }


        } catch (e: Exception) {


        }

    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        try {
            val professorAdjunto = listaProfessor[codigoProfessorAdjunto]
            val professorTitular = listaProfessor[codigoProfessorTitular]
            val curso = listaCurso[codigoCurso]
            if (curso != null) {
                curso.professorTitular = professorTitular as ProfessorTitular
                curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
                println("${professorAdjunto.nomeProf} e ${professorTitular.nomeProf} alocados com sucesso ao curso ${curso.nomeCurso}")

            }
            

        } catch (e: Exception) {

        }


    }

    override fun toString(): String {
        return "Alunos=${listaAluno.values.toString()}\n Professores=${listaProfessor.values.toString()}\n Cursos=${
            listaCurso.values.toString()
        }"
    }
}

























