/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjn.primeiro.orm.teste;

import edu.fjn.primeiro.orm.model.Discipline;
import edu.fjn.primeiro.orm.repositorio.DisciplineRepository;
import edu.fjn.primeiro.orm.repositorio.util.ConnectionFactory;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author vinicius
 */
public class Executavel {

    public static void main(String[] args) {

        DisciplineRepository disciplineRepository
                = new DisciplineRepository();

        
        
        Discipline d = new Discipline();
        
        String uuid = UUID.randomUUID().toString();
        d.setName("Banco de Dados II");
       
        
        disciplineRepository.save(d);
        
        System.out.println("Deu Certo ? =  Sim");
        
        ConnectionFactory.close();
        
        
        

    }

}
