package com.devam.MVCInputApp.Controller;

import com.devam.MVCInputApp.Model.MVCApp;
import com.devam.MVCInputApp.Repository.MVCAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private MVCAppRepo mvcAppRepo;

    //this code shows all entries in the form
    @GetMapping("/all")
    public String showAllEntries(Model model){
        model.addAttribute("entries" , mvcAppRepo.findAll());
        return "entries";
    }
    //this code shows the add form page
    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("mvcApp", new MVCApp());
        return "add-entry";
    }
    //this code lets you add the data in the form
    @PostMapping("/add")
    public String addEntry(@ModelAttribute MVCApp mvcApp){
        mvcAppRepo.save(mvcApp);
        return "redirect:/all";
    }

}
