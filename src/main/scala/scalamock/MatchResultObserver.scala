package scalamock

import scalamock.Player.PlayerId

import Countries.{ Value => Country }

/**
  * Created by M.Kumar on 5/16/2017.
  */

case class MatchResult(winner: PlayerId, loser: PlayerId)

class MatchResultObserver(
                           playerDatabase: PlayerDatabase,
                           countryLeaderBoard: CountryLeaderboard) {

  def recordMatchResult(result: MatchResult): Unit = {
    val player = playerDatabase.getPlayerById(result.winner)
    countryLeaderBoard.addVictoryForCountry(player.country)
  }

}


