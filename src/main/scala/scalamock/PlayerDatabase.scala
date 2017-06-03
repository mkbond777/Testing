package scalamock

import scalamock.Player.PlayerId

/**
  * Created by M.Kumar on 5/16/2017.
  */
trait PlayerDatabase {

  def getPlayerById(playerId: PlayerId): Player

}
