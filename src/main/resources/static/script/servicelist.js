 // JavaScript Document
$(function(){
	function leftscroll(){
		var _scroll = $("#products_scroll_list ul");
		_scroll.animate({marginLeft:"-176px"},500,function(){
			_scroll.css({marginLeft:0}).find("li:first").appendTo(_scroll);
		});
	};
	function rightscroll(){
		var _scroll = $("#products_scroll_list ul");
		_scroll.css({marginLeft:"-176px"}).find("li:last").prependTo(_scroll);
		_scroll.animate({marginLeft:0},500);
	};
	
	var _scrollling = setInterval(leftscroll,2000);
		
	$("#products_scroll_listt ul,#prev,#next").hover(function(){
			clearInterval(_scrollling);
		},
		function(){
			_scrollling = setInterval(leftscroll,2000);}
	)
	$("#prev").click(function(){
		leftscroll();	
	});
	$("#next").click(function(){
		rightscroll();	
	});
})//end .service