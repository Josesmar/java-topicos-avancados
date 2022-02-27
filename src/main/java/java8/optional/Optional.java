package java8.optional;

public class Optional {
    public static void main(String[] args) {

        Curso cursoAdm = new Curso("Administração");

        Aluno jose = new Aluno("Josesmar");
        jose.setMatricula(new Matricula("123"));
        cursoAdm.getListaAluno().add(jose);

        Aluno maria = new Aluno("Maria");
        maria.setMatricula(new Matricula("456"));
        cursoAdm.getListaAluno().add(maria);

        Aluno ana = new Aluno("Ana");
//        ana.setMatricula(new Matricula("789"));
        cursoAdm.getListaAluno().add(ana);

        Aluno pamela = new Aluno("Pamela");
        pamela.setMatricula(new Matricula("0112"));
        cursoAdm.getListaAluno().add(pamela);

        cursoAdm.getListaAluno().stream()
                .filter(a -> a.getMatricula().isPresent())
                .forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero()));
    }
}
