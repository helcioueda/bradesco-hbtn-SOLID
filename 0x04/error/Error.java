public class Error {

    // Usa Exceções em vez de retornar um código
    public User createUser(User user) {
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception) {
            // detalhe aqui
        }
        resolveGroup(user);
        return userRepository.save(user);
    }

    // Exceções com contexto
    public void validate(String id) {
        if (ownerRepo.count(id) == 0) {
            throw new ValidationException("id: " + id + " não foi informado, deveria ser informado...");
        }
    }

    // Não retorna null e não passa null
    public User createUser(User user) {
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception) {
            // detalhe aqui
        }
        resolveGroup(user);
        return userRepository.save(user);
    }
}