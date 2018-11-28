package com.example.spring_boot.Spring_Boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1l, "Mastering Spring 5.0", "RangaKaranam"),
				new Book(2l,"Java with JDBC", "Abdul"));
	}
	

}
