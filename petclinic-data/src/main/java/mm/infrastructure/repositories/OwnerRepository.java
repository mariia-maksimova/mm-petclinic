package mm.infrastructure.repositories;

import mm.domain.persons.owners.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
        Owner findByLastName(String lastName);
}
