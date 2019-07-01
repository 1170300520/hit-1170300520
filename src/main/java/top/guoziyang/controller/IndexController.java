package top.guoziyang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import top.guoziyang.pojo.User;
import top.guoziyang.service.UserService;

@Controller
public class IndexController {

  @Autowired
  private UserService userService;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("users", userService.selectAll());
    return "index";
  }

  @PostMapping("/")
  public String addUser(User user) {
    userService.insertUser(user);
    return "redirect:/";
  }

  @PostMapping("/delete")
  public String deleteUser(Integer id) {
    userService.deleteUser(id);
    return "redirect:/";
  }

  @PostMapping("/update")
  public String updateUser(User user) {
    userService.updateUser(user);
    return "redirect:/";
  }

}
