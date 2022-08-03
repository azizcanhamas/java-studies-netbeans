<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<%@page import="java.io.InputStreamReader" %>
<%@page import="java.io.FileInputStream" %>
<%@page import="org.json.simple.parser.*"%>
<%@page import="org.json.simple.*"%>
<%@page import="java.io.IOException"%>

<style>
    html{
        width:99%;
        height: 100%;
    }

    body{
        background-color: #0f2c54;
        width:100%;
        height:100%;
        font-family: monospace,"Monaco";
        font-size: 90%;
    }

    #container{
        height: 100%;
        width: 70%;
        margin:0 auto; 
    }

    #form_div{
        background-color: white;
        width: 65%;
        height: 62%;
        margin: 0 auto;
        position:relative;
        top:15%;
        padding:1%;
        border-radius:  20px/20px;
        border:10px solid black;
    }
    
    table{
        margin:0 auto;      
        width: 100%;
        height:100%;
        padding-top:0%;
        border-radius:  10px/10px;
        background-color: #00000;
    }

    th{
        height:100px;
        background-color:#7587a1;
        border-radius:  10px/10px;
    }

    tr{
        width:100%;
        height: 100%;
        padding: 10%;
    }  

    td{
        height: 100%;       
        font-weight: bold;
        text-align: center;
        border-radius:  10px/10px;
        padding: 0.1em;
    }

    input,button{
        width: 96%;
        height:98%;
        border-radius:  10px/10px;
        border:3px solid black;
    }
    
    select{
        width:99%;
        height:98%;
        border-radius:  10px/10px;
        text-align:center;
        border: 3px solid black;       
    }
    
    textarea{
        width: 95%;
        height: 100%;
        text-align: center;
        border: 3px solid black;
        border-radius:  10px/10px;
        resize:none;
    }

    input[type="text"]{
        text-align: center;
    }        
</style>

<%@include file="../Controller/uyeGuncelleController.jsp" %>
<%  
    ArrayList<String>datas=getUye(request.getParameter("guncelle"));
%>

<body>
    <div id="container">
        <div id="form_div">
            <form>
                <table border="2">
                    <tr>
                        <th colspan="8">Üye Güncelle Ekranı</th>
                    </tr>             
                    <tr>
                        <td colspan="1">Kullanıcı Adı</td>
                        <td colspan="7"><input type="text" name="yeniKullaniciAdi" value="<%=datas.get(0).toString()%>"/></td>
                    </tr>
                    
                    <tr>
                        <td>Üye Adı</td>
                        <td colspan="7"><input type="text" name="ad" value="<%=datas.get(1).toString()%>"/>
                           
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Üye Soyadı</td>
                        <td colspan="7"><input type="text" name="soyad" value="<%=datas.get(2).toString()%>"/></td>
                    </tr>
                    
                    <tr>
                        <td>Üye İl</td>
                        <td colspan="7">
                            <select name="il">
                                
                                <option name="il" value="<%=datas.get(3).toString()%>"><%=datas.get(3).toString()%></option>
                            <%                             
                                try(InputStreamReader file=new InputStreamReader(new FileInputStream("C:\\Users\\azuwin_user\\Documents\\NetBeansProjects\\MVC\\src\\main\\webapp\\iller-ilceler.json"),"utf-8")){
                                    // Tum dosyanin parse edilmesi.
                                    JSONParser parser=new JSONParser();
                                    Object obj=parser.parse(file);

                                    JSONArray jo_obj=(JSONArray)obj;
                                    for (Object object : jo_obj) {
                                        JSONObject jo=(JSONObject)object;
                            %>
                                        <option name="il" value="<%=jo.get("text")%>"><%=jo.get("text")%></option>
                            <%                                            
                                    }
                                }catch(IOException ex){
                                    out.print("ERROR: "+ex);
                                } catch (ParseException ex) {
                                    out.print("ERROR: "+ex);
                                }
                            %>  
                            </select>                           
                        </td>
                    </tr>
                    
                    <tr>
                        <td>İletişim Adresi</td>
                        <td colspan="7"><textarea name="iletisimAdresi" rows="10" cols="50"><%=datas.get(4).toString()%></textarea></td>
                    </tr>
                    <tr>
                        <td colspan="2"><button formaction="../Controller/uyeGuncelleController.jsp" name="eskiKullaniciAdi" value="<%=request.getParameter("guncelle")%>">Güncelle</button></td> <!--eski kullanıcı unutulmamalı-->
                        
                        <td colspan="2"><button formaction="adminPanel.jsp">Anasayfaya Git</button></td>
                        
                        <td colspan="2"><button formaction="uyeListele.jsp">Listele Ekranına Git</button></td>
                        
                        <td colspan="2"><input type="reset" value="Temizle"/></button></td>
                    </tr>
                    
                    
                        
                </table>                              
            </form>
        </div>                      
    </div>
</body>
</html>
