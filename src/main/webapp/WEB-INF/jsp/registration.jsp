<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <form:form modelAttribute="registration">
        <table>
            <tr>
                <td>
                    Name :
                </td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value"Add" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>