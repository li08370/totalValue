public class Value {
    int key, num;

    public Value(int key, int num) {
        this.key = key;
        this.num = num;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getNum() {
        return num;
    }

    public void updateNum() {
        this.num++;
    }

    public String toString(){
            String s = "Key: " + key;
            s += " num: " + num;
            return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Value){
            Value v = (Value) obj;
            if(key == v.getKey()){
                return true;
            }
        }
        return false;
    }
    public int compareTo(Object obj){
        if(obj instanceof Value){
            Value k = (Value) obj;
            Integer tKey = this.key;
            Integer oKey = k.key;
            return tKey.toString().compareTo(oKey.toString());
        }
        return -5;
    }

}
