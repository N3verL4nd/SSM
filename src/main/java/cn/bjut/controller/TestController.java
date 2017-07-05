package cn.bjut.controller;

import cn.bjut.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by N3verL4nd on 2017/7/4.
 */
@Controller
public class TestController {
    private PersonMapper personMapper;

    @Autowired
    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @RequestMapping("/list")
    public String listPerson(Model model) {
        model.addAttribute("persons", personMapper.selectAllPersons());
        return "list";
    }

}
