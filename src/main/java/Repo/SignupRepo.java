package Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import Model.SignUps;

@Repository
@Component
public interface SignupRepo extends JpaRepository<SignUps, Integer>
{
}
