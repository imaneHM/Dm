1/Spring web dependency:The spring-web dependency contains common web specific utilities for both Servlet and Portlet environments.

2/Spring data JPA:Spring Data JPA is a part of the larger Spring Data family, that makes it easy to easily implement JPA based repositories.

3/Hibernate Validator is the reference implementation of the validation API.It allows to express and validate application constraints.

4/H2 is a relational database management system written in Java. It can be embedded in Java applications or run in client-server mode.

5/DevTools is a Developer Tool. The aim of the module is to try and improve the development time while working with the Spring Boot application.

6/Thymeleaf is a Java XML/XHTML/HTML5 template engine that can work both in web  and non-web environments.It also Allows HTML to be correctly displayed in browsers and as static prototypes.

1/    @GetMapping("/greeting")
2/public String greeting ( @RequestParam( name ="nameGET",
required =false , defaultValue ="World")
3/ model . addAttribute ("nomTemplate", nameGET )
étape17
la table ADDRESS est ajoutée
étape18(search for it later)
Etape 20
oui
SELECT * FROM ADDRESS
ID  	CONTENT  	                          CREATION  
1	    57 boulevard demorieux	                   2021-11-12 15:34:25.983856
2	    51 allee du gamay , 34080 montpellier 	   2021-11-12 15:34:25.997848
Etape 23
The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished.
TP4
etape6
oui, il faut une clé pour appeler Meteoconcept , appelé communément "token".
il faut appeler l'URL  https://api.meteo-concept.com/api/
3)L'authentification à l'API est fournie en transmettant le token en tant que paramètre d'URL (token) ou d'en-tête. Dans ce dernier cas, le token est passé dans l'en-tête Authorization sous la forme Authorization: Bearer MON_TOKEN.
https://api.meteo-concept.com/api/forecast/nextHours:pour afficher les previsions dans les prochains heures, la localisation de la prévision étant données dans les paramètres de la requête

