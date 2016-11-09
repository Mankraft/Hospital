<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Patient  Appointment Submission Page</title>
</head>
<body bgcolor="#E6E6FA">
<h2>Appointment Submission Result Page</h2>

<table>
<tr>
<td>PatientName :</td><td>${appointment.patientName}</td>
</tr>
<tr>
<td>PatientMobile :</td><td>${appointment.patientMobile}</td>
</tr>
<tr>
<td>PatientEmail :</td><td>${appointment.patientEmail}</td>
</tr>
<tr>
<td>PatientMobile :</td><td>${appointment.patientMobile}</td>
</tr>
<tr>
<td>PatientGender :</td><td>${appointment.patientGender}</td>
</tr>
<tr>
<td>PatientVisitType :</td><td>${appointment.patientVisitType}</td>
</tr>
<tr>
<td>PatientDisease:</td><td>${appointment.patientDiseaseName}</td>
</tr>
<tr>
<td>PatientCountry :</td><td>${appointment.patientCountry}</td>
</tr>
<tr>
<td>PatientState :</td><td>${appointment.patientState}</td>
</tr>
<tr>
<td>PatientDistrict :</td><td>${appointment.patientDistrict}</td>
</tr>
<tr>
<td>Patient Address :</td><td>${appointment.patientAddress}</td>
</tr>
</table>

</body>
</html>