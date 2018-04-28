package domain;

import javax.persistence.*;
import java.io.Serializable;

/* SINGE_TABLE fait une seule table pour toutes les 3 tables(IntelligentPeripherik,  Equipement, Chauffage)

 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class IntelligentPeripherik implements Serializable{

  private Long id;
  private String name;
  int consommation;

  @Id
  @GeneratedValue
  public Long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getConsommation() {
    return consommation;
  }

  public void setConsommation(int consommation) {
    this.consommation = consommation;
  }
}
