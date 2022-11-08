package task05.lesson;

import task05.lesson.building.Building;

//Инкапсуляция - возможность скрытия реализации каких либо частей модуля или объекта от внешнего мира

public class Run {
    public static void main(String[] args) {
        Building building = new Building();
       /*  1 method. Плохой вариант, так как много связанных между собой данных
        int sum = 0;
        for (Material m: building.materails)
              {
            sum += m.cost;
        }
        System.out.println("1 method. price: " + sum);

        */

        /*2 method.
        System.out.println("2 method. price: " + building.getPrice());

         */

        //3 method.
        System.out.println("3 method. price: " + building.getCustomerPrice());


        /*Наследование - процесс, в ходе которого один объект может обретать свойства другого и добавлять к нему черты,
                         характерные только для него. Вводит иерархию "общее - частное"
         Альтернатива наследованию: - Агрегация (отношение, когда один объект является частью другого)
                                    - Композиция (отношение, когда объект является частью другого, и при этом не может
                                     принадлежать кому-то еще */

        /*Полиморфизм - свойство семантики системы типов, позволяющее обрабатывать значения разных типов идентичным
                        образом, то есть исполнять физически один и тот же код для разных типов*/
        /*Абстракция - использование только тех характеристик объекта, которые с достаточной точностью представляют его
                       в данной системе. Основная идея состоит в том, чтобы предоставить объект с минимальным набором
                       полей и методов и при этом с достаточной точностью для решаемой задачи */
    }
}
