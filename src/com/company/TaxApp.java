package com.company;

public class TaxApp {
    private Tax tax;
    private ConsoleInputOutput consoleInputOutput;
    private Parser parser;

    public TaxApp(Tax tax, ConsoleInputOutput consoleInputOutput, Parser parser) {
        this.tax = tax;
        this.consoleInputOutput = consoleInputOutput;
        this.parser = parser;
    }

    public double getTotalTax() {
        double taxAmount;
        String input = consoleInputOutput.takeUserInputForAProduct();
        Products product =parser.getProduct(input);
        taxAmount=tax.totalTax(product);
        tax.display(product);
        return taxAmount;
    }
}
