<%-- 
    Document   : index_Medico
    Created on : 19/02/2017, 03:23:54 PM
    Author     : GREG-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Centro Medico Universitario</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/landing-page.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top topnav" role="navigation">
        <div class="container topnav">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand topnav" href="#">Centro Médico</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#about" id="Registrar_Cita">Reservar Cita</a>
                    </li>
                    <li>
                        <a href="#services" id="Editar_Informacion">Editar Información Personal</a>
                    </li>
                    <li>
                        <a href="#contact">Ver historial médico</a>
                    </li>
                    <li>
                        <a href="Inicio_Sesion.jsp">Iniciar Sesion</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>


    <!-- Header -->
    <a name="about"></a>
    <div class="intro-header">
        <div class="container">

            <div class="row">
                <div class="col-lg-12">
                    <div class="intro-message">
                        <h1>Landing Page</h1>
                        <h3>A Template by Start Bootstrap</h3>
                        <hr class="intro-divider">
                        <ul class="list-inline intro-social-buttons">
                            <li>
                                <a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                            </li>
                            <li>
                                <a href="https://github.com/IronSummitMedia/startbootstrap" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                            </li>
                            <li>
                                <a href="#" class="btn btn-default btn-lg"><i class="fa fa-linkedin fa-fw"></i> <span class="network-name">Linkedin</span></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.intro-header -->

    <!-- Page Content -->

	<a  name="services"></a>
    <div class="content-section-a">

        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">Death to the Stock Photo:<br>Special Thanks</h2>
                    <p class="lead">A special thanks to <a target="_blank" href="http://join.deathtothestockphoto.com/">Death to the Stock Photo</a> for providing the photographs that you see in this template. Visit their website to become a member.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/ipad.png" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

    <div class="content-section-b">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">3D Device Mockups<br>by PSDCovers</h2>
                    <p class="lead">Turn your 2D designs into high quality, 3D product shots in seconds using free Photoshop actions by <a target="_blank" href="http://www.psdcovers.com/">PSDCovers</a>! Visit their website to download some of their awesome, free photoshop actions!</p>
                </div>
                <div class="col-lg-5 col-sm-pull-6  col-sm-6">
                    <img class="img-responsive" src="img/dog.png" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-b -->

    <div class="content-section-a">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">Google Web Fonts and<br>Font Awesome Icons</h2>
                    <p class="lead">This template features the 'Lato' font, part of the <a target="_blank" href="http://www.google.com/fonts">Google Web Font library</a>, as well as <a target="_blank" href="http://fontawesome.io">icons from Font Awesome</a>.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/phones.png" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

	<a  name="contact"></a>
    <div class="banner">

        <div class="container">

            <div class="row">
                <div class="col-lg-6">
                    <h2>Connect to Start Bootstrap:</h2>
                </div>
                <div class="col-lg-6">
                    <ul class="list-inline banner-social-buttons">
                        <li>
                            <a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                        </li>
                        <li>
                            <a href="https://github.com/IronSummitMedia/startbootstrap" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                        </li>
                        <li>
                            <a href="#" class="btn btn-default btn-lg"><i class="fa fa-linkedin fa-fw"></i> <span class="network-name">Linkedin</span></a>
                        </li>
                    </ul>
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.banner -->

    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <ul class="list-inline">
                        <li>
                            <a href="#">Home</a>
                        </li>
                        <li class="footer-menu-divider">&sdot;</li>
                        <li>
                            <a href="#about">About</a>
                        </li>
                        <li class="footer-menu-divider">&sdot;</li>
                        <li>
                            <a href="#services">Services</a>
                        </li>
                        <li class="footer-menu-divider">&sdot;</li>
                        <li>
                            <a href="#contact">Contact</a>
                        </li>
                    </ul>
                    <p class="copyright text-muted small">Copyright &copy; Your Company 2014. All Rights Reserved</p>
                </div>
            </div>
        </div>
    </footer>

   
    
    <div class="modal fade" id="Mo_Editar_Informacion" role="dialog">
    <div class="modal-dialog">

      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title" align="center">Información Personal</h4>
        </div>
         
            <div class="modal-body">

              <form role="form" method="post" action="/pacientes" autocomplete="off">
            <input type="hidden" name="_token" value="{{csrf_token()}}">
            <fieldset>

          
            </div></br>


            <div class="form-group">
                  <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>

                  <div class="col-md-6 col-xs-10">
                      <select id="Tipo_Paciente" name="tipo_paciente" placeholder="Tipo Paciente" class="form-control" required>
                        <option value="ESTUDIANTE">ESTUDIANTE</option>
                        <option value="PERSONA EXTERNA">PERSONA EXTERNA</option>
                      </select>
                  </div>
            </div></br></br>



            <div id="Seccion_General">
                <div class="form-group">
                      <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>

                      <div class="col-md-6 col-xs-10">
                          <input id="dni" name="dni" placeholder="DNI" class="form-control" required>
                      </div>
                </div></br></br>

                <div class="form-group">
                      <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-lock bigicon"></i></span>
                      <div class="col-md-6 col-xs-10">
                          <input id="Password" type="Password" name="contraseña" placeholder="Password" class="form-control" required>
                      </div>
                </div></br></br>

                <div class="form-group">
                      <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>

                      <div class="col-md-6 col-xs-10">
                          <input id="Nombres" name="nombres" placeholder="Nombres" class="form-control" required>
                      </div>
                </div></br></br>

                <div class="form-group">
                      <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>

                      <div class="col-md-6 col-xs-10">
                          <input id="Apellidos" name="apellidos" placeholder="Apellidos" class="form-control" required>
                      </div>
                </div></br></br>

                <div class="form-group">
                      <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-calendar bigicon"></i></span>

                      <div class="col-md-6 col-xs-10">
                          <input id="Fecha_Nacimiento" name="fecha_nacimiento" type ="date" placeholder="Fecha de Nacimiento" class="form-control" required>
                      </div>
                </div></br></br>

               <div class="form-group">
                    <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>

                    <div class="col-md-6 col-xs-10">
                        <select class="form-control" id="Sexo" name="sexo">
                          <option>MASCULINO</option>
                          <option>FEMENINO</option>
                        </select>
                    </div>
              </div></br></br>


              <div class="form-group">
                    <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-phone bigicon"></i></span>

                    <div class="col-md-6 col-xs-10">
                        <input id="Telefono" name="telefono" placeholder="Teléfono" class="form-control" required>
                    </div>
              </div></br></br>

                 <div class="form-group">
                      <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>

                      <div class="col-md-6 col-xs-10">
                          <input id="E_mail" name="correo" placeholder="E-Mail" class="E_mail" required>
                      </div>
                </div></br></br>


                <div class="form-group">
                      <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-home bigicon"></i></span>

                      <div class="col-md-6 col-xs-10">
                          <input id="Direccion" name="direccion" placeholder="dirección" class="form-control" required>
                      </div>
                </div></br></br>

                <div class="form-group">
                      <span class="col-md-1 col-xs-1 col-md-offset-2 text-center"><i class="fa fa-home bigicon"></i></span>

                      <div class="col-md-6 col-xs-10">
                          <select id="Estado" name="estado" class="form-control">
                              <option>Habilitado</option>
                              <option>Deshabilitado</option>
                          </select>

                      </div>
                </div></br></br>


                <div class="form-group">
                      <div class="col-md-12 text-center">
                          <input type="submit" style="width:80px" class="btn btn-success" align="center" class="form-control" value="Guardar">
                          <button type="reset" style="width:80px" class="btn btn-primary" class="form-control" >Limpiar</button>

                      </div>
                </div></br></br>
            </div>
            </fieldset>


       </form>

              </div>
              <input name="Id_Paciente" id="Id_Paciente" type="hidden" value="{{Auth::user()->dni}}">
            </div>

            <div class="modal-footer">
              
            </div>
      </div>

    </div>
  </div>
    
    
    <div class="modal fade" id="Mo_Registrar_Cita" role="dialog">
    <div class="modal-dialog">

      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title" align="center">Registrar Cita</h4>
        </div>
          <form role="form" method="get" action="/reservas_Almacenar" autocomplete="off">
            <input type="hidden" name="_token" value="{{csrf_token()}}">
            <div class="modal-body">

              <div id="Datos_Reserva">

              </div>
              <input name="Id_Paciente" id="Id_Paciente" type="hidden" value="{{Auth::user()->dni}}">
            </div>

            <div class="modal-footer">
              <input type="submit" class="btn btn-primary" value="Confirmar">
              <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
            </div>
          </form>
      </div>
    </div>
  </div>
    
   
  <div class="modal fade" id="Mo_Especialidades" role="dialog" >
    <div class="modal-dialog" role="document">
	<div class="modal-content">
            <div class="modal-header">
                    <h3 align="center" >Reservar una cita</h3><button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body"  align="center">
                <div id="Lista_Consultorios">
                </div>
            </div>
            <div class="modal-footer" style="display:block;margin-left:0%;">
              <button id="btn_Mostrar_Horario" style="width:250px"  type="button" class="btn btn-primary">Siguiente</button>
            </div>
	</div>
    </div>
</div>
  
  
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

       <script>
 $(document).ready(function() {
          $("#Editar_Informacion").click(function(event){
            event.preventDefault();
             $('#Mo_Editar_Informacion').modal({
             show: 'true'
           });
           });
           
        $("#Registrar_Cita").click(function(event){
         $.get('Listar_Especialidades', {}, function(responseText) {
             $('#Lista_Consultorios').empty();
             $('#Lista_Consultorios').append(responseText);
             $('#Mo_Especialidades').modal({
             show: 'true'
            });
         });  

        });
    });
</script>
<script>
$("#btn_Mostrar_Horario").click(function(event){
 $.get('Listar_Especialidades', {}, function(responseText) {
     $('#Lista_Consultorios').empty();
     $('#Lista_Consultorios').append(responseText);
     $('#Mo_Especialidades').modal({
     show: 'true'
    });
 });  
});
</script>
<script>
$("#btn_Mostrar_Horario").click(function(event){
    var Especialidad = $("#Especialidad_Cita").val();
 $.get('Recuperar_Horario', {Especialidad:Especialidad}, function(responseText) {
     alert(responseText);
     
 });  
});
</script>
</body>

</html>

