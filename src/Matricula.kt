import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class Matricula(val aluno: Aluno, val curso: Curso) {

    val data = Date()
    override fun toString(): String {
        return "${aluno.nome} está matriclulado(a) ${curso.nomeCurso} "
    }

}