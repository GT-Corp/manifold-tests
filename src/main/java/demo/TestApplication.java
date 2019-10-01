package demo;

import demo.dto.Car;
import demo.dto.CarDto;
import demo.dto.CarMapper;
import res.AppProps;
import res.Person;

import java.util.List;

import static java.lang.System.out;

public class TestApplication {

    public static void main(String[] args) {

        CarDto dto = CarMapper.INSTANCE.toDto(new Car(10L, "Honda"));
        out.println(dto.getCarMaker());

        //test 0 - testing extension fn
        new Car(1L, "Toyota").drive(100);

        //test 1 - extension fn from manifest
        out.println(List.of("A", "B", "C").last());

        //test 2 - custom ext fn
        out.println("test".getTotalLength("another"));

        //test3 - property mapping
        out.println(AppProps.name);

        //test4 - json
        out.println(Person.fromSource().getHobby().first());


    }
}