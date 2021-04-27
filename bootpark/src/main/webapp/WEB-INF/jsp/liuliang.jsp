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
                         
                          	<div class="col-lg-9 col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h2>
							<i class="fa fa-flag-o red"></i><strong>单日车流量统计</strong>
						</h2>
						<div class="panel-actions">
							<a href="index.html#" class="btn-setting"><i
								class="fa fa-rotate-right"></i></a> <a href="index.html#"
								class="btn-minimize"><i class="fa fa-chevron-up"></i></a> <a
								href="index.html#" class="btn-close"><i class="fa fa-times"></i></a>
						</div>
					</div>
					<div class="panel-body">
						<table class="table bootstrap-datatable countries">
							<thead>
								<tr>
									<th>时间段</th>
									<th>进入数量</th>
									<th>离开数量</th>
									<th>整时段停车数</th>
									<th>进入普通车数量</th>
									<th>进入年卡车数量</th>
									<th>进入免费车数量</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach items="${positionUseList }" var="list" >
								<tr>
									<td>${list.carnumber }</td>
									<td>${list.carstatedes }</td>
									<td>${list.intimestring }</td>
									<td>${list.outtimestring }</td>
									<td>${list.lveldes }</td>
									<td>${list.parkprice }</td>
									<td>${list.position }</td>
								</tr>
								</c:forEach>
								
								
								
								
								
								
							</tbody>
						</table>
					</div>

				</div>
					

			</div>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
