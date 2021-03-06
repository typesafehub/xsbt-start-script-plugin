import com.typesafe.startscript.StartScriptPlugin
import com.github.siasia.WebPlugin

seq(StartScriptPlugin.startScriptForWarSettings: _*)

seq(WebPlugin.webSettings: _*)

version := "0.1"

libraryDependencies ++= Seq("javax.servlet" % "servlet-api" % "2.5" % "provided",
                            "org.eclipse.jetty" % "jetty-webapp" % "7.3.1.v20110307" % "container")
