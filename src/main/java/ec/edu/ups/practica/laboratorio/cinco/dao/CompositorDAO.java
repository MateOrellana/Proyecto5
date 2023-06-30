/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.laboratorio.cinco.dao;

import ec.edu.ups.practica.laboratorio.cinco.modelo.Compositor;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.practica.laboratorio.cinco.idao.ICompositorDAO;

/**
 *
 * @author mateo
 */
public class CompositorDAO implements ICompositorDAO{
    private List<Compositor> compositores;

    public CompositorDAO() {
        this.compositores = new ArrayList<>();
    }

    @Override
    public void create(Compositor compositor) {
        compositores.add(compositor);
    }

    @Override
    public Compositor read(int codigo) {
        for (Compositor compositor : compositores) {
            if (compositor.getCodigo() == codigo) {
                return compositor;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {
        for (int i = 0; i < compositores.size(); i++) {
            if (compositores.get(i).getCodigo() == compositor.getCodigo()) {
                compositores.set(i, compositor);
                break;
            }
        }
    }

    @Override
    public void delete(int codigo) {
        compositores.removeIf(compositor -> compositor.getCodigo() == codigo);
    }

    @Override
    public List<Compositor> getAll() {
        return compositores;
    }
}
