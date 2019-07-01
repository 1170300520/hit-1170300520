package top.guoziyang.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import top.guoziyang.pojo.User;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

  @Insert("INSERT INTO user(name, email, phone) VALUES(#{name}, #{email}, #{phone})")
  void insertUser(User user);

  @Select("SELECT * FROM user")
  List<User> selectAll();

  @Delete("DELETE FROM user where id=#{id}")
  void deleteUser(Integer id);

  @Update("UPDATE user SET name=#{name}, email=#{email}, phone=#{phone} WHERE id=#{id}")
  void updateUser(User user);

}
