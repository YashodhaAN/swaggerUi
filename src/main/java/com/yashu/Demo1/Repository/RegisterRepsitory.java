package com.yashu.Demo1.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yashu.Demo1.Entity.Register;

@Repository
public interface RegisterRepsitory extends JpaRepository<Register, Integer>
{


	
}
