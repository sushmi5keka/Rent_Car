package com.israt.contoller;

import com.israt.entity.LogIn;
import com.israt.entity.Role;
import com.israt.repo.LoginRepo;
import com.israt.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/login/")
public class LoginController {

    @Autowired
    private LoginRepo repo;

    @GetMapping(value = "create.jsf")
    public String displayRole(Model model){
        Model objt = model.addAttribute("objt", new LogIn());
        return "login/create";

    }

    @PostMapping(value = "create.jsf")
    public String saveRole(@Valid LogIn objt, BindingResult result,Model model){
      if(objt !=null) {
          repo.save(objt);
          model.addAttribute("successMsg", "Success");
          model.addAttribute("objt", new LogIn());
      }
        return "login/create";
    }

}
