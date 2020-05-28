<%@ page language="java" import="com.bsl.ocust.sqm.*,
org.openqa.selenium.*,java.io.File,java.io.FileInputStream,java.io.FileNotFoundException,java.util.Properties,java.util.concurrent.TimeUnit,org.openqa.selenium.JavascriptExecutor,org.openqa.selenium.WebElement,org.testng.TestListenerAdapter,org.testng.TestNG,org.testng.annotations.Test,java.util.Properties,java.io.File,com.aspose.cells.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<title>BIRLASOFT SAAS BOT Automation Tool</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@8.2.6/dist/sweetalert2.all.min.js" integrity="sha256-Ry2q7Rf2s2TWPC2ddAg7eLmm7Am6S52743VTZRx9ENw=" crossorigin="anonymous"></script>

<link rel="stylesheet" href="w3-theme-black.css">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        		<link href="css/sweetalert.css" rel="stylesheet">
<script src="js/sweetalert.js"></script>
        

<style>
body, html {
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url("images/saasbot.png");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">

  <!-- Custom styles for this page -->
  <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/start/jquery-ui.css"/>
  
<script type="text/javascript">
function showData(){
      
      document.getElementById("myData").style.display='inline-block';
}

</script>

<style>
.swal2-overflow {
  overflow-x: visible;
  overflow-y: visible;
}
</style>

</script>

<body >

<!-- Side Navigation -->
  <div id="nav-placeholder"></div>


<!-- Header -->
<header class="w3-container w3-theme w3-padding bg " id="myHeader">
  <div class="w3-center ">
  <center><img src='logo.png' height="65" width="250"></center>
  <h2 style="color:white;">SAAS BOT Use Case AUTOMATION TOOL</h2>
 <div class="w3-padding-32">
      <a href="#"><button id="add"  class="w3-btn w3-xlarge w3-dark-grey w3-hover-light-grey" onclick="addProduct();" style="font-weight:900;">Launch Tests</button></a>
    </div>
  </div>
</header>

<!-- Modal -->


	

</div>

<div class="w3-row-padding">

<!-- <div class="w3-center"> -->
  	
<!--  <h5> <form action = "SAASBOT/Upload.jsp" target="_blank" method = "post" -->
<!--          enctype = "multipart/form-data"> -->
<!--          <input type = "file" name = "file" size = "50" /> -->
        
         
<!--           <td><input type = "submit" value = "Upload" /> </a>  -->
<!-- </td> -->
<!--           </form></h5>  </div> -->
<div class="w3-responsive w3-card-4">
        <div class="container-fluid">

          <!-- Page Heading -->
          

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
  <th>Use Case Description</th>
  <th>Sample Input File</th>
  <th>Select Use Case</th>
  <th>Select Input file</th>
  <th>Execute Now</th>  
                    </tr>
                  </thead>
                  
                  <tbody>
                    


<tr class="w3-white">
  <td>SQM#2</td>
  <td>Launch Initiative NOV CAPS </td>
  <td><a href="Input File/create_initiative_input.xlsx"><img src="images/download.png"></a></td>
  <td><input type="checkbox" id="c2"></td>
 <td><input type = "file" name = "file" size = "50" /><input type = "submit" value = "Upload" onclick="upload();" /></td>
  <td><a id="s2" class="btn btn-primary btn-icon-split" href="initiative_creation.jsp"  target="_blank">Run </a> 
</td>
</tr>



                  </tbody>
                </table>
              </div>
            </div>
          </div>

        </div>
		</div>
</div>


</div>
</div>
<!-- Footer -->
<footer class="w3-container w3-theme-dark w3-padding-16">
  <p>Powered by <a href="#" target="_blank">MDM COE Team</a></p>
  <div style="position:relative;bottom:55px;" class="w3-tooltip w3-right">
    <span class="w3-text w3-theme-light w3-padding">Go To Top</span>    
    <a class="w3-text-white" href="#myHeader"><span class="w3-xlarge">
    <i class="fa fa-chevron-circle-up"></i></span></a>
  </div>
</footer>
	<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
	  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

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
}

// Tabs
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
}

