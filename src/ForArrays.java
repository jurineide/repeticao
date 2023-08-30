public class ForArrays {
    public static void main(String[] args) {
        String alunos[] ={"FELIPE", "JOSE", "MARIA", "CARLOS"};
        for(int x=0; x<alunos.length; x++){
            //enquanto x for menor que o tamanho da lista de alunos , incrementa mais um
            System.out.println("o aluno no indice "+ x + " é " + alunos[x]);
        }
    }
}
