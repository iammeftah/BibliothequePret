package wav.hmed.microservicepret.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-livre", url = "https://bibliothequelivre.onrender.com")
public interface LivreClient {

    @GetMapping("/livres/{id}")
    String getLivreDetails(@PathVariable Long id);
}