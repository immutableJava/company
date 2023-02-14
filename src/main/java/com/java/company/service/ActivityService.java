package com.java.company.service;

import com.java.company.model.Activity;

import java.util.Collection;

public interface ActivityService {

    Collection<Activity> findAllActivities();

    Activity addActivity(Activity activity);

    Activity updateActivity(Activity activity);

    void deleteActivityById(Long id);

    Activity findActivityById(Long id);

}
