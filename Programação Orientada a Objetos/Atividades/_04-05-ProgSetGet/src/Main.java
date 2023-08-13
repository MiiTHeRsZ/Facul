public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        if (pessoa1.isAtivo())
            System.out.println(pessoa1.id+" "+pessoa1.getNome()+" "+pessoa1.getMae()+ " " + pessoa1.getPai());
        pessoa1.id=5;
        pessoa1.setNome("Lucas");
        pessoa1.setPai("João");
                pessoa1.setMae("Karoline");
        pessoa1.setAtivo(true);
        if (pessoa1.isAtivo())
            System.out.println(pessoa1.id+" "+pessoa1.getNome()+" "+pessoa1.getMae()+" "+pessoa1.getPai());

    }
}