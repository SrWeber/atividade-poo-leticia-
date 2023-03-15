public class ConsultaCliente {
    
    public static void main(String[] args){
        System.out.println("O Cliente Buscado é:");

        Cliente Samoel = new Cliente();
        Samoel.Nome = "Samoel Weber";
        Samoel.Cpf = "051.722.401-10";
        Samoel.Endereco = "Rua Assunção,1666";
        Samoel.Cidade = "Vera";
        Samoel.Telefone = "(66) 9 9939-0521";
        
        


        System.out.println(Samoel.Dados());
    }
}
    

