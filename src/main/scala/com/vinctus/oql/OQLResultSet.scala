package com.vinctus.oql

abstract class OQLResultSet {

  def next: Boolean

  /**
    * Gets the value of the column at zero-based index '`idx`' in the current row of this result set.
    *
    * @param idx zero-based column index
    * @return value of designated column
    */
  def get(idx: Int): OQLResultSetValue

  def getString(idx: Int): String

  def getResultSet(idx: Int): OQLResultSet

}

abstract class OQLResultSetValue { val value: Any }
