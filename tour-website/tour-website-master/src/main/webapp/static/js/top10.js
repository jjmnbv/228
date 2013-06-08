//Top10
function lazyloadForPart(container){
    container.find('img').each(function(){
        var original = $(this).attr("original");
        if (original) {
            $(this).attr('src', original).removeAttr('original');
        }
    });
}

function TabHeads(c,a,b){
	
	$(c).hover(function(){
		
		$(c).each(function(){
			$(this).removeClass(a)
		});
		
		$(b).each(function(){
			$(this).hide()
		});
		
		$(this).addClass(a);
		
		var d=$(c).index(this);
		
		$(b).eq(d).each(function(){
			$(this).show();
			lazyloadForPart($(b));
		});
		
	})
}