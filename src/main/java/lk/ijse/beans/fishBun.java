package lk.ijse.beans;

import lk.ijse.contract.BakeryItems;
import org.springframework.stereotype.Component;

@Component
public class fishBun implements BakeryItems {
    @Override
    public void foodLover() {
        System.out.println("mahesh love fish bun");
    }
}
