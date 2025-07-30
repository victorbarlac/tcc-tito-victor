package br.org.rapeifes.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "intervencao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Intervencao {

    @Id
    private Integer id;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private String local;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_intervencao_id", nullable = false)
    private TipoIntervencao tipoIntervencao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "encaminhador_id")
    private Encaminhador encaminhador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "encaminhamento_id", nullable = false)
    private Encaminhamento encaminhamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "demanda_inicial_id", nullable = false)
    private DemandaInicial demandaInicial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "objetivo_intervencao_id", nullable = false)
    private ObjetivoIntervencao objetivoIntervencao;
}
