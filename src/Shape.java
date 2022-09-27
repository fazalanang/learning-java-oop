class Shape {
    int getConner() {
        return 0;
    }
}
class Rectangel extends Shape {
    int getConner() {
        return 4;
    }
    int getParentConner(){
        return super.getConner();
    }
}
