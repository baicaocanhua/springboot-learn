package com.example.springboottransactional.mapper;

import com.example.springboottransactional.domain.User;

import java.util.List;

/**
 * descripiton:
 *
 * @author: kinson(2219945910 @ qq.com)
 * @date: 2019/1/31
 * @time: 21:43
 * @modifier:
 * @since:
 */
public interface UserMapper {

    List<User> selectUserList();

    User selectUserById(final Integer id);

    void delete(final Integer id);

    void update(final User user);
}
