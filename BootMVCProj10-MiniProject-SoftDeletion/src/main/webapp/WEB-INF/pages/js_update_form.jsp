<%@ page language="java" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<h1 style="color:cyan; text-align: center">JobSeeker Updetion Page</h1>

<frm:form modelAttribute= "js"  method="post">
    <table align="center" bgcolor="red">
    <tr>
            <td>Id</td>
            <td><frm:input type="text" path="jsid" readonly="true"/></td>
        </tr>
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
            <td><input type="submit" value="edit jobSeeker" /></td>
            <td><input type="reset" value="Cancel" /></td>
        </tr>
    </table>
</frm:form>

