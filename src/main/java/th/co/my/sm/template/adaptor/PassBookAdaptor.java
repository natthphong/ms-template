package th.co.my.sm.template.adaptor;

import org.springframework.http.ResponseEntity;


public interface PassBookAdaptor {

    ResponseEntity<String> createTxn(String body);
}
