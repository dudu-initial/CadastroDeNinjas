package com.dududevv.CadastroDeNinjas.Missoes;

import com.dududevv.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldadeMissao;

    //OneToMany - Uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(long id, String nomeMissao, String dificuldadeMissao) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldadeMissao = dificuldadeMissao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldadeMissao() {
        return dificuldadeMissao;
    }

    public void setDificuldadeMissao(String dificuldadeMissao) {
        this.dificuldadeMissao = dificuldadeMissao;
    }
}
