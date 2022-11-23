package via.sdj3.slaugtherhouse2.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaugtherhouse2.domain.Tray;

@Repository
public interface ITrayRep extends JpaRepository<Tray, Long> {

}
