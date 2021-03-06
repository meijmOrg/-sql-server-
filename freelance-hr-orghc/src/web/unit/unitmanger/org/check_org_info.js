$(function(){

    $("#OrgInfoForm").validate({
        rules:{
        	orgName:{
        		required: true
        	},
        	orgCategory:{
        		required: true
        	},
        	orderOfView:{
        		isThreeNum:true
	        },
	        mobilePhone:{
	        	isMobilePhone:true
	        },
	        /*phone:{
	        	isPhone:true
	        },*/
	        email:{
	        	isEmail:true
	        }/*,
	        fax:{
	        	isPhone:true
	        }*/
        },
        messages: {
        	orgName:{
        		required: "科室名称必填"
        	},
        	orgCategory:{
        		required: "科室类型必填"
        	},
        	orderOfView:{
        		isThreeNum:'请输入三位数字或字母'
	        },
	        mobilePhone:{
        		isMobilePhone:'手机格式不正确'
	        },
	        /*phone:{
        		isMobilePhone:'联系电话格式不正确'
	        },*/
	        email:{
        		isMobilePhone:'电子邮箱格式不正确'
	        }/*,
	        fax:{
	        	isPhone:'传真格式不正确'
	        }*/
        },
        errorPlacement: function (error, element)
        {
            error.appendTo(element.parents("div:first"));
        },
        errorLabelContainer: $("#OrgInfoForm div.md-error"),
        wrapper: "span",
        submitHandler: function (form)
        {
        	$.ajax({
                url : $('#OrgInfoForm').attr("action"),
                data :  $("#OrgInfoForm").serializeArray(),
                dataType : 'json',
                type : 'post',
                async : false,
                success : function(data) {
                    if (data.success) {
                    	var flag=$("#flag").val();
                    	var orgOid=$("#orgOid").val();
                        $.fn.close_popdown();
                        Widget.close();
                        if(''!=flag&&null!=flag){
                        	expandNode();
                        	$(".right-content").load("goToViewOrg.do?method=goToViewOrg&orgOid="+orgOid);
                        }else{
                        	expandNode();
                        	worktop.form.goQuery();
                        }
                    }
                    else
                    {
		                  	$("#OrgInfoForm div.md-error").css('display','block');
		                    if($("#OrgInfoForm div.md-error .back-error").length>0) {
		                    	$("#OrgInfoForm div.md-error .back-error").html(data.message);
		                    }else {
		                    	$("#OrgInfoForm div.md-error").append("<span class='back-error'>"+data.message+"</span>");
		                    }
                    }
                }
            });
        }
    });
});
function changeOrgType(value){
	var unitOid=$("#unitOid").val();
	if(''!=value||null!=value){
		$.ajax({
			url : 'findByOrgType.do?method=findByOrgType',
			data :  {orgCategory:value,unitOid:unitOid},
			dataType : 'json',
			error : function(x,t) {
				alert(t);
			},
			async : false,
			success : function(data) {
				$("#parentOrgOid").empty();
				$("#parentOrgOid").append("<option value=''>--请选择--</option>");
				if(null != data.rs ){
					data.rs&&data.rs.forEach(function(v,i) {
						if($('#initParentOrgOid').val()==v.orgOid){
							$("#parentOrgOid").append("<option value="+v.orgOid+" selected>"+v.orgName+"</option>");
						}else{
							$("#parentOrgOid").append("<option value="+v.orgOid+">"+v.orgName+"</option>");
						}
					});
				}
			}
		});
	}
}
function checkOrgType(){
	var orgCategory=$("#orgCategory").val();
	if(''==orgCategory||null==orgCategory){
		MessageBox.alert('提示', "请先选择科室类型");
	}
}
function expandNode(){
	$.ajax({
		url : 'findOrg.do?method=findOrgList',
		data :　{controlDataAuthority : 'N'},
		dataType : 'json',
		type:'POST',
		 beforeSend:function(XMLHttpRequest){ 
	    	Mask.showMask();
        },
		complete:function(XMLHttpRequest,textStatus){ 
	    	Mask.hideMask();
         }, 
		async : true,
		success : function(data) {
				$("#firstUl li").remove();
				$.each(data,function(index,item){
					var firstLi='';
					firstLi+="<li class='ln-firstli'>";
					firstLi+="<span class='ln-plus-icon'></span><a class='ln-firstli-a' href='javascript:void(0);' title='"+item.orgName+"' onclick=workUnitLocation('"+item.unitOid+"')>"+item.orgName+"</a>";
					firstLi+="<ul class='ln-second-nav' id='SecondUl"+item.organizationOid+"'></ul></li>";
					firstLi = $(firstLi);
				    firstLi.appendTo($("#firstUl"));
				    if(item.children){
				    	$.each(item.children,function(index1,item1){
							var SecondLi="";
							if(!item1.leaf)
							{
								 SecondLi+="<li class='ln-secondli'><span class='ln-line'></span>";
								 if(index1==item.children.length-1){
									 SecondLi+=" <span class='ln-plus-icon'></span><a class='ln-secondli-a' href='javascript:void(0);' title='"+item1.orgName+"' onclick=workLocation('"+item1.orgOid+"') >"+item1.orgName+"</a> ";
								 }else{
									 SecondLi+=" <span class='ln-plus-icon'></span><a class='ln-secondli-a' href='javascript:void(0);' title='"+item1.orgName+"' onclick=workLocation('"+item1.orgOid+"') >"+item1.orgName+"</a>";
								 }
							}else{
								 SecondLi+="<li class='ln-secondli'>";
								 if(index1==item.children.length-1){
									 SecondLi+=" <span class='ln-plus-icon'></span><a class='ln-secondli-a' href='javascript:void(0);' title='"+item1.orgName+"' onclick=workLocation('"+item1.orgOid+"') >"+item1.orgName+"</a> ";
								 }else{
									 SecondLi+=" <span class='ln-plus-icon'></span><a class='ln-secondli-a' href='javascript:void(0);' title='"+item1.orgName+"' onclick=workLocation('"+item1.orgOid+"') >"+item1.orgName+"</a>";
								 }
							}
							SecondLi+="<ul class='ln-third-nav' id='TrirdUl"+item1.organizationOid+"'></ul></li>";   
							SecondLi=$(SecondLi);  
							SecondLi.appendTo($("#SecondUl"+item.organizationOid));
							if(item1.children){
								$.each(item1.children,function(index2,item2){
									var TrirdLi="";
									if(!item2.leaf)
									{
										 TrirdLi+="<li class='ln-thirdli'><span class='ln-line'></span>";
										 if(index2==item1.children.length-1){
											 TrirdLi+=" <span class='ln-plus-icon'></span><a class='ln-thirdli-a' href='javascript:void(0);' title='"+item2.orgName+"' onclick=workLocation('"+item2.orgOid+"')>"+item2.orgName+"</a>";
										 }else{
											 TrirdLi+=" <span class='ln-plus-icon'></span><a class='ln-thirdli-a' href='javascript:void(0);' title='"+item2.orgName+"' onclick=workLocation('"+item2.orgOid+"')>"+item2.orgName+"</a>";
										 }
									}else{
										TrirdLi+="<li class='ln-thirdli'><span class='ln-line'></span>";
										 if(index2==item1.children.length-1){
											 TrirdLi+=" <a class='ln-thirdli-a' href='javascript:void(0);' title='"+item2.orgName+"' onclick=workLocation('"+item2.orgOid+"')>"+item2.orgName+"</a>";
										 }else{
											 TrirdLi+=" <a class='ln-thirdli-a' href='javascript:void(0);' title='"+item2.orgName+"' onclick=workLocation('"+item2.orgOid+"')>"+item2.orgName+"</a>";
										 }
									}
									TrirdLi+="<ul class='ln-fourth-nav' id='ForthUl"+item2.organizationOid+"'></ul></li>";   
									TrirdLi=$(TrirdLi);  
									TrirdLi.appendTo($("#TrirdUl"+item1.organizationOid));
									if(!item2.leaf){
										$.each(item2.children,function(index3,item3){
											var ForthLi="";
											if(!item3.leaf)
											{
												 ForthLi+="<li class='ln-fourthli'><span class='ln-line'></span>";
												 if(index3==item2.children.length-1){
													 ForthLi+=" <span class='ln-plus-icon'><a class='ln-fourthli-a' href='javascript:void(0);' title='"+item3.orgName+"' onclick=workLocation('"+item3.orgOid+"') >"+item3.orgName+"</a>";
												 }else{
													 ForthLi+=" <span class='ln-plus-icon'><a class='ln-fourthli-a' href='javascript:void(0);' title='"+item3.orgName+"' onclick=workLocation('"+item3.orgOid+"') >"+item3.orgName+"</a>";
												 }
											}else{
												ForthLi+="<li class='ln-fourthli'><span class='ln-line'></span>";
												 if(index3==item2.children.length-1){
													 ForthLi+=" <a class='ln-fourthli-a' href='javascript:void(0);' title='"+item3.orgName+"' onclick=workLocation('"+item3.orgOid+"') >"+item3.orgName+"</a>";
												 }else{
													 ForthLi+=" <a class='ln-fourthli-a' href='javascript:void(0);' title='"+item3.orgName+"' onclick=workLocation('"+item3.orgOid+"') >"+item3.orgName+"</a>";
												 }
											}
											ForthLi+="</li>";   
											ForthLi=$(ForthLi);  
											ForthLi.appendTo($("#ForthUl"+item2.organizationOid));
										})
									}
					
								})
							}
				
						})
					}
				})
				$('.left-nav').find('ul').show();
		        $('.left-nav').find('.ln-plus-icon').attr('class','ln-minus-icon');
		        leftNavScrollHide();
//		     // 点击左导航"+"号展开子菜单
//		        $(document).on('click','.ln-plus-icon',function (e) {
//		            e.stopPropagation();//防止冒泡
//		            $(this).attr('class','ln-minus-icon');  //"+"号变"-"
//		            $(this).siblings('ul').show();
//
//		            leftNavScrollHide();
//		        });
//		        // 点击左导航"-"号收缩子菜单
//		        $(document).on('click','.ln-minus-icon',function (e) {
//		            e.stopPropagation();//防止冒泡
//		            $(this).attr('class','ln-plus-icon');  //"-"号变"+"
//		            $(this).siblings('ul').hide();
//
//		            leftNavScrollHide();
//		        });
//		        //点击左导航中li选中状态显示
//		        $('.left-nav li a').click(function (e) {
//		            e.stopPropagation();//防止冒泡
//		            // 给点击的li添加选中的样式，先将之前点击的li的样式去掉，保证只有一个li显示选中状态
//		            $('.left-nav').find('a').removeClass('left-nav-active');
//		            $(this).addClass('left-nav-active');
//		        });
//		    //默认显示右侧工作台  
//		    $('.ln-firstli-a').click();
			//$(".right-content").load("getUnitInformation.do?method=getUnitInformation");
		}
	});
}