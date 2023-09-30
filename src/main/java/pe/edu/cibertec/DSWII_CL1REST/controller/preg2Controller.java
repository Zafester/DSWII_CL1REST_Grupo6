package pe.edu.cibertec.cl1_dsw_apirest.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.cl1_dsw_apirest.model.MensajeResponse;
import pe.edu.cibertec.cl1_dsw_apirest.service.preg2Service;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/preg2")
public class preg2Controller {

  private preg2Service preg2Service;


  @GetMapping("/jubilacion")
    public ResponseEntity<MensajeResponse> jubilacion(@RequestParam Integer edad,@RequestParam String sexo){

      return new ResponseEntity<>(preg2Service.jubilacion(edad,sexo), HttpStatus.OK);

  }

  @GetMapping("/numeros")
  public  ResponseEntity<MensajeResponse> numerpmenor(@RequestParam Integer num1, @RequestParam Integer num2,@RequestParam Integer num3,@RequestParam Integer num4){

      return new ResponseEntity<>(preg2Service.numerpmenor(num1,num2,num3,num4),HttpStatus.OK);
  }





  @GetMapping("/sumamul")
  public  ResponseEntity<MensajeResponse> numerpmenor(@RequestParam Integer numinicio, @RequestParam Integer numfinal){
    return new ResponseEntity<>(preg2Service.sumnumerosmultiplos(numinicio,numfinal), HttpStatus.OK);
  }







}
