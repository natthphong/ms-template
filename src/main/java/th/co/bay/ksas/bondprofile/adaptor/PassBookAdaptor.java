package th.co.bay.ksas.bondprofile.adaptor;

import org.springframework.http.ResponseEntity;


public interface PassBookAdaptor {

    ResponseEntity<String> createTxn(String body);
}
