<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.*"%>
<%@page import="model.TblAuto"%>

    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Autos</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de Autos</h1>
<table>
<tr>
<th>codigo</th>
<th>marca</th>
<th>modelo</th>
<th>color</th>
<th>motor</th>
<th>nro_tarje</th>

</tr>
<%
List<TblAuto> listar=(List<TblAuto>)request.getAttribute("listado");
//APLICAMOS UN BUCLE
for(TblAuto lis:listar){
	//APLICAMOS UNA CONDICION
	if(lis!=null){
		%>
		<tr>
				<td><%=lis.getIdauto() %></td>
				<td><%=lis.getMarca() %></td>
				<td><%=lis.getModelo() %></td>
				<td><%=lis.getColor() %></td>
				<td><%=lis.getMotor() %></td>
				<td><%=lis.getNroTarje() %></td>
		
		</tr>
		<%
	}//FIN DEL IF
	
}//FIN DEL BUCLE
%>


</table>

</body>
</html>