<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet" />
<script
	src="${pageContext.request.contextPath}/resources/js/jquery_3_1_1-min.js"></script>

<style>
.form-group label {
	display: block;
}

.form-group {
	display: block;
}

.form-group .form-control {
	padding: 4px;
	/*width: 300px;*/
}

/*
        button {
            margin-top: 15px;
        }*/
.alert {
	text-align: center;
	background: green;
	color: #eee;
	padding: 4px;
}

.alert button {
	display: none;
}

.failed {
	border: 1px solid red;
}

/*
        form {
            position: relative;
            padding: 10px;
            width: 300px;
        }*/
.block-loading {
	position: absolute;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	background: #fff
		url('${pageContext.request.contextPath}/resources/img/loader.gif')
		no-repeat center center;
	opacity: 0.7;
}
</style>

<style>
body {
	padding-top: 20px;
}

.footer {
	padding-top: 40px;
	padding-bottom: 40px;
	margin-top: 40px;
	border-top: 1px solid #eee;
}

/* Main marketing message and sign up button */
.jumbotron {
	text-align: center;
	background-color: transparent;
}

.jumbotron .btn {
	padding: 14px 24px;
	font-size: 21px;
}

/* Customize the nav-justified links to be fill the entire space of the .navbar */
.nav-justified {
	background-color: #eee;
	border: 1px solid #ccc;
	border-radius: 5px;
}

.nav-justified>li>a {
	padding-top: 15px;
	padding-bottom: 15px;
	margin-bottom: 0;
	font-weight: bold;
	color: #777;
	text-align: center;
	background-color: #e5e5e5; /* Old browsers */
	background-image: -webkit-gradient(linear, left top, left bottom, from(#f5f5f5),
		to(#e5e5e5));
	background-image: -webkit-linear-gradient(top, #f5f5f5 0%, #e5e5e5 100%);
	background-image: -o-linear-gradient(top, #f5f5f5 0%, #e5e5e5 100%);
	background-image: linear-gradient(to bottom, #f5f5f5 0%, #e5e5e5 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f5f5f5',
		endColorstr='#e5e5e5', GradientType=0); /* IE6-9 */
	background-repeat: repeat-x; /* Repeat the gradient */
	border-bottom: 1px solid #d5d5d5;
}

.nav-justified>.active>a, .nav-justified>.active>a:hover, .nav-justified>.active>a:focus
	{
	background-color: #ddd;
	background-image: none;
	-webkit-box-shadow: inset 0 3px 7px rgba(0, 0, 0, .15);
	box-shadow: inset 0 3px 7px rgba(0, 0, 0, .15);
}

.nav-justified>li:first-child>a {
	border-radius: 5px 5px 0 0;
}

.nav-justified>li:last-child>a {
	border-bottom: 0;
	border-radius: 0 0 5px 5px;
}

@media ( min-width : 768px) {
	.nav-justified {
		max-height: 52px;
	}
	.nav-justified>li>a {
		border-right: 1px solid #d5d5d5;
		border-left: 1px solid #fff;
	}
	.nav-justified>li:first-child>a {
		border-left: 0;
		border-radius: 5px 0 0 5px;
	}
	.nav-justified>li:last-child>a {
		border-right: 0;
		border-radius: 0 5px 5px 0;
	}
}

/* Responsive: Portrait tablets and up */
@media screen and (min-width: 768px) {
	/* Remove the padding we set earlier */
	.masthead, .marketing, .footer {
		padding-right: 0;
		padding-left: 0;
	}
}
</style>
