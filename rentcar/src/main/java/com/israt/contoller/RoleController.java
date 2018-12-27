package com.israt.contoller;

import com.israt.entity.Role;
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
@RequestMapping(value = "/role/")
public class RoleController {

    @Autowired
    private RoleRepo repo;

    @GetMapping(value = "create.jsf")
    public String displayRole(Model model){
        Model obj = model.addAttribute("obj", new Role());
        return "role/create";

    }

    @PostMapping(value = "create.jsf")
    public String saveRole(@Valid Role obj, BindingResult result,Model model){
      if(obj !=null) {
          repo.save(obj);
          model.addAttribute("successMsg", "Success");
          model.addAttribute("obj", new Role());
      }
        return "role/create";
    }

}
