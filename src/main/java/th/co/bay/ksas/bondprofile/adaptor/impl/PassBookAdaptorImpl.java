//package th.co.bay.ksas.bondprofile.adaptor.impl;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.*;
//import org.springframework.web.client.RestTemplate;
//
//import th.co.bay.ksas.bondprofile.adaptor.PassBookAdaptor;
//import th.co.bay.ksas.bondprofile.model.property.TemplateAdaptorProperties;
//
//
//
//
//@Configuration
//@Slf4j
//public class PassBookAdaptorImpl  implements PassBookAdaptor {
//
//
//    private final TemplateAdaptorProperties templateAdaptorProperties;
//
//
//    @Autowired
//    @Qualifier("passBookRestTemplate")
//    private RestTemplate restTemplate;
//
//    public PassBookAdaptorImpl(TemplateAdaptorProperties templateAdaptorProperties, @Qualifier("passBookRestTemplate") RestTemplate restTemplate) {
//        this.templateAdaptorProperties = templateAdaptorProperties;
//        this.restTemplate = restTemplate;
//    }
//
//    @Override
//    public ResponseEntity<String> createTxn(String body) {
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<String> httpEntity = new HttpEntity<>(body, httpHeaders);
//        return super.exchange(templateAdaptorProperties.getOutbound().getCreateTxn(), HttpMethod.POST, httpEntity);
//
//    }
//
//
//    @Override
//    protected RestTemplate getRestTemplate() {
//        return restTemplate;
//    }
//}
