// classe representando nossa entidade de usuário
class UserModel {

    int idUser;

    String descricao;

    final static int IDADE_MINIMA = 18;

    // função que coleta todos os usuários
    public List<User> getUsers() {
        return new ArrayList<>();
    }
}