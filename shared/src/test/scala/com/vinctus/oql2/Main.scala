package com.vinctus.oql2

object Main extends App with StudentDB {

  println(db.ds.schema(db.model) mkString "\n\n")
  db.showQuery()
  println(test("student { * classes { * students <name> } <name> } [name = 'John']"))

}
