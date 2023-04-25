import java.time.LocalDateTime;

class Job {
    public Job(String jobId, String description, String companyName, LocalDateTime lastDate) {
        this.jobId = jobId;
        this.description = description;
        this.companyName = companyName;
        this.lastDate = lastDate;
    }

    public String jobId, description, companyName;
    LocalDateTime lastDate;

}