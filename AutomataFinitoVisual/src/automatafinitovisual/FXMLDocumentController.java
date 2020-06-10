/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatafinitovisual;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author MoisesDario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private ImageView imgAutomata;
   
    @FXML
    private TextField textCadenaEntrada;
    
    @FXML
    private TextArea textAreaResultado;
    
    @FXML
    private Button btnEntrada;
    
    @FXML
    private Button btnLimpiarCadena;
    
    @FXML
    private Circle Estadoq0;

    @FXML
    private Circle Estadoq1;

    @FXML
    private Circle Estadoq2;

    @FXML
    private Circle Estadoq3;

    @FXML
    private Circle Estadoq4;

    @FXML
    private Circle Estadoq5;

    @FXML
    private Circle Estadoq6;

    @FXML
    private Circle Estadoq7;

    @FXML
    private Circle Estadoq9;

    @FXML
    private Circle Estadoq10;

    @FXML
    private Circle Estadoq11;

    @FXML
    private Circle Estadoq12;

    @FXML
    private Circle Estadoq13;

    @FXML
    private Circle Estadoq14;

    @FXML
    private Circle Estadoq15;

    @FXML
    private Circle Estadoq17;

    @FXML
    private Circle Estadoq16;

    @FXML
    private Circle Estadoq21;

    @FXML
    private Circle Estadoq18;

    @FXML
    private Circle Estadoq25;
    
    @FXML
    private Circle Estadoq26;
    
    @FXML
    private Circle Estadoq27;
    
    @FXML
    private Circle Estadoq28;
    
    @FXML
    private Circle Estadoq29;

    @FXML
    private Circle Estadoq19;

    @FXML
    private Circle Estadoq23;

    @FXML
    private Circle Estadoq24;

    @FXML
    private Circle Estadoq8;

    @FXML
    private Circle Estadoq20;

    @FXML
    private Circle Estadoq22;

    
    @FXML
    void IniciarAutomata(ActionEvent event){
        LimpiarAutomata();
        imgAutomata.setVisible(true);
        SimboloInicial();
    }
    
    public void SimboloInicial(){  
        String camino = textCadenaEntrada.getText();
        char[] cadena = camino.toCharArray();
        
        if(cadena.length>0 && cadena[0] == 'f'){
           if(cadena[1] == 'o'){
                if(cadena[2] == 'r'){
                    textAreaResultado.appendText("q0 - " + cadena[0] + cadena[1] + cadena[2] + "- q1"+"\n");
                    Estadoq0.setVisible(false);
                    Estadoq1(cadena);
                }else{
                    textAreaResultado.appendText("Dato invalido!! "+"\n");
                }
           }else{
                textAreaResultado.appendText("Dato invalido!! "+"\n");
           }
        }else{
            textAreaResultado.appendText("Dato invalido!! "+"\n");
        }
    }
    
    public void Estadoq1(char[] cadena){     
        if(cadena[3] == ' ' && cadena[4] == '('){
            Estadoq1.setVisible(false);
            textAreaResultado.appendText("q1 - " + cadena[4] + "- q2"+"\n");
            Estadoq2(cadena);
        }else{
            textAreaResultado.appendText("Dato invalido!! "+"\n");
        }
    }
    
    public void Estadoq2(char[] cadena){
        
        if(cadena[5] == ' '){
            Estadoq2.setVisible(false);
            validarInt(cadena);
        }else{
            textAreaResultado.appendText("Dato invalido!! "+"\n");
        }
    }
    
    public void validarInt(char[] cadena){
        
        if (cadena[6] =='i' && cadena[7] == 'n' && cadena[8] == 't') {
            textAreaResultado.appendText("q2 - " + cadena[6] + cadena[7] + cadena[8] + "- q3"+"\n");
            Estadoq3.setVisible(false);
            Estadoq3(cadena);
        }
        if(cadena[6] == ';'){
            textAreaResultado.appendText("q2 - " + cadena[6] + "- q8"+"\n");
            Estadoq8.setVisible(false); 
            Estadoq24(cadena);
        }
    }
    
    public void Estadoq24(char[] cadena){
        int i=7;
        if(cadena[7] == ' '){
            i=8;
            if(cadena[8] == ' '){
                i++;
                textAreaResultado.appendText("q8 - " + cadena[9] + "- q24"+"\n");
                Estadoq24.setVisible(false); 
                i++;
                if(cadena[10] == ' '){
                    i++;
                    Estadoq25(cadena,i);
                    i++;
                    Estadoq26(cadena,i);
                    i++;
                    Estadoq27C(cadena,i);
                    i=23;
                    Estadoq28(cadena,i);
                    i++;
                    Estadoq29(cadena,i);   
                }
            }else{
                do{
                    Estadoq9B(cadena,i);
                    i++;
                }while(i<=cadena.length);
            }
        }                                              
    }
    public void Estadoq3(char[] cadena){ 
        if(cadena.length >= 10){
            if(cadena[10] == ' '){
                  
            }else{
               textAreaResultado.appendText("q3 - " + cadena[10] + "- q4"+"\n");
               System.out.println("Valor N: " + cadena.length);
               Estadoq4.setVisible(false);
               if(cadena.length >=12){
                   Estadoq4(cadena);
               }
            }
        }else{
            textAreaResultado.appendText("Dato invalido!! "+"\n");
        }
    }
    
    public void Estadoq4(char[] cadena){
        int i = 12;
        if(cadena[i] == ' '){
            
        }else{
          do{
                if(cadena[i] == ' '){
                        
                }else{
                    if(cadena[i] == '='){
                        textAreaResultado.appendText("q4 - " + cadena[i] + "- q5"+"\n");
                        Estadoq5.setVisible(false);
                    }else{
                        if(cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9'){
                            Estadoq5(cadena,i);
                        }else{
                            if(cadena[i] == ';'){
                                Estadoq7(cadena,i);
                            }else{ 
                                if(cadena[i] == ' '){
                                    Estadoq7.setVisible(false);
                                }else{
                                    int valorB = i;
                                    if(valorB == i){
                                        if(valorB>=15){
                                            Estadoq9A(cadena,i);
                                        }else{
                                            if(valorB<=15 ){
                                                textAreaResultado.appendText("q4 - " + cadena[i] + "- q4"+"\n");
                                            }
                                        }                                          
                                    }
                                }                               
                            }
                        }
                    }
                }
                i++;
            }while(i<=cadena.length);
        }
    }
    public void Estadoq5(char[] cadena, int i){ 
        
       if(i == 13){  
            textAreaResultado.appendText("q5 - " + cadena[i] + "- q6"+"\n");
            Estadoq6.setVisible(false);
            i++;
            if(i >= 14 || i>=21 || i >= 16){
                Estadoq6(cadena,i);
            }else{
            }  
        }else{
       }
    }
    
    public void Estadoq6( char[] cadena, int i){
        if(cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9'){
            textAreaResultado.appendText("q6 - " + cadena[i] + "- q6"+"\n");
            Estadoq6.setVisible(false);
        }
    }
    
    public void Estadoq7(char[] cadena, int i){
        if(i == 15 || i==14){
            textAreaResultado.appendText("q6 - " + cadena[i] + "- q7"+"\n"); 
            Estadoq7.setVisible(false);
        }
    }
    
    public void Estadoq9B(char[] cadena, int i){
        int valorC = i;
        
        if(valorC == 8){
            textAreaResultado.appendText("q8 - " + cadena[i] + "- q9"+"\n"); 
        }else{
            if(valorC >=9 && valorC<=16){
                textAreaResultado.appendText("q9 - " + cadena[i] + "- q9"+"\n"); 
                Estadoq9.setVisible(false);
            }
            if(cadena[i] == '!'){
                Estadoq10(cadena, i);
            }
            if(cadena[i] == '>'){
                Estadoq11(cadena, i);
            }
            if(cadena[i] == '<'){
                Estadoq12(cadena, i);
            }
        }
    }
    
    public void Estadoq9A(char[] cadena, int i){  
        int valorC = i;
        if( valorC == 15 || valorC == 16 || valorC == 17){
            textAreaResultado.appendText("q7 - " + cadena[i] + "- q9"+"\n"); 
            Estadoq9.setVisible(false);
            valorC++;
            Estadoq11(cadena, i);
            Estadoq12(cadena, i);        
        }else{
            if(valorC == 19){
                Estadoq10(cadena,i);
                Estadoq11(cadena, i);
                Estadoq12(cadena, i); 
            }else{
                if(valorC <24){
                    textAreaResultado.appendText("q9 - " + cadena[i] + "- q9"+"\n");
                }
            }
        }
    }
    
    public void Estadoq10(char[] cadena, int i){
        if(cadena[i] == '!'){
            textAreaResultado.appendText("q9 - " + cadena[i] + "- q10"+"\n");
            Estadoq10.setVisible(false);
        }
        i++;
        if(cadena[i] == '='){
            textAreaResultado.appendText("q10 - " + cadena[i] + "- q13"+"\n");
            Estadoq13.setVisible(false);
        }
        i++;
        Estadoq15(cadena,i);
        Estadoq16(cadena,i);
    }
    public void Estadoq11(char[] cadena, int i){
        if(cadena[i] == '>'){
            textAreaResultado.appendText("q9 - " + cadena[i] + "- q11"+"\n");
            Estadoq11.setVisible(false);
        }
        i++;
        if(cadena[i] == '='){
            textAreaResultado.appendText("q11 - " + cadena[i] + "- q13"+"\n");
            Estadoq13.setVisible(false);
            i++;
            Estadoq15(cadena,i);
            Estadoq16(cadena,i);
        }
    }
    public void Estadoq12(char[] cadena, int i){
        int valorD = i;  

        if(cadena[i] == '<'){
            textAreaResultado.appendText("q9 - " + cadena[i] + "- q12"+"\n");
            Estadoq12.setVisible(false);
            i++;
            Estadoq14(cadena,i);
            Estadoq14A(cadena,i);
        }
    }
         
    public void Estadoq14( char[] cadena, int i){
        if(i==20){
            if(cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9'){
                textAreaResultado.appendText("q12 - " + cadena[i] + "- q14"+"\n");
                Estadoq14.setVisible(false);
            }
            i++;
            if(i == 21){
                if(cadena[i] == ';'){     
                    textAreaResultado.appendText("q14 - " + cadena[i] + "- q18"+"\n");  
                    Estadoq18.setVisible(false);
                }
                textAreaResultado.appendText("q14 - " + cadena[i] + "- q14"+"\n");                
            }
            i++;
            if(i == 22){
                if(cadena[i] == ';'){
                    textAreaResultado.appendText("q14 - " + cadena[i] + "- q18"+"\n");  
                    Estadoq18.setVisible(false);
                }
            }
            i++;
            if(i == 23){
                if(cadena[i] == ' '){
                 
                }
            }
            i++;
            if(cadena[i] == ' '){
                Estadoq16.setVisible(true     );
            }else{
                i++;
                if( i == 25){
                        textAreaResultado.appendText("q18 - " + cadena[i] + "- q19"+"\n");
                        Estadoq19.setVisible(false); 
                    i++;
                        textAreaResultado.appendText("q19 - " + cadena[i] + "- q19"+"\n");
                    if(cadena[i] == '+'){
                        textAreaResultado.appendText("q19 - " + cadena[i] + "- q20"+"\n");
                        Estadoq20.setVisible(false);
                    }
                    i++;
                    if(cadena[i] == '+'){
                        textAreaResultado.appendText("q20 - " + cadena[i] + "- q22"+"\n");
                        Estadoq22.setVisible(false);
                    }
                    i++;
                    Estadoq25(cadena,i);
                    i++;                   
                    Estadoq26(cadena,i);
                    i++;
                    Estadoq27A(cadena,i);
                }   
            }
        }
    }
   
     public void Estadoq14A( char[] cadena, int i){
        if(i==18){
            if(cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9'){
                textAreaResultado.appendText("q12 - " + cadena[i] + "- q14"+"\n");
                Estadoq14.setVisible(false);
            }
            i++;
            if(i == 19){
                if(cadena[i] == ';'){     
                    textAreaResultado.appendText("q14 - " + cadena[i] + "- q18"+"\n");  
                    Estadoq18.setVisible(false);
                }
                textAreaResultado.appendText("q14 - " + cadena[i] + "- q14"+"\n");                
            }
            i++;
            if(i == 20){
                if(cadena[i] == ';'){
                    textAreaResultado.appendText("q14 - " + cadena[i] + "- q18"+"\n");  
                    Estadoq18.setVisible(false);
                }
            }
            i++;
            if( i == 21){
                if(cadena[i] == ' '){
                    Estadoq16.setVisible(true);
                    i++;
                    System.out.println("Vlor A: " + i);
                    if( i == 22){
                            textAreaResultado.appendText("q18 - " + cadena[i] + "- q19"+"\n");
                            Estadoq19.setVisible(false); 
                        i++;
                            textAreaResultado.appendText("q19 - " + cadena[i] + "- q19"+"\n");
                        i++;
                        if(cadena[i] == ')'){
                            textAreaResultado.appendText("q18 - " + cadena[i] + "- q25"+"\n");
                            Estadoq25.setVisible(false);
                            Estadoq19.setVisible(true);
                            i++;
                            Estadoq26(cadena,i);
                            i++; 
                            Estadoq27H(cadena,i);
                        }
                        if(cadena[i] == '+'){
                            textAreaResultado.appendText("q19 - " + cadena[i] + "- q20"+"\n");
                            Estadoq20.setVisible(false);
                        }
                        if(cadena[i] == '-'){
                            textAreaResultado.appendText("q19 - " + cadena[i] + "- q21"+"\n");
                            Estadoq21.setVisible(false);
                        }
                        
                        i++;
                        if(cadena[i] == '+'){
                            textAreaResultado.appendText("q20 - " + cadena[i] + "- q22"+"\n");
                            Estadoq22.setVisible(false);
                        }
                        if(cadena[i] == '-'){
                            textAreaResultado.appendText("q21 - " + cadena[i] + "- q23"+"\n");
                            Estadoq23.setVisible(false);
                        }
                        i++;
                        Estadoq25(cadena,i);
                        i++;                   
                        Estadoq26A(cadena,i);
                        i++;
                        Estadoq27A(cadena,i);
                    }
                }
           }
        }
    }
   
    public void Estadoq15(char[] cadena, int i){
        if(cadena[i] == '-'){
            textAreaResultado.appendText("q13 - " + cadena[i] + "- q15"+"\n");
            Estadoq15.setVisible(false);
        }
        i++;
        if(cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9'){
            textAreaResultado.appendText("q15 - " + cadena[i] + "- q17"+"\n");
            Estadoq17.setVisible(false);
        }
        i++;
        if(cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9'){
            textAreaResultado.appendText("q17 - " + cadena[i] + "- q17"+"\n");
            Estadoq17.setVisible(false);
        }
        i++;
        if(cadena[i] == ';'){      
            textAreaResultado.appendText("q17 - " + cadena[i] + "- q18"+"\n");
            Estadoq18.setVisible(false);
            i++;
            if(cadena[i] == ' '){ 
                i++;
                textAreaResultado.appendText("q18 - " + cadena[i] + "- q19"+"\n");
                Estadoq19.setVisible(false); 
                i++; 
                textAreaResultado.appendText("q19 - " + cadena[i] + "- q19"+"\n"); 
                i++;
                if(cadena[i] == '+'){
                    textAreaResultado.appendText("q19 - " + cadena[i] + "- q20"+"\n");
                    Estadoq20.setVisible(false);
                    i++;
                    if(cadena[i] == '+'){
                        textAreaResultado.appendText("q20 - " + cadena[i] + "- q22"+"\n");
                        Estadoq22.setVisible(false);
                        i++;
                        Estadoq25A(cadena,i);
                        i++;
                        Estadoq26(cadena,i);          
                        i++;
                        Estadoq27B(cadena,i);
                        Estadoq27A(cadena,i);
                    }
                }
                if(cadena[i] == '-'){
                    textAreaResultado.appendText("q19 - " + cadena[i] + "- q21"+"\n");
                    Estadoq21.setVisible(false);   
                    i++;
                    if(cadena[i] == '-'){
                        textAreaResultado.appendText("q21 - " + cadena[i] + "- q23"+"\n");
                        Estadoq23.setVisible(false); 
                        i++;
                        Estadoq25(cadena,i);
                        i++;
                        Estadoq26(cadena,i);
                        i++;
                        Estadoq27B(cadena,i);
                        Estadoq27A(cadena,i);
                    }
                }
                if(cadena[i] == ')'){
                    textAreaResultado.appendText("q18 - " + cadena[i] + "- q25"+"\n");
                    Estadoq25.setVisible(false);
                    Estadoq19.setVisible(true);
                    i++;
                    Estadoq26(cadena,i); 
                    Estadoq26A(cadena,i);
                    i++;
                    Estadoq27A(cadena,i);
                    
                }
            }
        }
        i++;
        if(cadena[i] == ' '){
            
        }
        i++;
        if(cadena[i] == ';'){
            textAreaResultado.appendText("q17 - " + cadena[i] + "- q18"+"\n");
            Estadoq18.setVisible(false);
        }
        i++;
        if(cadena[i] == ' '){
            i++;
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q18 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
                i++;
                Estadoq26(cadena,i);
                i++;
                Estadoq27D(cadena,i);
                /*if(i == 20){
                    Estadoq27E(cadena,i);
                }*/
            }
        }
    }
    
    public void Estadoq16(char[] cadena, int i){
       if(cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9'){
            textAreaResultado.appendText("q13 - " + cadena[i] + "- q16"+"\n");
            Estadoq16.setVisible(false);
        }
        i++;
        textAreaResultado.appendText("q16 - " + cadena[i] + "- q16"+"\n");
        i++;
        if(cadena[i] == ';'){
            textAreaResultado.appendText("q16 - " + cadena[i] + "- q18"+"\n");  
            Estadoq18.setVisible(false);
            Estadoq17.setVisible(true);
        }
        i++;
        if(cadena[i] == ' '){
            i++;
            textAreaResultado.appendText("q18 - " + cadena[i] + "- q19"+"\n");
            Estadoq19.setVisible(false);
            i++;
            textAreaResultado.appendText("q19 - " + cadena[i] + "- q19"+"\n");
            i++;
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q18 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
                Estadoq19.setVisible(true);
                i++;
                Estadoq26(cadena,i); 
                Estadoq26A(cadena,i);
                i++;
                Estadoq27D(cadena,i);                   
            }
            if(cadena[i] == '-'){
                textAreaResultado.appendText("q19 - " + cadena[i] + "- q21"+"\n");
                Estadoq21.setVisible(false);
            }
            if(cadena[i] == '+'){
                textAreaResultado.appendText("q19 - " + cadena[i] + "- q20"+"\n");
                Estadoq20.setVisible(false);   
            }
            
            i++;
            if(cadena[i] == '-'){
                textAreaResultado.appendText("q21 - " + cadena[i] + "- q23"+"\n");
                Estadoq23.setVisible(false);
                i++;
                Estadoq25A(cadena,i);
            }
            if(cadena[i] == '+'){
                textAreaResultado.appendText("q20 - " + cadena[i] + "- q22"+"\n");
                Estadoq22.setVisible(false);  
                i++;
                Estadoq25(cadena,i);
            }
            i++;
            Estadoq26(cadena,i);
            i++;
            Estadoq27F(cadena,i);
            Estadoq27A(cadena,i);
            Estadoq27G(cadena,i);
        }
    }
    
    public void Estadoq25A(char[] cadena, int i){
        if(i== 26){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q23 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
        if(i== 27){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q23 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
         if(i== 28){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q22 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
        if(i== 29){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q23 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
        if(i == 30){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q22 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
    }
    public void Estadoq25(char[] cadena, int i){
        if(i== 26){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q22 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
        if(i== 27){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q22 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
        if(i== 28){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q22 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
        if(i== 29){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q22 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }
        if(i == 30){
            if(cadena[i] == ')'){
                textAreaResultado.appendText("q23 - " + cadena[i] + "- q25"+"\n");
                Estadoq25.setVisible(false);
            }
        }

        if(cadena[11] == ')'){
            textAreaResultado.appendText("q24 - " + cadena[11] + "- q25"+"\n");
            Estadoq25.setVisible(false);
        }
    }
    
    public void Estadoq26A(char[] cadena, int i){
        if(i== 27){
            if(cadena[i] == '{'){
                textAreaResultado.appendText("q25 - " + cadena[i] + "- q26"+"\n");
                Estadoq26.setVisible(false);
            }
       }
        i++;
        if(cadena[28] == 'i'){
            i++;
            if(cadena[29] == 'n'){
                i++;
                if(cadena[30] == 's'){
                    i++;
                    if(cadena[31] == 't'){
                        i++;
                        if(cadena[32] == 'r'){
                            i++;
                            if(cadena[33] == 'u'){
                                i++;
                                if(cadena[34] == 'c'){
                                    i++;
                                    if(cadena[35] == 'c'){
                                        i++;
                                        if(cadena[36] == 'i'){
                                            i++;
                                            if(cadena[37] == 'o'){
                                                i++;
                                                if(cadena[38] == 'n'){
                                                    i++;
                                                    if(cadena[39] == 'e'){
                                                        i++;
                                                        if(cadena[40] == 's'){
                                                            i++;
                                                            textAreaResultado.appendText("q26 - " + cadena[28]+cadena[29]+cadena[30]+cadena[31]+cadena[32]+cadena[33]+cadena[34]+cadena[35]+cadena[36]+cadena[37]+cadena[38]+cadena[39]+cadena[40] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                        }
                                                        textAreaResultado.appendText("q28 - " + cadena[41] + "- q29"+"\n");
                                                        Estadoq29.setVisible(false);  
                                                        Estadoq28(cadena,i); 
                                                    }else{
                                                        System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                                System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                       System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                            System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
           System.err.println("Dato no valido!!");
        }
    }
    public void Estadoq26(char[] cadena, int i){
        if(i== 25){
            if(cadena[i] == '{'){
                textAreaResultado.appendText("q25 - " + cadena[i] + "- q26"+"\n");
                Estadoq26.setVisible(false);
            }
        }
        if(i== 26){
            if(cadena[i] == '{'){
                textAreaResultado.appendText("q25 - " + cadena[i] + "- q26"+"\n");
                Estadoq26.setVisible(false);
            }
        }
        if(i== 28){
            if(cadena[i] == '{'){
                textAreaResultado.appendText("q25 - " + cadena[i] + "- q26"+"\n");
                Estadoq26.setVisible(false);
            }
       }
       if(i== 29){
            if(cadena[i] == '{'){
                textAreaResultado.appendText("q25 - " + cadena[i] + "- q26"+"\n");
                Estadoq26.setVisible(false);
            }
       }
       if(i==30){
            if(cadena[i] == '{'){
                textAreaResultado.appendText("q25 - " + cadena[i] + "- q26"+"\n");
                Estadoq26.setVisible(false);
            }
        }
       if(i==31){
            if(cadena[i] == '{'){
                textAreaResultado.appendText("q25 - " + cadena[i] + "- q26"+"\n");
                Estadoq26.setVisible(false);
            }
       }
             
    }
    
    public void Estadoq27A(char[] cadena, int i){
        if(cadena[30] == 'i'){
            i++;
            if(cadena[31] == 'n'){
                i++;
                if(cadena[32] == 's'){
                    i++;
                    if(cadena[33] == 't'){
                        i++;
                        if(cadena[34] == 'r'){
                            i++;
                            if(cadena[35] == 'u'){
                                i++;
                                if(cadena[36] == 'c'){
                                    i++;
                                    if(cadena[37] == 'c'){
                                        i++;
                                        if(cadena[38] == 'i'){
                                            if(cadena[39] == 'o'){
                                                i++;
                                                if(cadena[40] == 'n'){
                                                    i++;
                                                    if(cadena[41] == 'e'){
                                                        i++;
                                                        if(cadena[42] == 's'){
                                                            i++;
                                                            textAreaResultado.appendText("q26 - " + cadena[30]+cadena[31]+cadena[32]+cadena[33]+cadena[34]+cadena[35]+cadena[36]+cadena[37]+cadena[38]+cadena[39]+cadena[40]+cadena[41]+cadena[42] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                        }
                                                        textAreaResultado.appendText("q28 - " + cadena[i] + "- q29"+"\n");
                                                        Estadoq29.setVisible(false);  
                                                        textAreaResultado.appendText("Dato valido!! " + "\n");                                                       
                                                        Estadoq28(cadena,i);
                                                        Estadoq19.setVisible(true);
                                                        Estadoq29(cadena,i);
                                                    }else{
                                                        System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                                System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                       System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                            System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
           System.err.println("Dato no valido!!");
        }
    }
    
    public void Estadoq27B(char[] cadena, int i){
        if(cadena[32] == 'i'){
            i++;
            if(cadena[33] == 'n'){
                i++;
                if(cadena[34] == 's'){
                    i++;
                    if(cadena[35] == 't'){
                        i++;
                        if(cadena[36] == 'r'){
                            i++;
                            if(cadena[37] == 'u'){
                                i++;
                                if(cadena[38] == 'c'){
                                    i++;
                                    if(cadena[39] == 'c'){
                                        i++;
                                        if(cadena[40] == 'i'){
                                            i++;
                                            if(cadena[41] == 'o'){
                                                i++;
                                                if(cadena[42] == 'n'){
                                                    i++;
                                                    if(cadena[43] == 'e'){
                                                        i++;
                                                        if(cadena[44] == 's'){
                                                            i++;
                                                            textAreaResultado.appendText("q26 - " + cadena[32]+cadena[33]+cadena[34]+cadena[35]+cadena[36]+cadena[37]+cadena[38]+cadena[39]+cadena[40]+cadena[41]+cadena[42]+cadena[43]+cadena[44] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                        }
                                                        Estadoq28(cadena,i);
                                                        i++;
                                                        Estadoq29(cadena,i);
                                                        i++;
                                                        if(cadena[i] == '.'){
                                                            System.out.println("Fin de Automata");
                                                        }
                                                    }else{
                                                        System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                               System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                        System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                            System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
            System.err.println("Dato no valido!!");
        }
    }
   
    public void Estadoq27C(char[] cadena, int i){
        if(cadena[13] == 'i'){
            i++;
            if(cadena[14] == 'n'){
                i++;
                if(cadena[15] == 's'){
                    i++;
                    if(cadena[16] == 't'){
                        i++;
                        if(cadena[17] == 'r'){
                            i++;
                            if(cadena[18] == 'u'){
                                i++;
                                if(cadena[19] == 'c'){
                                    i++;
                                    if(cadena[20] == 'c'){
                                        i++;
                                        if(cadena[21] == 'i'){
                                            i++;
                                            if(cadena[22] == 'o'){
                                                i++;
                                                if(cadena[23] == 'n'){
                                                    i++;
                                                    if(cadena[24] == 'e'){
                                                        i++;
                                                        if(cadena[25] == 's'){
                                                            textAreaResultado.appendText("q26 - " + cadena[13]+cadena[14]+cadena[15]+cadena[16]+cadena[17]+cadena[18]+cadena[19]+cadena[20]+cadena[21]+cadena[22]+cadena[23]+cadena[24]+cadena[25] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                            i++;
                                                            if(cadena[26] == ';'){
                                                                textAreaResultado.appendText("q27 - " + cadena[26] + "- q28"+"\n");
                                                                Estadoq28.setVisible(false);
                                                                i++;
                                                                if(cadena[27] == '}'){
                                                                    textAreaResultado.appendText("q28 - " + cadena[27] + "- q29"+"\n");
                                                                    Estadoq29.setVisible(false);  
                                                                    textAreaResultado.appendText("Dato valido!! " + "\n");
                                                                    if(cadena[28] == '.'){
                                                                        System.err.println("Dato no valido!!");
                                                                    }
                                                                }else{
                                                                    System.err.println("Dato no valido!!");
                                                                }
                                                            }else{
                                                                System.err.println("Dato no valido!!");
                                                            }
                                                        }else{
                                                            System.err.println("Dato no valido!!");
                                                        }
                                                    }else{
                                                       System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                                System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                        System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                            System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
            System.err.println("Dato no valido!!");    
        }
    }
   
    public void Estadoq27D(char[] cadena, int i){
        if(cadena[27] == 'i'){
            i++;
            if(cadena[28] == 'n'){
                i++;
                if(cadena[29] == 's'){
                    i++;
                    if(cadena[30] == 't'){
                        i++;
                        if(cadena[31] == 'r'){
                            i++;
                            if(cadena[32] == 'u'){
                                i++;
                                if(cadena[33] == 'c'){
                                    i++;
                                    if(cadena[34] == 'c'){
                                        i++;
                                        if(cadena[35] == 'i'){
                                            i++;
                                            if(cadena[36] == 'o'){
                                                i++;
                                                if(cadena[37] == 'n'){
                                                    i++;
                                                    if(cadena[38] == 'e'){
                                                        i++;
                                                        if(cadena[39] == 's'){
                                                            i++;
                                                            textAreaResultado.appendText("q26 - " + cadena[27]+cadena[28]+cadena[29]+cadena[30]+cadena[31]+cadena[32]+cadena[33]+cadena[34]+cadena[35]+cadena[36]+cadena[37]+cadena[38]+cadena[39] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                        }else{
                                                            System.err.println("Dato no valido!!");
                                                        }
                                                        if(cadena[40] == ';'){
                                                            textAreaResultado.appendText("q27 - " + cadena[39] + "- q28"+"\n");
                                                            Estadoq28.setVisible(false);  
                                                        }
                                                        i++;
                                                        if(cadena[41] == '}'){
                                                            textAreaResultado.appendText("q28 - " + cadena[40] + "- q29"+"\n");
                                                            Estadoq29.setVisible(false);  
                                                            textAreaResultado.appendText("Dato valido!! " + "\n");
                                                        }
                                                        i++;
                                                        if(cadena[42] == '.'){
                                                            textAreaResultado.appendText("Dato no valido!! " + "\n");
                                                        }
                                                    }else{
                                                        System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                               System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                        System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                           System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
            System.err.println("Dato no valido!!");
        }
    }
    public void Estadoq27E(char[] cadena, int i){
        if(cadena[20] == 'i'){
            i++;
            if(cadena[21] == 'n'){
                i++;
                if(cadena[22] == 's'){
                    i++;
                    if(cadena[23] == 't'){
                        i++;
                        if(cadena[24] == 'r'){
                            i++;
                            if(cadena[25] == 'u'){
                                i++;
                                if(cadena[26] == 'c'){
                                    i++;
                                    if(cadena[27] == 'c'){
                                        i++;
                                        if(cadena[28] == 'i'){
                                            i++;
                                            if(cadena[29] == 'o'){
                                                i++;
                                                if(cadena[30] == 'n'){
                                                    i++;
                                                    if(cadena[31] == 'e'){
                                                        i++;
                                                        if(cadena[32] == 's'){
                                                            i++;
                                                            textAreaResultado.appendText("q26 - " + cadena[20]+cadena[21]+cadena[22]+cadena[23]+cadena[24]+cadena[25]+cadena[26]+cadena[27]+cadena[28]+cadena[29]+cadena[30]+cadena[31]+cadena[32] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                        }else{
                                                            System.err.println("Dato no valido!!");
                                                        }
                                                        if(cadena[33] == ';'){
                                                            textAreaResultado.appendText("q27 - " + cadena[39] + "- q28"+"\n");
                                                            Estadoq28.setVisible(false);  
                                                        }
                                                        i++;
                                                        if(cadena[34] == '}'){
                                                            textAreaResultado.appendText("q28 - " + cadena[40] + "- q29"+"\n");
                                                            Estadoq29.setVisible(false);  
                                                            textAreaResultado.appendText("Dato valido!! " + "\n");
                                                        }
                                                        i++;
                                                        if(cadena[35] == '.'){
                                                            textAreaResultado.appendText("Dato no valido!! " + "\n");
                                                        }
                                                    }else{
                                                        System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                               System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                        System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                           System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
            System.err.println("Dato no valido!!");
        }
    }
    
    public void Estadoq27F(char[] cadena, int i){
        if(cadena[31] == 'i'){
            i++;
            if(cadena[32] == 'n'){
                i++;
                if(cadena[33] == 's'){
                    i++;
                    if(cadena[34] == 't'){
                        i++;
                        if(cadena[35] == 'r'){
                            i++;
                            if(cadena[36] == 'u'){
                                i++;
                                if(cadena[37] == 'c'){
                                    i++;
                                    if(cadena[38] == 'c'){
                                        i++;
                                        if(cadena[39] == 'i'){
                                            i++;
                                            if(cadena[40] == 'o'){
                                                i++;
                                                if(cadena[41] == 'n'){
                                                    i++;
                                                    if(cadena[42] == 'e'){
                                                        i++;
                                                        if(cadena[43] == 's'){
                                                            i++;
                                                            textAreaResultado.appendText("q26 - " + cadena[31]+cadena[32]+cadena[33]+cadena[34]+cadena[35]+cadena[36]+cadena[37]+cadena[38]+cadena[39]+cadena[40]+cadena[41]+cadena[42]+cadena[43] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                        }
                                                        Estadoq28(cadena,i);
                                                        i++;
                                                        Estadoq29(cadena,i);
                                                    }else{
                                                        System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                               System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                        System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                            System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
            System.err.println("Dato no valido!!");
        }
    }
   
    public void Estadoq27G(char[] cadena, int i){
        if(cadena[29] == 'i'){
            i++;
            if(cadena[30] == 'n'){
                i++;
                if(cadena[31] == 's'){
                    i++;
                    if(cadena[32] == 't'){
                        i++;
                        if(cadena[33] == 'r'){
                            i++;
                            if(cadena[34] == 'u'){
                                i++;
                                if(cadena[35] == 'c'){
                                    i++;
                                    if(cadena[36] == 'c'){
                                        i++;
                                        if(cadena[37] == 'i'){
                                            i++;
                                            if(cadena[38] == 'o'){
                                                i++;
                                                if(cadena[39] == 'n'){
                                                    i++;
                                                    if(cadena[40] == 'e'){
                                                        i++;
                                                        if(cadena[41] == 's'){
                                                            i++;
                                                            textAreaResultado.appendText("q26 - " + cadena[29]+cadena[30]+cadena[31]+cadena[32]+cadena[33]+cadena[34]+cadena[35]+cadena[36]+cadena[37]+cadena[38]+cadena[39]+cadena[40]+cadena[41] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                        }
                                                        textAreaResultado.appendText("q28 - " + cadena[43] + "- q29"+"\n");
                                                        Estadoq29.setVisible(false);  
                                                        textAreaResultado.appendText("Dato valido!! " + "\n");      
                                                        Estadoq28(cadena,i);
                                                    }else{
                                                        System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                               System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                        System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                            System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
            System.err.println("Dato no valido!!");
        }
    }
    
    public void Estadoq27H(char[] cadena, int i){
        if(cadena[26] == 'i'){
            i++;
            if(cadena[27] == 'n'){
                i++;
                if(cadena[28] == 's'){
                    i++;
                    if(cadena[29] == 't'){
                        i++;
                        if(cadena[30] == 'r'){
                            i++;
                            if(cadena[31] == 'u'){
                                i++;
                                if(cadena[32] == 'c'){
                                    i++;
                                    if(cadena[33] == 'c'){
                                        i++;
                                        if(cadena[34] == 'i'){
                                            i++;
                                            if(cadena[35] == 'o'){
                                                i++;
                                                if(cadena[36] == 'n'){
                                                    i++;
                                                    if(cadena[37] == 'e'){
                                                        i++;
                                                        if(cadena[38] == 's'){
                                                            i++;
                                                            textAreaResultado.appendText("q26 - " + cadena[26]+cadena[27]+cadena[28]+cadena[29]+cadena[30]+cadena[31]+cadena[32]+cadena[33]+cadena[34]+cadena[35]+cadena[36]+cadena[37]+cadena[38] + "- q27"+"\n");
                                                            Estadoq27.setVisible(false);
                                                        }
                                                        textAreaResultado.appendText("q28 - " + cadena[40] + "- q29"+"\n");
                                                        Estadoq29.setVisible(false);  
                                                        textAreaResultado.appendText("Dato valido!! " + "\n");      
                                                        Estadoq28(cadena,i);
                                                    }else{
                                                        System.err.println("Dato no valido!!");
                                                    }
                                                }else{
                                                    System.err.println("Dato no valido!!");
                                                }
                                            }else{
                                               System.err.println("Dato no valido!!");
                                            }
                                        }else{
                                            System.err.println("Dato no valido!!");
                                        }
                                    }else{
                                        System.err.println("Dato no valido!!");
                                    }
                                }else{
                                    System.err.println("Dato no valido!!");
                                }
                            }else{
                                System.err.println("Dato no valido!!");
                            }
                        }else{
                            System.err.println("Dato no valido!!");
                        }
                    }else{
                        System.err.println("Dato no valido!!");
                    }
                }else{
                    System.err.println("Dato no valido!!");
                }
            }else{
                System.err.println("Dato no valido!!");
            }
        }else{
            System.err.println("Dato no valido!!");
        }
    }
    public void Estadoq28(char[] cadena, int i){
        if(cadena[39] == ';'){
           textAreaResultado.appendText("q27 - " + cadena[39] + "- q28"+"\n");
            Estadoq28.setVisible(false);  
        }
        if(cadena[41] == ';'){
           textAreaResultado.appendText("q27 - " + cadena[41] + "- q28"+"\n");
            Estadoq28.setVisible(false);  
        }
        if(cadena[42] == ';'){
           textAreaResultado.appendText("q27 - " + cadena[42] + "- q28"+"\n");
            Estadoq28.setVisible(false);  
        }
        if(cadena[43] == ';'){
           textAreaResultado.appendText("q27 - " + cadena[43] + "- q28"+"\n");
            Estadoq28.setVisible(false);  
        }
        if(cadena[44] == ';'){
           textAreaResultado.appendText("q27 - " + cadena[44] + "- q28"+"\n");
            Estadoq28.setVisible(false);  
        }
        if(cadena[45] == ';'){
           textAreaResultado.appendText("q27 - " + cadena[44] + "- q28"+"\n");
            Estadoq28.setVisible(false);  
        }
    }
    
    public void Estadoq29(char[] cadena, int i){
        if(cadena[44] == '}'){
           textAreaResultado.appendText("q28 - " + cadena[44] + "- q29"+"\n");
            Estadoq29.setVisible(false);  
           textAreaResultado.appendText("Dato valido!! " + "\n");
        }
        if(cadena[45] == '}'){
            textAreaResultado.appendText("q28 - " + cadena[45] + "- q29"+"\n");
            Estadoq29.setVisible(false);  
            textAreaResultado.appendText("Dato valido!! " + "\n");
        }
        if(cadena[46] == '}'){
            textAreaResultado.appendText("q28 - " + cadena[45] + "- q29"+"\n");
            Estadoq29.setVisible(false);  
            textAreaResultado.appendText("Dato valido!! " + "\n");
        }
    }
    @FXML
    private void LimpiarAutomata(ActionEvent event){
        //textCadenaEntrada.setText("");
        textAreaResultado.setText("");
        Estadoq0.setVisible(true);
        Estadoq1.setVisible(true);
        Estadoq2.setVisible(true);
        Estadoq3.setVisible(true);
        Estadoq4.setVisible(true);
        Estadoq5.setVisible(true);
        Estadoq6.setVisible(true);
        Estadoq7.setVisible(true);
        Estadoq8.setVisible(true);
        Estadoq9.setVisible(true);
        Estadoq10.setVisible(true);
        Estadoq11.setVisible(true);
        Estadoq12.setVisible(true);
        Estadoq13.setVisible(true);
        Estadoq14.setVisible(true);
        Estadoq15.setVisible(true);
        Estadoq16.setVisible(true);
        Estadoq17.setVisible(true);
        Estadoq18.setVisible(true);
        Estadoq19.setVisible(true);
        Estadoq20.setVisible(true);
        Estadoq21.setVisible(true);
        Estadoq22.setVisible(true);
        Estadoq23.setVisible(true);
        Estadoq24.setVisible(true);
        Estadoq25.setVisible(true);
        Estadoq26.setVisible(true);
        Estadoq27.setVisible(true);
        Estadoq28.setVisible(true);
        Estadoq29.setVisible(true);
        Estadoq10.setVisible(true);
    }
    
    private void LimpiarAutomata(){
        //textCadenaEntrada.setText("");
        textAreaResultado.setText("");
        Estadoq0.setVisible(true);
        Estadoq1.setVisible(true);
        Estadoq2.setVisible(true);
        Estadoq3.setVisible(true);
        Estadoq4.setVisible(true);
        Estadoq5.setVisible(true);
        Estadoq6.setVisible(true);
        Estadoq7.setVisible(true);
        Estadoq8.setVisible(true);
        Estadoq9.setVisible(true);
        Estadoq10.setVisible(true);
        Estadoq11.setVisible(true);
        Estadoq12.setVisible(true);
        Estadoq13.setVisible(true);
        Estadoq14.setVisible(true);
        Estadoq15.setVisible(true);
        Estadoq16.setVisible(true);
        Estadoq17.setVisible(true);
        Estadoq18.setVisible(true);
        Estadoq19.setVisible(true);
        Estadoq20.setVisible(true);
        Estadoq21.setVisible(true);
        Estadoq22.setVisible(true);
        Estadoq23.setVisible(true);
        Estadoq24.setVisible(true);
        Estadoq25.setVisible(true);
        Estadoq26.setVisible(true);
        Estadoq27.setVisible(true);
        Estadoq28.setVisible(true);
        Estadoq29.setVisible(true);
        Estadoq10.setVisible(true);
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
