package cn.bjut.controller;

import cn.bjut.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by N3verL4nd on 2017/7/4.
 */
@Controller
public class TestController {
    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }



    @RequestMapping("/list")
    public String listPerson(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "list";
    }

}
