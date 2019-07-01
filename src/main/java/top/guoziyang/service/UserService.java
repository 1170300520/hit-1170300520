package top.guoziyang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.guoziyang.mapper.UserMapper;
import top.guoziyang.pojo.User;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserMapper mapper;

  public void insertUser(User user) {
    mapper.insertUser(user);
  }

  public List<User> selectAll() {
    return mapper.selectAll();
  }

  public void deleteUser(Integer id) {
    mapper.deleteUser(id);
  }

  public void updateUser(User user) {
    mapper.updateUser(user);
  }

}
