<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

	I want to read in
	<a href="?language=en">English</a> ||
	<a href="?language=si"> Sinhala </a>

	<h1>Add Activity</h1>
	<h3>to ${event.eventName}</h3>

	<form:form commandName="activities">

		<div>
			<spring:message code="activity.caption" />
			<div>
				<div>
					
					<div>
						<form:input path="activityName" />
					</div>
				</div>

				<div>
					<input type="submit" value="Save">
				</div>

			</div>
		</div>
	</form:form>
</body>
</html>