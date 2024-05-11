package com.atru.gestioncursos.service.serviceimpl;

import com.atru.gestioncursos.entity.Curso;
import com.atru.gestioncursos.repository.CursoRepository;
import com.atru.gestioncursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    protected CursoRepository cursoRepository;
    @Override
    public List<Curso> findAllCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso findCursoById(Integer id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public Curso editCurso(Integer id, Curso curso) {
        Curso cursoBD = cursoRepository.findById(id).orElse(null);
        if (cursoBD != null) {
            cursoBD.setTitulo(curso.getTitulo());
            cursoBD.setDescripcion(curso.getDescripcion());
            cursoBD.setNivel(curso.getNivel());
            //cursoBD.setPublicado();
            return cursoRepository.save(curso);
        }
        return null;
    }

    @Override
    public void deleteCurso(Integer id) {
        cursoRepository.deleteById(id);
    }
}
