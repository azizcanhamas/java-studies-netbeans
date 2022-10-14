<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            table,tr,td,th{
                border:1px solid black;
                margin:2px;
                padding:5px;
            }
        </style>
    </head>
    <body>
        
        <!--
            Ekrana aşağıdaki şekilde tablo yazan program
            0 0 1 2 3
            1 0 1 2 3
            2 0 1 2 3
            3 0 1 2 3
        -->

        <table>
            <%
                for(int i=0;i<4;i++){
            %>
                    <tr>
                        <td><%=i%></td>
                    
                <%
                    for(int j=0;j<4;j++){
                %>
                        <td><%=j%></td>
                    
                <%
                    }
                %>
                </tr>
                <%
                }
                %>
        </table>

    </body>
</html>
