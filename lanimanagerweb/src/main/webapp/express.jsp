<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>快递</title>
<!---css--->
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!---css--->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Real Space Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<!---js--->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<!---js--->
<!---fonts-->
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=PT+Sans:400,400italic,700,700italic'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Righteous'
	rel='stylesheet' type='text/css'>
<!---fonts-->
<!-- FlexSlider -->
<script src="js/jquery.flexslider.js"></script>
<link rel="stylesheet" href="css/flexslider.css" type="text/css"
	media="screen" />
<script>
	// Can also be used with $(document).ready()
	$(window).load(function() {
		$('.flexslider').flexslider({
			animation : "slide",
			controlNav : "thumbnails"
		});
	});
</script>
<!-- //FlexSlider-->
</head>
<body>

	<%@ include file="header.jsp"%>

	<!---banner--->
	<div class="banner-section">
		<div class="container">
			<h2>快 递</h2>
		</div>
	</div>
	<!---banner--->
	<div class="content">
	<!-- find -->
	<div class="place-section">
			<div class="container">
				<h2>懒一下</h2>
				<div class="place-grids">
					<div class="col-md-3 place-grid">
						<h5>取货地址</h5>
						<select class="sel">
							<option value="">All Locations</option>
							<option value="">New Jersey</option>
							<option value="">New York</option>
							<option value="">Australia</option>
							<option value="">Canada</option>
							<option value="">India</option>
						</select>
					</div>
					<div class="col-md-3 place-grid">
						<h5>送货地址</h5>
						<select class="sel">
							<option value="">All Locations</option>
							<option value="">New Jersey</option>
							<option value="">New York</option>
							<option value="">Australia</option>
							<option value="">Canada</option>
							<option value="">India</option>
						</select>
					</div>
					<div class="col-md-3 place-grid">
						<h5>Property Status</h5>
						<select class="sel">
							<option value="">All status</option>
							<option value="">none</option>
							<option value="">open house</option>
							<option value="">rent</option>
							<option value="">sale</option>
						</select>
					</div>
					<div class="col-md-3 place-grid">
						<h5>Property Type</h5>
						<select class="sel">
							<option value="">All Type</option>
							<option value="">Commercial</option>
							<option value="">- Office</option>
							<option value="">- Buy</option>
							<option value="">Residential</option>
							<option value="">-Apartment</option>
						</select>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="place-grids">
					<div class="col-md-2 place-grid1">
						<h5>Min Beds</h5>
						<select class="sel">
							<option value="">any</option>
							<option value="">1</option>
							<option value="">2</option>
							<option value="">3</option>
							<option value="">4</option>
							<option value="">5</option>
						</select>
					</div>
					<div class="col-md-2 place-grid1">
						<h5>Min Baths</h5>
						<select class="sel">
							<option value="">any</option>
							<option value="">1</option>
							<option value="">2</option>
							<option value="">3</option>
							<option value="">4</option>
							<option value="">5</option>
						</select>
					</div>
					<div class="col-md-2 place-grid1">
						<h5>Min Price</h5>
						<select class="sel">
							<option value="">any</option>
							<option value="">$500</option>
							<option value="">$1000</option>
							<option value="">$2000</option>
							<option value="">$3000</option>
							<option value="">$4000</option>
							<option value="">$5000</option>
							<option value="">$75000</option>
							<option value="">$10000</option>
						</select>
					</div>
					<div class="col-md-2 place-grid1">
						<h5>Max Price</h5>
						<select class="sel">
							<option value="">any</option>
							<option value="">$1000</option>
							<option value="">$2000</option>
							<option value="">$3000</option>
							<option value="">$4000</option>
							<option value="">$5000</option>
							<option value="">$75000</option>
							<option value="">$10000</option>
						</select>
					</div>
					<div class="col-md-4 search">
						<form action="forrent.html">
							<input type="submit" value="Search">
						</form>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<!-- find -->
		<div class="properties-section">
			<div class="container">
				<div class="properties-grids">
					<div class="col-md-9 forsales-left">
						<div class="forsale">
							<div class="bs-example bs-example-tabs" role="tabpanel"
								data-example-id="togglable-tabs">
								<ul id="myTab" class="nav nav-tabs left-tab" role="tablist">
									<li role="presentation" class="active"><a href="#home"
										id="home-tab" role="tab" data-toggle="tab"
										aria-controls="home" aria-expanded="true"><img
											src="images/menu1.png"></a></li>
									<li role="presentation"><a href="#profile" role="tab"
										id="profile-tab" data-toggle="tab" aria-controls="profile"><img
											src="images/menu.png"></a></li>
								</ul>
								<div id="myTabContent" class="tab-content">
									<div role="tabpanel" class="tab-pane fade in active" id="home"
										aria-labelledby="home-tab">
										<div class="forsale-grids">
											<h4>
												<a href="#">1200 Anastasia Avenue, Coral Gables</a>
											</h4>
											<div class="forsale1">
												<div class="forsale-left">
													<a href="#"><img src="images/p6.jpg"
														class="img-responsive" alt="/"></a>
												</div>
												<div class="forsale-right">
													<h5>
														<label>$</label> 7,500 Per Month - <span>Single
															Family Home</span>
													</h5>
													<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
														elit, sed diam nonummy nibh euismod tincidunt ut laoreet
														dolore magna aliquam erat volutpat. Ut wisi enim ad……</p>
													<a href="#" class="button4">more details</a>
												</div>
												<div class="clearfix"></div>
												<ul>
													<li><span> 5000 </span>Area</li>
													<li><span> 3 </span>Bathrooms</li>
													<li><span> 3 </span>Bedrooms</li>
													<li><span> 2 </span>Garages</li>
												</ul>
											</div>
										</div>
										<div class="forsale-grids">
											<h4>
												<a href="#">1200 Anastasia Avenue, Coral Gables</a>
											</h4>
											<div class="forsale1">
												<div class="forsale-left">
													<a href="#"><img src="images/p4.jpg"
														class="img-responsive" alt="/"></a>
												</div>
												<div class="forsale-right">
													<h5>
														<label>$</label> 7,500 Per Month - <span>Villa</span>
													</h5>
													<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
														elit, sed diam nonummy nibh euismod tincidunt ut laoreet
														dolore magna aliquam erat volutpat. Ut wisi enim ad……</p>
													<a href="#" class="button4">more details</a>
												</div>
												<div class="clearfix"></div>
												<ul>
													<li><span> 5000 </span>Area</li>
													<li><span> 3 </span>Bathrooms</li>
													<li><span> 3 </span>Bedrooms</li>
													<li><span> 2 </span>Garages</li>
												</ul>
											</div>
										</div>
										<div class="forsale-grids">
											<h4>
												<a href="#">1200 Anastasia Avenue, Coral Gables</a>
											</h4>
											<div class="forsale1">
												<div class="forsale-left">
													<a href="#"><img src="images/p5.jpg"
														class="img-responsive" alt="/"></a>
												</div>
												<div class="forsale-right">
													<h5>
														<label>$</label> 9,500 Per Month - <span>Single
															Family Home</span>
													</h5>
													<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
														elit, sed diam nonummy nibh euismod tincidunt ut laoreet
														dolore magna aliquam erat volutpat. Ut wisi enim ad……</p>
													<a href="#" class="button4">more details</a>
												</div>
												<div class="clearfix"></div>
												<ul>
													<li><span> 5000 </span>Area</li>
													<li><span> 3 </span>Bathrooms</li>
													<li><span> 3 </span>Bedrooms</li>
													<li><span> 2 </span>Garages</li>
												</ul>
											</div>
										</div>
										<div class="forsale-grids">
											<h4>
												<a href="#">1909 Bollywood Boulevard</a>
											</h4>
											<div class="forsale1">
												<div class="forsale-left">
													<a href="#"><img src="images/p7.jpg"
														class="img-responsive" alt="/"></a>
												</div>
												<div class="forsale-right">
													<h5>
														<label>$</label> 7,500 Per Month - <span>Single
															Family Home</span>
													</h5>
													<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
														elit, sed diam nonummy nibh euismod tincidunt ut laoreet
														dolore magna aliquam erat volutpat. Ut wisi enim ad……</p>
													<a href="#" class="button4">more details</a>
												</div>
												<div class="clearfix"></div>
												<ul>
													<li><span> 5000 </span>Area</li>
													<li><span> 3 </span>Bathrooms</li>
													<li><span> 3 </span>Bedrooms</li>
													<li><span> 2 </span>Garages</li>
												</ul>
											</div>
										</div>
										<div class="forsale-grids">
											<h4>
												<a href="#">1200 Anastasia Avenue, Coral Gables</a>
											</h4>
											<div class="forsale1">
												<div class="forsale-left">
													<a href="#"><img src="images/p3.jpg"
														class="img-responsive" alt="/"></a>
												</div>
												<div class="forsale-right">
													<h5>
														<label>$</label> 480,000 Per Month - <span>Single
															Family Home</span>
													</h5>
													<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
														elit, sed diam nonummy nibh euismod tincidunt ut laoreet
														dolore magna aliquam erat volutpat. Ut wisi enim ad……</p>
													<a href="#" class="button4">more details</a>
												</div>
												<div class="clearfix"></div>
												<ul>
													<li><span> 5000 </span>Area</li>
													<li><span> 3 </span>Bathrooms</li>
													<li><span> 3 </span>Bedrooms</li>
													<li><span> 2 </span>Garages</li>
												</ul>
											</div>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="profile"
										aria-labelledby="profile-tab">
										<div class="forsale-grids1">
											<div class="col-md-4 forsale-grid1">
												<img src="images/s7.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>60 Merrick Way, Miami</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 2,500</h6>
											</div>
											<div class="col-md-4 forsale-grid1">
												<img src="images/s5.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>Florida 5, Pinecrest, FL</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 4,500</h6>
											</div>
											<div class="col-md-4 forsale-grid1">
												<img src="images/s6.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>109 Bollywood Boulevard</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 9,500</h6>
											</div>
											<div class="clearfix"></div>
										</div>
										<div class="forsale-grids1">
											<div class="col-md-4 forsale-grid1">
												<img src="images/s4.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>60 Merrick Way, Miami</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 2,500</h6>
											</div>
											<div class="col-md-4 forsale-grid1">
												<img src="images/s2.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>Florida 5, Pinecrest, FL</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 5,500</h6>
											</div>
											<div class="col-md-4 forsale-grid1">
												<img src="images/s3.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>109 Bollywood Boulevard</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 7,500</h6>
											</div>
											<div class="clearfix"></div>
										</div>
										<div class="forsale-grids1">
											<div class="col-md-4 forsale-grid1">
												<img src="images/s6.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>60 Merrick Way, Miami</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 3,500</h6>
											</div>
											<div class="col-md-4 forsale-grid1">
												<img src="images/s4.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>Florida 5, Pinecrest, FL</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 4,500</h6>
											</div>
											<div class="col-md-4 forsale-grid1">
												<img src="images/s7.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>109 Bollywood Boulevard</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$9,500</h6>
											</div>
											<div class="clearfix"></div>
										</div>
										<div class="forsale-grids1">
											<div class="col-md-4 forsale-grid1">
												<img src="images/s3.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>60 Merrick Way, Miami</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 2,500</h6>
											</div>
											<div class="col-md-4 forsale-grid1">
												<img src="images/s5.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>Florida 5, Pinecrest, FL</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$4,500</h6>
											</div>
											<div class="col-md-4 forsale-grid1">
												<img src="images/s6.jpg" class="img-responsive" alt="/">
												<div class="sale-info">
													<span>For Rent</span>
												</div>
												<h5>109 Bollywood Boulevard</h5>
												<p>
													Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
														More</a>
												</p>
												<h6>$ 7,500</h6>
											</div>
											<div class="clearfix"></div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 properties-right">
						<div class="properties-top">
							<h4>条件查找</h4>
							<div class="yourplace">
								<h5>all location</h5>
								<select class="sel2">
									<option value="">All Locations</option>
									<option value="">New Jersey</option>
									<option value="">New York</option>
									<option value="">Australia</option>
									<option value="">Canada</option>
									<option value="">India</option>
								</select>
							</div>
							<div class="yourplace">
								<h5>all sub location</h5>
								<select class="sel2">
									<option value="">All Locations</option>
									<option value="">New Jersey</option>
									<option value="">New York</option>
									<option value="">Australia</option>
									<option value="">Canada</option>
									<option value="">India</option>
								</select>
							</div>
							<div class="yourplace">
								<h5>Property Status</h5>
								<select class="sel2">
									<option value="">All status</option>
									<option value="">none</option>
									<option value="">open house</option>
									<option value="">rent</option>
									<option value="">sale</option>
								</select>
							</div>
							<div class="yourplace">
								<h5>Property Type</h5>
								<select class="sel2">
									<option value="">All Type</option>
									<option value="">Commercial</option>
									<option value="">- Office</option>
									<option value="">- Buy</option>
									<option value="">Residential</option>
									<option value="">-Apartment</option>
								</select>
							</div>
							<div class="yourplace-grids">
								<div class="col-md-6 yourplace-grid">
									<h5>Min Beds</h5>
									<select class="sel3">
										<option value="">any</option>
										<option value="">1</option>
										<option value="">2</option>
										<option value="">3</option>
										<option value="">4</option>
										<option value="">5</option>
									</select>
								</div>
								<div class="col-md-6 yourplace-grid">
									<h5>Min Baths</h5>
									<select class="sel3">
										<option value="">any</option>
										<option value="">1</option>
										<option value="">2</option>
										<option value="">3</option>
										<option value="">4</option>
										<option value="">5</option>
									</select>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="yourplace-grids1">
								<div class="col-md-6 yourplace-grid">
									<h5>Min Price</h5>
									<select class="sel3">
										<option value="">any</option>
										<option value="">$500</option>
										<option value="">$1000</option>
										<option value="">$2000</option>
										<option value="">$3000</option>
										<option value="">$4000</option>
										<option value="">$5000</option>
										<option value="">$75000</option>
										<option value="">$10000</option>
									</select>
								</div>
								<div class="col-md-6 yourplace-grid">
									<h5>Max Price</h5>
									<select class="sel3">
										<option value="">any</option>
										<option value="">$1000</option>
										<option value="">$2000</option>
										<option value="">$3000</option>
										<option value="">$4000</option>
										<option value="">$5000</option>
										<option value="">$75000</option>
										<option value="">$10000</option>
									</select>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="search1">
								<form>
									<input type="submit" value="Search">
								</form>
							</div>
						</div>
						<div class="feature">
							<h4>Featured Properties</h4>
							<div class="feature-top">
								<img src="images/s6.jpg" class="img-responsive" alt="/">
								<h5>60 Merrick Way, Miami</h5>
								<p>
									Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
										More</a>
								</p>
							</div>
							<div class="feature-top top2">
								<img src="images/s7.jpg" class="img-responsive" alt="/">
								<h5>Villa in Hialeah, Dade</h5>
								<p>
									Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
										More</a>
								</p>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!---footer--->
	<div class="footer-section">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-3 footer-grid">
					<h4>About Real Homes</h4>
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
						sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna
						aliquam erat volutpat.</p>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>Recent Posts</h4>
					<ul>
						<li><a href="#">Lorem Post With Image Format</a></li>
						<li><a href="#">Example Video Blog Post</a></li>
						<li><a href="#">Example Post With Gallery Post </a></li>
						<li><a href="#">Example Video Blog Post</a></li>
						<li><a href="#">Lorem Post With Image Format</a></li>
						<li><a href="#">Example Video Blog Post</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>Useful links</h4>
					<ul>
						<li><a href="terms.html">Terms of Use</a></li>
						<li><a href="privacy.html">Privacy Policy</a></li>
						<li><a href="contact.html">Contact Support </a></li>
						<li><a href="agents.html"> All Agents</a></li>
						<li><a href="blog.html">Blog</a></li>
						<li><a href="faqs.html">FAQs</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>Get In Touch</h4>
					<p>8901 Marmora Road</p>
					<p>Glasgow, DO4 89GR.</p>
					<p>Freephone : +1 234 567 890</p>
					<p>Telephone : +1 234 567 890</p>
					<p>FAX : + 1 234 567 890</p>
					<p>
						E-mail : <a href="mailto:example@mail.com"> example@mail.com</a>
					</p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!---footer--->
	<!--copy-->
	<div class="copy-section">
		<div class="container">
			<p>
				Copyright &copy; 2016.Company name All rights reserved.More
				Templates <a href="http://www.cssmoban.com/" target="_blank"
					title="模板之家">模板之家</a> - Collect from <a
					href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
			</p>
		</div>
	</div>
	<!--copy-->

</body>
</html>