package domain;


import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.ArrayList;

import javax.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name="personne")
public class Personne {

  private String nom;
  private Long id;
  private String prenom;
  private String mail;
  Collection<Residence> residences = new ArrayList<Residence>();
  Collection<Personne> amis = new ArrayList<Personne>();
  Collection<Equipement> equipements = new ArrayList<Equipement>();

  public Personne() {

  }
  public Personne(String nom, String prenom){
      this.nom = nom;
      this.prenom = prenom;
  }

    public Personne(String nom, String prenom, String mail){
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

  public Personne(String nom, String prenom, String mail, Collection<Residence> residences, Collection<Personne> amis, Collection<Equipement> equipements){
      this.nom = nom;
      this.prenom = prenom;
      this.mail = mail;
      this.amis = amis;
      this.equipements = equipements;
      this.residences = residences;
  }
  @Id
  @GeneratedValue
  public Long getId() {

    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {

    this.nom = nom;
  }

  @Column
  public String getPrenom() {

    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  @Column
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  @OneToMany
  public Collection<Residence> getResidences() {

    return residences;
  }

  public void setResidences(Collection<Residence> residences) {

    this.residences = residences;
  }

  @OneToMany
  public Collection<Equipement> getEquipements() {

    return equipements;
  }

  public void setEquipements(Collection<Equipement> equipements) {

    this.equipements = equipements;
  }

  @ManyToMany
  public Collection<Personne> getAmis() {
    return amis;
  }

  public void setAmis(Collection<Personne> amis) {
    this.amis = amis;
  }

    public void addAmis(Personne ami){
        this.amis.add(ami);
    }

  @Override
  public String toString() {
    return "Personne [id = " + id + ", Nom = " + nom + ", Prénom = " + prenom + ", email = " + mail + "]";
  }
}



