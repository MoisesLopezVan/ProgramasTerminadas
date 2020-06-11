/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoscentro;

import clases.Reporte;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.HibernateException;
import org.hibernate.Query;
/**
 *
 * @author MoisesDario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btnNodo;
    @FXML
    private TextField textNodoNomina;
    @FXML
    private TextField textNodoNominaBaja;
    @FXML
    private TextField textNodoAdministrativo;
    @FXML
    private TextArea textnodoHijo1;
    @FXML
    private TextArea textnodoHijo2;
    @FXML
    private TextArea textnodoHijo3;
    @FXML
    private Line nodoNomina;
    @FXML
    private Line nodoHijo1;
    @FXML
    private Line nodoNominaBaja;
    @FXML
    private Line nodoHijo2;
    @FXML
    private Line nodoAdministrativo;
    @FXML
    private Line nodoHijo3;
    @FXML
    private Line nodoPrincipal;
    @FXML
    private Circle inicio;
    
    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;
    
    @FXML
    private void btnNodo(ActionEvent event){
        conexion();
        ramas();
    }
    public void ramas(){
        this.inicio.setVisible(true);
        this.nodoNomina.setVisible(true);
        this.textNodoNomina.setVisible(true);
        getNomina();
        this.nodoHijo1.setVisible(true);
        this.textnodoHijo1.setVisible(true);
        getNominaHijo();
        this.nodoPrincipal.setVisible(true);
        this.nodoNominaBaja.setVisible(true);
        this.textNodoNominaBaja.setVisible(true);
        getNominaBaja();
        this.nodoHijo2.setVisible(true);
        this.textnodoHijo2.setVisible(true);
        getNominaBajaHijo();
        this.nodoAdministrativo.setVisible(true);
        this.textNodoAdministrativo.setVisible(true);
        getAdministrativo();
        this.nodoHijo3.setVisible(true);
        this.textnodoHijo3.setVisible(true);
        getAdministrativoHijo();
    }
    public void conexion(){
         System.err.println("Iniciando");
        try {
            Configuration configuration = new Configuration();
            System.err.println("Leyendo configuracion.");
            configuration.configure("/conexion/conexion.cfg.xml");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("No se puede crear la Sesion" + ex);
            throw new ExceptionInInitializerError(ex);
        }
       System.out.println("Verificar datos: ");
    }  
    public void getNomina(){
        Session session = factory.openSession();
        //List empList1 = session.createQuery(" from Alumno  emp where emp.edad >= 20").list(); 
        List empList1 = session.createQuery(" from Reporte r where r.id = 1").list();    
        System.out.println("Reporte con sus Datos Nomina: ");
        System.out.println("Nombre"+" \t- Descripción"+" \t- Id_reportepadre");
        for (Iterator iterator = 
	                           empList1.iterator(); iterator.hasNext();){
                    Reporte dao = (Reporte) iterator.next(); 
	            System.out.println( dao.getNombre()+" - "+ dao.getDescripcion() + "-" + dao.getId_reportepadre()); 
                    textNodoNomina.appendText(dao.getNombre());
        }
    }
    public void getNominaHijo(){
        Session session = factory.openSession();
        //List empList1 = session.createQuery(" from Alumno  emp where emp.edad >= 20").list(); 
        List empList1 = session.createQuery(" from Reporte s where s.id_reportepadre = 1").list();    
        System.out.println("Reporte con sus Datos Nomina Hijo: ");
        System.out.println("Nombre"+"\t- Id_reportepadre");
        for (Iterator iterator = 
	                           empList1.iterator(); iterator.hasNext();){
                    Reporte dao = (Reporte) iterator.next(); 
	            System.out.println( dao.getNombre()+"-"+ dao.getId_reportepadre()); 
                    textnodoHijo1.appendText(dao.getNombre());
        }
    }
    public void getNominaBaja(){
        Session session = factory.openSession();
        //List empList1 = session.createQuery(" from Alumno  emp where emp.edad >= 20").list(); 
        List empList1 = session.createQuery(" from Reporte r where r.id = 2").list();    
        System.out.println("Reporte con sus Datos Nomina Baja: ");
        System.out.println("Nombre"+" \t- Descripción"+" \t- Id_reportepadre");
        for (Iterator iterator = 
	                           empList1.iterator(); iterator.hasNext();){
                    Reporte dao = (Reporte) iterator.next(); 
	            System.out.println( dao.getNombre()+" - "+ dao.getDescripcion() + "-" + dao.getId_reportepadre()); 
                    textNodoNominaBaja.appendText(dao.getNombre());
        }
    }
    public void getNominaBajaHijo(){
        Session session = factory.openSession();
        //List empList1 = session.createQuery(" from Alumno  emp where emp.edad >= 20").list(); 
        List empList1 = session.createQuery(" from Reporte r where r.id_reportepadre = 2").list();    
        System.out.println("Reporte con sus Datos Nomina Baja Hijo: ");
        System.out.println("Nombre"+"\t- Id_reportepadre");
        for (Iterator iterator = 
	                           empList1.iterator(); iterator.hasNext();){
                    Reporte dao = (Reporte) iterator.next(); 
	            System.out.println( dao.getNombre()+"-"+ dao.getId_reportepadre()); 
                    textnodoHijo2.appendText(dao.getNombre());
        }
    }
     public void getAdministrativo(){
        Session session = factory.openSession();
        //List empList1 = session.createQuery(" from Alumno  emp where emp.edad >= 20").list(); 
        List empList1 = session.createQuery(" from Reporte r where r.id = 3").list();    
        System.out.println("Reporte con sus Datos Administrativo: ");
        System.out.println("Nombre"+" \t- Descripción"+" \t- Id_reportepadre");
        for (Iterator iterator = 
	                           empList1.iterator(); iterator.hasNext();){
                    Reporte dao = (Reporte) iterator.next(); 
	            System.out.println( dao.getNombre()+" - "+ dao.getDescripcion() + "-" + dao.getId_reportepadre()); 
                    textNodoAdministrativo.appendText(dao.getNombre());
        }
    }
    public void getAdministrativoHijo(){
        Session session = factory.openSession();
        //List empList1 = session.createQuery(" from Alumno  emp where emp.edad >= 20").list(); 
        List empList1 = session.createQuery(" from Reporte r where r.id_reportepadre = 3").list();    
        System.out.println("Reporte con sus Datos Administrativo Hijo: ");
        System.out.println("Nombre"+"\t- Id_reportepadre");
        for (Iterator iterator = 
	                           empList1.iterator(); iterator.hasNext();){
                    Reporte dao = (Reporte) iterator.next(); 
	            System.out.println( dao.getNombre()+"-"+ dao.getId_reportepadre()); 
                    textnodoHijo3.appendText(dao.getNombre());
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
