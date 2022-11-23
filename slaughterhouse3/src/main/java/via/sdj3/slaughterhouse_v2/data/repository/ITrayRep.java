package via.sdj3.slaughterhouse_v2.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhouse_v2.domain.Tray;

@Repository
public interface ITrayRep extends JpaRepository<Tray, Long> {

}
