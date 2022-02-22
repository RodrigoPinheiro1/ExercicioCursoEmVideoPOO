package Exercicio;

public class ProjetoLivro {


    public static  void main (String [] args) {

        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("pedro", 22, "M");
        p[1] = new Pessoa("MARIA", 23, "f");



        l[0] = new Livro("Apreendendo Java" ,"José da silva", p[0] , 300, 5,true);
        l[1] = new Livro("Apreendendo .NET" ,"Curso em video", p[1] , 250, 5,true);
        l[2] = new Livro("Java avançado" ,"dDIO", p[1] , 250, 5,true);



        l[0].abrir();
        l[0].folhear(400);



        System.out.println(l[0].detalhes());








    }


}
