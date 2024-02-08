![제네릭](https://github.com/SungChanKwon/Java_/assets/157094708/d4a6ce19-d99f-4d3c-a5ac-23c0cb0560f7) 


class Box<T> {				//사과, 오렌지 담는 상자
	private T obj;
	
	void setObj(T obj) {  //타입이 같은 애들만 넣어줄 수 있음. 또한 그 아이를 상속하는 애들.
		this.obj = obj;   //
	}
	
	T getObj() {
		return obj;
	}
}


//메인 메서드에서 Box<Apple> abox = new Box();를 생성하면 제네릭에 의해서 위 클래스를 아래 클래스로 만들어주는것임

class Box<T> {				
	private Apple obj;
	
	void setObj(Apple obj) {  
		this.obj = obj;   
	}
	
	Apple getObj() {
		return obj;
	}
}

// ==> Box<Orange> bbox = new Box();

class Box<T>{  //사과,오렌지 담는 상자
   private Orange obj;
   
   void setObj(Orange  obj) {
      this.obj = obj;
   }
   
   Orange  getObj(){
      return obj;
   }
}

// ==> Box<Integer> ibox = new Box<Integer>();

class Box<T>{  //사과,오렌지 담는 상자
   private Integer obj;
   
   void setObj(Integer  obj) {
      this.obj = obj;
   }
   
   Integer  getObj(){
      return obj;
   }
}
