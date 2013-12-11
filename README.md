ScalaBug2.10.3
==============

Mockito and Scala NPE

    sbt run

    > run
    [info] Updating {file:/home/ezh/projects/specific/scalaBug/}scalabug...
    [info] Resolving org.fusesource.jansi#jansi;1.4 ...
    [info] Done updating.
    [info] Compiling 1 Scala source to /home/ezh/projects/specific/scalaBug/target/scala-2.10/classes...
    [info] Running Test
    [error] (run-main) java.lang.AssertionError: assertion failed
    java.lang.AssertionError: assertion failed
        at scala.Predef$.assert(Predef.scala:165)
        at Test$delayedInit$body.apply(Test.scala:14)
        at scala.Function0$class.apply$mcV$sp(Function0.scala:40)
        at scala.runtime.AbstractFunction0.apply$mcV$sp(AbstractFunction0.scala:12)
        at scala.App$$anonfun$main$1.apply(App.scala:71)
        at scala.App$$anonfun$main$1.apply(App.scala:71)
        at scala.collection.immutable.List.foreach(List.scala:318)
        at scala.collection.generic.TraversableForwarder$class.foreach(TraversableForwarder.scala:32)
        at scala.App$class.main(App.scala:71)
        at Test$.main(Test.scala:8)
        at Test.main(Test.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
        at java.lang.reflect.Method.invoke(Method.java:597)
