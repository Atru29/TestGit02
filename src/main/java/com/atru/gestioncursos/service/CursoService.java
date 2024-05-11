package com.atru.gestioncursos.service;

import com.atru.gestioncursos.entity.Curso;

import java.util.List;

public interface CursoService {
    public List<Curso> findAllCursos();
    public Curso saveCurso(Curso curso);
    public Curso findCursoById (Integer id);
    public Curso editCurso(Integer id,Curso curso);
    public void deleteCurso(Integer id);

}
