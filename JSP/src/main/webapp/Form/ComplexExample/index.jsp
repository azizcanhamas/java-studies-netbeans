<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kayıt Formu</title>
    </head>

    <style>
        *{
         margin:10px;   
        }
    </style>

    <body>
        <div style="padding:25px; width:400px; border: 1px solid black;">
            <form method="post" action="display.jsp">
                <label>Ad</label><input id="ad" name="ad" type="text" placeholder="Adinizi giriniz." size="40" onkeyup="form_kontrol()"/><br>
                <label>Soyad</label><input id="soyad" name="soyad" type="text" placeholder="Soyadinizi giriniz." size="30" onkeyup="form_kontrol()"/><br>
                <!--
                    Radiobutton gruplarken JSP tarafindan secili parametrenin alinabilmesi icin
                    id'ler farkli, name'ler ayni ve value degerleri farkli olarak tanimlanmalidir. 
                -->
                <label>Cinsiyet</label><input id="erkek" name="cinsiyet" value="Erkek" type="radio" checked="checked"/>Erkek 
                <input id="kadin" name="cinsiyet" value="Kadin" type="radio"/>Kadın<br>
                <label>Dogum tarihi</label>
                
                <!--Checkbox nesnelerinin for dongusu ile doldurulmasi-->
                <select id="gun" name="gun">
                    <%
                        for (int i = 1; i <= 31; i++) {
                    %>
                        <option value="<%=i%>"><%=i%></option>
                    <%
                        }
                    %>        
                </select>

                <select id="ay" name="ay">
                    <%
                        for (int i = 1; i <= 12; i++) {
                    %>
                        <option value="<%=i%>"><%=i%></option>
                    <%
                        }
                    %>        
                </select>

                <select id="yil" name="yil">
                    <%
                        for (int i = 2022; i >= 1940; i--) {
                    %>
                        <option value="<%=i%>"><%=i%></option>
                    <%
                        }
                    %>        
                </select><br>

                <label>Mesleki Birikim</label>
                <input id="ASPNet" name="meslekiBirikim" value="ASP.Net" type="checkbox" onchange="form_kontrol()"/>ASP.Net
                <input id="Java" name="meslekiBirikim" value="Java" type="checkbox" onchange="form_kontrol()"/>Java
                <input id="Python" name="meslekiBirikim" value="Python" type="checkbox" onchange="form_kontrol()"/>Python<br><br>

                <label>Hedefleriniz</label><br>
                <textarea id="hedef" name="hedef" rows="10" cols="50" name="textarea" onkeyup="form_kontrol();"></textarea><br>
                
                <input type="checkbox" id="kullanim" name="kullanim" onchange="form_kontrol()"/>
                <label>Kullanım sözleşmesini kabul ediyorum.</label><br>
                
                <input id="gonder" name="gonder" type="submit" value="Gonder"/>
                <input id="temizle" name="temizle" type="reset"  size="20"/> 
            </form>
        </div>  
    </body>
    
    <script>
        function form_kontrol(){
            if(document.getElementById("ad").value.length==0){
                document.getElementById("gonder").disabled=true;
            }
            else if(document.getElementById("soyad").value.length==0){               
                document.getElementById("gonder").disabled=true;
            }
            else if(document.getElementById("hedef").value.length==0){               
                document.getElementById("gonder").disabled=true;
            }
            else if(document.getElementById("kullanim").checked==false){               
                document.getElementById("gonder").disabled=true;
            }
            else{               
                document.getElementById("gonder").disabled=false;
            }
        }
    </script>
    
    
</html>
