public class TesteLecionar {
  public static void main(String[] args) {
    ProfessorHorista ph = 
    new ProfessorHorista();
    ph.setNome("Jose");
    ProfessorPesquisador pp = 
    new ProfessorPesquisador();
    pp.setNome("Pedro");
    ph.lecionar();
    pp.lecionar();
  }
}
