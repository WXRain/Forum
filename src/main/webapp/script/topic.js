$(function(){
	init();
});

function init(){
	var topicId = getCookie("topicId");
	$.ajax({
		url : 'topic/showTopic.do',
		method : 'POST',
		dataType : 'JSON',
		data : {'topicId' : topicId},
		success : function(result){
			console.log(result.data);
		}
	});
}

