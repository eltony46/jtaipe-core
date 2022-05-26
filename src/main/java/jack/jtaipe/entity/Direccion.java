package jack.jtaipe.entity;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpersona;
    private  String calle;
    private String ciudad;
    private String estado;
    private  String codigoPostal;
    private String pais;
    @OneToOne

    @JoinColumn(name="Direccion")

    private Direccion Persona;}
