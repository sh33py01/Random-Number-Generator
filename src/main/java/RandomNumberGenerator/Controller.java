package RandomNumberGenerator;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

	@RequestMapping("/")
	public int index() {
		return new Random().nextInt(1000001);
	}
}
