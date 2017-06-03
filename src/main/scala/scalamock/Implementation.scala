package scalamock

/**
  * Created by M.Kumar on 5/16/2017.
  */

import Countries.{ Value => Country }
import Player.PlayerId

trait DbConnectionPool
trait DatabaseConfig
trait SecurityManager
trait TransactionManager

class RealPlayerDatabase(
                          dbConnectionPool: DbConnectionPool,
                          databaseConfig: DatabaseConfig,
                          securityManager: SecurityManager,
                          transactionManager: TransactionManager) extends PlayerDatabase {

  override def getPlayerById(playerId: PlayerId) = ???
}

class RealCountryLeaderboard(
                              dbConnectionPool: DbConnectionPool,
                              databaseConfig: DatabaseConfig,
                              transactionManager: TransactionManager) extends CountryLeaderboard {

  override def addVictoryForCountry(country: Country): Unit = ???
  override def getTopCountries: List[CountryLeaderboardEntry] = ???
}