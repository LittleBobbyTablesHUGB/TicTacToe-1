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
          }
	  else if(result === "O"){
		var d = document.getElementById(boxId);
		d.className = "circle";
		$("#" + boxId).html(result);
	  }
      });
      event.preventDefault();
    };
    });
});
