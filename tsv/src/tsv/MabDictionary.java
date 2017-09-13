package tsv;

/**
 * Created by bibek on 8/20/17.
 */
public class MabDictionary {
    private String entityType;
    private String id;
    private String term;
    private String validate;
    private String disambiguationplus;
    private String disambiguationminus;
    private String dateModified;
    private String target;
    private String disease;
    private String company;

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public MabDictionary(String entityType, String id, String term, String validate, String disambiguationplus, String disambiguationminus, String dateModified, String target, String disease, String company) {
        this.entityType = entityType;
        this.id = id;
        this.term = term;
        this.validate = validate;
        this.disambiguationplus = disambiguationplus;
        this.disambiguationminus = disambiguationminus;
        this.dateModified = dateModified;
        this.target = target;
        this.disease = disease;
        this.company = company;
    }

    @Override
    public String toString() {
        return "MabDictionary{" +
                "entityType='" + entityType + '\'' +
                ", id=" + id +
                ", term='" + term + '\'' +
                ", validate='" + validate + '\'' +
                ", disambiguationplus='" + disambiguationplus + '\'' +
                ", disambiguationminus='" + disambiguationminus + '\'' +
                ", dateModified='" + dateModified + '\'' +
                ", target='" + target + '\'' +
                ", disease='" + disease + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
