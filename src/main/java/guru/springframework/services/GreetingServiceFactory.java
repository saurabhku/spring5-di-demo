package guru.springframework.services;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public void setGreetingRepository(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
            default:
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
        }
    }
}
