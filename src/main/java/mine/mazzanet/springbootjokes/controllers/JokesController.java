package mine.mazzanet.springbootjokes.controllers;

import mine.mazzanet.springbootjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chrismazza on 2019-01-25
 **/

@Controller
public class JokesController {

    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String ShowJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";

    }
}
