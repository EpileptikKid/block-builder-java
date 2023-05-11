package com.educate.BlockBuilderJava;

import com.educate.BlockBuilderJava.elements.Point;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @RequestMapping("/home")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Point> home(@RequestParam int width,
                                      @RequestParam int height) {

        Point point = new Point();
        int x = (int) (Math.random()*(width - 100));
        int y = (int) (150 + Math.random()*(height- 250));
        point.setX(x);
        point.setY(y);
        System.out.println("x - " + x + ", y - " + y);
        return ResponseEntity.ok().body(point);
    }
}
