package headfirst.others.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}