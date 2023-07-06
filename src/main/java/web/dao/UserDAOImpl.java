package web.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepImpl implements UserRep {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public UserRepImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
    @Override
    public void createUser(User user) {
        entityManager.persist(user);
    }
    @Override
    public User readUser(long id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void updateUser(User userOld, Long id) {
        User userNew = readUser(id);
        userNew.setName(userOld.getName());
        userNew.setLastName(userOld.getLastName());
        userNew.setAge(userOld.getAge());
        userNew.setNational(userOld.getNational());
    }
    @Override
    public void deleteUser(long id) {
        User userNow = entityManager.find(User.class, id);
        entityManager.remove(userNow);
    }
}