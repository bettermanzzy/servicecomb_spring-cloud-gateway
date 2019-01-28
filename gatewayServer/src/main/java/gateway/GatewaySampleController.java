package gateway;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.webflux.ProxyExchange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestSchema(schemaId = "gatewaySampleController")
//@RestController
public class GatewaySampleController {

    @Value("${remote.home}")
    private URI home;

    @GetMapping("/test")
    public String proxy() throws Exception {
//        Mono<ResponseEntity<byte[]>> result = proxy.uri(home.toString() + "/index.html").get();
        return "hello";
    }


}
