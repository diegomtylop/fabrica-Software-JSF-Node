ECHO OFF
echo GENERA LA PAGINA DE ACCESO
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
call mustache datos.json maestroTemplate.jsf > pagAccesoGenerada.jsf
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
echo GENERA LA PAGINA DE CONTENIDO
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
echo -----------------------------------------
call mustache datos.json maestroTemplateC.jsf > pagContenidoGenerada.jsf
pause