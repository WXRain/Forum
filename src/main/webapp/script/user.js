$(function(){
	init();
});

function convertToDate(longNum){
	var year, month, date, hour, min, sec;
	
}

function init(){
	var userId = getCookie("userId");
	$.ajax({
		url : 'account/showUserTopics.do',
		method : 'POST',
		dataType : 'JSON',
		data : {'userId' : getCookie('userId')},
		success : function(result){
			for(var i = 0; i < result.data.length; i++){
				//document.write(result.data[i].releaseDate + " ");
				var tr = "<tr><td>"+result.data[i].id + 
							"</td><td><a href='topic.jsp?topicId="+result.data[i].id+"'>" + 
							result.data[i].topicName + "</a></td><td>" + 
							result.data[i].rDate +"</td></tr>";
				$('#table').append(tr);
			}
			
		}
	});
}