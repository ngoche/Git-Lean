var Henv = {
	openLeftSide:function(){
		console.log('check run');
		var sideLeft = document.getElementsByClassName('side-left')[0];
		if(sideLeft.style.display === 'none')
			sideLeft.style.display = 'block';
		else
			sideLeft.style.display = 'none';
	},
	changeLeftMenuPaddingTop: function(){
	}
}