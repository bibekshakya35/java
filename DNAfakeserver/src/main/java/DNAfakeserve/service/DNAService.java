package DNAfakeserve.service;

import DNAfakeserve.dna.Response;
import DNAfakeserve.repo.DNARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by bibek on 8/11/17.
 */
@Service
public class DNAService {
    @Autowired
    private DNARepository dnaRepository;

    public Mono<ServerResponse> provideExtraction(ServerRequest
                                                   serverRequest){
        assert serverRequest.headers().contentType().isPresent();
        String contentType = serverRequest.headers().contentType().get().getParameter("Content-Type");
        List<String> userKey = serverRequest.headers().header("user-key");
        if (StringUtils.isEmpty(contentType)&&StringUtils.isEmpty(userKey)){
            return ServerResponse.badRequest().body(this.dnaRepository.doError(),Response.class);
        }
        return ServerResponse
                .ok().body(this.dnaRepository.createAExtraction(), Response.class);
    }
    public Mono<ServerResponse>
}
