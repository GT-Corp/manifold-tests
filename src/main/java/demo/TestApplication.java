package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static java.lang.System.out;

public class TestApplication {

    public static void main(String[] args) {

        CarDto dto = CarMapper.INSTANCE.toDto(new Car(10L, "Honda"));
        out.println(dto.getCarMaker());

        out.println(List.of("A", "B", "C").last());
    }
}

@Mapper
interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "make", target = "carMaker")
    CarDto toDto(Car car);
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Car {
    Long id;
    String make;
}

@Data
class CarDto {
    String carMaker;
}