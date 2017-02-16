package com.ebsco.demo.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookApplication {

  @RequestMapping(value = "/magazine", method = RequestMethod.GET)
  public Publication getMagazine() {
    return new Publication("Fine Woodworking");
  }

  @RequestMapping(value = "/book", method = RequestMethod.GET)
  public Publication getBook() {
    return new Publication("Don Quixote");
  }

  public static void main(String[] args) {
    SpringApplication.run(BookApplication.class, args);
  }
}