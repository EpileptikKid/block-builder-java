package com.educate.BlockBuilderJava;

import com.educate.BlockBuilderJava.arithmetic.ChainPoint;
import com.educate.BlockBuilderJava.arithmetic.CoordinateGenerator;
import com.educate.BlockBuilderJava.arithmetic.ValueSetter;
import com.educate.BlockBuilderJava.elements.OneTaskPoint;
import com.educate.BlockBuilderJava.elements.Point;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @RequestMapping("/numbers")
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<OneTaskPoint>> randomNumbers(@RequestParam int width,
                                            @RequestParam int height,
                                            @RequestParam int count) {
        List<OneTaskPoint> points = getTasks(width, height, count);
        return ResponseEntity.ok().body(points);
    }

    @RequestMapping("/hello")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body("hello");
    }

    public List<OneTaskPoint> getTasks(int width, int height, int count) {
        List<OneTaskPoint> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(getPoints(width, height, count, i));
        }
        return tasks;
    }

    private OneTaskPoint getPoints(int width, int height, int count, int numberTask) {
        List<Point> points = new ArrayList<>();
        int w = width/230 - 1;
        int h = height/230 - 1;
        List<Integer> integerSet = Helper.getIntegerSet(w*h, 100);



        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                Point point = new Point();
                point.setX(230 + i * 230);
                point.setY(230 + j * 230);
                point.setValue(integerSet.get(i*h + j));
                point.setId(numberTask*100 + i*10 + j);
                points.add(point);
            }
        }

        List<Integer> resultSet = Helper.getIntegerSet(count, w*h);
        List<Point> result = new ArrayList<>();
        for (int a : resultSet) {
            result.add(points.get(a));
        }

        List<Integer> orderInteger = result.stream().map(e -> e.getValue()).sorted().toList();
        OneTaskPoint oneTaskPoint = new OneTaskPoint();
        oneTaskPoint.setTaskPoints(result);
        oneTaskPoint.setCorrectOrder(orderInteger);
        return oneTaskPoint;
    }
}
