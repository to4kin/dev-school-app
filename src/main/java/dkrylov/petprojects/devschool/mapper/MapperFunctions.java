package dkrylov.petprojects.devschool.mapper;

import dkrylov.petprojects.devschool.model.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * Mapper functions utils.
 */
@Component
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapperFunctions {
    private static final ModelMapper modelMapper;

    static {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setSkipNullEnabled(true);
    }

    /**
     * Mapper for transforming Course DTO to entity
     *
     * @return function for mapping
     */
    public static Function<CourseDto, Course> dtoToCourseMapper() {
        return courseDto -> modelMapper.map(courseDto, Course.class);
    }

    /**
     * Mapper for transforming Course entity to DTO
     *
     * @return function for mapping
     */
    public static Function<Course, CourseDto> courseToDtoMapper() {
        return course -> modelMapper.map(course, CourseDto.class);
    }

    /**
     * Mapper for transforming Mentor DTO to entity
     *
     * @return function for mapping
     */
    public static Function<MentorDto, Mentor> dtoToMentorMapper() {
        return mentorDto -> modelMapper.map(mentorDto, Mentor.class);
    }

    /**
     * Mapper for transforming Mentor entity to DTO
     *
     * @return function for mapping
     */
    public static Function<Mentor, MentorDto> mentorToDtoMapper() {
        return mentor -> modelMapper.map(mentor, MentorDto.class);
    }

    /**
     * Mapper for transforming Mentor DTO to entity
     *
     * @return function for mapping
     */
    public static Function<SchoolDto, School> dtoToSchoolMapper() {
        return schoolDto -> modelMapper.map(schoolDto, School.class);
    }

    /**
     * Mapper for transforming Mentor entity to DTO
     *
     * @return function for mapping
     */
    public static Function<School, SchoolDto> schoolToDtoMapper() {
        return school -> modelMapper.map(school, SchoolDto.class);
    }

}
