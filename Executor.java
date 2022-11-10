public class Executor {
    public static void main(String[] args) {
        Conta dados = new Conta();

        dados.setNome("Matheus");
        dados.setIdade("21");
        dados.setAltura("1.80");

        System.out.println("Conta criada com sucesso");
        System.out.println(dados.getNome());
        System.out.println(dados.getIdade());
        System.out.println(dados.getAltura());
    }
}
