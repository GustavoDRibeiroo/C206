import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.computadores = new Computador[10];

        System.out.println("Insira o nome do Cliente: ");
        cliente.nome = sc.nextLine();
        System.out.println("Insira o CPF do Cliente: ");
        cliente.cpf = sc.nextLong();

         Computador pc1 = new Computador("Positivo",1300.00);
         Computador pc2 = new Computador("Acer",1800);
         Computador pc3 = new Computador("Vaio",2800.00);

         SistemaOperacional so1 = new SistemaOperacional("Sistema Operacional Linux Ubuntu",32);
         SistemaOperacional so2 = new SistemaOperacional("Sistema Operacional Windows 8",64);
         SistemaOperacional so3 = new SistemaOperacional("Sistema Operacional Windows 10",64);

         MemoriaUSB m1 = new MemoriaUSB("Pen-drive",16);
         MemoriaUSB m1 = new MemoriaUSB("Pen-drive",32);
         MemoriaUSB m1 = new MemoriaUSB("HD Externo",1000);


        HardwareBasico h1 = new HardwareBasico("Pentium Core i3 (1200 Mhz ) com  4Gb de Memória RAM", 500);
        HardwareBasico h2 = new HardwareBasico("Pentium Core i5 (2260 Mhz) com 8 Gb de Memória RAM", 1000);
        HardwareBasico h3 = new HardwareBasico("Pentium Core i5 (2260 Mhz) com 16 Gb de Memória RAM", 2000);





        // Flag que permite a execução em loop do menu
        boolean flag = true;
        int i = 0;

        while(flag) {
            System.out.println("Entre com a promoção em que deseja comprar::");
            System.out.println("1 - Promoção 1:");
            System.out.println("2 - Promoção 2:");
            System.out.println("3 - Promoção 3:");
            System.out.println("0 - Para sair do menu.");

            int op = input.nextInt();

            switch (op) {

                case 0:
                    System.out.println("O cliente " + cliente.nome + " adquiriu: ");
                    System.out.println(" ");
                    for(Computador pc : cliente.computadores){
                        if(pc != null)
                            pc.mostraPCConfigs();
                    }
                    System.out.println("Total da compra: R$" + cliente.calculaTotalCompra());
                    flag = false;
                    System.out.println("Agradecemos pela compra!");

                    break;

                case 1:

                    pc1 = cliente.computadores[i];
                    i++;
                    System.out.println("Computador no carrinho!");
                    break;

                case 2:

                    pc2 = cliente.computadores[i];
                    i++;
                    System.out.println("Computador no carrinho!");

                case 3:

                    pc3 = cliente.computadores[i];
                    i++;
                    System.out.println("Computador no carrinho!");
                    break;


                default:
                    System.out.println("Digite um valor válido!\n");
                    break;
            }
        }


    }

}

