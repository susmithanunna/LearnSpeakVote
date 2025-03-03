package com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Service;

import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Entity.Event;
import com.example.DIGITAL.SOLUTION.FOR.CAMPUS.LIFE.Repository.EventRepository;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public void createEvent(Event event) {
        eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
