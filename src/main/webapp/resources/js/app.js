/**
 * 
 */

/* 정규표현식 */
var regexUserName = /^[가-힣]{2,4}$/; // 이름 검사식
var regexEMail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i; // 이메일
																										// 검사식
var regexPhoneNumber = /^\d{11,12}$/; // 전화번호 검사식
var dataSet = {};
var $form = $('#form');
var $userName = $('#userName');
var $address = $('#address');
var $phoneNumber = $('#phoneNumber');
var $eMail = $('#eMail');
var checkList = "";
$('#userName, #phoneNumber').after('<strong></strong>');

/* 이름 무결성 검사 */
$userName.keyup(function() {
	var textTip = $(this).next('strong');
	if ($userName.val().length == 0) // 입력 값이 없을 때
		textTip.text('');
	else if ($userName.val().length > 4)
		textTip.text('이름이 너무 깁니다.');
	else if ($userName.val().length < 2)
		textTip.text('이름이 너무 짧습니다.');
	else
		textTip.text('적절함.');
})
/* 전화번호 무결성 검사 */
$phoneNumber.keyup(function() {
	var textTip = $(this).next('strong');
	if ($phoneNumber.val().indexOf('-') != -1)
		textTip.text('하이픈(-) 입력 금지');
	else
		textTip.text('');
})

/* post에서 제출 버튼을 누른 경우 */
$('#button').click(
		function() {
			checkList = "";
			if (checkValidate()) {
				dataSet = {
					userName : $('#userName').val(),
					address : $('#address').val(),
					phoneNumber : $('#phoneNumber').val(),
					eMail : $('#eMail').val(),
					registerPath : $('#registerPath').val(),
					checkList : checkList.substr(1)
				}
				$.ajax({
					type : "POST",
					url : "/postRequest",
					data : dataSet,
					dataType : "json",
					success : function(response) {
						var responseData = {
							userName : response.userName,
							address : response.address,
							phoneNumber : response.phoneNumber,
							eMail : response.eMail,
							registerPath : response.registerPath,
							checkList : response.checkList
						};
						/* 테이블 행 추가 */
						var text = "<tr><td>" + responseData.userName + "</td>"
								+ "<td>" + responseData.address + "</td>"
								+ "<td>" + responseData.phoneNumber + "</td>"
								+ "<td>" + responseData.eMail + "</td>"
								+ "<td>" + responseData.registerPath + "</td>"
								+ "<td>" + responseData.checkList
								+ "</td></tr>";
						$('#myTable > tbody:last').append(text);
					}
				})
			}

		})

/* 회원가입 양식이 타당한지 검사 */
function checkValidate() {
	if (!regexUserName.test($userName.val())) { // 아이디 검사
		alert('[이름 입력 오류] 2~4글자의 한글 이름을 입력해주세요.');
		$userName.focus();
		return false;
	} else if ($address.val() == null || $address.val() == "") { // 이메일 검사
		alert('[주소 입력 오류] 올바른 주소를 입력해 주세요.');
		$address.focus();
		return false;
	} else if (!regexPhoneNumber.test($phoneNumber.val())) { // 이메일 검사
		alert('[전화번호 입력 오류] 유효한 전화번호를 입력해 주세요. ex) 01012345678');
		$phoneNumber.focus();
		return false;
	} else if (!regexEMail.test($eMail.val())) { // 전화번호 검사
		alert('[이메일 입력 오류] 유효한 이메일 주소를 입력해 주세요. ex) example@example.com');
		$eMail.focus();
		return false;
	} else {
		var chk = $('input[type="checkbox"]');
		chk.each(function() {
			if ($(this).prop('checked') == true)
				checkList += ',' + $(this).attr('name');
		});
		document.getElementById('registerPath').value = $('#registerPath')
				.val();
		return true;
	}
}

$form.submit(function() {
	return checkValidate();
});
