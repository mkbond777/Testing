package scalamock

import org.scalamock.scalatest.MockFactory
import org.scalatest.FunSuite

/**
  * Created by M.Kumar on 5/16/2017.
  */
class MatchResultObserverTest extends FunSuite with MockFactory {


  val winner = Player(id = 222, nickname = "boris", country = Countries.Russia)
  val loser = Player(id = 333, nickname = "hans", country = Countries.Germany)

  test("testRecordMatchResult") {
    val countryLeaderBoardMock = mock[CountryLeaderboard]
    val userDetailsServiceStub = stub[PlayerDatabase]

    // set expectations
    (countryLeaderBoardMock.addVictoryForCountry _).expects(Countries.Russia)

    (userDetailsServiceStub.getPlayerById _).when(loser.id).returns(loser)
    (userDetailsServiceStub.getPlayerById _).when(winner.id).returns(winner)

    val matchResultObserver = new MatchResultObserver(userDetailsServiceStub, countryLeaderBoardMock)
    matchResultObserver.recordMatchResult(MatchResult(winner = winner.id, loser = loser.id))
  }

}
