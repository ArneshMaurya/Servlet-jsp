<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList,java.util.Calendar" %>
    <%@ page session="true" %>
    <%! private int x=10; %>
    <%! public int getValue(){
    	return 10;
    }%>
    	
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
for(int i=0;i<10;i++){
%>
<h1>Capgemini solutions.</h1>
<%
}
%>
<%=x %>
<%=getValue() %>
<%
config.getInitParameter(arg0);
application.getInitParameter(arg0);
session.getSessionContext();
System.out.println(page.x);
%>

</body>
</html>

<%--  
Directives:<%@ %>
	Page:session,import
	tagLib:
	include:compile time
Declarations:<%! %> They are contents of class, Instance Fields, Methods.
Scriptlets:<% %> its ajava code to be added inside service().
Expressions:<%= %> a single value to print.
Template: Its html parts.
Elements:<jsp:element name=""></jsp:element>, forward, include.
--%>
<!-- 
Implicit objects
	1.ServletConfig: application
	2.ServletContext: config
	3.HttpServletRequest:request
	4.HttpServletResponse: response
	5.HttpSession: session
	6.JspWriter: out: Handle to Response
	7.Page: page: its like "this"
	8.PageContext: pageContext: Bundle of Jsp resources.
	9.Exception exception: Refers to Exception Available on only those JSP for Whom
	<%-- <%@ page isError=true%>--%>
 -->