<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
</head>
<body>

  <h1 align="center">${title }</h1>
  <hr>
  <form action="processItem">
  <div align="center">
    <label for="item">please enter dish you want</label>&nbsp;&nbsp;
    <input type="text" name="item-name" id="item" placeholder="burger"/>
    <button type="submit">submit</button>
  </div>
  </form>
</body>
</html>