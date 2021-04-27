<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="model.jsp"%>

<script>
function queding(newsid){
	
	 var r=confirm("确定删除吗")
	  if (r==true)
	    {
		  //alert(blogId);
		  window.location.href="${pageContext.request.contextPath }/deleteBlog.action?newsid="+newsid;
	    }
	  else
	    {
		 return false;
	    }
	
}
</script>
<!--sidebar end-->

<!--main content start-->
<section id="main-content">
	<section class="wrapper">


		<div class="row">
			<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
				<div class="info-box blue-bg">
					<i class="fa fa-cloud-download"></i>
					<div class="count">${monthCount}</div>
					<div class="title">月收入</div>
				</div>
				<!--/.info-box-->
			</div>
			<!--/.col-->

			<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
				<div class="info-box brown-bg">
					<i class="fa fa-shopping-cart"></i>
					<div class="count">${cardCount}</div>
					<div class="title">办卡数量</div>
				</div>
				<!--/.info-box-->
			</div>
			<!--/.col-->

			<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
				<div class="info-box dark-bg">
					<i class="fa fa-thumbs-o-up"></i>
					<div class="count">${freePosition}</div>
					<div class="title">空余车位</div>
				</div>
				<!--/.info-box-->
			</div>
			<!--/.col-->

			<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
				<div class="info-box green-bg">
					<i class="fa fa-cubes"></i>
					<div class="count">${usingPosition}</div>
					<div class="title">已用车位</div>
				</div>
				<!--/.info-box-->
			</div>
			<!--/.col-->


		</div>
		<!--/.row-->





		<!-- Today status end -->



		<div class="row">

			<div class="col-lg-9 col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h2>
							<i class="fa fa-flag-o red"></i><strong>当前停车情况</strong>
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
									<th>车位</th>
									<th>状态</th>
									<th>车牌</th>
									<th>进入时间</th>
									<th>车辆类型</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${positionUseList }" var="list">
									<tr>
										<td>${list.position }</td>
										<td>${list.positionstatedes }</td>
										<td>${list.carnumber }</td>
										<td>${list.intimestring }</td>
										<td>${list.lveldes }</td>
									</tr>
								</c:forEach>






							</tbody>
						</table>
					</div>

				</div>
			</div>
			<div class="col-md-3">

				<header class="panel-heading"> 查询每日停车记录 </header>
				<div class="panel-body">
					<form class="form-validate form-horizontal" id="feedback_form"
						action="${pageContext.request.contextPath }/dayRecord.action"
						method="post">
						<div class="form-group ">
							<input class="" id="day" name="day" 
								type="date" required />
							<button
								type="submit"
								class="btn btn-info popovers">查询</button>

						</div>


					</form>
					

				</div>
			</div>
					<div class="col-md-3">

				<header class="panel-heading"> 查询时段停车记录</header>
				<div class="panel-body">
					<form class="form-validate form-horizontal" id="feedback_form"
						action="${pageContext.request.contextPath }/liuliang.action"
						method="post">
						<div class="form-group ">
							起始时间<input class="" id="starttime" name="starttime" 
								type="datetime-local" required /><br>
								截止时间
								<input class="" id="endtime" name="endtime" 
								type="datetime-local" required /><br>
							<button type="submit"
								class="btn btn-info popovers">查询</button>

						</div>


					</form>
					

				</div>
			</div>
			
		<div class="col-lg-9 col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h2>
						<i class="fa fa-flag-o red"></i><strong>公告管理</strong>
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
								<th>公告标题</th>
								<th>公告内容</th>
								<th>发布时间</th>
								<th>可选操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${newsList }" var="list">
								<tr>
									<td>${list.title }</td>
									<td>${list.message }</td>
									<td>${list.creattimestring }</td>
									<td><div class="btn-group">
											<a class="btn btn-danger" href="#"
												onclick="queding(${list.newsid})"><i
												class="icon_close_alt2"></i></a>
											<!--  <a class="btn btn-success" href="#"><i class="icon_check_alt2"></i></a> -->
										</div></td>
								</tr>
							</c:forEach>






						</tbody>
					</table>
				</div>

			</div>
		</div>



		<br> <br>


		<!-- project team & activity end -->

	</section>
</section>
<!--main content end-->
<!-- container section start -->

<!-- javascripts -->
<script src="js/jquery.js"></script>
<script src="js/jquery-ui-1.10.4.min.js"></script>
<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.9.2.custom.min.js"></script>
<!-- bootstrap -->
<script src="js/bootstrap.min.js"></script>
<!-- nice scroll -->
<script src="js/jquery.scrollTo.min.js"></script>
<script src="js/jquery.nicescroll.js" type="text/javascript"></script>
<!-- charts scripts -->
<script src="assets/jquery-knob/js/jquery.knob.js"></script>
<script src="js/jquery.sparkline.js" type="text/javascript"></script>
<script src="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
<script src="js/owl.carousel.js"></script>
<!-- jQuery full calendar -->
<script src="js/fullcalendar.min.js"></script>
<!-- Full Google Calendar - Calendar -->
<script src="assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
<!--script for this page only-->
<script src="js/calendar-custom.js"></script>
<script src="js/jquery.rateit.min.js"></script>
<!-- custom select -->
<script src="js/jquery.customSelect.min.js"></script>
<script src="assets/chart-master/Chart.js"></script>

<!--custome script for all page-->
<script src="js/scripts.js"></script>
<!-- custom script for this page-->
<script src="js/sparkline-chart.js"></script>
<script src="js/easy-pie-chart.js"></script>
<script src="js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="js/jquery-jvectormap-world-mill-en.js"></script>
<script src="js/xcharts.min.js"></script>
<script src="js/jquery.autosize.min.js"></script>
<script src="js/jquery.placeholder.min.js"></script>
<script src="js/gdp-data.js"></script>
<script src="js/morris.min.js"></script>
<script src="js/sparklines.js"></script>
<script src="js/charts.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<script>



      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
	  
	  /* ---------- Map ---------- */
	$(function(){
	  $('#map').vectorMap({
	    map: 'world_mill_en',
	    series: {
	      regions: [{
	        values: gdpData,
	        scale: ['#000', '#000'],
	        normalizeFunction: 'polynomial'
	      }]
	    },
		backgroundColor: '#eef3f7',
	    onLabelShow: function(e, el, code){
	      el.html(el.html()+' (GDP - '+gdpData[code]+')');
	    }
	  });
	});



  </script>

</body>
</html>
