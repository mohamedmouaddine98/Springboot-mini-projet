package com.miniprojet.miniprojet.Controller;

import com.miniprojet.miniprojet.Model.CaseTest;
import com.miniprojet.miniprojet.Repo.CaseTestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cases")
public class CaseTestController {

    private final CaseTestRepo caseTestRepo;

    @Autowired
    public CaseTestController(CaseTestRepo caseTestRepo) {
        this.caseTestRepo = caseTestRepo;
    }

    @GetMapping
    public List<CaseTest> getAllCaseTests() {
        return caseTestRepo.findAll();
    }

    @GetMapping("/{id}")
    public CaseTest getCaseTestById(@PathVariable("id") Long id) {
        return caseTestRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("cant found case"));
    }

    @PostMapping
    public CaseTest createCaseTest(@RequestBody CaseTest caseTest) {
        return caseTestRepo.save(caseTest);
    }

    @PutMapping("/{id}")
    public CaseTest updateCaseTest(@PathVariable("id") Long id, @RequestBody CaseTest updatedCaseTest) {
        return caseTestRepo.findById(id)
                .map(caseTest -> {
                    caseTest.setTitle(updatedCaseTest.getTitle());
                    caseTest.setDescription(updatedCaseTest.getDescription());
                    caseTest.setLastUpdateDate(new Date());
                    return caseTestRepo.save(caseTest);
                })
                .orElseThrow(() -> new RuntimeException("can't found case " ));
    }

    @DeleteMapping("/{id}")
    public void deleteCaseTest(@PathVariable("id") Long id) {
        caseTestRepo.deleteById(id);
    }
}