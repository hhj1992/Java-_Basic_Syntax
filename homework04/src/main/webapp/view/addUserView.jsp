<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>회원가입</title>
    <style>
        table,html, body,tr,td,th{margin:0;padding: 0;border: 0;}
        table{background-color: rgb(245, 245, 245);}
        #wrap{display: flex; justify-content: center;flex-direction: column;align-items: center;}
        td {height: 30px; border: 1px solid #2d2d2d;}
        .row_title{width: 200px;}
        .row_middle{width: 130px;}
        .haeder{text-align: right;}
        .num_box{width: 50px;}
        #to_send{text-align: center;}
        .bottom_btn{text-align: center;}
        #table_box{margin-top: 100px;}
        
    </style>
</head>

<body>
    
</body>
</html>
<body>
    <div id="wrap">
        <form  method="post" action="../jsp/addUserJSP.jsp">
            <table id="table_box">
                <tr>
                    <td>* 개인정보</td>
                    <td colspan="3" class="haeder"> <input type="button" value="?"> 도움말</td>
                </tr>
                <tr>
                    <td class="row_title">* 아이디</td>
                    <td colspan="3"> <input name="id" type="text"></td>
                </tr>
                <tr>
                    <td class="row_title">* 비밀번호</td>
                    <td colspan="3"> <input name="password" type="password"></td>
                </tr>
                <tr>
                    <td class="row_title">* 이름(한글실명)</td>
                    <td colspan="3"> <input name="name" type="text"></td>
                </tr>
                <tr>
                    <td class="row_title">* 성별</td>
                    <td colspan="3"> 
                        <input type="radio" name="sex" value="남자"><span>남</span>
                        <input type="radio" name="sex" value="여자"><span>여</span>
                    </td>
                </tr>
                <tr>
                    <td class="row_title">* 생년월일</td>
                    <td colspan="3">
                        <input type="text" name="year">년
                        <select name="month" id="sel_mon">
                            <option >선택</option>
                        </select>
                        <span>월</span>
                        <select name="day" id="sel_day">
                            <option >선택</option> 
                        </select>
                        <span>일</span>
                        <input type="radio" name="calendar" value="양력"><span>양력</span>
                        <input type="radio" name="calendar" value="음력"><span>음력</span>
                        (<input type="radio" name="calendar" value="윤달"><span>윤달</span>)
                    </td>
                </tr>
                <tr>
                    <td class="row_title">* 최종학력</td>
                    <td colspan="3">
                        <select name="education">
                            <option >선택</option>
                            <option value="중졸">중졸</option>
                            <option value="고졸">고졸</option>
                            <option value="대졸">대졸</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="row_title">* 직업</td>
                    <td> 
                        <select name="job">
                            <option >선택</option>
                            <option value="학생">학생</option>
                            <option value="직장인">직장인</option>
                            <option value="백수">백수</option>
                        </select>
                    </td>
                    <td class="row_middle">소속</td>
                    <td><input type="text"></td>
                </tr>
                <tr>
                    <td class="row_title">* 결혼 여부</td>
                    <td>
                        <input type="radio" name="marry" value="미혼">미혼
                        <input type="radio" name="marry" value="기혼">기혼
                    </td>
                    <td class="row_middle">자녀수</td>
                    <td>
                        <select name="child" id="sel_child">
                            <option >선택</option>
                        </select>
                        <span>명</span>
                    </td>
                </tr>
                <tr>
                    <td rowspan="3" class="row_title">* 연락처</td>
                    <td> 
                        <span>전화번호</span> 
                        <input class="num_box" type="tel" name="tell"> - <input class="num_box" type="tel" name="tell"> - <input class="num_box" type="tel" name="tell"> 
                    </td>
                    <td colspan="2">
                        <input type="radio" name="tellStyle" value="home"> 집 
                        <input type="radio" name="tellStyle" value="Workplace"> 직장
                    </td>
                </tr>
                <tr>
                    <td> 
                        <span>휴대폰</span> 
                        <input class="num_box" type="tel" name="phone"> - <input class="num_box" type="tel" name="phone"> - <input class="num_box" type="tel" name="phone"> 
                    </td>
                    <td class="row_middle">이동 통신사</td>
                    <td>
                        <input type="radio" name="phoneStyle" value="SKT"><span>SKT</span>
                        <input type="radio" name="phoneStyle" value="KTF"><span>KTF</span>
                        <input type="radio" name="phoneStyle" value="LGT"><span>LGT</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <span>전화번호나 휴대폰번호 2가지 중 하나는 반드시 입력하셔야 합니다.</span>
                    </td>
                </tr>
                <tr>
                    <td class="row_title">* 거주지 주소</td>
                    <td colspan="3">
                        <input type="button" value="국내">
                        <input type="button" value="국외">
                        <input type="text" name="Nationality">
                    </td>
                </tr>
                
            </table>
            <div class="bottom_btn">
                <input id="to_send" type="submit" value="전송" />
            </div>
        </form>
    </div>
</body>
<script text="script">
    var selDay = document.querySelector("#sel_day");
    var selmon = document.querySelector("#sel_mon");
    var selchild = document.querySelector("#sel_child");
    
    selectOption(selmon,12);
    selectOption(selDay,31);
    selectOption(selchild,10);

    function selectOption(variable, num ) {
        for (let index = 1; index <= num; index++) {
            variable.innerHTML += "<option value=\""+index+"\">"+index+"</option>";
        }
    }
    
</script>
</html>