package scalamock

import Countries.{Value => Country}

/**
  * Created by M.Kumar on 5/16/2017.
  */

object Player {
  type PlayerId = Int
}

import scalamock.Player.PlayerId

case class Player(id: PlayerId, nickname: String, country: Country)
