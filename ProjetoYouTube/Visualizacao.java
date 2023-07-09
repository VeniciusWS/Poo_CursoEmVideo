public class Visualizacao{
    private Gafanhoto espectador;
    private Video filme;
    
    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public Gafanhoto getEspectador(){
        return espectador;
    }
    public Video getFilme(){
        return filme;
    }
    public void setEspectador(Gafanhoto espectador){
        this.espectador=espectador;
    }
    public void setFilme(Video filme){
        this.filme=filme;
    }
    
    //Sobrecarga de métodos
    public void avaliar(){
        this.filme.setAvaliacao(5);//se não avaliar a nota vai ser 5
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);//caso seja feita uma avaliação
    }
    
    @Override
    public String toString(){
        return "Visualização{"+"Espectador: "+espectador+", filme: "+filme+"}";
    }
}
