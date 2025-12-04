public class Principal {

    public static void main(String[] args) {
    	
    	//Gera pessoas e vendas
        ControleTeleSena controle = new ControleTeleSena();
        
        //Realiza o sorteio
        controle.realizarSorteio();
        controle.mostrarResultados();
    }
}