package com.yinuo.training.collection;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by Bill Lv on 7/12/16.
 */
public class UserRepositoryTest {
    @Test
    public void findById() throws Exception {
        final Optional<Users> user = UserRepository.getInstance().findById(2L);
        System.out.println(user.get());
    }

}