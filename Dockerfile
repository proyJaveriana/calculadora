#######################################################################
#		DOCKERFILE PARA LA CALCULADORA			      #
#######################################################################

FROM oracle/glassfish

ADD ["api.war","$GLASSFISH_HOME/glassfish/domains/domain1/autodeploy/"]
