package com.icode.ng;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TutorialController {
	
	@PostMapping("/tutorials")
	public ResponseEntity<TutorialBean> create(@RequestBody TutorialBean bean) {
		System.out.println(String.format("%s %s   ", bean.getTitle(),bean.getDescription()) );
		return new ResponseEntity<TutorialBean>(bean,HttpStatus.ACCEPTED);
	}
	@GetMapping("/tutorials")
	public ResponseEntity<TutorialBean> getAll() {
		return new ResponseEntity<TutorialBean>(HttpStatus.ACCEPTED);
	}

}
