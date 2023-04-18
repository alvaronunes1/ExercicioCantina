import javax.swing.*;

public class Cantina {
    public static void main(String[] args) {


        String nomeCliente = JOptionPane.showInputDialog("Nome do cliente: ");
        String tipoMassa = JOptionPane.showInputDialog("Nome da massa: ");
        Double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Valor da massa:  "));


        Cliente cliente = new Cliente();
        cliente.nome = nomeCliente;

        Massa massa = new Massa();
        massa.setTipo(tipoMassa);
        massa.setValor(valorMassa);


        String menu = JOptionPane.showInputDialog("\n 1 - Bacon\n 2 - Mussarela\n 3 - Tomate\n 4 - Queijo\n 5 - Sair ");


        Ingrediente ingredientes = new Ingrediente();
        try {

            while (!menu.equals("5")) {


                if (menu.equals("1")) {
                    ingredientes.setNome("Bacon");
                }
                if (menu.equals("2")) {
                    ingredientes.setNome("Mussarela");
                }

                if (menu.equals("3")) {
                    ingredientes.setNome("Tomate");
                }

                if (menu.equals("4")) {
                    ingredientes.setNome("Queijo");
                }


                if (!(menu.equals("1") || menu.equals("2") || menu.equals("3") || menu.equals("4"))) {
                    throw new Exception("Não existe o ingrediente selecionado");
                }

                menu = JOptionPane.showInputDialog("\n 1 - Bacon\n 2 - Mussarela\n 3 - Tomate\n 4 - Queijo\n 5 - Sair ");


                Double valorFinal = massa.getValor() + 2;

                JOptionPane.showMessageDialog(null, "Pedido feito para " + cliente.nome + "\n" + massa.getTipo() + " com " + ingredientes.getNome() + "\n Valor: " + valorFinal);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
