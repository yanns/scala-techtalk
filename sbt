#!/bin/sh

if test "$1" = "debug"; then
    JAVA_DEBUG_PORT="9998"
    shift
fi

if [ -z "${JAVA_DEBUG_PORT}" ]; then
    DEBUG_PARAMETERS=""
else
    DEBUG_PARAMETERS="-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=${JAVA_DEBUG_PORT}"
fi

if [ -z "$SBT_VERSION" ]
then
  SBT_VERSION=0.13.0
fi

SBT_LAUNCH_JAR=$HOME/.sbt/sbt-launch-$SBT_VERSION.jar

mkdir -p $HOME/.sbt

if [ ! -r $SBT_LAUNCH_JAR ]
then
  SBT_URL="http://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/sbt-launch/$SBT_VERSION/sbt-launch.jar"
  echo "Downloading sbt $SBT_VERSION from $SBT_URL"
  wget -q -O "$SBT_LAUNCH_JAR" $SBT_URL

  if [ ! -r $SBT_LAUNCH_JAR ]
  then
    echo "Unable to download file."
  fi
fi


java ${DEBUG_PARAMETERS} -Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=384M -jar $SBT_LAUNCH_JAR "$@"
