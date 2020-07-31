<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${usuarioVo.getMensaje() != null  && usuarioVo.getMensaje().getTexto() != null}">
 <div>
     <div 
     	class='alert alert-<c:out value="${usuarioVo.getMensaje().getClaseCss()}" /> alert-dismissible fade show' role="alert">
         <button type="button" class="close" data-dismiss="alert" aria-label="Close">
             <span aria-hidden="true">&times;</span>
         </button>
         <strong>¡<c:out value="${usuarioVo.getMensaje().getTitulo()}" />! - </strong> <c:out value="${usuarioVo.getMensaje().getTexto()}" />
         
     </div>
 </div>
</c:if>