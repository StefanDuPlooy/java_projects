package java_projects;

public class Task 
{
    private String dateString;
    private int date;
    private String task;

    public Task()
    {

    }

    public void addTask(String task)
    {
        this.task = task;
    }

    public String getTask()
    {
        return task;
    }

    public void addDate(String date)
    {
        dateString = date;
    }

    public void convertDate()
    {
        //Must split year, month and day and add 0s to make int
    }

}
