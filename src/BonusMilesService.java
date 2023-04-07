public class BonusMilesService {

    public int calculate(int cost) {
        int condition = 20;                  //сколько рублей за 1 милю
        int finalBonus = cost / condition;  //количество миль за билет
        return finalBonus;
    }

}