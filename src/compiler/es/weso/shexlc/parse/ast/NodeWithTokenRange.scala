//------------------------------------------------------------------------------
// File: NodeWithTokenRange.scala
//
// Short version for non-lawyers:
//
// The ShEx Lite Project is dual-licensed under GNU 3.0 and
// MIT terms.
//
// Longer version:
//
// Copyrights in the ShEx Lite project are retained by their contributors. No
// copyright assignment is required to contribute to the ShEx Lite project.
//
// Some files include explicit copyright notices and/or license notices.
// For full authorship information, see the version control history.
//
// Except as otherwise noted (below and/or in individual files), ShEx Lite is
// licensed under the GNU, Version 3.0 <LICENSE-GNU> or
// <https://choosealicense.com/licenses/gpl-3.0/> or the MIT license
// <LICENSE-MIT> or <http://opensource.org/licenses/MIT>, at your option.
// In case of incompatibility between project licenses, GNU/GPLv3 will be
// applied.
//
// The ShEx Lite Project includes packages written by third parties.
//------------------------------------------------------------------------------

package es.weso.shexlc.parse.ast

import org.antlr.v4.runtime.misc.Interval

/**
  * A node with range is a node that contains an antlr interval, which is the
  * range of tokens that generate the node.
  *
  * @author Guillermo Facundo Colunga
  */
trait NodeWithTokenRange {

  /**
    * Gets the range of tokens from the source on which the node was generated.
    *
    * @return the range of tokens from the source on which the node was
    *         generated.
    */
  def getRange: Interval

  /**
    * Gets the content of the node as a String, for example for a node that
    * contains the assignment of a and 3 the content
    * would be 'a = 3'.
    *
    * @return the content of the node as a String.
    */
  def getContent: String
}
