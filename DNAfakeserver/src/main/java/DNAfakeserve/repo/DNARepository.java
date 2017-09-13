package DNAfakeserve.repo;

import DNAfakeserve.dna.Response;
import DNAfakeserve.utils.JsonUtils;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

/**
 * Created by bibek on 8/11/17.
 */
@Repository
public class DNARepository {
    private static final String JOB_ID = "job_01";
    private static final String ROOT = "http://localhost:8080";
    private static final String JOB = ROOT+"/alpha/extractions/documents/";
    public Mono<Response> createAExtraction(){
        String responseStr = "{\n" +
                "    \"data\": {\n" +
                "        \"attributes\": {\n" +
                "            \"current_state\": \"JOB_STATE_RUNNING\",\n" +
                "            \"extraction_type\": \"documents\"\n" +
                "        },\n" +
                "        \"id\": \"job_GfvOtHm21ze2hTzUSMwTvPeR56vH\"\n" +
                "    },\n" +
                "    \"links\": {\n" +
                "        \"self\": \"++\"\n" +
                "    }\n" +
                "}";
        Response response = JsonUtils.fromJsonToObj(responseStr,Response.class);
        return Mono.justOrEmpty(response);
    }
    public Mono<Response> doError(){
        String error =
    }

}
