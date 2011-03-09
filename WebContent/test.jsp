<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<sql:query var="rs" dataSource="jdbc/PMRSDS">
select LOGIN_NAME,LAST_NAME from pmrs_user
</sql:query>

<html>
<head>
<title>DB Test</title>
</head>
<body>

<h2>Results</h2>

<c:forEach var="row" items="${rs.rows}">
    Login Name : ${row.LOGIN_NAME}<br />
    Last  Name : ${row.LAST_NAME}<br />
</c:forEach>

</body>
</html>
