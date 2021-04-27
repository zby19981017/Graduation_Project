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
                           <form class="form-validate form-horizontal" id="feedback_form" action="${pageContext.request.contextPath }/saveSys.action" method="post">
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">每小时收费（单位：元） <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                            <input class="form-control" id="usualprice" name="usualprice"  type="text" value="${sysrecord.usualprice }" required />  
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="cemail" class="control-label col-lg-2">最大免费时间（单位：分钟） <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="mintime" type="text" name="mintime" value="${sysrecord.mintime }" required />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="cemail" class="control-label col-lg-2">年卡费用 <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="vipprice" type="text" name="vipprice" value="${sysrecord.vipprice }" required  />
                                          </div>
                                      </div>
                                      
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit">保存</button>  
                                          </div>
                                      </div>
                                  </form>
          
          </div>
          <div class="panel-body">
                           <form class="form-validate form-horizontal" id="feedback_form" action="${pageContext.request.contextPath }/saveFree.action" method="post">
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">设置免费车辆 <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                            <input class="form-control" id="carnumber" name="carnumber"  type="text" required />  
                                         	<h5><font color="red">${messageFree }</font></h5>
                                          </div>
                                         
                                      </div>
                                       
                                      
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit">保存</button>  
                                          </div>
                                      </div>
                                  </form>
          
          </div>
          <div class="panel-body">
                           <form class="form-validate form-horizontal" id="feedback_form" action="${pageContext.request.contextPath }/saveBlog.action" method="post">
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">公告标题 <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                            <input class="form-control" id="usualprice" name="title"  type="text" required />  
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="cemail" class="control-label col-lg-2">公告内容<span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="mintime" type="text" name="message" required />
                                          </div>
                                      </div>
                                      
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit">发布</button>  
                                          </div>
                                      </div>
                                  </form>
          
          </div>
          <div class="panel-body">
                           <form class="form-validate form-horizontal" id="feedback_form" action="${pageContext.request.contextPath }/saveSys.action" method="post">
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">开启或关闭停车场</label>
                                          
                                          <div class="col-lg-10">
                                          <a class="btn btn-primary btn-lg"   href="${pageContext.request.contextPath }/controlPark.action?type=on">开启停车场</a><br><br>
                                          <a class="btn btn-danger btn-lg"  href="${pageContext.request.contextPath }/controlPark.action?type=off">关闭停车场</a><br><br>
												
												<h5><font color="red">${messageControl }</font></h5>
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
