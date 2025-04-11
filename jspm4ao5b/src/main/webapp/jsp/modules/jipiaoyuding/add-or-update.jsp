<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
  	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="contentText">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul id="navUl" class="navbar-nav mr-auto">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑机票预订</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>机票预订管理</span></li>
								<li class="breadcrumb-item active"><span>编辑机票预订</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">机票预订信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
										<label>订单编号</label>
										<input id="dingdanbianhao" name="dingdanbianhao" class="form-control" value="" readonly>
									</div>
									<div class="form-group col-md-6">
										<label>航班编号</label>
										<input name="hangbanbianhao" id="hangbanbianhao" name="hangbanbianhao" class="form-control" placeholder="航班编号">
									</div>
									<div class="form-group col-md-6">
										<label>航空公司</label>
										<input name="hangkonggongsi" id="hangkonggongsi" name="hangkonggongsi" class="form-control" placeholder="航空公司">
									</div>
									<div class="form-group col-md-6">
										<label>航班</label>
										<input name="hangban" id="hangban" name="hangban" class="form-control" placeholder="航班">
									</div>
									<div class="form-group col-md-6">
										<label>出发地</label>
										<input name="chufadi" id="chufadi" name="chufadi" class="form-control" placeholder="出发地">
									</div>
									<div class="form-group col-md-6">
										<label>目的地</label>
										<input name="mudedi" id="mudedi" name="mudedi" class="form-control" placeholder="目的地">
									</div>
									<div class="form-group col-md-6">
										<label>出发时间</label>
										<div id="chufashijianDate" class="input-append date form_datetime">
											<input id="chufashijian-input" name="chufashijian" size="20" type="text" readonly>
											<span class="add-on"><i class="icon-remove"></i></span>
											<span class="add-on"><i class="icon-calendar"></i></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label>类型</label>
										<input name="leixing" id="leixing" name="leixing" class="form-control" placeholder="类型">
									</div>
									<div class="form-group col-md-6">
										<label>机票票价</label>
										<input id="jipiaopiaojia" name="jipiaopiaojia" class="form-control" onchange="calculation()">
									</div>
									<div class="form-group col-md-6">
										<label>数量</label>
										<input id="shuliang" name="shuliang" class="form-control" onchange="calculation()">
									</div>
									<div class="form-group col-md-6">
										<label>总价</label>
										<input name="zongjia" id="zongjia" name="zongjia" class="form-control" placeholder="总价">
									</div>
									<div class="form-group col-md-6">
										<label>预定时间</label>
										<div id="yudingshijianDate" class="input-append date form_datetime">
											<input id="yudingshijian-input" name="yudingshijian" size="20" type="text" readonly>
											<span class="add-on"><i class="icon-remove"></i></span>
											<span class="add-on"><i class="icon-calendar"></i></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label>用户账号</label>
										<input name="yonghuzhanghao" id="yonghuzhanghao" name="yonghuzhanghao" class="form-control" placeholder="用户账号">
									</div>
									<div class="form-group col-md-6">
										<label>用户姓名</label>
										<input name="yonghuxingming" id="yonghuxingming" name="yonghuxingming" class="form-control" placeholder="用户姓名">
									</div>
									<div class="form-group col-md-6">
										<label>联系方式</label>
										<input name="lianxifangshi" id="lianxifangshi" name="lianxifangshi" class="form-control" placeholder="联系方式">
									</div>
									<div class="form-group col-md-6">
										<label>身份证</label>
										<input name="shenfenzheng" id="shenfenzheng" name="shenfenzheng" class="form-control" placeholder="身份证">
									</div>
										
									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button  id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
										<button id="exitBtn" type="button" class="btn btn-primary btn-lg">取消</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../static/utils.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "jipiaoyuding";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};


		function dingdanbianhaoUuid(){
			if($("#dingdanbianhao").val() == null || $("#dingdanbianhao").val() == "null" || $("#dingdanbianhao").val() == ""){
				$("#dingdanbianhao").attr("value",Math.round(new Date().getTime()/1000));
			}
		}				

		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "jipiaoyuding/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 文件上传
		function upload(){
		}  
		//取消 
		function cancel() {
            window.location.href = "list.jsp";
		}
		function getQueryString(name) { 
			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
			var r = window.location.search.substr(1).match(reg); 
			if (r != null) return unescape(r[2]); 
			return null; 
		}

		// 表单提交
		function submit() {

			var crossFlag = getQueryString("cross");
			if(validform() ==true && compare() == true){
				if(crossFlag) {
				}
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{		
					urlParam = 'save';
					successMes = '添加成功';
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(crossFlag) {
					var statusColumnName = window.sessionStorage.getItem('statusColumnName'); 
					var statusColumnValue = window.sessionStorage.getItem('statusColumnValue'); 
					var obj = JSON.parse(window.sessionStorage.getItem('crossObj'));
					if(statusColumnName!='') {
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}
							}
							var table = window.sessionStorage.getItem('crossTableName');
							httpJson(crossTableName + "/update","POST",obj,(res)=>{
								if(res.code == 0){
									console.log('更新属性成功');
								}
							});   
						} else  {
							crossuserid = Number(window.sessionStorage.getItem('userid'));
							crossrefid = obj["id"];
							crossoptnum = window.sessionStorage.getItem('statusColumnName');
							crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					data.crossuserid=crossuserid;
					data.crossrefid=crossrefid;
					http("jipiaoyuding/page","GET",{
						page:1,
						limit:10,
						crossuserid:data.crossuserid,
						crossrefid:data.crossrefid,			
					},(res)=>{
						if(res.data.total >= crossoptnum){
							alert(window.sessionStorage.getItem('tips'));
							return false;
						} else {
							httpJson("jipiaoyuding/"+urlParam,"POST",data,(res)=>{
								if(res.code == 0){
									window.sessionStorage.removeItem('id');
									let flag = true;
									if(crossFlag) {
									}

									if(flag){
										alert(successMes);
									}
									if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
										window.sessionStorage.removeItem('onlyme');
										window.location.href="${pageContext.request.contextPath}/index.jsp";
									}else{
                                        window.location.href = "list.jsp";
									}
									
								}
							});
						}
					});
				} else {
					httpJson("jipiaoyuding/"+urlParam,"POST",data,(res)=>{
						if(res.code == 0){
							window.sessionStorage.removeItem('id');
							let flag = true;
							if(crossFlag) {
							}

							if(flag){
								alert(successMes);
							}
							if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
								window.sessionStorage.removeItem('onlyme');
								window.location.href="${pageContext.request.contextPath}/index.jsp";
							}else{
                                        window.location.href = "list.jsp";
							}
							
						}
					});
				}
			}else{
				alert("表单未填完整或有错误");
			}
		}

		// 填充富文本框
		function setContent(){
		}  

		// 获取富文本框内容
		function getContent(){
		}

		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
				    hangbanbianhao: {
					},
				    hangkonggongsi: {
					},
				    hangban: {
					},
				    chufadi: {
					},
				    mudedi: {
					},
				    chufashijian: {
					},
				    leixing: {
					},
				    jipiaopiaojia: {
					number: true,
					},
				    shuliang: {
					digits: true,
					},
				    zongjia: {
					number: true,
					},
				    yudingshijian: {
					},
				    yonghuzhanghao: {
					},
				    yonghuxingming: {
					},
				    lianxifangshi: {
					},
				    shenfenzheng: {
					},
				    ispay: {
					},
				},
				messages: {
					hangbanbianhao: {
					},
					hangkonggongsi: {
					},
					hangban: {
					},
					chufadi: {
					},
					mudedi: {
					},
					chufashijian: {
					},
					leixing: {
					},
					jipiaopiaojia: {
						number: "请输入数字",	
					},
					shuliang: {
						digits: "请输入整数",
					},
					zongjia: {
						number: "请输入数字",	
					},
					yudingshijian: {
					},
					yonghuzhanghao: {
					},
					yonghuxingming: {
					},
					lianxifangshi: {
					},
					shenfenzheng: {
					},
					ispay: {
					},
				}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
                        jQuery.validator.addMethod("isIdCardNo", function(value, element) {
                                return this.optional(element) || value.length == 18;
                        }, "请正确输入您的身份证号码");
                        jQuery.validator.addMethod("isTel", function(value, element) {
                          var length = value.length;
                          var phone = /(^(\d{3,4}-)?\d{6,8}$)|(^(\d{3,4}-)?\d{6,8}(-\d{1,5})?$)|(\d{11})/;
                          return this.optional(element) || (phone.test(value));
                         }, "请填写正确的固定电话");//可以自定义默认提示信息
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("jipiaoyuding/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						// 是/否下拉框回显
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
												//注册表单验证
						$(validform());	
					}
				});
			}else{
				dingdanbianhaoUuid();



		 		fill()
				//注册表单验证
		    		$(validform());
			}
		}	
		// 下拉框选项回显
		function setSelectOption(){
		}			
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
			
		}		
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}		
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };
			$("#chufashijian-input").val(getCurDateTime());
			$("#chufashijianDate").datetimepicker({ 
				autoclose: true,
				format:'yyyy-mm-dd hh:ii:ss',
				minuteStep:1,
				language:'zh-CN',
			});
			$("#yudingshijian-input").val(getCurDateTime());
			$("#yudingshijianDate").datetimepicker({ 
				autoclose: true,
				format:'yyyy-mm-dd hh:ii:ss',
				minuteStep:1,
				language:'zh-CN',
			});

		}		
		
		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;
			if($("#jipiaopiaojia").val() != null && $("#jipiaopiaojia").val() != ""){
				if(x == 0 && flag < 2){
					x = (x+1) * parseFloat($("#jipiaopiaojia").val());
					flag++;
				}else{
					x = x * parseFloat($("#jipiaopiaojia").val());
					flag++;
				}
			}
			if($("#shuliang").val() != null && $("#shuliang").val() != ""){
				if(x == 0 && flag < 2){
					x = (x+1) * parseFloat($("#shuliang").val());
					flag++;
				}else{
					x = x * parseFloat($("#shuliang").val());
					flag++;
				}
			}
			if(flag < 2){
				$("#zongjia").val(0);
			}else{
				$("#zongjia").val(x.toFixed(2));
			}
					
				
		}		
		function calculationSE(colName){
			//单列求和接口
			http("jipiaoyuding"+colName,"GET",{
				tableName: "jipiaoyuding",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}	
		function calculationPre(){
			//进入该页面就填充"单列求和"的列
		}			
		
		
			//新增时填充字段
			function fill(){
				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
						if(res.data !=null && res.data.yonghuzhanghao != null && res.data.yonghuzhanghao != ''){
							$('#yonghuzhanghao').val(res.data.yonghuzhanghao)
							$("#yonghuzhanghao").attr('readonly','readonly');
						}
						if(res.data !=null && res.data.yonghuxingming != null && res.data.yonghuxingming != ''){
							$('#yonghuxingming').val(res.data.yonghuxingming)
							$("#yonghuxingming").attr('readonly','readonly');
						}
						if(res.data !=null && res.data.lianxifangshi != null && res.data.lianxifangshi != ''){
							$('#lianxifangshi').val(res.data.lianxifangshi)
							$("#lianxifangshi").attr('readonly','readonly');
						}
						if(res.data !=null && res.data.shenfenzheng != null && res.data.shenfenzheng != ''){
							$('#shenfenzheng').val(res.data.shenfenzheng)
							$("#shenfenzheng").attr('readonly','readonly');
						}
						$(validform());
					}
				});
							
			}	
			
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
			$("#dingdanbianhao").val(ruleForm.dingdanbianhao);	
			$("#hangbanbianhao").val(ruleForm.hangbanbianhao);	
			$("#hangkonggongsi").val(ruleForm.hangkonggongsi);	
			$("#hangban").val(ruleForm.hangban);	
			$("#chufadi").val(ruleForm.chufadi);	
			$("#mudedi").val(ruleForm.mudedi);	
			$("#chufashijian-input").val(ruleForm.chufashijian);
			$("#leixing").val(ruleForm.leixing);	
			$("#jipiaopiaojia").val(ruleForm.jipiaopiaojia);	
			$("#shuliang").val(ruleForm.shuliang);	
			$("#zongjia").val(ruleForm.zongjia);	
			$("#yudingshijian-input").val(ruleForm.yudingshijian);
			$("#yonghuzhanghao").val(ruleForm.yonghuzhanghao);	
			$("#yonghuxingming").val(ruleForm.yonghuxingming);	
			$("#lianxifangshi").val(ruleForm.lianxifangshi);	
			$("#shenfenzheng").val(ruleForm.shenfenzheng);	
			$("#ispay").val(ruleForm.ispay);	
		}		
		//图片显示
		function showImg(){
		}		
		//跨表

        //跨表
        function crossTable(){
		crossTableName = window.sessionStorage.getItem('crossTableName');
		crossTableId = window.sessionStorage.getItem('crossTableId');
		if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
			http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
				if(res.code == 0){
					crossRuleForm = res.data;
					$('#updateId').val(crossTableId);
					if(res.data != null && res.data != '' && res.data.dingdanbianhao != null && res.data.dingdanbianhao != ''){

						$("#dingdanbianhao").val(res.data.dingdanbianhao);
						$("#dingdanbianhao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.hangbanbianhao != null && res.data.hangbanbianhao != ''){

						$("#hangbanbianhao").val(res.data.hangbanbianhao);
						$("#hangbanbianhao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.hangkonggongsi != null && res.data.hangkonggongsi != ''){

						$("#hangkonggongsi").val(res.data.hangkonggongsi);
						$("#hangkonggongsi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.hangban != null && res.data.hangban != ''){

						$("#hangban").val(res.data.hangban);
						$("#hangban").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.chufadi != null && res.data.chufadi != ''){

						$("#chufadi").val(res.data.chufadi);
						$("#chufadi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.mudedi != null && res.data.mudedi != ''){

						$("#mudedi").val(res.data.mudedi);
						$("#mudedi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.chufashijian != null && res.data.chufashijian != ''){

						$("#chufashijian-input").val(res.data.chufashijian);
						$('#chufashijianFileName').val(res.data.chufashijian)
					}
					if(res.data != null && res.data != '' && res.data.leixing != null && res.data.leixing != ''){

						$("#leixing").val(res.data.leixing);
						$("#leixing").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.jipiaopiaojia != null && res.data.jipiaopiaojia != ''){

						$("#jipiaopiaojia").val(res.data.jipiaopiaojia);
						$("#jipiaopiaojia").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.shuliang != null && res.data.shuliang != ''){

						$("#shuliang").val(res.data.shuliang);
						$("#shuliang").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.zongjia != null && res.data.zongjia != ''){

						$("#zongjia").val(res.data.zongjia);
						$("#zongjia").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.yudingshijian != null && res.data.yudingshijian != ''){

						$("#yudingshijian-input").val(res.data.yudingshijian);
						$('#yudingshijianFileName').val(res.data.yudingshijian)
					}
					if(res.data != null && res.data != '' && res.data.yonghuzhanghao != null && res.data.yonghuzhanghao != ''){

						$("#yonghuzhanghao").val(res.data.yonghuzhanghao);
						$("#yonghuzhanghao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.yonghuxingming != null && res.data.yonghuxingming != ''){

						$("#yonghuxingming").val(res.data.yonghuxingming);
						$("#yonghuxingming").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.lianxifangshi != null && res.data.lianxifangshi != ''){

						$("#lianxifangshi").val(res.data.lianxifangshi);
						$("#lianxifangshi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.shenfenzheng != null && res.data.shenfenzheng != ''){

						$("#shenfenzheng").val(res.data.shenfenzheng);
						$("#shenfenzheng").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.ispay != null && res.data.ispay != ''){

						$("#ispay").val(res.data.ispay);
						$("#ispay").attr('readonly','readonly');
					}
				}
			});  
            }
		window.sessionStorage.removeItem('crossTableName');
		window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
				},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
			return true;
		}
		$(document).ready(function() { 
			//设置右上角用户名
			$('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			//设置导航栏菜单
			setMenu();
			//初始化时间插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			<%@ include file="../../static/myInfo.js"%>
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});
			$('#exitBtn').on('click', function(e) {
			    cancel();
			});
			readonly();
		});		

		function readonly(){
            if(window.sessionStorage.getItem('role')!="管理员") {
				$('#money').attr('readonly','readonly');
            }
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
			if(largerVal !=null && smallerVal != null){
				if(parseInt(largerVal)<=parseInt(smallerVal)){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}


		// 用户登出
        <%@ include file="../../static/logout.jsp"%>		
	</script>
</body>

</html>
