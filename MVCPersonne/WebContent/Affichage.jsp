<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "iset.modele.Personne"%>
 <%@ page import ="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>

<%
ArrayList<Personne> list = new ArrayList<Personne>();
list = (ArrayList<Personne>) session.getAttribute("Personne");
%>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2">

            <% for(int i = 0; i < list.size(); i++) {
                Personne actor = new Personne();
                actor = list.get(i);
                //out.println(actor.getId());
                //out.println(actor.getFirstname());
                //out.println(actor.getLastname());
            %>
            <tr><td>nom </td><td>prenom</td><td>sexe</td><td>codePostal</td></tr>
            <tr>
                <td><%=actor.getNom()%></td>
                <td><%=actor.getPreNom()%></td>
                <td><%=actor.getSexe()%></td>
                <td><%=actor.getCodeP()%></td>
               </tr>
                  <%
            };
            %>
        
</table>



</body>
</html>