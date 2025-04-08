import javax.swing.*;
import java.util.Scanner;
public class VencimentoIPVA {
    public static void main (String args[]) {

//Declarando as variáveis e seu tipo.
        int Digito;

//Convertendo os valores recebidos para String
        Digito = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo ao Escritório Despachante Vale Card. Digite o número final da placa do seu veículo: "));

//Utilizando a condição switch/case/break para obter o resultado esperado
    switch (Digito) {
        case 1:
            JOptionPane.showMessageDialog(null,"Placa final 1: Pagamento do IPVA até 30/04");
            break;
        case 2:
            JOptionPane.showMessageDialog(null,"Placa final 2: Pagamento do IPVA até 31/05");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,"Placa final 3: Pagamento do IPVA até 30/06");
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Placa final 3: Pagamento do IPVA até 31/07");
            break;
        case 5:
            JOptionPane.showMessageDialog(null,"Placa final 5: Pagamento do IPVA até 31/08");
            break;
        case 6:
            JOptionPane.showMessageDialog(null,"Placa final 6: Pagamento do IPVA até 30/09");
            break;
        case 7:
            JOptionPane.showMessageDialog(null,"Placa final 7: Pagamento do IPVA até 31/10");
            break;
        case 8:
            JOptionPane.showMessageDialog(null,"Placa final 8: Pagamento do IPVA até 31/11");
            break;
        case 9:
            JOptionPane.showMessageDialog(null,"Placa final 9: Pagamento do IPVA até 31/12");
            break;
        default:
            JOptionPane.showMessageDialog(null,"Placa final não identificado. Digite novamente.");

        }
    }
}
