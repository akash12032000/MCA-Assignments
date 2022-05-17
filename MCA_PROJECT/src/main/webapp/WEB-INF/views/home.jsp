<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/style.css">
          <script src="<%=request.getContextPath()%>/resources/myscript.js"></script>
        <style type="text/css">
        th{
  text-align:left !important;
      padding: 8px !important;
}
        
        </style>
       
        <title>Home</title>
    </head>
    <body>
    <div class="MainDiv" >
    <form:form method="POST"  action="SaveUser" modelAttribute="Guest" id="guiform" name = "guiform">
        <table class="sortable">
        <caption class="cap">User Creation</caption>
      <tbody> 
        <tr>
        <th>First Name<font style="color:red">*</font></th>
        <td><form:input path="FirstName" type="text" id="fn" onclick="DoNormal(this.id)"/></td>
        </tr>
        <tr> 
         <th>Last Name<font style="color:red">*</font></th>
        <td><form:input path="LastName" type="text" id="ln" onclick="DoNormal(this.id)"  /></td> 
        </tr>
        <tr>
         <th>Email Address<font style="color:red">*</font></th>
        <td><form:input path="EmailAddress" type="email" id="email" onclick="DoNormal(this.id)"  /></td>
        </tr>
        <tr>
        <th>Govt. Issue-Id<font style="color:red">*</font></th>
        <td><form:input path="GovtIssuedId" type="text" id="gid" onclick="DoNormal(this.id)"  /></td> 
        </tr>
        <tr>
        <th>Date of Arrival<font style="color:red">*</font></th>
        <td><form:input  type="date" path="DateOfArrival" id="doa" onclick="DoNormal(this.id)"  /></td> 
        </tr>
        <tr>
         <th>Date of Departure<font style="color:red">*</font></th>
        <td><form:input type="date" path="DateOfDeparture"  id="dd" onclick="DoNormal(this.id)"  /></td> 
        </tr>
        <tr>
         <th>Country<font style="color:red">*</font></th>
        <td><form:input path="Country" type="text" id="con" onclick="DoNormal(this.id)"  /></td>  
        </tr>
        <tr>
         <th>Number of People<font style="color:red">*</font></th>
        <td><form:input path="NumberOfPerson" type="text" id="np" onclick="DoNormal(this.id)" /></td>
        </tr>
        <tr>
         <th>Any Special Request<font style="color:red">*</font></th>
        <td><form:input path="SpecialRequest" type="text" id="asr" onclick="DoNormal(this.id)"  /></td>
        </tr>
        <tr>
         <th>Payment Method</th>
        <td><form:radiobutton  name="pay" path="PaymentMethod" value="Debit" /><label class="debit">Debit</label><form:radiobutton  name="pay" path="PaymentMethod"  value="Credit" /><label class="debit">Credit</label></td> 
        </tr>
        <tr> 
        <th></th><td><input  class="btn" type="submit" value="Submit" onclick="return Require()"><input class="btn" type="button" value="Cancel" ><input type="reset" value="Reset"></td>
        </tr>
        <form:errors path="*" />
       </tbody>
        </table>
        </form:form>
        </div>
    </body>
</html>
