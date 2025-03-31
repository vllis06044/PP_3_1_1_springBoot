package vllis.PP_3_1_1_springboot.dao;

import vllis.PP_3_1_1_springboot.entities.User;
import java.util.List;

public interface UserDao {
    void save(User user);
    void update(User user);
    void delete(Long id);
    User findById(Long id);
    List<User> findAll();
}