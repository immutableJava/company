package com.java.company.controller;

import com.java.company.model.Activity;
import com.java.company.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("activity")
public class ActivityController {
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }


    @PostMapping("/create")
    public ResponseEntity<Activity> addActivity(@RequestBody Activity activity) {
        return ResponseEntity.ok(activityService.addActivity(activity));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Activity> getActivityById(@PathVariable Long id) {
        return ResponseEntity.ok(activityService.findActivityById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Activity> updateActivity(@RequestBody Activity activity) {
        return ResponseEntity.ok(activityService.updateActivity(activity));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Activity> deleteActivity(@PathVariable Long id) {
        activityService.deleteActivityById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Collection<Activity>> getAllActivities() {
        return ResponseEntity.ok(activityService.findAllActivities());
    }
}
