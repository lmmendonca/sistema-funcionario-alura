public class Cliente implements Autenticavel {

    private MetodosAutenticadores autenticadores = new MetodosAutenticadores();

    public void setSenha(int senha) {
        this.autenticadores.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticadores.autentica(senha);
    }
}
