<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 style="color:blue;text-align: center">Report Page</h1>
<c:choose>
    <c:when test="${!empty jslist}">
        <table border="1" bgcolor="cyan" align="center">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Adress</th>
                <th>Percentage</th>
                <th>Opeation</th>
            </tr>
            <c:forEach var="js" items="${jslist}">
                <tr style="color:blue">
                    <td>${js.jsid}</td>
                    <td>${js.jsname}</td>
                    <td>${js.jsadress}</td>
                    <td>${js.jspercentage}</td>
                      <td> <a href="edit?id=${js.jsid}"><img src="images/edit.jpg" width="20px" height="30px"></a>&nbsp;&nbsp;
                <a href="delete?id=${js.jsid}" onclick="return confirm('Are sure want to delete ?')"><img src="images/delete.jpg" width="20px" height="30px"></a></td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1 style="color:red;text-align: center">JobSeeker Not Found</h1>
    </c:otherwise>
</c:choose>

<a href="./" style="display:flex;justify-content: center;align-items: center">home</a>
<a href="add"  style="display:flex;justify-content: center;align-items: center">AddJobSeeker<img src="images/add.jpg" width="40" height="50"/></a>
<h1 style="color:blue;text-align:center">${jsMsg}</h1>

