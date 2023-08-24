<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('https://images.unsplash.com/photo-1607743882420-4412ee605bac?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=735&q=80'); background-size: cover;">
<h1 style="color: skyblue">Registered User's</h1>

<%@page import="java.sql.*" %>

<table border="1" style="color: skyblue; text-align: center;">
<tr>
<th>Name</th>
<th>contact</th>
<th> DOB</th>
<th>city</th>
<th>email</th>


</tr>



<%

Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_3","root","root");

String str="select * from student";
Statement st=conn.createStatement();

ResultSet rs=st.executeQuery(str);%>


<%while (rs.next()){%>
<tr>

<td><%	out.println(rs.getString(1));%></td>

<td><%	out.println(rs.getInt(2));%></td>

<td><%	out.println(rs.getString(3));%></td>

<td><%	out.println(rs.getString(4));%></td>

<td><%	out.println(rs.getString(5));



}

%></td>

</tr>
</table>

<br>

<b><a href="try.html">Back To Home</a></b>


</body>
</html>