			$.get("pdxNavigationBar.html", function(data){
				
			    $("#nav-placeholder").replaceWith(data);
			    
			    var role = localStorage.getItem("Role");
			    if(role!=="SuperAdmin")
				{
					$("#userPG").hide();
					console.log("yes");
				}
			    
			    document.getElementById('userName').innerHTML = "";
			    
			    var name=localStorage.getItem("LoginBy");
			    $('#userName').append(name);
			});
			
