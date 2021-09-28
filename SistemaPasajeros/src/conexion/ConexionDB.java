    package conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ConexionDB
{
    
/***********CONTROL DE BASE DE DATOS******************/    
    
   //variable que conecta al servidor destino
    private final String server="jdbc:mysql://localhost:3306/pasajeros";

   //Valida la conexion, devuelve su veracidad
   public boolean conectar()
   {
   
        try 
        {
             Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server,"admin","admin");
            conexion.close();
           
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            return false;
        } 
        catch (ClassNotFoundException ex) 
        {
            ex.printStackTrace();
            return false;
        }
     
   return true;
    }

/****************CONTROL DE INICIO SESION Y CUENTAS*************/     
   
   //Obtiene un arreglo de todos los datos de inicio de sesion de matriz y sucursal para que se verifique su veracidad
   public String[][] datosLogin()
    {
        
        String[][] tabla=new String[2][5];
       int cont=0;
       if(!this.conectar())
       {
               JOptionPane.showMessageDialog(null, "Error al obtener los datos de inicio sesión", "ERROR", JOptionPane.ERROR_MESSAGE);
               System.exit(0);
           return null;
           
       }
        Connection conexion=null;
        Statement sentencia=null;
        ResultSet rs=null;
        try 
        {
            
            conexion = DriverManager.getConnection(server,"admin","admin");
            String consulta = "SELECT * FROM login";
            sentencia = conexion.createStatement();
             rs = sentencia.executeQuery(consulta);
            
          while (rs.next())
          {
                Integer id = rs.getInt("id");
                String user = rs.getString("user");
                String password = rs.getString("password");
                Integer matriz = rs.getInt("matriz");
                Integer activo = rs.getInt("activo");
                
                tabla[cont][0]=id.toString();
                tabla[cont][1]=user;
                tabla[cont][2]=password;
                tabla[cont][3]=matriz.toString();      
                tabla[cont][4]=activo.toString();   
                cont++;
          }
          
      sentencia.close();
     
        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            tabla=null;
        } 
     return tabla;

    }
    
   //Mantiene la sesión iniciada de un usuario impidiendo duplicados
   public void sesionIniciada(int id, int sesion)
   {
       if(!this.conectar())
       {
         JOptionPane.showMessageDialog(null, "Error al actualizar la sesion, revise su conexión a la Base de Datos", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
       }
        Connection conexion=null;
        try 
        {
            conexion = DriverManager.getConnection(server,"admin","admin");
            String consulta = "UPDATE login SET activo = ? WHERE id = ?";
            PreparedStatement preparedStmt = conexion.prepareStatement(consulta);
            preparedStmt.setInt (1, sesion);
            preparedStmt.setInt(2, id);
            preparedStmt.executeUpdate();
            conexion.close();

        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        } 

    }
   
 /*********REFERENCIALES A AJUSTE DE VUELOS***********/      
   
    //Obtiene todos los datos del CONTROL de los dos aviones, lo muestra en la tabla de impresión en AJUSTE DE VUELOS
    public String[][] datosAvion()
    {
        
        String[][] tabla=new String[2][5];
        String avion="";
       int cont=0;
       if(!this.conectar())
       {
          JOptionPane.showMessageDialog(null, "Error al obtener los datos del avión", "ERROR", JOptionPane.ERROR_MESSAGE);
           return null;
       }
        Connection conexion=null;
        Statement sentencia=null;
        ResultSet rs=null;
        try 
        {
            conexion = DriverManager.getConnection(server,"admin","admin");
            String consulta = "SELECT * FROM control";
            sentencia = conexion.createStatement();
             rs = sentencia.executeQuery(consulta);
            
          while (rs.next())
          {
                Integer id = rs.getInt("id");
                Integer capacidad = rs.getInt("capacidad");
                String origen = rs.getString("origen");
                String destino = rs.getString("destino");
                java.sql.Date fecha = rs.getDate("fecha");
                if(id==1)
                {
                   avion="Boeing 747"; 
                }
                else
                {
                  avion="T400"; 
                }
                tabla[cont][0]=avion;
                tabla[cont][1]=capacidad.toString();
                tabla[cont][2]=origen;
                tabla[cont][3]=destino;
                tabla[cont][4]=fecha.toString();                                         
                cont++;
          }
          
      sentencia.close();
     
        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            tabla=null;
        } 
     return tabla;

    }
    
     //Actualiza todos los datos del CONTROL del avion elegido, lo muestra en la tabla de impresión en AJUSTE DE VUELOS después
   public void actualizarAvion(int id, String origen, String destino, String fecha)
   {
       if(!this.conectar())
       {
         JOptionPane.showMessageDialog(null, "Error al actualizar el avion, revise su conexión a la Base de Datos", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
       }
        Connection conexion=null;
        try 
        {
            conexion = DriverManager.getConnection(server,"admin","admin");
            String consulta = "UPDATE control SET origen = ?, destino = ?, fecha = ? WHERE id = ?";
            PreparedStatement preparedStmt = conexion.prepareStatement(consulta);
            preparedStmt.setString   (1, origen);
            preparedStmt.setString(2, destino);
            preparedStmt.setString(3, fecha);
            preparedStmt.setInt(4, id);
            preparedStmt.executeUpdate();
            conexion.close();

        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        } 

    }
   
  /********REFERENCIALES A CAPACIDAD DEL AVION Y TABLA DE DETALLES*************/    
   
   //Obtiene la capacidad actual del avión en función de los asientos ocupados
   public int[] capacidad(int idAvion)
       {
          int[]disp=new int[30];
          Arrays.fill(disp, 1);
        int count=0;
       if(!this.conectar())
       {
          JOptionPane.showMessageDialog(null, "Error al obtener los datos del asiento", "ERROR", JOptionPane.ERROR_MESSAGE);
           return null;
       }
        Connection conexion=null;
        ResultSet rs=null;
        Statement sentencia=null;
 
        try 
        {
            conexion = DriverManager.getConnection(server,"admin","admin");
            if(idAvion==0)
            {
                   sentencia = conexion.createStatement();
                   rs = sentencia.executeQuery("SELECT id, disponible FROM boeing_as");          
                
            }
            else if(idAvion==1)
            {
                    sentencia = conexion.createStatement();
                   rs = sentencia.executeQuery("SELECT id, disponible FROM t400_as");    
                 
            }
        
            
           while (rs.next())
          {
              Integer as = rs.getInt("id");
              Integer id = rs.getInt("disponible");
              int menos= --as;
              if(as!=null)
              {
                  disp[menos]=id;  
              }
          }

            sentencia.close();
           
        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();

        } 
      return disp;
     }
   
  //Obtiene un arreglo de todos los detalles de todos los pasajeros del avión elegido
   public String[][] datosAsientos(int idAvion)
    {
        
        String[][] tabla=new String[30][7];
       int cont=0;
       if(!this.conectar())
       {
          JOptionPane.showMessageDialog(null, "Error al obtener los datos de los asientos", "ERROR", JOptionPane.ERROR_MESSAGE);
           return null;
       }
        Connection conexion=null;
        Statement sentencia=null;
        ResultSet rs=null;
        try 
        {
            conexion = DriverManager.getConnection(server,"admin","admin");
            
            if(idAvion==0)
            {
                  String consulta = "SELECT * FROM boeing_as";
                  sentencia = conexion.createStatement();
                  rs = sentencia.executeQuery(consulta);
            }
            else if(idAvion==1)
            {
                String consulta = "SELECT * FROM t400_as";
                sentencia = conexion.createStatement();
                 rs = sentencia.executeQuery(consulta);
            }
            
          
          while (rs.next())
          {
                Integer asiento = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                Integer precio=rs.getInt("precio");
                String clase = rs.getString("clase");
                Integer disponible=rs.getInt("disponible");

                tabla[cont][0]=asiento.toString();
                tabla[cont][1]=nombre;
                tabla[cont][2]=apellido;
                tabla[cont][3]=correo;
                tabla[cont][4]=precio.toString();        
                tabla[cont][5]=clase; 
                tabla[cont][6]=disponible.toString(); 
                cont++;
          }
          
      sentencia.close();
     
        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            tabla=null;
        } 
     return tabla;

    }  
        
 /************REFERENCIALES A ADMINISTRACION DE ASIENTOS***************/   
   
     //Obtiene los datos de un asiento elegido de un avión objetivo, siempre y cuando este exista
    public String[] asiento(int idAvion, int idAsiento)
    {
        String[]tabla=new String[7];
        
       if(!this.conectar())
       {
          JOptionPane.showMessageDialog(null, "Error al obtener los datos del asiento", "ERROR", JOptionPane.ERROR_MESSAGE);
           return null;
       }
        Connection conexion=null;
        ResultSet rs=null;
        Statement sentencia=null;
        try 
        {
            conexion = DriverManager.getConnection(server,"admin","admin");
            if(idAvion==0)
            {
                   sentencia = conexion.createStatement();
                   rs = sentencia.executeQuery("SELECT * FROM boeing_as WHERE id = "+idAsiento+";");
            }
            else if(idAvion==1)
            {
                    sentencia = conexion.createStatement();
                   rs = sentencia.executeQuery("SELECT * FROM t400_as WHERE id = "+idAsiento+";");
            }
        
            
         while (rs.next())
          {
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                Integer precio = rs.getInt("precio");
                String clase = rs.getString("clase");
                Integer disponible = rs.getInt("disponible");   
                
                tabla[0]=id.toString();
                tabla[1]=nombre;
                tabla[2]=apellido;
                tabla[3]=correo; 
                tabla[4]=precio.toString(); 
                tabla[5]=clase; 
                tabla[6]=disponible.toString(); 
          }
          
      sentencia.close();
     
        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            tabla=null;
        } 
     return tabla;
    }
      
     //Vacía los datos del asiento elegido de un avión objetivo dejándolo disponible
    public void vacante(int idAvion, int idAsiento, String clase)
    {       
       if(!this.conectar())
       {
          JOptionPane.showMessageDialog(null, "Error al obtener los datos del asiento", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
       }
        Connection conexion=null;
        try 
        {
            
            conexion = DriverManager.getConnection(server,"admin","admin");


            if(idAvion==0)
            {
                String consulta = "UPDATE boeing_as SET nombre = '', apellido = '', correo = '', precio = 0, clase = ?, disponible = 1 WHERE id = ?";
                PreparedStatement preparedStmt = conexion.prepareStatement(consulta);
                preparedStmt.setString (1, clase);
                  preparedStmt.setInt (2, idAsiento);
                preparedStmt.executeUpdate();
                conexion.close();
            }
            else if(idAvion==1)
            {
                String consulta = "UPDATE t400_as SET nombre = '', apellido = '', correo = '', precio = 0, clase = '?', disponible = 1 WHERE id = ?";
                PreparedStatement preparedStmt = conexion.prepareStatement(consulta);
                preparedStmt.setString (1, clase);
                preparedStmt.setInt (2, idAsiento);
                preparedStmt.executeUpdate();
                conexion.close();
            }
     
        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        } 
 
    }
    
     //Actualiza los datos del asiento elegido de un avión objetivo
    public void setAsiento(int idAvion, int idAsiento, String nombre,String apellido, String correo,int precio,String clase, int disponible)
    {       

       if(!this.conectar())
       {
          JOptionPane.showMessageDialog(null, "Error al ajustar los datos del asiento", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
       }
        Connection conexion=null;
        try 
        {
            
            conexion = DriverManager.getConnection(server,"admin","admin");
            if(idAvion==0)
            {
                String consulta = "UPDATE boeing_as SET nombre = ?, apellido = ?, correo = ?, precio = ?, clase = ?, disponible = ? WHERE id = ?";
                PreparedStatement preparedStmt = conexion.prepareStatement(consulta);
                preparedStmt.setString (1, nombre);
                preparedStmt.setString (2, apellido);
                preparedStmt.setString (3, correo);
                preparedStmt.setInt (4, precio);
                preparedStmt.setString (5, clase);
                 preparedStmt.setInt (6, disponible);
              preparedStmt.setInt (7, idAsiento);
                preparedStmt.executeUpdate();
                conexion.close();
            }
            else if(idAvion==1)
            {
               String consulta = "UPDATE t400_as SET nombre = ?, apellido = ?, correo = ?, precio = ?, clase = ?, disponible = ? WHERE id = ?";
                PreparedStatement preparedStmt = conexion.prepareStatement(consulta);
                 preparedStmt.setString (1, nombre);
                preparedStmt.setString (2, apellido);
                preparedStmt.setString (3, correo);
                preparedStmt.setInt (4, precio);
                preparedStmt.setString (5, clase);
                 preparedStmt.setInt (6, disponible);
              preparedStmt.setInt (7, idAsiento);
                preparedStmt.executeUpdate();
                
                conexion.close();
            }
     
        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        } 
 
    }
    
    //Informa si el asiento está vacío o inexistente (crea un asiento temporal)
    public boolean registrarAsiento(int idAvion, int idAsiento, String clase)
    {
       if(!this.conectar())
       {
          JOptionPane.showMessageDialog(null, "Error al obtener los datos del asiento", "ERROR", JOptionPane.ERROR_MESSAGE);
           return false;
       }
        Connection conexion=null;
        ResultSet rs=null;
        Statement sentencia=null;
        try 
        {           
            conexion = DriverManager.getConnection(server,"admin","admin");
            if(idAvion==0)
            {
               String consulta = "SELECT id FROM boeing_as WHERE id="+idAsiento;
               sentencia = conexion.createStatement();
               rs = sentencia.executeQuery(consulta);
               Integer id=idAsiento;
               
               if(!rs.next())
                {
                   sentencia.close();
                   sentencia = conexion.createStatement();
                  sentencia.executeUpdate("INSERT INTO boeing_as (id, nombre, apellido, correo, precio, clase, disponible) VALUES ('"+id.toString()+"','','','','0','"+clase+"','0')");
                   sentencia.close();
                   conexion.close();
                   return true;
                   
               }
               else
               {
                  sentencia.close();
                   conexion.close();
                    return false;
               }
             
            }

            else if(idAvion==1)
            {      
              String consulta = "SELECT id FROM t400_as WHERE id="+idAsiento;
              sentencia = conexion.createStatement();
              rs = sentencia.executeQuery(consulta);
              Integer id=idAsiento;
              if(!rs.next())
               {
                   sentencia.close();
                   sentencia = conexion.createStatement();
                   sentencia.executeUpdate("INSERT INTO t400_as (id, nombre, apellido, correo, precio, clase, disponible) VALUES ("+id.toString()+",'','','','0','"+clase+"','0')");
                   sentencia.close();
                   conexion.close();
                        return true;
                   
                }
              else
               {
                   sentencia.close();
                   conexion.close();
                        return false;
               }
             
              
            }

        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        } 
             return false;
        
    }
    
     //Elimina el asiento temporal si no se ha llenado ningun dato
     public void anularNuevo(int idAvion, int idAsiento)
     {
         
      if(!this.conectar())
       {
         JOptionPane.showMessageDialog(null, "Error al actualizar la sesion, revise su conexión a la Base de Datos", "ERROR", JOptionPane.ERROR_MESSAGE);
           return;
       }
      
        Connection conexion=null;

        try 
        {
               conexion = DriverManager.getConnection(server,"admin","admin");
            if(idAvion==0)
            {
                  String consulta = "DELETE FROM boeing_as WHERE id = ?";
                 PreparedStatement preparedStmt = conexion.prepareStatement(consulta);
                 preparedStmt.setInt (1, idAsiento);
                  preparedStmt.executeUpdate();
                 conexion.close();
            }
            else
            {
                  String consulta = "DELETE FROM t400_as WHERE id = ?";
                  PreparedStatement preparedStmt = conexion.prepareStatement(consulta);
                preparedStmt.setInt (1, idAsiento);
                preparedStmt.executeUpdate();
                conexion.close();
            }
         
      

        }    
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }  
      }
   
}
