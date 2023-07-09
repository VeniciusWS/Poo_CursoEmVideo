
public class ProjetoYouTube{
    public static void main (String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("José","Masculino",26,"Zé");
        g[1] = new Gafanhoto ("Daniela","Feminino",39,"Dani");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[0]);
        vis[0].avaliar();
        System.out.println(vis[0]);
        
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[0].avaliar(8);
        System.out.println(vis[0]);
        
        
        //vis[2] = new Visualizacao(g[1],v[1]);
        //System.out.println(vis[0]);

        
        /*System.out.println("VÍDEOS\n-----------------------");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println("GAFANHOTOS\n-----------------------");
        System.out.println(g[0]);
        System.out.println(g[1]);*/
    }

}
