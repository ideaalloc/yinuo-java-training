package com.yinuo.training.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Title.
 * <p>
 * Description.
 *
 * @author Bill Lv {@literal <billcc.lv@hotmail.com>}
 * @version 1.0
 * @since 2016-07-12
 */
public class UserRepository {
    static class UserRepositoryHolder {
        static final UserRepository INSTANCE = new UserRepository();
    }

    public static UserRepository getInstance() {
        return UserRepositoryHolder.INSTANCE;
    }

    private UserRepository() {
        users = Arrays.asList(new Users(1L, "Cathy"), new Users(2L, "Tom"), new Users(3L, "Bill"), new Users(4L, "Gary"));
    }

    List<Users> users;

    public Optional<Users> findById(Long id) {
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }
}
