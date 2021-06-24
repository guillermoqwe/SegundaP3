/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author Guillermolp
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   
    public  static void main(String[]args){
        
        List<Cliente> clientes= new ArrayList<>();
       Scanner scanner = new Scanner(System.in);  
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        
        

        int o1 = 100;
        String o9="";
       
        while (o1 != 0) {
            System.out.println("------------------------------------");
            System.out.println("1) Agregar clientes");
            System.out.println("2) Buscar Cliente  ");
            System.out.println("3) Eliminar clientes ");
             System.out.println("4) Mostrar");
            System.out.println("0) Salir");
            System.out.print("Elige una opcion:");
            o1 = scanner.nextInt();
        
        
        
         switch (o1) {
                case 1:
                    try {
                        
                            
                            Cliente client=new Cliente();
                               
                            
                        
                            System.out.print("Introduce el codigo: ");
                            client.setIdCliente(scanner.nextInt());
                            System.out.print("Introduce el nombre: ");
                            client.setNombre(bu.readLine());
                            System.out.print("Introduce  correo : ");
                            client.setCorreo(bu.readLine());
                            System.out.print("Introduce edad : ");
                            client.setEdad(scanner.nextInt());
                            System.out.print("Introduce el telefono  : ");
                            client.setTelefono(scanner.next());
                            clientes.add(client);
                             for (int i = 0; i < clientes.size(); i++) {
                                }
                        }
                     catch (Exception e) {

                    }
                      break;
         

                  
                case 2:
                     try {
                 System.out.println("Introduce el nombre a buscar ");
                   o9 = (bu.readLine());
                    for (Cliente c: clientes){
                     if (o9.equals(c.getNombre())) {
                         System.out.println("Econtrado"); 
                        System.out.println("id:"+c.getIdCliente());
                        System.out.println("Nombre"+c.getNombre());
                        System.out.println("Edad"+c.getEdad());
                        System.out.println("Correr"+c.getCorreo());
                        System.out.println("Telefono"+c.getTelefono());
                        
                     }
                      else{
                             
                         System.out.println("No encontrado");
                             }
                    }
                     }
                    catch (Exception e) {
                            }
                        break;
                    
                case 3:
                    try{
                    for (Cliente c: clientes){
                   System.out.println("Introduce el nombre a eliminar  ");
                    o9 = (bu.readLine());
                      if (o9.equals(c.getNombre())) {
                      System.out.println("id:"+c.getIdCliente());
                        System.out.println("Nombre"+c.getNombre());
                        System.out.println("Edad"+c.getEdad());
                        System.out.println("Correr"+c.getCorreo());
                        System.out.println("Telefono"+c.getTelefono());
                         clientes.remove(c);
                                for(int i=0; i<clientes.size();i++ );{
                            
                             }
                     }
                    }
                    
                                } catch (Exception e) {
                                    System.out.println("No exisate");
                                }          
        break;
                     case 4:
                    System.out.println("----Mostrar cliente ------");
                    for(Cliente c:clientes){
                    System.out.println("id:"+c.getIdCliente());
                      System.out.println("Nombre"+c.getNombre());
                      System.out.println("Edad"+c.getEdad());
                      System.out.println("Correr"+c.getCorreo());
                      System.out.println("Telefono"+c.getTelefono());
        

                    
                    System.out.println("------------------------------------");
         }
                    break;

     
                case 0:
                    System.out.println("Salio de el menu");
                    break;
            }
    }
    
    }
}




        
    



        
        
        
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    //
                    
        
        //System.out.println("Tamaño de la lista"+ clientes.size());
      //  Cliente cliente1= new Cliente();
       // cliente1.setIdCliente(1);
       // cliente1.setNombre("Pepe");
       // cliente1.setEdad(19);
       // clientes.add(cliente1);
        
        
       // cliente1 =new Cliente();
       // cliente1.setEdad(20);
       // cliente1.setIdCliente(2);
        //cliente1.setNombre("Omar");
       // clientes.add(cliente1);
        
        
      //  cliente1 =new Cliente();
        //cliente1.setEdad(19);
        //cliente1.setIdCliente(3);
        //cliente1.setNombre("Guillermo");
        //clientes.add(cliente1);
        
          //System.out.println("Tamaño de la lista"+ clientes.size());
        //System.out.println("Estos son los datos de los cliente ");
        
        //System.out.println("Esto son los datos de el cliente 2");
       // System.out.println("Nombre del guapeton"+ clientes.get(1).getNombre());
        
        //System.out.println(" Lista de clientes ");
     //Cliente c2=new Cliente (idClientes: 1,nombre:"La vecina ",edad:18);
     
     //for(int i=0; i<clientes.size();i++ );{
       // if(clientes.getNombre().equals(c2.getNombre())){
        //System.out.println("Econtradoooo");
        //System.out.println("id"+c.getIdCliente());
         //System.out.println("id"+c.getNombre());
          //System.out.println("id"+c.getEdad());
        //break;
        //}else {
          //  System.out.println("No encontrada ");
        
    //}
    //}
//}
//}
