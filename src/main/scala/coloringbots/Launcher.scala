package coloringbots

import coloringbots.bots.{ImmortalBot, SeqBotV2, SeqBot, RandomBot}

/**
 * User: rgordeev
 * Date: 19.12.14
 * Time: 16:29
 */
object Launcher extends App{
  private val timer: TimeZombi = new TimeZombi
  Game(Coord(5, 6), 35)
    .register(ImmortalBot("blue"))
    .register(RandomBot("red"))
    .register(RandomBot("green"))
    .register(SeqBot("yellow"))
    .register(SeqBotV2("orange"))
    .register(ChampionBot("pink"))
    .register(PrintZombi)
    .register(timer)
    .play
  println(timer)
}
