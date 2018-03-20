package io.github.bibekshakya35.resttdd.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloResource {
    @GetMapping
    public String helloWorld() {
        return "hello world";
    }
    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBook(){
        return new Book("Spring In Action","12");
    }
    private class Book{
        private String title;
        private String page;

        public Book(String title, String page) {
            this.title = title;
            this.page = page;
        }

        public String getTitle() {

            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }
    }
}
