/**
 * 
 */
package psa.springframework.joke.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import psa.springframework.joke.services.JokeService;

/**
 * Created by pyaesoneaung on 20/04/2020
 *
 */
@Controller
public class JokeController {
	
	private final JokeService jokeService;

	/**
	 * @param jokeService
	 */
	@Autowired
	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJokes());
		return "chucknorris";
	}
			

}
