package template;

public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final  void play(){
		//��ʼ��
		initialize();
		//��ʼ��Ϸ
		startPlay();
		//������Ϸ
		endPlay();
	}
}
