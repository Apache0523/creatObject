/**
 * Created by xulin5
 * 2019/4/1 16:32
 * 代理类
 */
public class Proxy implements LetOutService{
    @Override
    public Integer letOut(){
        LandLady landLady = new LandLady();
        Integer money = landLady.letOut();
        return money+100;
    }
}
