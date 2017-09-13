package io.github.bibekshakya35.avro.dowjone;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by bibek on 8/9/17.
 */

public class DowJoneCollection implements Serializable {
    @JsonProperty("an")
    private String accessNumber;
    @JsonProperty("art")
    private String artText;
    @JsonProperty("action")
    private String action;
    @JsonProperty("publication_date")
    private Date publicatedOn;
    @JsonProperty("credit")
    private String creditText;
    @JsonProperty("byline")
    private String byLine;
    @JsonProperty("document_type")
    private String documentType;
    @JsonProperty("language_code")
    private String languageCode;
    private String title;
    private String body;
    private String snippet;
    private String copyright;
    private String dateline;
    @JsonProperty("source_code")
    private String sourceCode;
    @JsonProperty("region_of_origin")
    private String publisherOriginRegion;
    @JsonProperty("publisher_name")
    private String publisherName;
    @JsonProperty("word_count")
    private String wordCount;
    @JsonProperty("company_codes")
    private String companyCodes;
    @JsonProperty("subject_codes")
    private String subjectCodes;
    @JsonProperty("region_codes")
    private String regionCodes;
    @JsonProperty("industry_codes")
    private String industryCodes;
    @JsonProperty("person_codes")
    private String personCodes;
    @JsonProperty("market_index_codes")
    private String marketIndexCodes;
    @JsonProperty("currency_codes")
    private String currencyCodes;

    public String getAccessNumber() {
        return accessNumber;
    }

    public void setAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
    }

    public String getArtText() {
        return artText;
    }

    public void setArtText(String artText) {
        this.artText = artText;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getPublicatedOn() {
        return publicatedOn;
    }

    public void setPublicatedOn(Date publicatedOn) {
        this.publicatedOn = publicatedOn;
    }

    public String getCreditText() {
        return creditText;
    }

    public void setCreditText(String creditText) {
        this.creditText = creditText;
    }

    public String getByLine() {
        return byLine;
    }

    public void setByLine(String byLine) {
        this.byLine = byLine;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getPublisherOriginRegion() {
        return publisherOriginRegion;
    }

    public void setPublisherOriginRegion(String publisherOriginRegion) {
        this.publisherOriginRegion = publisherOriginRegion;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public String getCompanyCodes() {
        return companyCodes;
    }

    public void setCompanyCodes(String companyCodes) {
        this.companyCodes = companyCodes;
    }

    public String getSubjectCodes() {
        return subjectCodes;
    }

    public void setSubjectCodes(String subjectCodes) {
        this.subjectCodes = subjectCodes;
    }

    public String getRegionCodes() {
        return regionCodes;
    }

    public void setRegionCodes(String regionCodes) {
        this.regionCodes = regionCodes;
    }

    public String getIndustryCodes() {
        return industryCodes;
    }

    public void setIndustryCodes(String industryCodes) {
        this.industryCodes = industryCodes;
    }

    public String getPersonCodes() {
        return personCodes;
    }

    public void setPersonCodes(String personCodes) {
        this.personCodes = personCodes;
    }

    public String getMarketIndexCodes() {
        return marketIndexCodes;
    }

    public void setMarketIndexCodes(String marketIndexCodes) {
        this.marketIndexCodes = marketIndexCodes;
    }

    public String getCurrencyCodes() {
        return currencyCodes;
    }

    public void setCurrencyCodes(String currencyCodes) {
        this.currencyCodes = currencyCodes;
    }

    public DowJoneCollection(String accessNumber,String title, String body, Date publicatedOn, String byLine, String publisherName) {
        this.accessNumber=accessNumber;
        this.publicatedOn = publicatedOn;
        this.byLine = byLine;
        this.title = title;
        this.body = body;
        this.publisherName = publisherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DowJoneCollection that = (DowJoneCollection) o;

        return accessNumber.equals(that.accessNumber);
    }

    @Override
    public int hashCode() {
        return accessNumber.hashCode();
    }
}
