<%@ page language="java" import="com.bsl.ocust.sqm.*,
org.openqa.selenium.*,java.io.File,java.io.FileInputStream,java.io.FileNotFoundException,java.util.Properties,java.util.concurrent.TimeUnit,org.openqa.selenium.JavascriptExecutor,org.openqa.selenium.WebElement,org.testng.TestListenerAdapter,org.testng.TestNG,org.testng.annotations.Test,java.util.Properties,java.io.File" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<title>BIRLASOFT SQM Automation Tool</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="w3-theme-black.css">
<style>
body, html {
  margin: 0;
}.bg {
  /* The image used */
  background-image: url("images/OCUST.jpeg");  /* Full height */
  height: 100%;   /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
        <link href="css/pdx.css" rel="stylesheet"><link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">
        <link href="css/bootstrap.min.css" rel="stylesheet">  <!-- Custom styles for this page -->
  <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
		<link href="css/sweetalert.css" rel="stylesheet">
<script src="js/sweetalert.js"></script>

<script type="text/javascript">
function showData(){
      
      document.getElementById("myData").style.display='inline-block';
}</script></script><body ><!-- Side Navigation -->
  <div id="nav-placeholder"></div>
<!-- Header -->





<header class="w3-container w3-theme w3-padding bg " id="myHeader">
  <div class="w3-center ">
  <center><img src='logo.png' height="65" width="250"></center>
  <h2>Oracle Cloud Upgrade Safe Testing</h2>
  <h1>Supplier Qualification Management(SQM)</h1>
    <div class="w3-padding-32">
      <a href="#"><button id="add"  class="w3-btn w3-xlarge w3-dark-grey w3-hover-light-grey" onclick="addProduct();" style="font-weight:900;">Launch Tests</button></a>
    </div>
  </div>
</header><!-- Modal --><div id="id01" class="w3-modal">
    <div class="w3-modal-content w3-card-4 w3-animate-top">
      <header class="w3-container w3-theme-l1"> 
        <span onclick="document.getElementById('id01').style.display='none'"
        class="w3-button w3-display-topright">X</span>
        <h4>Please wait while we execute the test cases....</h4>
      </header>
      <footer class="w3-container w3-theme-l1">
        <p>Test case Execution Started....</p>
      </footer>
    </div>
</div></div><div class="w3-row-padding"><div class="w3-center">
  	
  <h5> <form action = "SQM/Upload.jsp"  method = "post" target="_blank"enctype = "multipart/form-data">
         <input type = "file" name = "file" size = "50" />
        
         
          <td><input type = "submit" value = "Upload"  /> </a> 
</td>
          </form></h5>
  </div>
<div class="w3-responsive w3-card-4">
        <div class="container-fluid">          <!-- Page Heading -->
                    <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
			
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead style="color:#e04646  ">
                    <tr>
                     <th>Test Name</th>
  <th>Test Description</th>
  <th>Module</th>
  <th>Select Test Case</th>
  <th>Execute</th>  
                    </tr>
                  </thead>
                  
                  <tbody>
                    <tr class="w3-white">
  <td>SQM#1</td>
  <td>Validate Quality team should be able to update status from provision approved to final approved/Disqualified only	</td>
  <td>SQM</td><td><input type="checkbox" id="c1"></td>
  <td><a id="s1" class="btn btn-primary btn-icon-split" href="SQM/SQM_41.jsp" target="_blank" target="_blank">Run</a> 
</td>
</tr>
<tr class="w3-white">
  <td>SQM#2</td>
  
  
  <td>Validate Quality Team should be able to extend/requalify expiring commodities	</td>
  <td>SQM</td><td><input type="checkbox" id="c2"></td>  
  <td><a id="s2" class="btn btn-primary btn-icon-split" href="SQM/SQM_46.jsp" target="_blank" target="_blank">Run </a></tr>
<tr class="w3-white">
  <td>SQM#3</td>
  
  <td>Add new Supplier, Address, Site and Contacts (Quality and Finance) along with sub commodity information (TIER1)</td>
  <td>BPM</td><td><input type="checkbox" id="c3"></td>  
  <td><a id="s3" class="btn btn-primary btn-icon-split" href="SQM/search_item.jsp" target="_blank" target="_blank">Run </a></tr>
<tr class="w3-white">
  <td>SQM#4</td>
  
  <td>Should not be able to create a new Supplier which is already existing in SQM</td>
    <td>BPM</td><td><input type="checkbox" id="c4"></td>  <td><a id="s4" class="btn btn-primary btn-icon-split" href="SQM/singlerow.jsp" target="hiddenFrame" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#5</td>
  
  <td>Add New Address, Site and contact to existing Supplier along with sub commodity information (TIER3)</td>
    <td>BPM</td><td><input type="checkbox" id="c5"></td>  <td><a id="s5" class="btn btn-primary btn-icon-split" href="SQM/multirow.jsp" target="hiddenFrame" target="_blank">Run </a> 
</tr>
<tr class="w3-white">
  <td>SQM#6</td>
  
  <td>Add New Site and Contact to Existing Supplier and Address with Sub Commodity Information (TIER2 & Mill Sub Commodity) </td>
    <td>BPM</td><td><input type="checkbox" id="c6"></td>
	
  <td><a id="s6" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> 
</tr>
<tr class="w3-white">
  <td>SQM#7</td>
  
  <td>Add New Site  with Sub Commodity Information (MRO) and use existing contact</td>
    <td>BPM</td><td><input type="checkbox" id="c7"></td>  <td><a id="s7" class="btn btn-primary btn-icon-split" href="SQM/item_ag.jsp" target="hiddenFrame" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#8</td>
  
  <td>Validate TIER1 and TIER 2 sub commodity should have finance and quality contact mandatory</td>
  <td>BPM</td><td><input type="checkbox" id="c8"></td>  
  <td><a id="s8" class="btn btn-primary btn-icon-split" href="SQM/deploy.jsp" target="hiddenFrame" target="_blank">Run </a> 
</tr>
<tr class="w3-white">
  <td>SQM#9</td>
  
  <td>Validate TIER3 and MRO have finance contact mandatory</td>
    <td>BPM</td><td><input type="checkbox" id="c9"></td>  <td><a id="s9" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#10</td>
  
  <td>Validate user should be able to request for new supplier with expedited request for TIER1 Sub Commodity</td>
    <td>BPM</td><td><input type="checkbox" id="c10"></td>  <td><a id="s10" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#11</td>
    
  <td>Validate Requestor Manager gets approval notification after requestor submits the request as level 1 approval</td>
  <td>BPM</td><td><input type="checkbox" id="c11"></td>  
  <td><a id="s11" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#12</td>
  
  <td>Validate Purchasing Manager for that SBU gets approval notification after requestor submits the request as level 2 approval</td>
    <td>BPM</td><td><input type="checkbox" id="c12"></td>  <td><a id="s12" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#13</td>
  
  <td>Validate user is able to submit revision on Existing Supplier/Address/Sites and Contact Attributes</td>
    <td>BPM</td><td><input type="checkbox" id="c13"></td>  <td><a id="s13" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#14</td>
  
  <td>Validate Requestor Manager gets approval notification after requestor submits the Revision request as level 1 approval</td>
    <td>BPM</td><td><input type="checkbox" id="c14"></td>  <td><a id="s14" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#15</td>
  
  <td>Validate Purchasing Manager for that SBU gets approval notification after Revision requestor submits the request as level 2 approval</td>
    <td>BPM</td><td><input type="checkbox" id="c15"></td>  <td><a id="s15" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#16</td>
  
  <td>Validate Vendor Management Group for that SBU gets approval notification after requestor submits the Revision request as level 3 approval</td>
    <td>BPM</td><td><input type="checkbox" id="c16"></td>  <td><a id="s16" class="btn btn-primary btn-icon-split" href="SQM/search_item.jsp" target="hiddenFrame" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#17</td>
  
  <td>Validate Supplier/Address/Site and Contact is created in SQM with sub commodity status as pending for Quality and Finance</td>
    <td>SQM</td><td><input type="checkbox" id="c17"></td>  <td><a id="s17" class="btn btn-primary btn-icon-split" href="SQM/advance_search.jsp" target="hiddenFrame" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#18</td>
  
  <td>Validate New Address, Site and Contact is created for existing Supplier with Sub Commodity Status as pending for finance and quality status as NA</td>
    <td>SQM</td><td><input type="checkbox" id="c18"></td>  <td><a id="s18" class="btn btn-primary btn-icon-split" href="SQM/update_attribute.jsp" target="hiddenFrame" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#19</td>
  
  <td>Validate New Site and Contact is created  in SQM with sub commodity status as pending  for Quality and Finance</td>
    <td>SQM</td><td><input type="checkbox" id="c19"></td>  <td><a id="s19" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#20</td>
  
  <td>Validate only new site should be created and no new contact should be created. Sub commodity status for finance should be pending but for quality should be NA</td>
    <td>SQM</td><td><input type="checkbox" id="c20"></td>  <td><a id="s20" class="btn btn-primary btn-icon-split" href="SQM/orgassignment.jsp" target="hiddenFrame" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#21</td>
  
  <td>Validate New Supplier is created in SQM along with Sub commodity Status for Finance and Quality as Pending along with final status as Expedited Approval</td>
    <td>SQM</td><td><input type="checkbox" id="c21"></td>  <td><a id="s21" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#22</td>
  
  <td>Validate all Supplier Attributes are updated post approval in BPM</td>
    <td>SQM</td><td><input type="checkbox" id="c22"></td>  <td><a id="s22" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#23</td>
  
  <td>Validate Quality Initiative is Launched automatically for Supplier with General Quality Questionnaire</td>
    <td>SQM</td><td><input type="checkbox" id="c23"></td>  <td><a id="s23" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#24</td>
  
  <td>Validate in case Supplier Contact Information is wrong for initiative then RPA error out the process and send email to Support Team</td>
    <td>SQM</td><td><input type="checkbox" id="c24"></td>  <td><a id="s24" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white"> 
  <td>SQM#25</td>
  
  <td>Validate Supplier should be able to respond to Quality Initiative</td>
    <td>SQM</td><td><input type="checkbox" id="c25"></td>  <td><a id="s25" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#26</td>
  
  <td>Validate Quality Distribution List for that S-BU receives notification when Supplier Responds to Questionnaire</td>
    <td>SQM</td><td><input type="checkbox" id="c26"></td>  <td><a id="s26" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#27</td>
  
  <td>Validate Quality Manager is able to review the response of the Supplier</td>
    <td>SQM</td><td><input type="checkbox" id="c27"></td>  <td><a id="s27" class="btn btn-primary btn-icon-split"  href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#28</td>
  
  <td>Validate Quality Manager is able to Provision Approve the Sub Commodity</td>
    <td>SQM</td><td><input type="checkbox" id="c28"></td>  <td><a id="s28" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#29</td>
  
  <td>Validate Finance Initiative is Launched automatically for Supplier with General Finance Questionnaire</td>
    <td>SQM</td><td><input type="checkbox" id="c29"></td>  <td><a id="s29" class="btn btn-primary btn-icon-split" href="SQM/SQM_29.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#30</td>
  
  <td>Validate if Quality Status is updated to rejected then finance initiative is not launched and final status is updated to rejected as well</td>
    <td>SQM</td><td><input type="checkbox" id="c30"></td>  <td><a id="s30" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#31</td>
  
  <td>Validate Supplier should be able to respond to Finance Initiative</td>
  <td>SQM</td><td><input type="checkbox" id="c31"></td>  
  <td><a id="s31"  class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#32</td>
  
  <td>Validate Finance Distribution List for that S-BU receives notification when Supplier Responds to Questionnaire</td>
    <td>SQM</td><td><input type="checkbox" id="c32"></td>  <td><a id="s32" class="btn btn-primary btn-icon-split" href="SQM/SQM_32.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#33</td>
  
  <td>Validate Finance Manager is able to review the response of the Supplier</td>
    <td>SQM</td><td><input type="checkbox" id="c33"></td>  <td><a id="s33" class="btn btn-primary btn-icon-split" href="SQM/SQM_33.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#34</td>
  
  <td>Validate Finance manager is able to update supplier information including banking information manually</td>
    <td>SQM</td><td><input type="checkbox" id="c34"></td>  <td><a id="s34" class="btn btn-primary btn-icon-split" href="SQM/SQM_34.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#35</td>
  
  <td>Validate Finance Manager is able to approve the Site</td>
    <td>SQM</td><td><input type="checkbox" id="c35"></td>  <td><a id="s35" class="btn btn-primary btn-icon-split" href="SQM/SQM_35.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#36</td>
  
  <td>Validate if another site of same address is already have finance status approved then for new site then finance status should be updated to approved automatically</td>
    <td>SQM</td><td><input type="checkbox" id="c36"></td>  <td><a id="s36" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#37</td>
  
  <td>Validate final status is updated to provision approved once finance status is approved (Quality Status is Provisional Approved)</td>
    <td>SQM</td><td><input type="checkbox" id="c37"></td>  <td><a id="s37" class="btn btn-primary btn-icon-split" href="SQM/SQM_37.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#38</td>
  
  <td>Validate If Quality Status is NA and Finance Status is approved then also final status should be updated to approved</td>
    <td>SQM</td><td><input type="checkbox" id="c38"></td>  <td><a id="s38" class="btn btn-primary btn-icon-split" href="SQM/SQM_38.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#39</td>
  
  <td>Validate if any of status is rejected (quality/finance) then final status should be rejected</td>
    <td>SQM</td><td><input type="checkbox" id="c39"></td>  <td><a id="s39" class="btn btn-primary btn-icon-split" href="SQM/SQM_39.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#40</td>
  <td>Validate requestor gets email once Supplier is provisionally Approved</td>
    <td>SQM</td><td><input type="checkbox" id="c40"></td>  <td><a id="s40" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#41</td>  <td>Validate Search existing SQM Supplier in BPM	</td>
    <td>BPM</td><td><input type="checkbox" id="c41"></td>  <td><a id="s41" class="btn btn-primary btn-icon-split" href="BPM/BPM_01.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#42</td>  <td>Validate that Quality team should be able to update the status to Approved only after capturing FAI Date, Audit Date and Next Audit Date for Tier1</td>
    <td>SQM</td><td><input type="checkbox" id="c42"></td>  <td><a id="s42" class="btn btn-primary btn-icon-split" href="SQM/SQM_42.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#43</td>  <td>Validate that Quality team should be able to update the status to Approved only after capturing FAI Date for Tier2</td>
    <td>SQM</td><td><input type="checkbox" id="c43"></td>  <td><a id="s43" class="btn btn-primary btn-icon-split" href="SQM/SQM_43.jsp" target="_blank">Run </a> </tr>
<tr class="w3-white">
  <td>SQM#44</td>  <td>Validate requestor gets email once Supplier is Approved/Disqualified</td>
    <td>SQM</td><td><input type="checkbox" id="c44"></td>  <td><a id="s44" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>     
<tr class="w3-white">
  <td>SQM#45</td>  <td>Validate that the Quality team is notified for the Expiring sub commodities (30 days before expiration)</td>
    <td>SQM</td><td><input type="checkbox" id="c45"></td>  <td><a id="s45" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#46</td>  <td>Validate Supplier and corresponding Address, Site and Contact details after searching Supplier in BPM	</td>
    <td>BPM</td><td><input type="checkbox" id="c46"></td>  <td><a id="s46" class="btn btn-primary btn-icon-split" href="BPM/BPM_02.jsp" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#47</td>  <td>Validate Supplier Certifications details are updated into Certification History Object</td>
    <td>SQM</td><td><input type="checkbox" id="c47"></td>  <td><a id="s47" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#48</td>  <td>Validate recertification questionnaire sent to Supplier 30 days before expiration of certificate</td>
    <td>SQM</td><td><input type="checkbox" id="c48"></td>  <td><a id="s48" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#49</td>  <td>Validate Quality User have capability to stop sending recertification questionnaire</td>
    <td>SQM</td><td><input type="checkbox" id="c49"></td>  <td><a id="s49" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#50</td>  <td>Validate Supplier should be able to do profile changes</td>
    <td>SQM</td><td><input type="checkbox" id="c50"></td>  <td><a id="s50" class="btn btn-primary btn-icon-split" href="SQM/SQM_50.jsp" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#51</td>  <td>Validate change request is triggered when supplier made profile changes</td>
    <td>SQM</td><td><input type="checkbox" id="c51"></td>  <td><a id="s51" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#52</td>  <td>Validate Vendor Management Group gets approval notification for the change request</td>
    <td>SQM</td><td><input type="checkbox" id="c52"></td>  <td><a id="s52" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#53</td>  <td>Validate Vendor Management Group is able to approve/reject/ask additional information on supplier profile changes</td>
    <td>SQM</td><td><input type="checkbox" id="c53"></td>  <td><a id="s53" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#54</td>  <td>Validate only provisional approved/approved supplier data is published to JDE</td>
    <td>SQM</td><td><input type="checkbox" id="c54"></td>  <td><a id="s54" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#55</td>  <td>Validate supplier updates are published to JDE</td>
    <td>SQM</td><td><input type="checkbox" id="c55"></td>  <td><a id="s55" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#56</td>  <td>Validate addition of sub commodity in SQM to existing site is published to JDE</td>
    <td>SQM</td><td><input type="checkbox" id="c56"></td>  <td><a id="s56" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#57</td>  <td>Validate Publish Status has been updated to "Published" once site is successfully published to JDE</td>
    <td>SQM</td><td><input type="checkbox" id="c57"></td>  <td><a id="s57" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#58</td>  <td>Validate JDE Address Book Number is updated at Site level attribute in case new site is published to JDE</td>
    <td>SQM</td><td><input type="checkbox" id="c58"></td>  <td><a id="s58" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#59</td>  <td>Validate if any record is not published successfully to JDE then Publish Status should be changed to "Publish Fail" with Fail Reason on that Site</td>
    <td>SQM</td><td><input type="checkbox" id="c59"></td>  <td><a id="s59" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#60</td>  <td>SQM Support should get notification in case any record is failed to publish and republish flag should be updated to 'No'</td>
    <td>SQM</td><td><input type="checkbox" id="c60"></td>  <td><a id="s60" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>  
    <tr class="w3-white">
  <td>SQM#61</td>  <td>Supplier record should be eligible for republish in case republish status is checked to 'Yes' for that site</td>
    <td>SQM</td><td><input type="checkbox" id="c61"></td>  <td><a id="s61" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr> 
     <tr class="w3-white">
  <td>SQM#62</td>  <td>Validate any record wih more than character limit of JDE for any attribute is not published to JDE</td>
    <td>SQM</td><td><input type="checkbox" id="c62"></td>  <td><a id="s62" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr> 
     <tr class="w3-white">
  <td>SQM#63</td>  <td>Verify only approved Supplier Site documents are published to OnBase</td>
    <td>SQM</td><td><input type="checkbox" id="c63"></td>  <td><a id="s63" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr>      
    
     <tr class="w3-white">
  <td>SQM#64</td>  <td>Validate all external document types are published to OnBase from SQM along with metadata</td>
    <td>SQM</td><td><input type="checkbox" id="c64"></td>  <td><a id="s64" class="btn btn-primary btn-icon-split" href="#" target="_blank">Run </a> </tr> 
    
                 </tbody>
                </table>
              </div>
            </div>
          </div>        </div>
		</div>
</div>
</div>
</div>
<!-- Footer -->
<footer class="w3-container w3-theme-dark w3-padding-16">
  <p>Powered by <a href="#" target="hiddenFrame">MDM COE Team</a></p>
  <div style="position:relative;bottom:55px;" class="w3-tooltip w3-right">
    <span class="w3-text w3-theme-light w3-padding">Go To Top</span>    
    <a class="w3-text-white" href="#myHeader"><span class="w3-xlarge">
    <i class="fa fa-chevron-circle-up"></i></span></a>
  </div>
</footer>
	<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
	  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>  <!-- Page level plugins -->
  <script src="vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>
<script type="text/javascript">function myFunction() {		  var myWindow = window.open("PHC/upload.jsp", "MsgWindow", "width=200,height=100");
		  
		}	
</script>
  <!-- Page level custom scripts -->
  <script src="js/demo/datatables-demo.js"></script>
<!-- Script for Sidebar, Tabs, Accordions, Progress bars and slideshows -->
<script>
// Side navigation
function w3_open() {
    var x = document.getElementById("mySidebar");
    x.style.width = "100%";
    x.style.fontSize = "40px";
    x.style.paddingTop = "10%";
    x.style.display = "block";
}
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
}// Tabs
function openCity(evt, cityName) {
  var i;
  var x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  var activebtn = document.getElementsByClassName("testbtn");
  for (i = 0; i < x.length; i++) {
      activebtn[i].className = activebtn[i].className.replace(" w3-dark-grey", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " w3-dark-grey";
}var mybtn = document.getElementsByClassName("testbtn")[0];
mybtn.click();// Accordions
function myAccFunc(id) {
    var x = document.getElementById(id);
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else { 
        x.className = x.className.replace(" w3-show", "");
    }
}// Slideshows
var slideIndex = 1;function plusDivs(n) {
slideIndex = slideIndex + n;
showDivs(slideIndex);
}function showDivs(n) {
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length} ;
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
}showDivs(1);// Progress Bars
function move() {
  var elem = document.getElementById("myBar");   
  var width = 5;
  var id = setInterval(frame, 10);
  function frame() {
    if (width == 100) {
      clearInterval(id);
    } else {
      width++; 
      elem.style.width = width + '%'; 
      elem.innerHTML = width * 1  + '%';
    }
  }
}
</script>




        <script src="js/pdxNavigationBar.js"></script>
                <script src="js/test_results.js"></script>
                
  
        
      <iframe name="hiddenFrame" width="0" height="0" border="0" style="display: none;"></iframe>
</body>
</html>