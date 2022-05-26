package jack.jtaipe.entity;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idasignatura;

    private String curso;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "idpersona")
    private Persona persona;

    public Asignatura(Long idasignatura, String curso) {
        this.idasignatura = idasignatura;
        this.curso = curso;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Asignatura() {

    }
}
