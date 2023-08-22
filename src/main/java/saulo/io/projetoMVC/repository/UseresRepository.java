package saulo.io.projetoMVC.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import saulo.io.projetoMVC.entity.Useres;

/**
 * Interface repository que tem uma extensão de algum repository (depende do BD)
 * e onde vc pode parametrizar suas probrias buscas ao BD
 * 
 * @author EDS
 *
 */

public interface UseresRepository extends MongoRepository<Useres, Long> {

	Useres findByName(String name);

	Useres findByNameIgnoreCase(String name);

	Useres findByNameIgnoreCaseLike(String name);

	Useres findByNameLike(String name);

	void deleteByName(String name);

	@Query(value = "{ 'name' : ?0 }")
	List<Useres> findByFirstnameprimeiro(String name);

}
