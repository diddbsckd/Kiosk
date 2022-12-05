package cafekiosk;

class Bread {
	// 빵 종류, 가격
	int saltbread = 4000;		// 소금빵
	int Croissant = 4500;		// 크로와상
	int madeleine = 3000;		// 마들렌
	int scone = 3500;			// 스콘
	int eggtart = 3500;			// 에그타르트
	
	
	// 옵션
	boolean isCutting; 			// 잘라줄까
	boolean isHeat;				// 데워줄까
	int breadChoice = 0;		// 빵 선택
	int breadOrder = 0;			// 빵을 주문 할거니?
	
	public int getSaltbread() {
		return saltbread;
	}
	
	public int getCroissant() {
		return Croissant;
	}
	
	public int getMadeleine() {
		return madeleine;
	}
	
	public int getScone() {
		return scone;
	}
	
	public int getEggtart() {
		return eggtart;
	}
	
	public int getBreadChoice() {
		return breadChoice;
	}
	public void setBreadChoice(int breadChoice) {
		this.breadChoice = breadChoice;
	}
	public boolean isCutting() {
		return isCutting;
	}
	public void setCutting(boolean isCutting) {
		this.isCutting = isCutting;
	}
	public boolean isHeat() {
		return isHeat;
	}
	public void setHeat(boolean isHeat) {
		this.isHeat = isHeat;
	}
	
	public int getBreadOrder() {
		return breadOrder;
	}

	public void setBreadOrder(int breadOrder) {
		this.breadOrder = breadOrder;
	}

	@Override
	public String toString() {
		return "Bread \n1.소금빵   : " + saltbread + "원\n" + "2.크로와상  : " + Croissant + "원\n" + "3.마들렌   : " + madeleine + "원\n" + 
	"4.스콘     : " + scone + "원\n" + "5.에그타르트 : " + eggtart + "원";
	}
	
	
}
