package Beans;

public class AlunoCT {
    
           // confere os dias da semana e treinos.
    
    private int ID_CTAluno;
    private int ID_Aluno;
    
    private String nome;
    private String horario;
    private String dataInicio;
    private float totalHorasSemana;
    private float valor;
    private boolean segunda;
    private boolean terca;
    private boolean quarta;
    private boolean quinta;
    private boolean sexta;
    private boolean sabado;
    private boolean domingo;

    public int getID_CTAluno() {
        return ID_CTAluno;
    }

    public void setID_CTAluno(int ID_CTAluno) {
        this.ID_CTAluno = ID_CTAluno;
    }

    public int getID_Aluno() {
        return ID_Aluno;
    }

    public void setID_Aluno(int ID_Aluno) {
        this.ID_Aluno = ID_Aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public float getTotalHorasSemana() {
        return totalHorasSemana;
    }

    public void setTotalHorasSemana(float totalHorasSemana) {
        this.totalHorasSemana = totalHorasSemana;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isSegunda() {
        return segunda;
    }

    public void setSegunda(boolean segunda) {
        this.segunda = segunda;
    }

    public boolean isTerca() {
        return terca;
    }

    public void setTerca(boolean terca) {
        this.terca = terca;
    }

    public boolean isQuarta() {
        return quarta;
    }

    public void setQuarta(boolean quarta) {
        this.quarta = quarta;
    }

    public boolean isQuinta() {
        return quinta;
    }

    public void setQuinta(boolean quinta) {
        this.quinta = quinta;
    }

    public boolean isSexta() {
        return sexta;
    }

    public void setSexta(boolean sexta) {
        this.sexta = sexta;
    }

    public boolean isSabado() {
        return sabado;
    }

    public void setSabado(boolean sabado) {
        this.sabado = sabado;
    }

    public boolean isDomingo() {
        return domingo;
    }

    public void setDomingo(boolean domingo) {
        this.domingo = domingo;
    }
    

    

}