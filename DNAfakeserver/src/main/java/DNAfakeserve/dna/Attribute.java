package DNAfakeserve.dna;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by bibek on 8/11/17.
 */
public class Attribute {
    @JsonProperty("extraction_type")
    private String extractionType;
    private String status;

    public String getExtractionType() {
        return extractionType;
    }

    public void setExtractionType(String extractionType) {
        this.extractionType = extractionType;
    }
}
