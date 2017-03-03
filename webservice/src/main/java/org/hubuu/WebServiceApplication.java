package org.hubuu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class WebServiceApplication {

  @RequestMapping(value = "/movies", produces = "application/json")
  public List<String> available() {
    List<String> movies = new ArrayList<>();
    movies.add("Star Wars - A new Hope (1977)");
    movies.add("Star Wars - The Empire Strikes Back (1980)");
    movies.add("Star Wars - Return of the Jedi (1983)");
    movies.add("Matrix (1999)");
    movies.add("The Lord of the Rings - The Fellowship of the Ring (2001)");
    movies.add("The Lord of the Rings - The Two Towers (2002)");
    movies.add("The Lord of the Rings - The Return of the King (2003)");
    movies.add("The Dark Knight (2008)");
    movies.add("Logan (2017)");
    return movies;
  }

  public static void main(String[] args) {
    SpringApplication.run(WebServiceApplication.class, args);
  }
}