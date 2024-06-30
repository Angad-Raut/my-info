package com.projectx.my_info.repository;

import com.projectx.my_info.entity.DocumentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentDetailsRepository extends JpaRepository<DocumentDetails,Long> {
}
