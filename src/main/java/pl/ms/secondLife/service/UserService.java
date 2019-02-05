package pl.ms.secondLife.service;

import pl.ms.secondLife.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
