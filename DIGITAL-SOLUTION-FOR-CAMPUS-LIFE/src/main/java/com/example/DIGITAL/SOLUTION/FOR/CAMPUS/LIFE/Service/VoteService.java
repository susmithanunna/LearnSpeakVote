package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Vote;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public void castVote(String candidateName) {
        Vote vote = voteRepository.findByCandidateName(candidateName)
                .orElse(new Vote(candidateName, 0));
        vote.setVoteCount(vote.getVoteCount() + 1);
        voteRepository.save(vote);
    }

    public List<Vote> getResults() {
        return voteRepository.findAll();
    }
}
