package be.doeraene.spickling

package object jsany {
  implicit val builder: JSPBuilder.type = JSPBuilder
  implicit val reader: JSPReader.type = JSPReader
}