var mybtn = document.getElementsByClassName("testbtn")[0];
mybtn.click();

// Accordions
function myAccFunc(id) {
    var x = document.getElementById(id);
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else { 
        x.className = x.className.replace(" w3-show", "");
    }
}

// Slideshows
var slideIndex = 1;

function plusDivs(n) {
slideIndex = slideIndex + n;
showDivs(slideIndex);
}

function showDivs(n) {
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length} ;
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
}

showDivs(1);

// Progress Bars
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

<script>

/* function schedule(){
	
	Swal.fire({
		  title: 'pick a date:',
		  type: 'question',
		  html: '<input id="datepicker" readonly class="swal2-input"><br><label>Select Time</label><select name="time"><option value="00:00">12.00 AM</option><option value="00:30">12.30 AM</option><option value="01:00">01.00 AM</option><option value="01:30">01.30 AM</option><option value="02:00">02.00 AM</option><option value="02:30">02.30 AM</option><option value="03:00">03.00 AM</option><option value="03:30">03.30 AM</option><option value="04:00">04.00 AM</option><option value="04:30">04.30 AM</option><option value="05:00">05.00 AM</option><option value="05:30">05.30 AM</option><option value="06:00">06.00 AM</option><option value="06:30">06.30 AM</option><option value="07:00">07.00 AM</option><option value="07:30">07.30 AM</option><option value="08:00">08.00 AM</option><option value="08:30">08.30 AM</option><option value="09:00">09.00 AM</option><option value="09:30">09.30 AM</option><option value="10:00">10.00 AM</option><option value="10:30">10.30 AM</option><option value="11:00">11.00 AM</option><option value="11:30">11.30 AM</option><option value="12:00">12.00 PM</option><option value="12:30">12.30 PM</option><option value="13:00">01.00 PM</option><option value="13:30">01.30 PM</option><option value="14:00">02.00 PM</option><option value="14:30">02.30 PM</option><option value="15:00">03.00 PM</option><option value="15:30">03.30 PM</option><option value="16:00">04.00 PM</option><option value="16:30">04.30 PM</option><option value="17:00">05.00 PM</option><option value="17:30">05.30 PM</option><option value="18:00">06.00 PM</option><option value="18:30">06.30 PM</option><option value="19:00" selected="">07.00 PM</option><option value="19:30">07.30 PM</option><option value="20:00">08.00 PM</option><option value="20:30">08.30 PM</option><option value="21:00">09.00 PM</option><option value="21:30">09.30 PM</option><option value="22:00">10.00 PM</option><option value="22:30">10.30 PM</option><option value="23:00">11.00 PM</option><option value="23:30">11.30 PM</option></select>',
		  customClass: 'swal2-overflow',
		  onOpen:function(){
			$('#datepicker').datepicker({
				dateFormat: 'yy/mm/dd' 
			});
		  }
		}).then(function(result) {
			if(result.value){
				console.log	($('#datepicker').val());
			}
		})
		
		
	//year, month 0-11, date, hour, min (can add ,sec,msec)
	//year, month 0-11, date, hour, min (can add ,sec,msec)
	var eta_ms = new Date(2020, 02, 03, 15, 44)-Date.now();
	
	//alert(eta_ms);
	if(eta_ms>0){
	var timeout = setTimeout(function(){
		Swal.fire({
	   		 imageUrl:'images/rolling.gif',
	   	    title: 'Starting executing: SQM1 As Scheduled',
	   	    text: 'Please wait till test Execution window opens',
	   	    timer: 5000,
	   	    showConfirmButton: false
	   	  })
		
		  document.getElementById("s1").click(); // Click on the checkbox

	}, eta_ms);
	}
} */


function upload(){
	
	 swal({
        title : "Done" ,
        text : "File Uploaded Successfully",
        type : "success"
       });
	
}
</script>
        <script src="js/pdxNavigationBar.js"></script>
               <script src="js/test_results.js"></script>
               <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/sweetalert2@8.2.6/dist/sweetalert2.all.min.js" ></script> -->
<!-- <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/start/jquery-ui.css"/> -->


               

</body>
</html>

