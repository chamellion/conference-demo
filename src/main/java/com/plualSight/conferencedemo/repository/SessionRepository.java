package com.plualSight.conferencedemo.repository;

import com.plualSight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {


}
