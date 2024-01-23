package Exercice1.TemplateMethodPattern;

public abstract class Plugin {
    public final void squeletteAlgorithme() {
        partie1();
        partie2();
    }

    protected abstract void partie1();
    protected abstract void partie2();
}