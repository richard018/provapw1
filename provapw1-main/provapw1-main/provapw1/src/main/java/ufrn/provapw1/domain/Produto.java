package ufrn.provapw1.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private float preco;
}