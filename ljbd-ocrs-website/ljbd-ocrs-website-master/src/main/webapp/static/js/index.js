// JavaScript Document
	//点击字母跳到当前字母位置
		//var goToLetter=function(letter,shower){
//			var gotoTop=0;
//			shower.find("span.Letter-tit").each(function(){
//				if($(this).html()==letter){
//					gotoTop=this.offsetTop;
//				}
//			});
//			shower.animate({"scrollTop":gotoTop},100);
//		}
$(function(){
$("#calendar1, #calendar2").calendar();
//$("#calendar1_alert").click(function(){alert(popUpCal.parseDate($('#calendar1').val()))});
});
	$(function(){
			  $(".country_nav .letter-list a").click(function(){
															   $(".city_box").hide();
															   $(".city_nav").hide();
															   $(".country_box").show();
												  $(".country_box").animate({scrollTop:0}, 0); 
						 var  letter_title=$(this).html();
						 $(".country_box .Letter-tit").each(function(i){
				var tt = $(this).html();
			
			
				   if(tt.indexOf(letter_title)>=0){
					   
					 								
  $(".country_box").animate({scrollTop: $(this).offset().top-230}, 10);   
					   }
					   } );	 } ) })
	
	
	
	
	
	$(function(){
			  $(".city_nav .letter-list a").click(function(){
												  $(".city_box").animate({scrollTop:0}, 0); 
						 var  letter_title=$(this).html();
						 $(".city_box .Letter-tit").each(function(i){
				var tt = $(this).html();
			
			
				   if(tt.indexOf(letter_title)>=0){
					   
					 								
  $(".city_box").animate({scrollTop: $(this).offset().top-230}, 10);   
					   }
					   } );	 } ) })
	
	
	$(function(){
			   
			 $(".country_box a").click(
						function(){
							$(".country_box").hide();	
				$(".city_box").show();
					$(".city_nav").show();
				
							
							}
									   )
			   
			   
			   
			   })
	
	
//	
//$(function () {
//			 $(".s_detail h3").toggle(function(){
//		   $(this).addClass("selected").next().slideDown().end().parents(".s_detail").siblings(".s_detail").children("p").hide().siblings("h3").removeClass("selected");},function(){$(this).removeClass("selected").next("p").hide() })
//		   
//											  }
//		   
//		  )
	
		$(function(){
				 $(".city_a").click(
						 
						function(){   
						$(".city_a").removeClass("selected");
						$(".both dl").css("display","none");
						$(this).addClass("selected").next("dl").toggle();
        })})
		
		var country;
		$(function(){
				 $(".country_a").click(
						function(){
			country = $(this).children("em").html();				
							
							});})
		$(function(){
				 $(".site").click(
						function(){   
						
						$(".indexes-box").slideDown();
						$(".indexes-box").css("top",$(this).offset().top-150);
				   
				   });
				 
				  $(".ser-close").click(
						function(){
						$(".indexes-box").hide();	
							})  ;
				    $(".city_box dd").click(
						function(){
						$(".indexes-box").hide();
					    var site;
						var plant=$(this).html();
						var city=$(this).parent().prev(".city_a").children("em").html();
					
						$(".site").html( country +"-"+ city + "-" +plant);
						
						
							})  
			
				 
				 })
		
	
$(function() {
	$(document).click(function() {
		$('.indexes-box').hide();
	})
	$('.site').click(function(event) {
		event.stopPropagation();
	})
		$('.indexes-box').click(function(event) {
		event.stopPropagation();
	})
});
	
