package com.ferhat.pubsub.repository;

import com.ferhat.pubsub.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String> {


    Department findByDepartmentId(String departmentId);

    Department findByUserUserId(String userDepartmentId);
}
