import org.example.four.Add4;
import org.example.four.AddDelete4;
import org.example.four.Delete4;
import org.junit.Test;

import java.util.ArrayList;

public class test4 {
    @Test
    public void AddAndDeleteTest(){
        ArrayList<Integer> list = new ArrayList<>();
        Add4 add4 = new Add4(list);
        Delete4 delete4 = new Delete4(list);
        delete4.start();
        add4.start();
        try {
            add4.join();
            delete4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    @Test
//    public void AddDeleteTest(){
//        ArrayList<Integer> list = new ArrayList<>();
//        AddDelete4 addDelete4 = new AddDelete4(list);
//        addDelete4.start();
//    }

//    @Test
//    public void AddDeleteCollectionsTest(){
//        ArrayList<Integer> list = new ArrayList<>();
//        AddDelete4 addDelete4 = new AddDelete4(list);
//        addDelete4.run();
//    }
}
