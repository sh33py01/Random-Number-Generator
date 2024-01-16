package RandomNumberGenerator;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@RequestMapping("/")
	public int index() {
		logger.info("Info level log message");
        logger.error("Error level log message");
//		String style = "\"color:white;font-size:10rem;position: absolute; top: 30%;left: 50%;-moz-transform: translateX(-50%) translateY(-50%);-webkit-transform: translateX(-50%) translateY(-50%);transform: translateX(-50%) translateY(-50%);\"";
//		return "<!doctypehtml><html><head><title>RandomNumber</title></head><body style=\"background:black\"><h1 style="
//				+ style + ">" + new Random().nextInt(1000001) + "</h1></body></html>";

		return new Random().nextInt(1000001);
	}
}
