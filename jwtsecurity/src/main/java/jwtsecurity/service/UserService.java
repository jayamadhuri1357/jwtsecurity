package jwtsecurity.service;

import jwtsecurity.entity.User;
import jwtsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public User register(User user) {

        if (repository.findByUsername(user.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new RuntimeException("Username cannot be empty");
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new RuntimeException("Password cannot be empty");
        }

        user.setPassword(encoder.encode(user.getPassword()));

        return repository.save(user);
    }
}