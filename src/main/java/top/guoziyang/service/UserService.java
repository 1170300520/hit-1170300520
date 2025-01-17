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
    mapper.insert(user);
  }

  public List<User> selectAll() {
    return mapper.selectAll();
  }

  public void deleteUser(Integer id) {
    mapper.delete(id);
  }

  public void updateUser(User user) {
    mapper.update(user);
  }

}
