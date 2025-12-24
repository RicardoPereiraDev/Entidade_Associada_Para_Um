package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDTO {

    private Long id;
    private String name;
    private Double salary;

    //O PersonDepartmentDTO tem uma referencia para o DepartmentDTO
   private DepartmentDTO departmentDTO;

   public PersonDepartmentDTO(){

   }

    public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO departmentDTO) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentDTO = departmentDTO;
    }

    public PersonDepartmentDTO(Person person) {
        id = person.getId();
        name = person.getName();
        salary = person.getSalary();

        //Agora na hora de copiar os dados do "Departamento" da "Person" para o DepartmentDTO, vou ter que dar um new "DepartmentDTO" puxando do "Departamento" da "Person", copiei os dados do "Department" da "Person" criando um novo DepartmentDTO
        departmentDTO = new DepartmentDTO(person.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }
}
