package com.orders.crx.simpleMS.accesingdatarest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// TODO: Why this is a repository???

// CrudRespository creates a full crud operations based on what with put inside the <T, ID> Person in this case, spring data rest is responsible for this

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, CrudRepository<Person, Long> {
    List<Person> findByLastName(@Param("name") String name);
}
