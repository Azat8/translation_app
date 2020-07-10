package application.models;

public class Translation {
	public String _id;
	public String word;
	public String createdAt;
	public String updatedAt;
	public TranslationInner firstTranslation, secondTranslation;
	public String firstTrans, secondTrans, firstTransKey, secondTransKey;
	
	public String get_Id() {
		return this._id;
	}
	
	public void set_Id(String _id) {
		this._id = _id;
	}
	
	public String getWord() {
		return this.word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public String getFirstTrans() {
		return this.firstTranslation.trans;
	}
	
	public void setFirstTrans(TranslationInner firstTranslation) {
		this.firstTrans = firstTranslation.trans;
	}
	
	public String getSecondTrans() {
		return this.secondTranslation.trans;
	}
	
	public void setSecondTrans(TranslationInner secondTranslation) {
		this.secondTrans = secondTranslation.trans;
	}
}
