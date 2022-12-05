package cafekiosk;

class Coffee {
	// 커피 메뉴, 가격
	int americano = 4000;		// 아메리카노
	int cafelatte = 5000;		// 카페라떼
	int vanilalatte = 5500;		// 바닐라라떼
	int zade = 4000;			// 자몽에이드
	int lade = 4000;			// 레몬에이드
	
	// 커피 옵션
	int isIce;					// 아이스로?
	int isTakeOut;				// 포장?
	int caffeine;				// 카페인? 디카페인?
	int shotCnt; 				// 500원
	int drinkOrder;				// 음료를 주문 할거니?
	
	// 기타 옵션
	int money; // 손님이 내는 돈
	int change; // 잔돈
	int drinkChoice; // 음료 선택
	
	// 커피류 getter, setter
	public int getAmericano() {
		return americano;
	}
	public int getCafelatte() {
		return cafelatte;
	}
	public int getVanilalatte() {
		return vanilalatte;
	}
	public int getZade() {
		return zade;
	}
	public int getLade() {
		return lade;
	}
	
	// 옵션류 getter, setter
		
	public int isIce() {
		return isIce;
	}
	public void setIce(int isIce) {
		this.isIce = isIce;
	}
	public int isTakeOut() {
		return isTakeOut;
	}
	public void setTakeOut(int isTakeOut) {
		this.isTakeOut = isTakeOut;
	}
	public int caffeine() {
		return caffeine;
	}
	public void setCaffeine(int caffeine) {
		this.caffeine = caffeine;
	}
	public int getShotCnt() {
		return shotCnt;
	}
	public void setShotCnt(int shotCnt) {
		this.shotCnt = shotCnt;
	}
	
	public void option() {
		System.out.println("");
	}
	
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
	public int getDrinkChoice() {
		return drinkChoice;
	}
	public void setDrinkChoice(int drinkChoice) {
		this.drinkChoice = drinkChoice;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getDrinkOrder() {
		return drinkOrder;
	}
	public void setDrinkOrder(int drinkOrder) {
		this.drinkOrder = drinkOrder;
	}
	@Override
	public String toString() {
		return "Coffee\n1.아메리카노 : " + americano +"원" + "\n2.카페라떼  : " + cafelatte +"원" + "\n3.바닐라라떼 : " + vanilalatte + "원"
				+ "\n4.자몽에이드 : " + zade+ "원" + "\n5.레몬에이드 : " + lade + "원";}
	
	
	
	

}
