package com.uabc.edu.clase.backend.repository;

import com.uabc.edu.clase.backend.model.Billionaires;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BillionairesRepository extends CrudRepository<Billionaires,Long> {
//    /***
//     * Busca billonarios por apellido
//     * @param lastName apellido
//     * @return List<Billionaires> lista de billonarios
//     */
//    public List<Billionaires> findByLastNameBetween(String lastName);
//    /***
//     * Busca un billonario por id
//     * @return Billionaires billionario encontrado
//     * @param id identificador de Billonario
//     */
//    public Billionaires findById(long id);
}
