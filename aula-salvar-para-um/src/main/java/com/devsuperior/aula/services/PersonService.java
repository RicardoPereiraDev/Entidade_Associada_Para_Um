package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    //metodo para retornar um PersonDepartmentDTO, e que vai receber argumentos
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){

        Person person = new Person();
        person.setName(dto.getName());
        person.setSalary(dto.getSalary());

        Department department = new Department();
        department.setId(dto.getDepartmentDTO().getId());

        person.setDepartment(department);

        person = personRepository.save((person));

        return new PersonDepartmentDTO(person);
    }
}
