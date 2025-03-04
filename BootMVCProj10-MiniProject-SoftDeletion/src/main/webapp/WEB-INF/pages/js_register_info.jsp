<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<h1 style="color:cyan; text-align: center">JobSeeker Registration Page</h1>

<frm:form modelAttribute="js" method="post">
    <table align="center" bgcolor="cyan">
        <tr>
            <td>Name</td>
            <td><frm:input type="text" path="jsname"/></td>
        </tr>
        <tr>
            <td>Address</td> 
            <td><frm:input type="text" path="jsadress" /></td>
        </tr>
        <tr>
            <td>Percentage</td>
            <td><frm:input type="text" path="jspercentage" /></td> <!-- Fixed the space issue here -->
        </tr>
        <tr>
            <td><input type="submit" value="Register" /></td>
            <td><input type="reset" value="Clear" /></td>
        </tr>
    </table>
</frm:form>

