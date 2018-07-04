package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
	public studentPOJO greeing(@RequestParam(value= "name", defaultValue="World")String name) {
		return new studentPOJO(11,"Jancsi","Manna","informatika",1,"2017-05-14","2018-08-03 00:25:14");
	}
}
