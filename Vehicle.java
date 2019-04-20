interface Vehicle {
    //default 동일한 패키지 내에서만 접근가능
    default void print(){
        System.out.println("vehicle");
    }
    static void blowHorn(){
        System.out.println("blowing horn");
    }
}