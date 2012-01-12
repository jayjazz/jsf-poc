$(document).ready(function() {
	$('.foldable').slideDown();
	$('.fold_button').click(function() {
		$('.foldable').slideToggle();
	});
});