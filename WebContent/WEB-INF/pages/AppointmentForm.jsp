<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style>
.error {
	color: #ff0000;
}
.errorblock{
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding:8px;
	margin:16px;
}

</style>
</head>

<body bgcolor="#E6E6FA">
<head>
<title>Patient  Appointment Page</title>
</head>
<h2>Patient Appointment Form</h2>

<form:form method="POST" commandName="appointment">

<form:errors path="*" cssClass="errorblock" element="div"/>

<table>
<tr>
<td>UserName : </td>
<td><form:input path="patientName" /></td>
<td><form:errors path="patientName" cssClass="error" /></td>
</tr>
<tr>
<td>Mobile No : </td>
<td><form:input path="patientMobile" /></td>
<td><form:errors path="patientMobile" cssClass="error" /></td>
</tr>
<tr>
<td>Email Id : </td>
<td><form:input path="patientEmail" /></td>
<td><form:errors path="patientEmail" cssClass="error" /></td>
</tr>
<tr>
<td>Address : </td>
<td><form:textarea path="patientAddress" /></td>
<td><form:errors path="patientAddress" cssClass="error" /></td>
</tr>
<tr>
<td>Gender : </td>
<td>
<form:radiobutton path="patientGender" value="M"/>Male 
<form:radiobutton path="patientGender" value="F"/>Female 
</td>
<td><form:errors path="patientGender" cssClass="error" /></td>
</tr>
<tr>
<td>Type of Visit : </td>
<td>
<form:radiobutton path="patientVisitType" value="First Visit"/>First Visit 
<form:radiobutton path="patientVisitType" value="Re Visit"/>Re Visit 
</td>
<td><form:errors path="patientVisitType" cssClass="error" /></td>
</tr>
<tr>
<td>Patient DiseaseName : </td>
<td><form:input path="patientDiseaseName" /></td>
<td><form:errors path="patientDiseaseName" cssClass="error" /></td>
</tr>
<tr>
<td>Country : </td>
<td>
<form:select path="patientCountry">
	<form:option value="NONE" label="--- Select ---"/>
	<form:options items="${countryList}" />
</form:select>
</td>
<td><form:errors path="patientCountry" cssClass="error" /></td>
</tr>
<tr>
<td>State : </td>
<td>
<form:select path="patientState">
	<form:option value="NONE" label="--- Select ---"/>
	<form:options items="${stateList}" />
</form:select>
</td>
<td><form:errors path="patientState" cssClass="error" /></td>
</tr>
<tr>
<td>District : </td>
<td>
<form:select path="patientDistrict">
	<form:option value="NONE" label="--- Select ---"/>
	<form:options items="${districtList}" />
</form:select>
</td>
<td><form:errors path="patientDistrict" cssClass="error" /></td>
</tr>
<tr>
<td colspan="3"><input type="submit" /></td>
</tr>
</table>
</form:form>

</body>
</html>