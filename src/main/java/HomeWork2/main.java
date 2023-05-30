package HomeWork2;

public class main {
    public static void main(String[] args) {

//        Реализовать класс Market и все методы, которые он обязан реализовывать.
//        Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди,
//        метод update – обновляет состояние магазина (принимает и отдаёт заказы)

        Actor Fedor = new Actor("Fedor", 32, 1L);
        Actor Maria = new Actor("Maria", 33, 2L);
        Actor Mira = new Actor("Mira", 17, 3L);

        Market market = new Market();
        market.acceptToMarket(Fedor);
        System.out.println(market.orderStatus(Fedor));
        market.acceptToMarket(Fedor);
        market.takeInQueue(Fedor);
        market.takeOrders(Fedor);
        System.out.println(market.orderStatus(Fedor));
        System.out.println(market.getQueueToGive());
        market.takeOrders(Maria);
        market.acceptToMarket(Maria);
        market.takeOrders(Maria);
        System.out.println(market.orderStatus(Maria));
        System.out.println(market.getQueueToGive());
        market.releaseFromMarket(Maria);
        System.out.println(market.getQueueToGive());



    }
}
