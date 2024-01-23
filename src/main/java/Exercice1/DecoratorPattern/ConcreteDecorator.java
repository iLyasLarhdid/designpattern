package Exercice1.DecoratorPattern;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(ComponentInterface component) {
        super(component);
    }

    @Override
    public void traitement() {
        super.traitement();
    }
}
