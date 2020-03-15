package com.youfan.control;

import com.youfan.model.User;
import com.youfan.service.UserService;
import com.youfan.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/touserregister", method = RequestMethod.GET)
    public String toUserRegister() {
        return "userregister";
    }

    @RequestMapping(value = "/userregister", method = RequestMethod.POST)
    public void userRegister(User user) {
        userService.insertUserInfo(user);
        return;
    }

    @RequestMapping(value = "/toupdateuser", method = RequestMethod.GET)
    public String toUpdateUser(int id, Model model) {
        User user = userService.findByUserid(id);
        model.addAttribute("user", user);
        return "userupdate";
    }

    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    @RequestMapping(value = "/findbyuserid", method = RequestMethod.GET)
    public String findByUserid(int id, Model model) {
        User user = userService.findByUserid(id);
        model.addAttribute(user);
        return "userview";
    }

    @RequestMapping(value = "/queryuserbyvo", method = RequestMethod.GET)
    public String queryUserByVo(Model model) {
        UserVo userVo = new UserVo();
        List<User> userList = userService.queryUserByVo(userVo);
        model.addAttribute("userList", userList);
        return "userlist";
    }

    @RequestMapping(value = "/deleteuserbyid", method = RequestMethod.GET)
    public void deleteUserById(int id) {
        userService.deleteUserById(id);
    }

}
