package com.projectx.my_info.repository;

import com.projectx.my_info.entity.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDetailsRepository extends JpaRepository<PersonDetails,Long> {
}
