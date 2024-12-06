package capstone.modleclasses;

public class ChangeLog {
    private Long logID;
    private Long variableID;
    private String variableType;  // Rental or Resell
    private Double oldValue;
    private Double newValue;
    private String changeDate;
    private Long changedBy;
    private String changeType;
    private String description;

    // Constructor
    public ChangeLog(Long logID, Long variableID, String variableType, Double oldValue, Double newValue, String changeDate, Long changedBy, String changeType, String description) {
        this.logID = logID;
        this.variableID = variableID;
        this.variableType = variableType;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.changeDate = changeDate;
        this.changedBy = changedBy;
        this.changeType = changeType;
        this.description = description;
    }

    // Getters and Setters
    public Long getLogID() {
        return logID;
    }

    public void setLogID(Long logID) {
        this.logID = logID;
    }

    public Long getVariableID() {
        return variableID;
    }

    public void setVariableID(Long variableID) {
        this.variableID = variableID;
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public Double getOldValue() {
        return oldValue;
    }

    public void setOldValue(Double oldValue) {
        this.oldValue = oldValue;
    }

    public Double getNewValue() {
        return newValue;
    }

    public void setNewValue(Double newValue) {
        this.newValue = newValue;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public Long getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(Long changedBy) {
        this.changedBy = changedBy;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
