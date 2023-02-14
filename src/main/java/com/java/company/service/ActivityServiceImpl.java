package com.java.company.service;

import com.java.company.model.Activity;
import com.java.company.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public Collection<Activity> findAllActivities() {
        return activityRepository.findAll();
    }

    @Override
    public Activity addActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public Activity updateActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public void deleteActivityById(Long id) {
        activityRepository.deleteById(id);
    }

    @Override
    public Activity findActivityById(Long id) {
        return activityRepository.findById(id).orElseThrow();
    }
}
