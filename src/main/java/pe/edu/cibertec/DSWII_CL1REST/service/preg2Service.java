package pe.edu.cibertec.cl1_dsw_apirest.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.cl1_dsw_apirest.model.MensajeResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class preg2Service {


 public MensajeResponse jubilacion(Integer edad , String sexo){

     if ((sexo.equals("Hombre") && edad >= 60) || (sexo.equals("Mujer") && edad >= 54)) {
        return MensajeResponse.builder().resultado("Se puede jubilar").build();
     }
     else{
         return MensajeResponse.builder().resultado("No se puede jubilar").build();
     }
 }

 public MensajeResponse numerpmenor(Integer num1,Integer num2,Integer num3,Integer num4){

    int nums[] = {num1,num2,num3,num4};
     Arrays.sort(nums);
     return MensajeResponse.builder().resultado("El numero menor es " + nums[0]).build();

 }

    public MensajeResponse sumnumerosmultiplos(Integer numinicio, Integer numfinal){
        int suma=0;
        for(int i = numinicio; i <= numfinal;i++){
            if (i % 3 == 0 || i % 7 == 0){
                suma += i;
            }
        }
        return MensajeResponse.builder().resultado("La suma es " + suma ).build();
    }


    public



}
