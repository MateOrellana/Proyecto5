/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.laboratorio.cinco.dao;

import ec.edu.ups.practica.laboratorio.cinco.modelo.Cantante;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.practica.laboratorio.cinco.idao.ICantanteDAO;

/**
 *
 * @author mateo
 */
public class CantanteDAO implements ICantanteDAO{
    private List<Cantante> cantantes;

    public CantanteDAO() {
        this.cantantes = new ArrayList<>();
    }

    @Override
    public void create(Cantante cantante) {
        cantantes.add(cantante);
    }

    @Override
    public Cantante read(int codigo) {
        for (Cantante cantante : cantantes) {
            if (cantante.getCodigo() == codigo) {
                return cantante;
            }
        }
        return null;
    }

    @Override
    public void update(Cantante cantante) {
        for (int i = 0; i < cantantes.size(); i++) {
            if (cantantes.get(i).getCodigo() == cantante.getCodigo()) {
                cantantes.set(i, cantante);
                break;
            }
        }
    }

    @Override
    public void delete(int codigo) {
        cantantes.removeIf(cantante -> cantante.getCodigo() == codigo);
    }

    @Override
    public List<Cantante> getAll() {
        return cantantes;
    }
}
