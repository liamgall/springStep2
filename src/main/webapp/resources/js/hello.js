/**
 * 
 */
var regexUserName = /^[가-힣]{2,4}|[a-zA-Z]{2,10}\s[a-zA-Z]{2,10}$/; // 아이디 검사식
var regexAddress;
var regexEMail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i; // 이메일 검사식
var regexPhoneNumber = /^\d{3}-\d{3,4}-\d{4}$/; // 전화번호 검사식

var $userName = $('#userName');
var $address = $('#address');
var $phoneNumber = $('#phoneNumber');
var $eMail = $('#eMail');
var $form = $('#form');


$(document).ready(function() {
	console.log($form);
});
$form.submit(function() {
	if (!regexUserName.test($userName.val())) { // 아이디 검사
		alert('[이름 입력 오류] 한글 혹은 영어 이름을 입력해주세요.');
		$userName.focus();
		return false;
	} 
//	else if (!regexAddress.test($address.val())) { // 이메일 검사
//		alert('[주소 입력 오류] 유효한 주소를 입력해 주세요.');
//		$address.focus();
//		return false;
//	} 
	else if (!regexPhoneNumber.test($phoneNumber.val())) { // 이메일 검사
		alert('[전화번호 입력 오류] 유효한 전화번호를 입력해 주세요. ex) 010-0000-0000');
		$phoneNumber.focus();
		return false;
	} else if (!regexEMail.test($eMail.val())) { // 전화번호 검사
		alert('[이메일 입력 오류] 유효한 이메일 주소를 입력해 주세요.');
		$eMail.focus();
		return false;
	} else {
		return true;
	}
});