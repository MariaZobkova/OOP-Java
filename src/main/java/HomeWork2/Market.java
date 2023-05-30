package HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private final List<Actor> QueueToTake;
    private final List<Actor> QueueToGive;

    public List<Actor> getQueueToTake() {
        return QueueToTake;
    }

    public List<Actor> getQueueToGive() {
        return QueueToGive;
    }

    public Market() {
        QueueToTake = new ArrayList<>();
        QueueToGive = new ArrayList<>();
    }


    @Override
    public void acceptToMarket(Actor actor) { // Войти в магазин, добавляет актора в очередь
        if (!QueueToTake.contains(actor)){
            QueueToTake.add(actor);}
        else System.out.println(actor.getName() + " уже находится в очереди");

    }

    @Override
    public void releaseFromMarket(Actor actor) { // Выйти из магазина, автоматически закрыть заказ, выйти из очереди
        if (QueueToTake.contains(actor)){
            QueueToTake.remove(actor);}
        if (QueueToGive.contains(actor)){
            QueueToGive.remove(actor);}
        else System.out.println("Вас нет в очереди");
    }

    @Override
    public void update() {// обновляет статус

    }

    @Override
    public void takeInQueue(Actor actor) { // Добавляем актора в очередь
        acceptToMarket(actor);
    }

    @Override
    public void takeOrders(Actor actor) { // актор сделал заказ

        if (!QueueToTake.contains(actor)){
            System.out.println("Вы не можете сделать заказ. Сначала необходимо зайти в магазин");
        }
        else {
        System.out.println(String.format("Actor %s, %s, %s take order", actor.getName(), actor.getAge(), actor.getId()));
        QueueToGive.add(actor);
        QueueToTake.remove(actor);}

    }

    @Override
    public void giveOrders(Actor actor) { // актор забрал заказ и вышел из очереди

        if (!QueueToGive.contains(actor)) {
            System.out.println("Вы не можете забрать заказ. Необходимо сначала сделать заказ.");
        } else {
            System.out.println(String.format("Actor %s, %s, %s make order", actor.getName(), actor.getAge(), actor.getId()));
            QueueToGive.remove(actor);
        }
    }



    @Override
    public void releaseFromQueue(Actor actor) {// убирает актора из очереди и из магазина
        releaseFromMarket(actor);
    }

    public String orderStatus(Actor actor) {
        if (QueueToTake.contains(actor)) {
            return actor.getName() + " находится в очереди сделать заказ";
        }
        if (QueueToGive.contains(actor)) {
            return actor.getName() + " находится в очереди на получение заказа";
        }
        return actor.getName() + " не присоединился к очереди или уже получил заказ";
    }



}

