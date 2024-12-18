import java.time.LocalDate;

public class Task {
    private final String title;
    private final String priority;
    private final LocalDate dueDate;
    private final String status;

    public Task(String title, String priority, LocalDate dueDate, String status) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;

    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

    }

}

// TO DO: Lengkapi atribut-atribut private kelas Task

// TO DO: Buat constructor untuk kelas Task

// TO DO: Buat getter untuk title

// TO DO: Buat getter untuk priority

// TO DO: Buat getter untuk dueDate

// TO DO: Buat getter untuk status

// TO DO: Buat setter untuk status
