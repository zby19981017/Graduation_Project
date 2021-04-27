<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
 
<%@ include file="model.jsp" %>

  <section id="main-content">
          <section class="wrapper">            
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
				<form class="form-horizontal " action="${pageContext.request.contextPath }/updateBlog.action" method="post"   name="upfile">
					<div align="center"><h3>${blog.blogTitle }</h3> </div>
					
					操作成功！！！
				</div>
				<!--<input type="submit" value="编辑" class="btn btn-success btn-lg">-->
				</form>
			</div>
         
          </section>
      </section>


