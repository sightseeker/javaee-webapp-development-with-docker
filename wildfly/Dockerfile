FROM jboss/wildfly

ENV JBOSS_HOME=/opt/jboss/wildfly

USER root
COPY assets/setup-wildfly.cli /tmp
ADD https://repo1.maven.org/maven2/mysql/mysql-connector-java/5.1.34/mysql-connector-java-5.1.34.jar /tmp
RUN chown jboss:jboss /tmp/setup-wildfly.cli /tmp/mysql-connector-java-5.1.34.jar

USER jboss
RUN /opt/jboss/wildfly/bin/add-user.sh admin password --silent
RUN ${JBOSS_HOME}/bin/jboss-cli.sh --file=/tmp/setup-wildfly.cli
RUN rm -rf /opt/jboss/wildfly/standalone/configuration/standalone_xml_history

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c", "standalone-full-ha.xml", "-Djboss.node.identifier=${NODE_ID:-node1"]
