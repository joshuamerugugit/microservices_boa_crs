package com.crs.services;

import com.crs.entity.CourseEntity;

public interface AdminService 
{
	public CourseEntity addCourse(CourseEntity course);
	public CourseEntity removeCourse(CourseEntity course);
	
	
}
