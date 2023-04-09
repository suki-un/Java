public class GuKe {
    private CaiDan caidan;

    public GuKe(CaiDan caidan) {
        this.caidan = caidan;
    }

    public GuKe() {
    }

    public CaiDan getCaidan() {
        return caidan;
    }

    public void setCaidan(CaiDan caidan) {
        this.caidan = caidan;
    }
    public void add(){
        caidan.XiHongShi();
        caidan.ShuiZhuYu();
    }
}


