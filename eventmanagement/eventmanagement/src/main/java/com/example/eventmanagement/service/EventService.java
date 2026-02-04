package com.example.eventmanagement.service;

import java.util.List;
import com.example.eventmanagement.model.Event;

public interface EventService {

    Event createEvent(Event event);

    Event getEventById(Long id);

    List<Event> getAllEvents();

    Event updateEvent(Long id, Event event);

    void deleteEvent(Long id);
}

