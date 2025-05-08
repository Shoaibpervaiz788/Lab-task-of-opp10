
abstract class VisitorPass {
  
    abstract int calculateTicketPrice(int numberOfVisitors);
}


class VIPPass extends VisitorPass {
    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 100; 
    }
}


class FamilyPass extends VisitorPass {
    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 50; 
    }
}


class GeneralPass extends VisitorPass {
    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 30;
    }
}


public class VisitorPassDemo {
    public static void main(String[] args) {
        
        VisitorPass vip = new VIPPass();
        VisitorPass family = new FamilyPass();
        VisitorPass general = new GeneralPass();

       
        int vipPrice = vip.calculateTicketPrice(2);        
        int familyPrice = family.calculateTicketPrice(4);  
        int generalPrice = general.calculateTicketPrice(3); 

        
        System.out.println("VIP Ticket Price: $" + vipPrice);
        System.out.println("Family Ticket Price: $" + familyPrice);
        System.out.println("General Ticket Price: $" + generalPrice);
    }
}
