package br.com.core.easy.code.web.controller;

import br.com.core.easy.code.web.domain.Course;
import br.com.core.easy.code.web.service.EasycodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/admin/courses")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EasycodeController {

    private final EasycodeService easycodeService;

    @GetMapping
    public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
        return ResponseEntity.ok(easycodeService.listAll(pageable));
    }

}