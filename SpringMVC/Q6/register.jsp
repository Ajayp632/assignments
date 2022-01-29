<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Spring MVC Form Validation</title>
      <style>
         .error {
         color: red
         }
      </style>
   </head>
   <body>
   		<form action = "/mvc/processForm" method = "post">
      <form:form action="processForm" modelAttribute="reg">
         <div align="center">
            <h2>Register Here</h2>
            <table>
               <tr>
                  <td>UserName</td>
                  <td>
                  	 <form:errors path = "register.*/" />
                     <input type="text" name="username"/>
                  </td>
                  <td>
                  	  
                     <form:errors path="username" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Password</td>
                  <td>
                     <form:errors path = "register.*/" />
                     <input type="text" name="password"/>
                  </td>
                  <td>
                     <form:errors path="password" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Email</td>
                  <td>
                     <form:errors path = "register.*/" />
                     <input type="text" name="email"/>
                  </td>
                  <td>
                     <form:errors path="email" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Contact</td>
                  <td>
                     <form:errors path = "register.*/" />
                     <input type="text" name="contact"/>
                  </td>
                  <td>
                     <form:errors path="contact" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td><input type="submit" value="Submit" /></td>
               </tr>
            </table>
         </div>
      </form:form>
   </body>
</html>