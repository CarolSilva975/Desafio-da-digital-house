class ProfessorAdjunto(nomeProf: String, sobrenomeProf: String, codProfessor: Int, var qtdMonitoria: Int)
    : Professor(nomeProf, sobrenomeProf, codProfessor) {

    override fun toString(): String {
        return "Professor Adjunto: $nomeProf $sobrenomeProf cod: $codProfessor horas de monitoria: $qtdMonitoria"
    }


}
