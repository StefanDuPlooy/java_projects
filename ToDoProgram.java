package java_projects;

public class ToDoProgram
{
    private int numIncomplete = 0;
    private int numComplete = 0;

    private String[] incompleteTasks = new String[numIncomplete];
    private String[] completeTasks = new String[numIncomplete];

    public ToDoProgram()
    {
    }

    public void addTask(String task)
    {
        numIncomplete++;
        
        if(incompleteTasks[0] == null)
        {
            incompleteTasks[0] = task;
        }
        else
        {
            incompleteTasks[numIncomplete] = task;
        }
    }

    public void completeTask(int taskNum)
    {

    }
}