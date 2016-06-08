package com.example.brenos.movies;

import java.util.ArrayList;

public class MoviesList {

    private ArrayList<Movie> listaFilmes = new ArrayList<Movie>();

    private String descricaoFightClub;
    private String descricaoEsquadraoSuicida;
    private String descricaoDeadpool;
    private String descricaoAOrigem;

    public MoviesList() {

        atualizaVariaveis();

        addFilme(new Movie("Deadpool", "2016", "1h 48 min", "8.3", descricaoDeadpool, false, R.drawable.deadpool, "https://www.youtube.com/watch?v=Q9X-bAE8KTc"));
        addFilme(new Movie("A Origem", "2010", "2h 28 min", "8.8", descricaoAOrigem, false, R.drawable.aorigem,"https://www.youtube.com/watch?v=HiixbtN-O24"));
        addFilme(new Movie("Esquadrão Suicida", "2016", "?", "?", descricaoEsquadraoSuicida, false, R.drawable.suicide_squad_poster, "https://www.youtube.com/watch?v=MZwsbcW-d-E"));
        addFilme(new Movie("Fight Club", "1999", "2h 19 min", "8.9", descricaoFightClub, false, R.drawable.fightclub, "https://www.youtube.com/watch?v=SUXWAEX2jlg"));

    }

    public void addFilme(Movie movie) {

        listaFilmes.add(movie);

    }

    public Movie searchByTitle(String titulo) {
        for (Movie movie: listaFilmes) {
            if (movie.getTitulo().equals(titulo)) {
                return movie;
            }
        }
        return null;
    }

    public void atualizaVariaveis() {
        descricaoFightClub = "Jack (Edward Norton) é um executivo jovem, trabalha como investigador de seguros, " +
                "mora confortavelmente, mas ele está ficando cada vez mais insatisfeito com sua vida medíocre. Para piorar ele " +
                "está enfrentando uma terrível crise de insônia, até que encontra uma cura inusitada para o sua falta de sono ao " +
                "frequentar grupos de auto-ajuda. Nesses encontros ele passa a conviver com pessoas problemáticas como a viciada " +
                "Marla Singer (Helena Bonham Carter) e a conhecer estranhos como Tyler Durden (Brad Pitt). Misterioso e cheio de " +
                "ideias, Tyler apresenta para Jack um grupo secreto que se encontra para extravasar suas angústias e tensões através " +
                "de violentos combates corporais.";

        descricaoEsquadraoSuicida = "Reuna um time dos super vilões mais perigosos já encarcerados, dê a eles o " +
                "arsenal mais poderoso do qual o governo dispõe e os envie a uma missão para derrotar uma entidade enigmática e " +
                "insuperável que a agente governamental Amanda Waller (Viola Davis) decidiu que só pode ser vencida por indivíduos" +
                " desprezíveis e com nada a perder. No então, assim que o improvável time percebe que eles não foram escolhidos para" +
                " vencerem, e sim para falharem inevitavelmente, será que o Esquadrão Suicida vai morrer tentando concluir a missão " +
                "ou decidem que é cada um por si?";

        descricaoDeadpool = "Ex-militar e mercenário, Wade Wilson (Ryan Reynolds) é diagnosticado com câncer em estado" +
                " terminal, porém encontra uma possibilidade de cura em uma sinistra experiência científica. Recuperado, com poderes " +
                "e um incomum senso de humor, ele torna-se Deadpool e busca vingança contra o homem que destruiu sua vida.";

        descricaoAOrigem = "Em um mundo onde é possível entrar na mente humana, Cobb (Leonardo DiCaprio) está entre os " +
                "melhores na arte de roubar segredos valiosos do inconsciente, durante o estado de sono. Além disto ele é um fugitivo," +
                "pois está impedido de retornar aos Estados Unidos devido à morte de Mal (Marion Cotillard). Desesperado para rever seus" +
                " filhos, Cobb aceita a ousada missão proposta por Saito (Ken Watanabe), um empresário japonês: entrar na mente de Richard" +
                " Fischer (Cillian Murphy), o herdeiro de um império econômico, e plantar a ideia de desmembrá-lo. Para realizar este " +
                "feito ele conta com a ajuda do parceiro Arthur (Joseph Gordon-Levitt), a inexperiente arquiteta de sonhos Ariadne (Ellen " +
                "Page) e Eames (Tom Hardy), que consegue se disfarçar de forma precisa no mundo dos sonhos";

    }

    public Movie getFilme(int i) {
        return listaFilmes.get(i);
    }

    public int getQuantidadeFilmes() {
        return listaFilmes.size();
    }

}