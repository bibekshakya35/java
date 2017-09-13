package tsv;

import com.opencsv.bean.CsvBindByName;

/**
 * Created by bibek on 8/20/17.
 */
public class Visitors {
    @CsvBindByName(column = "#EntityType", required = true)
    private String entityType;
    @CsvBindByName(column = "ID", required = true)
    private long id;
    @CsvBindByName(column = "Term")
    private String term;
    @CsvBindByName(column = "Validate?")
    private String validate;
    @CsvBindByName(column = "Disambiguation+")
    private String disambiguationplus;
    @CsvBindByName(column = "Disambiguation-")
    private String disambiguationminus;
    @CsvBindByName(column = "DateModified")
    private String dateModified;
    @CsvBindByName(column = "Target")
    private String target;
    @CsvBindByName(column = "Disease")
    private String disease;
    @CsvBindByName(column = "Company")
    private String company;

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getDisambiguationplus() {
        return disambiguationplus;
    }

    public void setDisambiguationplus(String disambiguationplus) {
        this.disambiguationplus = disambiguationplus;
    }

    public String getDisambiguationminus() {
        return disambiguationminus;
    }

    public void setDisambiguationminus(String disambiguationminus) {
        this.disambiguationminus = disambiguationminus;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
