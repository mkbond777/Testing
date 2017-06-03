package scalamock

import Countries.{Value => Country}

/**
  * Created by M.Kumar on 5/16/2017.
  */

case class CountryLeaderboardEntry(country: Country, points: Int)

trait CountryLeaderboard {

  def addVictoryForCountry(country: Country): Unit
  def getTopCountries: List[CountryLeaderboardEntry]

}
