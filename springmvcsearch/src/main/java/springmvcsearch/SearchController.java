package springmvcsearch;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home view!");
		return "home";

	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {

		String url = "https:///www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;

	}
}