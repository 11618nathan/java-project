
class English{
	public String word;
	public String idiom;
	public String pronunciation;
	public String exSentence;
	
	public String getWord(String word) {
		if(word == \W)
			System.out.println(word + "와 일치하는 단어가 없습니다.");
			return word;
	}
	public String getIdiom() {
		return idiom;
	}
	public String getPronunciation() {
		return pronunciation;
	}
	public String getExSentence() {
		return exSentence;
	}
	
	public English(){
		System.out.println("English() 호출");
	}
	public English(String word, String idiom, String pronunciation, String exSentence) {
		super();
		this.word = word;
		this.idiom = idiom;
		this.pronunciation = pronunciation;
		this.exSentence = exSentence;
	}
	
	public void show(){
		System.out.println(this.word + " [ " + this.pronunciation + " ]"
							+ this.idiom + this.exSentence);
	}
	
}

public class EngKorDic {

	public static void main(String[] args) {
		English [] English;
		
		
	}

}
