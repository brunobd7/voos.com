<%-- 
    Document   : contaUsuario
    Created on : 25/11/2017, 20:37:43
    Author     : Lenovo
--%>
<jsp:useBean id="fac" class="Controle.Usuario"/>
<%@include file="/commons/head.jsp" %>
<body>
  <div class="global-wrap">
    <%@include file="/commons/header.jsp" %>
        <div class="container">
            <h1 class="page-title">Atualiza��o de conta</h1>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-14">
                    <div class="row">
                        <div class="col-md-10">
                          <%=fac.getUsuarioSingle(request)%>
                        </div>
                    </div>

                </div>
            </div>
        </div>



        <div class="gap"></div>
        <footer id="main-footer">
      <div class="container">
         <div class="row row-wrap">
            <div class="col-md-3">
               <a class="logo" href="index.html">
               <img src="http://www.kanzenshuu.com/wp-content/themes/kanzenshuu/images/logo_rof.png?x66125" alt="Image Alternative text" title="Image Title" />
               </a>
            </div>
         </div>
      </div>
   </footer>
   <script src="resources/js/jquery.js"></script>
   <script src="resources/js/bootstrap.js"></script>
   <script src="resources/js/slimmenu.js"></script>
   <script src="resources/js/bootstrap-datepicker.js"></script>
   <script src="resources/js/bootstrap-timepicker.js"></script>
   <script src="resources/js/nicescroll.js"></script>
   <script src="resources/js/dropit.js"></script>
   <script src="resources/js/ionrangeslider.js"></script>
   <script src="resources/js/icheck.js"></script>
   <script src="resources/js/fotorama.js"></script>
   <script src="resources/js/typeahead.js"></script>
   <script src="resources/js/card-payment.js"></script>
   <script src="resources/js/magnific.js"></script>
   <script src="resources/js/owl-carousel.js"></script>
   <script src="resources/js/fitvids.js"></script>
   <script src="resources/js/tweet.js"></script>
   <script src="resources/js/countdown.js"></script>
   <script src="resources/js/gridrotator.js"></script>
   <script src="resources/js/custom.js"></script>
   <script src="resources/js/switcher.js"></script>
   </div>
    </div>
</body>

</html>



