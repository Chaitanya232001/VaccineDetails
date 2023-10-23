package com.vaccine.VaccineDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaccine.VaccineDetails.Model.Vaccine;
import com.vaccine.VaccineDetails.Repository.VaccineRepo;
import com.vaccine.VaccineDetails.Service.VaccineService;

@Controller
public class FirstController {
    @Autowired
     VaccineRepo obj;

     @GetMapping("/Home")
     public String homepg(){
        return "Home";
     }

      @GetMapping("/vaccineForm")
     public String regipg(){
        return "vaccineForm";
     }

     @PostMapping("/vaccineForm")
     public String regipg1(@ModelAttribute Vaccine a){
        Vaccine b = obj. save(a);
        System.out.println(b);
        return "vaccineForm";
     }
     @GetMapping("/getuser")
     public String getAllSignup(Model model) {
         List<Vaccine> users = VaccineService.getAllSignup();
         model.addAttribute("users", users);
         return "userList"; // Create a user list view
     }
}
