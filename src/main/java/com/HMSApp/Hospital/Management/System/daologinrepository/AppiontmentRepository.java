package com.HMSApp.Hospital.Management.System.daologinrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HMSApp.Hospital.Management.System.doclogin.entity.Appointment;

@Repository
public interface AppiontmentRepository extends JpaRepository<Appointment,Long> {

}
