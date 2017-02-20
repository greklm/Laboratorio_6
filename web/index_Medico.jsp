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
                        <a href="Inicio_Sesion.jsp">Cerrar Sesion</a>
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
                        <h1>Centro Medico UNSAAC</h1>
                        <h3>SIEMPRE A TU SERVICIO</h3>
                        <hr class="intro-divider">  
                    </div>
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.intro-header -->

    <!-- Page Content -->
<section id="services">
    <div class="content-section-a">

        <div class="container">
            <div class="row">
                
                    <div class="col-lg-12 col-sm-12" >
                        <div align="center" class="dataTable_wrapper table-responsive" id="Mantenimiento_Contenido">
                            
                            <h1 id="Titulo_Mantenimiento"></h1>
                            <button id="btn_Agregar" hidden="hidden">Agregar Nuevo</button></br></br>
                            <input type="hidden" id="Nombre_Tabla" value="">
                            <input type="hidden" class="Valores_Atributos" value="">
                            <input type="hidden" class="Valores_Parametros" value="">
                            <table class="table table-striped table-bordered table-hover" id="Tabla_Mantenimiento">
                                
                            </table>
                            
                            
                        </div>
                    </div>
                
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->
</section>
    
    <!-- /.content-section-a -->

 <div class="content-section-b">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">VISIÓN</h2>
                    <p class="lead">La Visión del Centro Universitario de Salud es constituirse en un Establecimiento de Salud de Primer Nivel de Atención, de prestigio, competitivo con otras instituciones del sector, por los logros en la calidad de atención y la satisfacción de las necesidades de los usuarios, con Recursos Humanos motivados, comprometidos, capacitados permanentemente y orgullosos de pertenecer a él, de infraestructura adecuada, equipos modernos, operativos y con proyección a la comunidad.</p>
                </div>
                <div class="col-lg-5 col-sm-pull-6  col-sm-6">
                    <img class="img-responsive" src="img/3.jpg" alt="">
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
                    <h2 class="section-heading">MISIÓN</h2>
                    <p class="lead">La Misión del Centro Universitario de Salud es brindar atención integral de salud, de tipo ambulatoria a la comunidad universitaria de la Universidad Nacional San Antonio Abad del Cusco, a través de prestaciones de prevención, promoción, recuperación y prestaciones sociales con equidad, solidaridad, eficacia, eficiencia y calidad, primando el empleo racional de los recursos humanos, económicos, materiales y tecnológicos, con la participación activa de la comunidad universitaria, siendo su compromiso el bienestar de la misma.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/c1.jpg" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>

    <!-- /.content-section-a -->

    <div class="banner">

        </div>
        <!-- /.container -->

    <!-- /.banner -->

    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <p class="copyright text-muted small">Universidad Nacional de San Antonio Abad del Cusco<br>
                        Av. de la Cultura, Nro. 733, Cusco - Perú - América Latina<br> 
                        Telf. 51.84.604100 - 51.84.604160 - Fax 51.84.238156<BR>
                        Apartado Postal Nro 921 - Cusco, Perú<br>
© 2012 webmaster@unsaac.edu.pe</p>
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

