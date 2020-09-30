fun main() {


    var digitalHouseManager = DigitalHouseManager()
    //registro dos cursos
    digitalHouseManager.registrarCurso("Android", 20002, 2)
    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)

    //registro dos professores adjuntos
    digitalHouseManager.registrarProfessorAdjunto("Vitoria", "Gonçalves", 1098, 34)
    digitalHouseManager.registrarProfessorAdjunto("Adão", "Macedo", 1234, 40)

    //registro dos professores titular
    digitalHouseManager.registrarProfessorTitular("Joao", "Silva", 2300, "Android")
    digitalHouseManager.registrarProfessorTitular("Wagner", "Silva", 2004, "Desenvolvimento web")

    //matricula de alunos
    digitalHouseManager.matricularAluno("Carol", "Silva", 123)
    digitalHouseManager.matricularAluno("Ana", "Araujo", 124)
    digitalHouseManager.matricularAluno("Danilo", "Macedo", 125)

    digitalHouseManager.matricularAluno(123, 20001)
    digitalHouseManager.matricularAluno(124, 20001)

    digitalHouseManager.matricularAluno(123, 20002)
    digitalHouseManager.matricularAluno(124, 20002)
    digitalHouseManager.matricularAluno(125, 20002)
    println("\n-------------------------------\n")

    //alocação de professores
    digitalHouseManager.alocarProfessores(20002, 2004, 1234)
    digitalHouseManager.alocarProfessores(20001, 2300, 1098)
    println("\n-------------------------------\n")
    println(digitalHouseManager)

}