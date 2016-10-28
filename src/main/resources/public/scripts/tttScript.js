$( document ).ready(function() {
    $("#gameBoard").on("click", "td", function( event ) {
    var boxId = $(this).attr('id');
    if ($(this).html() === "") {
      $.ajax({
          type: "post",
          url: "/id",
          data: "id=" + boxId
      }).done(function(result) {
	  if (result === "X") {
              	var d = document.getElementById(boxId);
		d.className = "cross";
		$("#" + boxId).html(result);
		$("#whosTurn").html("Player O´s turn");
          }
	  else if(result === "O"){
		var d = document.getElementById(boxId);
		d.className = "circle";
		$("#" + boxId).html(result);
		$("#whosTurn").html("Player X´s turn");
	  }
	  else if(result == "0"){
		var d = document.getElementById(boxId);
                d.className = "cross";
                $("#" + boxId).html("X");
		$("#whosTurn").html("Its a draw!");
	  }
	 else if(result == "3"){
                var d = document.getElementById(boxId);
                d.className = "circle";
                $("#" + boxId).html("O");
                $("#whosTurn").html("Its a draw!");
          }
	  else if(result == "1"){
		var d = document.getElementById(boxId);
                d.className = "cross";
		$("#" + boxId).html("X"); 
		$("#whosTurn").html("X is the winner!");
	  }
	  else if(result == "2"){
		var d = document.getElementById(boxId);
                d.className = "circle";
		$("#" + boxId).html("O");
		$("#whosTurn").html("O is the winner!");
	  }
	  else{
		 $("#whosTurn").html("An error occured, please try again or restart the game!");
	  }
      });
      event.preventDefault();
    };
    });
});

function clearBoard(){
  for(var i = 1; i < 10; i++){
    $("#" + i).html("");
  }
}

function playGame() {
  $.ajax({
      type: "post",
      url: "/playGame",
  }).done(function(result) {
      if(result) {
	  $("#whosTurn").html("Player X´s turn");
          clearBoard();
      }
  });
}
