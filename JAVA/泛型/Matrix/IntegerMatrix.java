package Matrix;

class IntegerMatrix extends GenericMatrix<Integer>{
    protected Integer add(Integer o1, Integer o2 ){
        return o1+o2;
    }
    protected Integer multiply(Integer o1, Integer o2){
        return o1*o2;
    }
    protected Integer zero(){
        return 0;
    }
}
