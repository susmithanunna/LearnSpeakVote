package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Controller;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Vote;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service.VoteService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VoteController {
    @Autowired
    private VoteService voteService;

    @PostMapping("/voting/cast")
    public ResponseEntity<String> castVote(@RequestParam String candidateName) {
        voteService.castVote(candidateName);
        return ResponseEntity.ok("Vote cast successfully");
    }

    @GetMapping("/voting/results")
    public List<Vote> getResults() {
        return voteService.getResults();
    }

}
