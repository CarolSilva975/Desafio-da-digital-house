class ProfessorTitular(nomeProf: String, sobrenomeProf: String,
                       codProfessor: Int, var especialidade: String) : Professor(nomeProf, sobrenomeProf, codProfessor) {

    override fun toString(): String {return "Professor Titular: $nomeProf $sobrenomeProf cod: $codProfessor especialidade: $especialidade"}



}




