package org.example.sourceClass;

import java.util.Random;

public class Stomach extends OrgansOfTheBody{

    private int volume;


    public Stomach(){
        Random rand = new Random();
        final int arraySize[] = {200, 115, 130, 89, 666, 420, 50, 80};
        final int stomachType[] = {400, 123, 300, 250, 504, 120};

        this.weight = arraySize[rand.nextInt(8)];
        this.volume = stomachType[rand.nextInt(6)];
    }

    public String getFood(String kpd, String food){
        return digest(kpd, food);
    }

    private String digest(String kpd, String food){
        if(kpd == "Здоровый") {
            final String[] noseTypeMessageDigestPizza = {"Вкусно пахнет", "Оооо, мне такое нравится", "Ммм, вкусно"};
            final String[] noseTypeMessageDigestSoup = {"Как дома", "Самый лучший суп", "Просто прелесть"};
            final String[] noseTypeMessageDigestCoffee = {"Какой аромат", "Дааа, крутяг", "Пушка, а не кофе"};
            Random rand = new Random();

            if(food == "Пицца") {
                return noseTypeMessageDigestPizza[rand.nextInt(3)];
            }
            else if(food == "Суп"){
                return noseTypeMessageDigestSoup[rand.nextInt(3)];
            }
            else{
                return noseTypeMessageDigestCoffee[rand.nextInt(3)];
            }
        }
        else if(kpd == "Приболел"){
            final String[] noseTypeMessageDigestPizza = {"Ооой, не то", "Не лучший вариант", "Нормас"};
            final String[] noseTypeMessageDigestSoup = {"Самое то", "То что надо", "Просто прелесть"};
            final String[] noseTypeMessageDigestCoffee = {"Фууу горький", "Беее", "Хотелось бы чай"};
            Random rand = new Random();

            if(food == "Пицца") {
                return noseTypeMessageDigestPizza[rand.nextInt(3)];
            }
            else if(food == "Суп"){
                return noseTypeMessageDigestSoup[rand.nextInt(3)];
            }
            else{
                return noseTypeMessageDigestCoffee[rand.nextInt(3)];
            }
        }
        else{
            final String[] noseTypeMessageDigestPizza = {"Что это за лепёха?", "Убери это", "Фуу"};
            final String[] noseTypeMessageDigestSoup = {"Шооо за кампот?", "Отврат", "Сам попей такое"};
            final String[] noseTypeMessageDigestCoffee = {"Чёрное, как ...", "Кисель?", "Я вылью это на улицу"};
            Random rand = new Random();

            if(food == "Пицца") {
                return noseTypeMessageDigestPizza[rand.nextInt(3)];
            }
            else if(food == "Суп"){
                return noseTypeMessageDigestSoup[rand.nextInt(3)];
            }
            else{
                return noseTypeMessageDigestCoffee[rand.nextInt(3)];
            }
        }
    }


    public void setParameter(){
        Random rand = new Random();
        final int arraySize[] = {200, 115, 130, 89, 666, 420, 50, 80};
        final int stomachType[] = {400, 123, 300, 250, 504, 120};

        this.weight = arraySize[rand.nextInt(8)];
        this.volume = stomachType[rand.nextInt(6)];
    }

    public int getVolume(){
        return this.volume;
    }

}
