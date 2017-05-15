/**
  * Created by M.Kumar on 5/5/2017.
  */
object count {

  def main(args: Array[String]): Unit = {
    println(solution("Forget CVs..Save time . x x"))
  }

  def solution(s:String):Int = {
    val sentences=s.split("[?.!]")
    if(sentences.isEmpty)
      0
    sentences.map(x=>getWordCount(x.trim)).max
  }
  def getWordCount(sent:String):Int={
    if(sent.length == 0)
      0
    val wordsInSent = sent.split("\\s")
    wordsInSent.length
  }
}
