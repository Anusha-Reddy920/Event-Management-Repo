package com.example.eventmanagement.service;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EventServiceTest {

    @Mock
    private EventRepository eventRepository;

    @InjectMocks
    private EventServiceImpl eventService;

    // ✅ Test Get Event By Id
    @Test
    void testGetEventById() {

        Event event = new Event();
        event.setId(1L);
        event.setName("Tech Event");

        when(eventRepository.findById(1L))
                .thenReturn(Optional.of(event));

        Event result = eventService.getEventById(1L);

        assertNotNull(result);
        assertEquals("Tech Event", result.getName());
    }

    // ✅ Test Create Event
    @Test
    void testCreateEvent() {

        Event event = new Event();
        event.setName("Conference");

        when(eventRepository.save(event))
                .thenReturn(event);

        Event saved = eventService.createEvent(event);

        assertEquals("Conference", saved.getName());
    }
}