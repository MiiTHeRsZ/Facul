package medico;

import consultaCliente.ConsultaCliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Impressao {
    public static void main(String[] args) {
        

        ConsultaCliente cliente = new ConsultaCliente();

        String dt = "29/05/1999";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dtNascimento;
        try {
            dtNascimento = sdf.parse(dt);
        }catch (ParseException e) {
            dtNascimento = null;
        }
        
        cliente.setNome("Gustavo");
        cliente.setDataDeNascimento(dtNascimento);
        cliente.setAltura(1.78);
        cliente.setAtivo(true);

        System.out.println(cliente);;
    }
}
