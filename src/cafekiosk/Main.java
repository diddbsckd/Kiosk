package cafekiosk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coffee cf = new Coffee();
		Bread br = new Bread();

		int flag; // 사용자가 선택한 값을 저장할 변수
		int totalPrice = 0; // 총 금액

		// 인사
		System.out.println("안녕하세요 JAVA COFFEE 입니다.");

		// 포장?
		while (true) {// 포장 while문 시작
			System.out.println("포장 : 1번, 매장 : 2번");
			System.out.print("입력 : ");
			flag = sc.nextInt();
			System.out.println();

			if (flag == 1) { // 포장 O
				cf.setTakeOut(1);
				break;
			} else if (flag == 2) { // 포장 X
				cf.setTakeOut(2);
				break;
			} else { // 1, 2 외에 다른 값 입력
				System.out.println("다시 입력해주세요.");
				continue;
			}
		} // 포장 while문 끝
		
		while (true) {
			System.out.println("음료를 주문하시겠습니까?");
			System.out.println("예 : 1, 아니오 : 2");
			cf.setDrinkOrder(sc.nextInt());
			if (cf.drinkOrder == 1) { // 음료 주문 O
				break;
			}
			if (cf.drinkOrder == 2) { // 음료 주문 X
				break;
			} else { // 1, 2 외에 다른 값 입력
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}

		while (cf.drinkOrder == 1) { // 음료 메뉴판 출력 while문 시작
			// 메뉴판 출력
			System.out.println("======음료 메뉴======");
			System.out.println(cf.toString()); // 메뉴판 부분
			System.out.println("===================");

			// 커피 선택
			System.out.print("입력 : ");
			cf.setDrinkChoice(sc.nextInt()); // 음료 선택 값 입력
			System.out.println();

			if (cf.drinkChoice == 1) { // 아메리카노
				totalPrice += cf.getAmericano();
				break;
			} else if (cf.drinkChoice == 2) { // 카페라떼
				totalPrice += cf.getCafelatte();
				break;
			} else if (cf.drinkChoice == 3) { // 바닐라라떼
				totalPrice += cf.getVanilalatte();
				break;
			} else if (cf.drinkChoice == 4) { // 자몽에이드
				totalPrice += cf.getZade();
				break;
			} else if (cf.drinkChoice == 5) { // 레몬에이드
				totalPrice += cf.getLade();
				break;
			} else { // 그 외
				System.out.println("다시 입력해주세요");
				continue;
			}
		} // 음료 메뉴판 while문 끝

		// 커피를 선택한 경우
		while (cf.drinkChoice == 1 || cf.drinkChoice == 2 || cf.drinkChoice == 3) { // 카페인, 디카페인 선택 while문 시작
			System.out.println("카페인 : 1, 디카페인 : 2");
			System.out.print("입력 : ");
			cf.setCaffeine(sc.nextInt());
			if (cf.caffeine == 1) { // 카페인
				break;
			} else if (cf.caffeine == 2) { // 디카페인
				break;
			} else { // 그 외
				System.out.println("다시 입력해주세요.");
				continue;
			}
		} // 커피 선택한 경우 카페인, 디카페인 while문 끝

		while (cf.caffeine == 1) {// 카페인 선택 후 샷 추가 시작
			System.out.println();
			System.out.println("카페인을 선택하셨습니다.");
			System.out.println();
			System.out.println("샷 추가 하시겠습니까?");
			System.out.println("샷 추가는 500원입니다.");
			System.out.println("예 : 1, 아니오 : 2");
			System.out.print("입력 : ");
			flag = sc.nextInt();
			System.out.println();
			
			if (flag == 1) { // 샷 추가를 선택한 경우
				System.out.println("추가할 샷 수를 입력해주세요");
				System.out.print("입력 : ");
				flag = sc.nextInt();
				System.out.println();
				cf.setShotCnt(flag);
				totalPrice += (cf.shotCnt * 500); // 추가한 샷 수 x 500원
				break;
			} else if (flag == 2) { // 샷 추가를 안하는 경우
				break;
			} else { // 그 외
				System.out.println("다시 입력해주세요");
				continue; // 반복문으로 다시 보냄
			}
		}
		
		while (cf.caffeine == 2) { // 디카페인 선택 후 if문 시작
			System.out.println();
			System.out.println("디카페인을 선택하셨습니다.");
			System.out.println();
			System.out.println("샷 추가 하시겠습니까?");
			System.out.println("예 : 1, 아니오 : 2");
			System.out.print("입력 : ");
			flag = sc.nextInt(); 
			System.out.println();
			
			if (flag == 1) { // 샷 추가를 선택한 경우
				System.out.println("추가할 샷 수를 입력해주세요");
				System.out.print("입력 : ");
				flag = sc.nextInt();
				System.out.println();
				cf.setShotCnt(flag);
				totalPrice += (cf.shotCnt * 500);
				break;
			} else if (flag == 2) {// 샷 추가를 안하는 경우
				break;
			} else {
				System.out.println("다시 입력해주세요");
				continue; // 반복문으로 다시 보냄
			}
		} // 커피 선택한 경우 while문 끝

		// Hot, Ice 선택
		while (cf.drinkChoice == 1 || cf.drinkChoice == 2 || cf.drinkChoice == 3) { // 커피 선택한 경우 hot, ice while문 시작
			System.out.println("Hot : 1번, Ice : 2번");
			System.out.print("입력 : ");
			flag = sc.nextInt();
			System.out.println();
			if (flag == 1) { // hot 선택
				System.out.println("Hot을 선택하셨습니다.");
				System.out.println();
				cf.isIce = 1;
				break;
			} else if (flag == 2) { // ice 선택
				System.out.println("Ice를 선택하셨습니다.");
				System.out.println();
				cf.isIce = 2;
				break;
			} else { // 1, 2 외의 숫자 입력
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}

		while (cf.drinkChoice == 4 || cf.drinkChoice == 5) { // 에이드를 선택한 경우
			System.out.println("에이드는 아이스만 제공됩니다.");
			System.out.println();
			break;
		}
		
		// 음료 주문 확인
		while (cf.drinkOrder == 1) { // 음료 주문 확인 while문 시작
			System.out.println("------주문확인------");
			if (cf.drinkChoice == 1) { // 아메리카노
				System.out.print("아메리카노 ");
			} else if (cf.drinkChoice == 2) { // 카페라떼
				System.out.print("카페라떼 ");
			} else if (cf.drinkChoice == 3) { // 바닐라라떼
				System.out.print("바닐라라떼 ");
			} else if (cf.drinkChoice == 4) { // 자몽에이드
				System.out.print("자몽에이드 ");
			} else if (cf.drinkChoice == 5) { // 레몬에이드
				System.out.print("레몬에이드 ");
			}
			if (cf.caffeine == 1) { // 카페인 선택
				System.out.print("카페인 ");
			} else if (cf.caffeine == 2 && (cf.drinkChoice == 1 || cf.drinkChoice == 2 || cf.drinkChoice == 3)) { // 디카페인 선택
				System.out.print("디카페인 "); 
			} else {
			}
			// Hot, Ice
			if (cf.isIce == 1) { // Hot 선택
				System.out.print("Hot ");
			} else if (cf.isIce == 2) { // Ice 선택
				System.out.print("Ice ");
			} else {
			}
			// 샷추가
			if (cf.shotCnt != 0) { // 샷 추가를 선택한 경우
				System.out.print(cf.shotCnt + "샷 추가"); // 샷 개수 출력
			} else {
			}
			System.out.println();
			System.out.println("------------------");
			break;
		} // 음료 주문 확인 while문 끝

		// 빵 주문
		while (true) { // 빵을 주문할건지 선택후 메뉴판 출력 while문 시작
			System.out.println();
			System.out.println("빵을 주문 하시겠습니까?");
			System.out.println("예 : 1, 아니오 : 2");
			System.out.print("입력 : ");
			br.setBreadOrder(sc.nextInt());
			System.out.println();
			
			if (br.breadOrder == 1) { // 빵 주문 O
				System.out.println("------빵 메뉴-----");
				System.out.println(br.toString()); // 빵 메뉴판 출력
				System.out.println("----------------");
				break;
			} else if (br.breadOrder == 2) { // 빵 주문 X
				break;
			} else { // 그 외
				System.out.println("다시 입력해주세요");
				continue;
			}
		} // 빵을 주문할건지 선택후 메뉴판 출력 while문 끝

		while (br.breadOrder == 1) { // 빵 주문 O 선택 후 while문 시작
			System.out.print("입력 : ");
			br.setBreadChoice(sc.nextInt());
			System.out.println();
			if (br.breadChoice == 1) { // 소금빵
				totalPrice += br.saltbread;
				break;
			} else if (br.breadChoice == 2) { // 크로와상
				totalPrice += br.Croissant;
				break;
			} else if (br.breadChoice == 3) { // 마들렌
				totalPrice += br.madeleine;
				break;
			} else if (br.breadChoice == 4) { // 스콘
				totalPrice += br.scone;
				break;
			} else if (br.breadChoice == 5) { // 에그타르트
				totalPrice += br.eggtart;
				break;
			} else { // 그 외
				System.out.println("다시 입력해주세요");
				continue;
			}
		} // 빵 주문? 예(1번)선택 while문 끝

		while (br.breadOrder == 2) {// 빵도 주문 X, 음료 주문 X while문
			if (cf.drinkOrder == 2 && br.breadOrder == 2) {// 빵도 주문 안하고 음료도 주문 안할때
				System.out.println("감사합니다."); // 종료
				break;
			} else {// 빵도 주문 안하고 음료도 주문 안할때 else문

				while (br.breadOrder == 2) { // 음료 주문 O, 빵 주문 X while문 시작
					System.out.println("총 금액 : " + totalPrice);
					System.out.print("내실 금액을 입력해주세요 : ");
					cf.setMoney(sc.nextInt());
					System.out.println();
					cf.setChange(cf.money - totalPrice);
					if (cf.change < 0) { // 낸 금액이 부족한 경우
						System.out.println("금액이 " + (totalPrice - cf.money) + "원 부족합니다.");
						System.out.println();
						continue;
					} else if (cf.change > 0) { // 낸 금액이 많은경우
						System.out.println("거스름돈 : " + cf.getChange());
						System.out.println();
						break;
					} else { // 금액을 정확히 낸 경우
						break;
					}
				} // 음료주문 O, 빵 주문 X while문 끝

				while (br.breadOrder == 2) {// 빵 주문 X 영수증 출력 while문 시작
					System.out.println("영수증을 출력하시겠습니까?");
					System.out.println("예 : 1, 아니오 : 2");
					System.out.print("입력 : ");
					flag = sc.nextInt();
					System.out.println();
					if (flag == 1) {
						// 영수증 출력
						// 음료 종류
						System.out.println("------영수증------");
						if (cf.drinkChoice == 1) { // 아메리카노
							System.out.println("아메리카노 : 4000원");
						} else if (cf.drinkChoice == 2) { // 카페라떼
							System.out.println("카페라떼 : 5000원");
						} else if (cf.drinkChoice == 3) { // 바닐라라떼
							System.out.println("바닐라라떼 : 5500원");
						} else if (cf.drinkChoice == 4) { // 자몽에이드
							System.out.println("자몽에이드 : 4000원");
						} else if (cf.drinkChoice == 5) { // 레몬에이드
							System.out.println("레몬에이드 : 4000원");
						}

						// 카페인, 디카페인
						if (cf.caffeine == 1) { // 카페인
							System.out.println("카페인");
						} else if (cf.caffeine == 2
								&& (cf.drinkChoice == 1 || cf.drinkChoice == 2 || cf.drinkChoice == 3)) { // 디카페인
							System.out.println("디카페인");
						} else {

						}

						// Hot, Ice
						if (cf.isIce == 1) { // Hot
							System.out.println("Hot");
						} else if (cf.isIce == 2) { // Ice
							System.out.println("Ice");
						} else {

						}

						// 샷추가
						if (cf.shotCnt != 0) { // 샷추가 가격
							System.out.println(cf.shotCnt + "샷 추가" + " : " + (cf.shotCnt * 500) + "원");
						} else {

						}

						// 포장, 매장
						if (cf.isTakeOut == 1) { // 포장
							System.out.println("포장");
						} else if (cf.isTakeOut == 2) { // 매장
							System.out.println("매장");
						}
						System.out.println("총 금액 : " + totalPrice + "원"); // 총액
						System.out.println("지불한 금액 : " + cf.money + "원"); // 받은 금액
						System.out.println("거스름돈 : " + cf.change + "원"); // 잔돈
						System.out.println("---------------");
						break;

					} else if (flag == 2) {
						System.out.println("감사합니다.");
						break;
					} else {
						System.out.println("다시 입력해주세요.");
						continue;
					}
				} // 빵 주문? 아니오(2번) 영수증 출력 while문 끝
				break;
			} // 빵도 주문 안하고 음료도 주문 안할때 else문 끝
		} // 빵도 주문 안하고 음료도 주문 안할때를 넣기위한 while문 끝
		
		// 빵 옵션 선택
		while (br.breadOrder == 1) { // 빵을 잘라드릴까요 while문 시작
			System.out.println("빵을 잘라드릴까요?");
			System.out.println("예 : 1, 아니오 : 2");
			System.out.print("입력 : ");
			flag = sc.nextInt();
			System.out.println();
			if (flag == 1) { // 자른다
				br.isCutting = true;
				break;
			} else if (flag == 2) { // 안자른다
				br.isCutting = false;
				break;
			} else { // 그 외
				System.out.println("다시 입력해주세요.");
				continue;
			}
		} // 빵을 잘라드릴까요 while문 끝

		while (br.breadOrder == 1) { // 빵을 데워드릴까요 while문 시작
			System.out.println("빵을 데워드릴까요?");
			System.out.println("예 : 1, 아니오 : 2");
			System.out.print("입력 : ");
			flag = sc.nextInt();
			System.out.println();
			if (flag == 1) { // 데운다
				br.isHeat = true;
				break;
			} else if (flag == 2) { // 안데운다
				br.isHeat = false;
				break;
			} else { // 그 외
				System.out.println("다시 입력해주세요.");
				continue;
			}
		} // 빵을 데워드릴까요 while문 끝

		
		while (br.breadOrder == 1) {// 빵 주문 확인 while문
			System.out.println("-------주문확인-------");
			// 빵 종류
			if (br.breadChoice == 1) { // 소금빵
				System.out.print("소금빵 ");
			} else if (br.breadChoice == 2) { // 크로와상
				System.out.print("크로와상 ");
			} else if (br.breadChoice == 3) { // 마들렌
				System.out.print("마들렌 ");
			} else if (br.breadChoice == 4) { // 스콘
				System.out.print("스콘 ");
			} else if (br.breadChoice == 5) { // 에그타르트
				System.out.print("에그타르트 ");
			}

			// 빵 옵션
			// 컷팅
			if (br.isCutting == true) { // 자른다
				System.out.print("잘라서 ");
			} else if (br.isCutting == false) { // 안자른다
				System.out.print("안잘라서 ");
			}

			// heat
			if (br.isHeat == true) { // 데워서
				System.out.println("데워서 ");
			} else if (br.isHeat == false) { // 안데워서
				System.out.println("안데워서");
			}
			System.out.println("--------------------");
			System.out.println();
			break;
		}// 빵 주문 확인 while문 끝
		
		
		while (br.breadOrder == 1) { // 빵 주문 o, 데워? 잘라? 선택 후 계산 while문 시작
			System.out.println("총 금액 : " + totalPrice + "원"); // 총액
			System.out.print("내실 금액을 입력해주세요 : ");
			cf.setMoney(sc.nextInt()); // 지불한 금액
			System.out.println();
			cf.setChange(cf.money - totalPrice);
			if (cf.change < 0) { // 지불한 금액이 총액보다 적은 경우
				System.out.println("금액이 " + (totalPrice - cf.money) + "원 부족합니다.");
				System.out.println();
				continue;
			} else if (cf.change > 0) { // 지불한 금액이 총액보다 많은 경우 거스름돈
				System.out.println("거스름돈 : " + cf.getChange() + "원");
				System.out.println();
				break;
			} else {
				break;
			}
		} // 빵 주문 o, 데워? 잘라? 선택 후 계산 while문 끝

		while (br.breadOrder == 1) { // 빵 주문 o, 데워? 잘라? 선택 후 계산 후 영수증 출력 while문 시작
			System.out.println("영수증을 출력하시겠습니까?");
			System.out.println("예 : 1, 아니오 : 2");
			System.out.print("입력 : ");
			flag = sc.nextInt();
			System.out.println();
			if (flag == 1) { // 영수증 출력 O
				System.out.println("------영수증------");
				// 음료 종류
				if (cf.drinkChoice == 1) { // 아메리카노
					System.out.println("아메리카노 : 4000원");
				} else if (cf.drinkChoice == 2) { // 카페라떼
					System.out.println("카페라떼 : 5000원");
				} else if (cf.drinkChoice == 3) { // 바닐라라떼
					System.out.println("바닐라라떼 : 5500원");
				} else if (cf.drinkChoice == 4) { // 자몽에이드
					System.out.println("자몽에이드 : 4000원");
				} else if (cf.drinkChoice == 5) { // 레몬에이드
					System.out.println("레몬에이드 : 4000원");
				}

				// 카페인, 디카페인
				if (cf.caffeine == 1) { // 카페인
					System.out.println("카페인");
				} else if (cf.caffeine == 2 && (cf.drinkChoice == 1 || cf.drinkChoice == 2 || cf.drinkChoice == 3)) { // 디카페인
					System.out.println("디카페인");
				} else {

				}

				// Hot, Ice
				if (cf.isIce == 1) { // Hot
					System.out.println("Hot");
				} else if (cf.isIce == 2) { // Ice
					System.out.println("Ice");
				} else {

				}

				// 샷추가
				if (cf.shotCnt != 0) { // 샷 추가
					System.out.println(cf.shotCnt + "샷 추가" + " : " + (cf.shotCnt * 500) + "원");
				} else {

				}

				// 빵 종류
				if (br.breadChoice == 1) { // 소금빵
					System.out.println("소금빵 : 4000원");
				} else if (br.breadChoice == 2) { // 크로와상
					System.out.println("크로와상 : 4500원");
				} else if (br.breadChoice == 3) { // 마들렌
					System.out.println("마들렌 : 3000원");
				} else if (br.breadChoice == 4) { // 스콘
					System.out.println("스콘 : 3500원");
				} else if (br.breadChoice == 5) { // 에그타르트
					System.out.println("에그타르트 : 3500원");
				}

				// 빵 옵션
				// 컷팅
				if (br.isCutting == true) { // 잘라서
					System.out.println("잘라서");
				} else if (br.isCutting == false) { // 안잘라서
					System.out.println("안잘라서");
				}

				// heat
				if (br.isHeat == true) { // 데워서
					System.out.println("데워서");
				} else if (br.isHeat == false) {	// 안데워서
					System.out.println("안데워서");
				}

				// 포장, 매장
				if (cf.isTakeOut == 1) { // 포장
					System.out.println("포장");
				} else if (cf.isTakeOut == 2) { // 매장
					System.out.println("매장");
				}
				System.out.println("총 금액 : " + totalPrice + "원"); // 총액
				System.out.println("지불한 금액 : " + cf.money + "원"); // 받은 금액
				System.out.println("거스름돈 : " + cf.change + "원"); // 거스름돈
				System.out.println("---------------");
				break;
			} else if (flag == 2) {
				System.out.println("감사합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		} // 빵 주문 o, 데워? 잘라? 선택 후 계산 후 영수증 출력 while문 끝
		sc.close();
	}
}
