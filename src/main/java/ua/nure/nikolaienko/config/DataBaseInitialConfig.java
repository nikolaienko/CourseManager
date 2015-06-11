// ============================================================================
//  File          : DataBaseInitialConfig
//  Created       : 10.06.15   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Nikolaienko Vlasyslav, Ukraine
// ============================================================================
package ua.nure.nikolaienko.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ua.nure.nikolaienko.entity.Course;
import ua.nure.nikolaienko.entity.Part;
import ua.nure.nikolaienko.entity.User;
import ua.nure.nikolaienko.entity.Week;
import ua.nure.nikolaienko.repository.CourseRepository;
import ua.nure.nikolaienko.repository.PartRepository;
import ua.nure.nikolaienko.repository.UserRepository;
import ua.nure.nikolaienko.repository.WeekRepository;

import java.util.Date;

import static java.util.Arrays.asList;

/**
 * @author by Nikolaienko Vladyslav on 10.06.15.
 * @version 1.0
 */
@Component
public class DataBaseInitialConfig implements CommandLineRunner {

    @Autowired
    WeekRepository weekRepository;
    @Autowired
    private UserRepository repository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private PartRepository partRepository;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setLogin("vlad");
        user.setPassword("vlad");
        Course course = new Course();
        course.setName("Android");
        course.setDescription("Android development");
        Week week = new Week();
        week.setNumber(1);
        week.setEstimate(10);
        week.setDue(new Date(2015, 07, 15));
        Part part = new Part();
        part.setDescription("Lecture 1 Android");
        part.setName("lecture");
        partRepository.save(part);
        week.setParts(asList(part));
        weekRepository.save(week);
        course.setWeeks(asList(week));
        courseRepository.save(course);
        user.addCourse(course);
        repository.save(user);
    }
}
