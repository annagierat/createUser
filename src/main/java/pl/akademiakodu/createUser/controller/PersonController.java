package pl.akademiakodu.createUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.createUser.exceptions.ResourceAlreadyExists;
import pl.akademiakodu.createUser.model.Person;
import pl.akademiakodu.createUser.service.PersonService;

@Controller
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "home";
    }

    @PostMapping("/person")
        public String addPerson(@ModelAttribute Person person, Model model) {
            if (personService.findByFirstNameAndLastName(person.getFirstName(),person.getLastName())!= null){
         //           throw new ResourceAlreadyExists("""User exists in DB", "name", person.getFirstName() + " " + person.getLastName());
        }
            personService.createPerson(person);
            model.addAttribute("persons", personService.getAllPersons());
            return "result";

    }


}
