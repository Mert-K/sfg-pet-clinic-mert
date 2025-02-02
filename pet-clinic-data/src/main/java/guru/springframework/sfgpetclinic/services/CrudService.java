package guru.springframework.sfgpetclinic.services;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;


//CrudService is mimicking Spring Data Repositories (like CrudRepository<T,ID>)
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
