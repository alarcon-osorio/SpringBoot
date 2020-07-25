## Spring Boot Projects

_Projects_

#
_Errors:_ 

Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

Sat Jul 25 00:03:29 COT 2020
There was an unexpected error (type=Bad Request, status=400).
Validation failed for object='videoJuego'. Error count: 1
org.springframework.validation.BindException: org.springframework.validation.BeanPropertyBindingResult: 1 errors
Field error in object 'videoJuego' on field 'distribuidor': rejected value [2]; codes [typeMismatch.videoJuego.distribuidor,typeMismatch.distribuidor,typeMismatch.com.server.videojuegos.entity.Distribuidor,typeMismatch]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [videoJuego.distribuidor,distribuidor]; arguments []; default message [distribuidor]]; default message [Failed to convert property value of type 'java.lang.String' to required type 'com.server.videojuegos.entity.Distribuidor' for property 'distribuidor'; nested exception is java.lang.IllegalStateException: Cannot convert value of type 'java.lang.String' to required type 'com.server.videojuegos.entity.Distribuidor' for property 'distribuidor': no matching editors or conversion strategy found]

_Soluction:_

Importar en POM.XML

<dependency>
    <groupId>org.springframework.boot</groupId> 
    <artifactId>spring-boot-starter-validation</artifactId> 
</dependency>

@PostMapping("/videojuegos/guardar")
public String guardar(@Valid VideoJuego videoJuego, BindingResult bindingResult, Model model) {

    System.out.println(videoJuego);
    return "redirect:/";
}

#

