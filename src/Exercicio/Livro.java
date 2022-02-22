package Exercicio;

public class Livro implements Publicacao {


    private String titulo;
    private String autor;
    private Pessoa leitor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;



    public Livro(String titulo, String autor, Pessoa  leitor, int totPaginas, int pagAtual, boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
    }




    public String detalhes() {
        return
                "\n titulo='" + titulo + "\n " +
                ", \n autor='" + autor + '\'' +
                ", \n leitor=" + leitor.getNome() +
                        " \n idade = "+ leitor.getIdade()+
                        " \n sexo = "+leitor.getSexo()+
                ", \n totPaginas=" + totPaginas +
                ", \n pagAtual=" + pagAtual +
                ", \n aberto=" + aberto +
                '}';
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }


    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {

        this.aberto = true;

    }

    @Override
    public void fechar() {

        this.aberto = false;
    }

    @Override
    public void folhear(int p) {


        if (p > this.totPaginas){

            this.pagAtual = 0;

            System.out.println(" não é possivel achar a pagina");
        }else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {

        this.pagAtual++;
    }

    @Override
    public void voltarPag() {

        this.pagAtual--;
    }
}
