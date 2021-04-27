<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
 
<%@ include file="model.jsp" %>
 <script type="text/javascript" charset="utf-8" src="ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="ueditor/ueditor.all.min.js"> </script>
     <script type="text/javascript" charset="utf-8" src="ueditor/lang/zh-cn/zh-cn.js"></script>
      <section id="main-content">
          <section class="wrapper">
		
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                         
                          <div class="panel-body">
                           <form class="form-validate form-horizontal" id="feedback_form" action="${pageContext.request.contextPath }/insertPosition.action" method="post">
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">车位标识<span class="required">*</span></label>
                                          <div class="col-lg-10">
                                            <input class="form-control" id="positionname" name="positionname" minlength="2" type="text" required />  
                                          </div>
                                      </div>
                                     
                                      
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit">保存</button>  
                                          </div>
                                      </div>
                                  </form>
          
          </div>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
