<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
 <link rel="shortcut icon" href="img/favicon.png">
<title>xxx停车场</title>
 <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="./css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="./css/elegant-icons-style.css" rel="stylesheet" />
    <link href="./css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="./assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
    <link href="./assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="./assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="./css/owl.carousel.css" type="text/css">
    <link href="./css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
    <link rel="stylesheet" href="./css/fullcalendar.css">
    <link href="./css/widgets.css" rel="stylesheet">
    <link href="./css/style.css" rel="stylesheet">
    <link href="./css/style-responsive.css" rel="stylesheet" />
    <link href="./css/xcharts.min.css" rel=" stylesheet">   
    <link href="./css/jquery-ui-1.10.4.min.css" rel="stylesheet">
</head>

<body>
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
    <script src="js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <script src="js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
    <script src="assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="js/calendar-custom.js"></script>
    <script src="js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="js/jquery.customSelect.min.js" ></script>
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
    <script type="text/javascript">
  	$(document).ready(function(){
		$("#park").click(function(){
			$("#inputNumber").show();
			$("#outNumber").hide();
			$("#bookNumber").hide();
			$("#vipset").hide();
		});
		$("#out").click(function(){
			$("#outNumber").show();
			$("#bookNumber").hide();
			$("#inputNumber").hide();
			$("#vipset").hide();
		});
		$("#book").click(function(){
			$("#bookNumber").show();
			$("#inputNumber").hide();
			$("#outNumber").hide();
			$("#vipset").hide();
		});
		$("#vip").click(function(){
			$("#bookNumber").hide();
			$("#inputNumber").hide();
			$("#outNumber").hide();
			$("#vipset").show();
		});
	});
  
  </script>

    <div align="center">
    <h1><a href="${pageContext.request.contextPath }/parkIndex.action">欢迎来到xxx停车场</a></h1>
    <h1>停车场已关闭</h1>
      <div class="padd sscroll">
							<ul class="chats">
								<c:forEach items="${list }" var="list" >
								<li class="by-me">

									<div class="chat-content">
										<div class="chat-meta">
											${list.title }
										</div>
										${list.message }
										<div class="clearfix"></div>
									</div>
								</li>
								</c:forEach>

								
							</ul>

						</div>

	</div>

</body>
				
			


