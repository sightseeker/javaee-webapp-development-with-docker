FROM gradle:jdk8 as build
COPY . /project
RUN gradle build

FROM sightseeker/wildfly-deployment-demo:11.0.0.Final
COPY deploy.cli /tmp
COPY --from=build /project/build/libs/webapp.war /tmp/
RUN /opt/jboss/wildfly/bin/jboss-cli.sh --file=/tmp/deploy.cli
