package wav.hmed.microservicepret.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-utilisateur", url = "https://bibliothequeutilisateur.onrender.com")
public interface UserClient {

    @GetMapping("/utilisateurs/{id}")
    String getUserDetails(@PathVariable Long id);
}