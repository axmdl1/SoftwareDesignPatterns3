package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskList implements Iterable<String>{
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task){
        tasks.add(task);
    }

    @Override
    public Iterator<String> iterator() {
        return tasks.iterator();
    }
}
