/**
 * proyect: ESC Bartlett
 * creato: Omar M.r
 */
function efScrollDown(){	
	//alert('cargando efecto scroll');
	$(".scroll").click(function(event) {
		event.preventDefault();
		var offset = $($(this).attr('href')).offset().top;
		$('html, body').animate({
			scrollTop : offset
		}, 800);
	});
} 