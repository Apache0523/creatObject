/**
 * Created by xulin5
 * 2019/4/1 16:29
 * 目标类
 */
public class LandLady implements LetOutService {
    @Override
    public Integer letOut(){
        System.out.println("房东方法开始......");
        return 100;
    }
}
