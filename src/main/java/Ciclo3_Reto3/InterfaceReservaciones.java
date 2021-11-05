/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ciclo3_Reto3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Date;

/**
 *
 * @author
 */
public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer>{
    
     public List<Reservaciones> findAllByStatus (String status);
     
     public List<Reservaciones> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);
    
    @Query ("SELECT c.client, COUNT(c.client) from Reservaciones AS c group by c.client order by COUNT(c.client)DESC")
    
    public List<Object[]> countTotalReservationsByClient();

}