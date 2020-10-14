let Henv = {
	openLeftSide:function(){
		let sideLeft = document.getElementsByClassName('side-left')[0];
		let sizeSideLeft = sideLeft.style.width.replace('%','');
		sizeSideLeft = parseInt(sizeSideLeft);
		
		let container = document.getElementsByClassName('container')[0];
		if(sizeSideLeft < '20' ){
			sideLeft.style.width = '20%';
			container.style.width = '80%';
		}
		else{
			sideLeft.style.width = '0%';
			container.style.width = '100%';
		}
	},
	changeLeftMenuPaddingTop: function(){
	}
}