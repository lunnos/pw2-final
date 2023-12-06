import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;



@ApplicationScoped
public class CalculatorConfig {

    @Inject
    @ConfigProperty(name = "calculator.welcomeMessage", defaultValue = "Bem-vindo à Calculadora")
    private String welcomeMessage;

    public String getWelcomeMessage() {
        return welcomeMessage;
    }
}
