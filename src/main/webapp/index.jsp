<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fun</title>
</head>

<style>
.jok
{
width: 500px;
height:200px;
text-align: center;
margin-left:30%;
padding: 0;
margin-top: 10%;
background-color: #42cbf5;
border: 2px solid red;
}
h4
{
padding-top: 20px;

}

button:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);

}


</style>

<body>

<div class="jok">

<h4>Its Fun Time !!!!</h4>

<p>Dhiraj:-${setup}</p>
<p>Vinit:-${punchline}</p>


<form action="change">
<button type="submit" name="change" value="change" >Change</button>
</form>


</div>

</body>
</html>
