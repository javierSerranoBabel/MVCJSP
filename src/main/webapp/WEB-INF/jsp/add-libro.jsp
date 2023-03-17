<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <html>

        <head>
            <title>Add Libro</title>
        </head>

        <body>
            <c:if test="${success}">
                <div>Libro guardado correctamente con ISBN: ${savedBook.isbdn}</div>

            </c:if>

            <form action="/libros" method="POST">
                    <label for="libroISBN"> ISBN del libro: </label><br>
                    <input type="text" id="isbdn" name="isbdn">
                    <label for="titulo"> Nombre del libro: </label><br>
                    <input type="text" id="titulo" name="titulo">
                    <label for="autor"> Autor del libro: </label><br>
                    <input type="text" id="autor" name="autor">
                    <input type="submit" value="Añadir libro">
            </form>
        </body>

        </html>