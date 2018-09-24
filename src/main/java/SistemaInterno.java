public class SistemaInterno {

    public static void main(String[] args) {
        Administrador adm = new Administrador("Leo","123.321.456.987", 1000, 123);

        System.out.println(adm.autentica(123));

        Cliente cliente = new Cliente();

        cliente.setSenha(123);

        System.out.println(cliente.autentica(123));
    }


}
