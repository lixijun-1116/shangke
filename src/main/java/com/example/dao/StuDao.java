package com.example.dao;

import com.example.entity.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface StuDao extends ElasticsearchRepository<Student,Long> {
}
