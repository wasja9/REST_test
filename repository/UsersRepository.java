package ALL.repository;

import ALL.models.US;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by asu on 07.08.2020.
 */
public interface UsersRepository extends JpaRepository<US,Integer> {
}
