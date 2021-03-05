package com.heima.service;

import com.heima.mapper.UserMapper;
import com.heima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public User queryById(Long id) {
    User user = this.userMapper.selectByPrimaryKey(id);
    return user;
  }

  @Transactional
  public void deleteById(Long id) {
    this.userMapper.deleteByPrimaryKey(id);
  }

  public List<User> queryAll() {
    List<User> list = userMapper.selectAll();
    return list;
  }
}
