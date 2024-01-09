package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String hello(){
        return "<h1>Here are some fun skills I'd love to learn:</h1>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm(){
        return "<body>" +
                "<form method='post' action='submit'>" +
                "<label>Name:</br><input type='text' name='name'></label></br>" +
                "<label>First Favorite Language:</br>" +
                "<select name=first>" +
                "<option value=''>Select One</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select></br>" +
                "<label>Second Favorite Language:</br>" +
                "<select name=second>" +
                "<option value=''>Select One</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select></br>" +
                "<label>Third Favorite Language:</br>" +
                "<select name=third>" +
                "<option value=''>Select One</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select></br>" +
                "</br><input type='submit' value='Submit'" +
                "</form>" +
                "</body>";
    }

    @RequestMapping(value = "submit", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String submission(@RequestParam String name, @RequestParam String first, @RequestParam String second,
    @RequestParam String third){
        return "<h1>Hello! My name is " + name +".</h1>" +
                "<ol>" +
                "<li>My favorite language is: "+ first + "</li>" +
                "<li>My second favorite language is: " + second +"</li>" +
                "<li>My least favorite language is: "+ third +"</li>" +
                "</ol>";
    };


}
