package com.example.eventmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.eventmanagement.exception.EventNotFoundException;
import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository repository;

    public EventServiceImpl(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public Event createEvent(Event event) {
        return repository.save(event);
    }

    @Override
    public Event getEventById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new EventNotFoundException("Event not found with id " + id));
    }

    @Override
    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    @Override
    public Event updateEvent(Long id, Event event) {
        Event existing = getEventById(id);

        existing.setName(event.getName());
        existing.setLocation(event.getLocation());
        existing.setDate(event.getDate());
        existing.setDescription(event.getDescription());

        return repository.save(existing);
    }

    @Override
    public void deleteEvent(Long id) {
        repository.delete(getEventById(id));
    }
}