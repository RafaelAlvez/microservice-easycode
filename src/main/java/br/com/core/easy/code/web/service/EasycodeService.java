package br.com.core.easy.code.web.service;

import br.com.core.easy.code.web.domain.Course;
import br.com.core.easy.code.web.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EasycodeService {

    private final CourseRepository courseRepository;

    public Iterable<Course> listAll(Pageable pageable) {
        log.info("*** Listing all courses. ***");
        return courseRepository.findAll(pageable);
    }

}