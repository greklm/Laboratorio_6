<%-- 
    Document   : index_Medico
    Created on : 19/02/2017, 03:23:54 PM
    Author     : GREG-PC
--%>

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
<style>
    .Hora_Cita_Libre:hover{
	background-color: blue;
	text-align: center;
	cursor: pointer;
}

.Hora_Cita_Ocupado:hover{
	background-color: red;
	text-align: center;
	cursor:not-allowed;
}
</style>
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
                <a class="navbar-brand topnav" href="#">Centro M�dico</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#about" id="Listar_Citas">Atender Cita</a>
                    </li>
                    <li>
                        <a href="#services" id="Editar_Informacion">Editar Informaci�n Personal</a>
                    </li>
                    <li>
                        <a href="#contact" id="Recuperar_Historial">Ver historial m�dico</a>
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

        
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

    <div class="content-section-b">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">VISI�N</h2>
                    <p class="lead">La Visi�n del Centro Universitario de Salud es constituirse en un Establecimiento de Salud de Primer Nivel de Atenci�n, de prestigio, competitivo con otras instituciones del sector, por los logros en la calidad de atenci�n y la satisfacci�n de las necesidades de los usuarios, con Recursos Humanos motivados, comprometidos, capacitados permanentemente y orgullosos de pertenecer a �l, de infraestructura adecuada, equipos modernos, operativos y con proyecci�n a la comunidad.</p>
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
                    <h2 class="section-heading">MISI�N</h2>
                    <p class="lead">La Misi�n del Centro Universitario de Salud es brindar atenci�n integral de salud, de tipo ambulatoria a la comunidad universitaria de la Universidad Nacional San Antonio Abad del Cusco, a trav�s de prestaciones de prevenci�n, promoci�n, recuperaci�n y prestaciones sociales con equidad, solidaridad, eficacia, eficiencia y calidad, primando el empleo racional de los recursos humanos, econ�micos, materiales y tecnol�gicos, con la participaci�n activa de la comunidad universitaria, siendo su compromiso el bienestar de la misma.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/c1.jpg" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

	<a  name="contact"></a>
    <div class="banner">


    </div>
    <!-- /.banner -->

    <!-- Footer -->
    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <p class="copyright text-muted small">Universidad Nacional de San Antonio Abad del Cusco<br>
                        Av. de la Cultura, Nro. 733, Cusco - Per� - Am�rica Latina<br> 
                        Telf. 51.84.604100 - 51.84.604160 - Fax 51.84.238156<BR>
                        Apartado Postal Nro 921 - Cusco, Per�<br>
� 2012 webmaster@unsaac.edu.pe</p>
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
          <h4 class="modal-title" align="center">Informaci�n Personal</h4>
        </div>
         
            <div class="modal-body">

              <form role="form" method="post" action="/pacientes" autocomplete="off">
                <fieldset>
  
                <div id="Datos_Personales">
                </div>
                </fieldset>
              </form>

            </div>
      </div>

    </div>
  </div>
    
    
   
<div class="modal fade" id="Mo_Lista_Citas" role="dialog" >
    <div class="modal-dialog" role="document">
	<div class="modal-content">
            <div class="modal-header" align="center">
                    <label style="font-size: 20px">Reservar una cita</label><button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body"  align="center">
                <div id="Lista_Citas">
                </div>
            </div>
            <div class="modal-footer" style="display:block;margin-left:0%;">
              <button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
            </div>
	</div>
    </div>
</div>
  
  
  <div class="modal fade" id="Mo_Horario" role="dialog" >
    <div class="modal-dialog" role="document">
	<div class="modal-content">
            <div class="modal-header" align="center">
                    <label style="font-size: 20px">Horario</label><button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body"  align="center">
                <div id="Horario">
                </div>
            </div>
           
	</div>
    </div>
</div>
  <div class="modal fade" id="Mo_Registrar_Cita" role="dialog" >
    <div class="modal-dialog" role="document">
	<div class="modal-content">
            <div class="modal-header" align="center">
                    <label style="font-size: 20px">Datos de la cita</label><button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body"  align="center">
                <div id="Datos_Reserva">
                </div>
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
            $.get('Cargar_Datos_Personales_Paciente', {}, function(responseText) {
            
                $('#Datos_Personales').empty();
                $('#Datos_Personales').append(responseText);
                 $('#Mo_Editar_Informacion').modal({
                  show: 'true'
                });
               });
           });
           
        $("#Listar_Citas").click(function(event){
         $.get('Recuperar_Citas_Pendientes', {}, function(responseText) {
             $('#Lista_Citas').empty();
             $('#Lista_Citas').append(responseText);
             $('#Mo_Lista_Citas').modal({
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
     $('#Horario').empty();
     $('#Horario').append(responseText);
     $('#Mo_Horario').modal({
     show: 'true'
    });
     
 });  
});
$(document).on('click', '.Hora_Cita_Libre', function(event) { 
    var Id_Horario = $(this).attr("value");
    var Especialidad = $("#Especialidad_Cita").val();
 $.get('Recuperar_Datos_Cita', {Id_Horario:Id_Horario,Especialidad:Especialidad}, function(responseText) {
     $('#Datos_Reserva').empty();
     $('#Datos_Reserva').append(responseText);
     $('#Mo_Registrar_Cita').modal({
     show: 'true'
    });
 });  
});
</script>
<script>
    
</script>
</body>

</html>
