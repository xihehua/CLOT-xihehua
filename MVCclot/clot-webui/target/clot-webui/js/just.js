//实现效果：
//鼠标放到小图片上面的时候，后面的大盒子出现。鼠标离开的时候大盒子隐藏。
//鼠标移动的时候，大盒子内的大图片也移动。
var small = document.getElementsByClassName('samll')[0];
var big = document.getElementsByClassName('big')[0];
var mask = document.getElementsByClassName('mask')[0];
var box = document.getElementsByClassName('box')[0];
var img = big.children[0];
big.style.display = 'none';//事件发生之前，后面的大盒子先隐藏起来
small.onmouseover = function () {
    big.style.display = 'block';//鼠标放上的时候，大盒子出现;
    mask.style.display = 'block';//与鼠标同步的放大镜也同时出现;
}
small.onmouseout = function () {//鼠标离开的时候，与上面的效果反之。
    big.style.display = 'none';
    mask.style.display = 'none';
}
    small.onmousemove = function () {//鼠标移动事件
		//如果mask的到父元素左边的值大于 其父元素的宽度减去放大镜的宽度。就都等于父元素的宽度-mask的宽度。
        //放大镜的横坐标的值 等于当前鼠标的横坐标值减去box到其父元素左边（即浏览器）减去放大镜宽度的一半，鼠标始终保持在放大镜的中央。
        mask.style.left = event.clientX-box.offsetLeft-mask.offsetWidth/2+'px';
        //纵坐标，与上同理。
        mask.style.top = event.clientY-box.offsetTop-mask.offsetHeight/2+'px';
        img.style.left = 500+'px';
        //防止放大镜溢出 小图片盒子
        //放大镜到父元素的左边的距离 如果大于 小图片盒子的宽度 减去放大镜的宽度 即表示放大镜溢出
        // 则令其等于 小图片盒子的宽度 减去放大镜的宽度
        if(mask.offsetLeft>small.offsetWidth-mask.offsetWidth){
            mask.style.left = (small.offsetWidth-mask.offsetWidth)+'px';
            //放大镜的Left的值如果为负，就为零
        }else if(mask.offsetLeft<=0){
            mask.style.left = 0+'px';
            //纵坐标 与上同理
        }if(mask.offsetTop>small.offsetHeight-mask.offsetHeight){
            mask.style.top = (small.offsetHeight-mask.offsetHeight)+'px';
        }else if(mask.offsetTop<=0){
            mask.style.top = 0+'px';
        }
        //移动时 大图片移动的距离 应是 鼠标移动距离 放大镜到父元素的距离乘以大图片宽高除以小图片宽高
        var numX = big.offsetWidth/box.offsetWidth;
        var numY = big.offsetHeight/box.offsetHeight;
//            alert(beinum);
        img.style.transform = "translateX("+-mask.offsetLeft*numX+"px"+")"
                +"translateY("+-mask.offsetTop*numY+"px"+")";
    }



		var lis=document.getElementsByClassName("list-item");
		var contents=document.getElementsByClassName("content");
		for(var i=0;i<lis.length;i++){
			lis[i].index=i;
			lis[i].onmouseover=function(){
				for(var j=0;j<contents.length;j++){
				lis[j].className=lis[j].className.replace("active","");
				contents[j].style.display="none";
			}
			lis[this.index].className=lis[this.index].className+" active";
			contents[this.index].style.display="block";
			}
		}





	var div=document.getElementById("mbbu");
	var child=document.getElementById("child");
	div.onmousemove=function(){
		child.style.display="block";
	}
	div.onmouseout=function(){
		child.style.display="none"
	}
	
	var div=document.getElementById("footemaxa");
	div.onmousemove = function(){
		div.src="img/about--black.png"
	}
	div.onmouseout = function(){
		div.src="img/about--white.png"
	}
	
	var divb=document.getElementById("footemaxb");
	divb.onmousemove = function(){
		divb.src="img/shipping--black.png"
	}
	divb.onmouseout = function(){
		divb.src="img/shipping--white.png"
	}
	
	var divc=document.getElementById("footemaxc");
	divc.onmousemove = function(){
		divc.src="img/orders--black.png"
	}
	divc.onmouseout = function(){
		divc.src="img/orders--white.png"
	}
	var divd=document.getElementById("footemaxd");
	divd.onmousemove = function(){
		divd.src="img/returns--black.png"
	}
	divd.onmouseout = function(){
		divd.src="img/returns--white.png"
	}
	
	var dive=document.getElementById("footemaxe");
	dive.onmousemove = function(){
		dive.src="img/juice--black.png"
	}
	dive.onmouseout = function(){
		dive.src="img/juice--white.png"
	}
	
	var divf=document.getElementById("footemaxf");
	divf.onmousemove = function(){
		divf.src="img/faq--black.png"
	}
	divf.onmouseout = function(){
		divf.src="img/faq--white.png"
	}
	
	var divg=document.getElementById("footemaxg");
	divg.onmousemove = function(){
		divg.src="img/contact--black.png"
	}
	divg.onmouseout = function(){
		divg.src="img/contact--white.png"
	}
	
	var divh=document.getElementById("footemaxh");
	divh.onmousemove = function(){
		divh.src="img/joinus--black.png"
	}
	divh.onmouseout = function(){
		divh.src="img/joinus--white.png"
	}
	
	
	
	var diva=document.getElementById("footemaxaa");
	diva.onmousemove = function(){
		diva.src="img/about--black.png"
	}
	diva.onmouseout = function(){
		diva.src="img/about--white.png"
	}
	
	var divbb=document.getElementById("footemaxbb");
	divbb.onmousemove = function(){
		divbb.src="img/shipping--black.png"
	}
	divbb.onmouseout = function(){
		divbb.src="img/shipping--white.png"
	}
	
	var divcc=document.getElementById("footemaxcc");
	divcc.onmousemove = function(){
		divcc.src="img/orders--black.png"
	}
	divcc.onmouseout = function(){
		divcc.src="img/orders--white.png"
	}
	var divdd=document.getElementById("footemaxdd");
	divdd.onmousemove = function(){
		divdd.src="img/returns--black.png"
	}
	divdd.onmouseout = function(){
		divdd.src="img/returns--white.png"
	}
	
	var divee=document.getElementById("footemaxee");
	divee.onmousemove = function(){
		divee.src="img/juice--black.png"
	}
	divee.onmouseout = function(){
		divee.src="img/juice--white.png"
	}
	
	var divff=document.getElementById("footemaxff");
	divff.onmousemove = function(){
		divff.src="img/faq--black.png"
	}
	divff.onmouseout = function(){
		divff.src="img/faq--white.png"
	}
	
	var divgg=document.getElementById("footemaxgg");
	divgg.onmousemove = function(){
		divgg.src="img/contact--black.png"
	}
	divgg.onmouseout = function(){
		divgg.src="img/contact--white.png"
	}
	
	var divhh=document.getElementById("footemaxhh");
	divhh.onmousemove = function(){
		divhh.src="img/joinus--black.png"
	}
	divhh.onmouseout = function(){
		divhh.src="img/joinus--white.png"
	}


