public class Pizza_Marc_Estelrich {
    //Atributos de la pizza
    private String tipoPizza;
    private String tamanoPizza;
    private boolean   estat;
    private static int TotalDemanades;
    private static int TotalServides;
    //Contructores
    //Constructor por defecto
    public Pizza_Marc_Estelrich(){
        this.estat=true;
    }
    //Contructor con dos parametros
    public Pizza_Marc_Estelrich(String tipoPizza,String tamanoPizza){
        this();
        this.tipoPizza=tipoPizza;
        this.tamanoPizza=tamanoPizza;
        tipoPizza();
        tamanoPizza();
        TotalDemanades++;
    }
    //Metodos

    /*Metodo de tipo de pizza, en es  cas si es de que es crei una pizza
    que no sigui de les 3 opcions (si es posa sense especificar posarà null)
     es posara per defecta margarita */
    private void tipoPizza(){
        String listaPizza[] ={"margarita","quatre formatges","funghi"};
        if(this.tipoPizza==listaPizza[0]){

        } else if (this.tipoPizza==listaPizza[1]) {

        } else if (this.tipoPizza==listaPizza[2]) {

        }
        else{
            this.tipoPizza="margarita";
        }
    }
    /*Metodo  mida de pizza, en es  cas de que es crei una pizza
     que no sigui de les 2 opcions (si es posa sense especificar posarà null)
      es posara per defecta mitjana */
    private void tamanoPizza(){
        String tamanoPizza []= {"mitjana","familiar"};
        if(this.tamanoPizza==tamanoPizza[0]){

        } else if (this.tamanoPizza==tamanoPizza[1]) {

        }
        else{
            this.tamanoPizza="mitjana";
        }
    }
/*Metodo per servir pizzes, una vegada servida si la tornes a
 demenar et dira que ja esta servida*/

    public void sirve(){
        if(estat==true){
            this.estat = false;
            System.out.println("pizza servida ");
            TotalServides++;
        }
        else {
            System.out.println("aquesta pizza ja s'ha servit");
        }

    }

    public String getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(String tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public String getTamanoPizza() {
        return tamanoPizza;
    }

    public void setTamanoPizza(String tamanoPizza) {
        this.tamanoPizza = tamanoPizza;
    }

    public boolean isEstat() {
        return estat;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    public static int getTotalDemanades() {
        return TotalDemanades;
    }

    public static void setTotalPizzesDemanades(int totalPizzesDemanades) {
        Pizza_Marc_Estelrich.TotalDemanades = TotalDemanades;
    }

    public static int getTotalServides() {
        return TotalServides;
    }

    public static void setTotalPizzesServides(int totalPizzesServides) {
        Pizza_Marc_Estelrich.TotalServides = TotalServides;
    }
    /*He `posat un toString per que per jo es mes comod visualitzarlo es
    més rapit que anar posant get and set */
    @Override
    public String toString() {
        return "pizza "+this.tipoPizza+" "+tamanoPizza+", demanda";
    }
}
