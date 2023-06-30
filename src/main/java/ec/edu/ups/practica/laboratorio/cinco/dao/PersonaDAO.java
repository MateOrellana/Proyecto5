/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.laboratorio.cinco.dao;

import ec.edu.ups.practica.laboratorio.cinco.modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.practica.laboratorio.cinco.idao.IPersonaDAO;

/**
 *
 * @author mateo
 */
public class PersonaDAO implements IPersonaDAO{
    private List<Persona> personas;

    public PersonaDAO() {
        this.personas = new ArrayList<>();
    }

    @Override
    public void create(Persona persona) {
        personas.add(persona);
    }

    @Override
    public Persona read(int codigo) {
        for (Persona persona : personas) {
            if (persona.getCodigo() == codigo) {
                return persona;
            }
        }
        return null;
    }

    @Override
    public void update(Persona persona) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCodigo() == persona.getCodigo()) {
                personas.set(i, persona);
                break;
            }
        }
    }

    @Override
    public void delete(int codigo) {
        personas.removeIf(persona -> persona.getCodigo() == codigo);
    }

    @Override
    public List<Persona> getAll() {
        return personas;
    }
}
