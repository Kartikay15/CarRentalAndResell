package capstone.modleclasses;

public class ResellVariable {
    private Long variableID;
    private String name;
    private Double value;
    private String description;
    private Long createdBy;
    private String createdDate;
    private Long modifiedBy;
    private String modifiedDate;

    // Constructor
    public ResellVariable(Long variableID, String name, Double value, String description, Long createdBy, String createdDate, Long modifiedBy, String modifiedDate) {
        this.variableID = variableID;
        this.name = name;
        this.value = value;
        this.description = description;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    // Getters and Setters
    public Long getVariableID() {
        return variableID;
    }

    public void setVariableID(Long variableID) {
        this.variableID = variableID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}

