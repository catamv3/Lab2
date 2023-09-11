package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Double.parseDouble;

public class HelloController {
    @FXML
    private Label annualInterestLabel;

    @FXML
    private Label numYearsLabel;

    @FXML
    private Label loanAmountLabel;

    @FXML
    private Label monthlyPaymentLabel;

    @FXML
    private Label totalPaymentLabel;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField annualInterestInp;

    @FXML
    private TextField numYearsInput;

    @FXML
    private TextField loanAmountInput;

    @FXML
    private Label monthlyPaymentDisplay;

    @FXML
    private Label totalPaymentDisplay;



    @FXML
    protected void calculatePayments(ActionEvent event){


        double interest = Double.parseDouble(annualInterestInp.getText());
        // =  Double.valueOf(intrst);
        double years = Double.parseDouble(numYearsInput.getText());

        double amount = Double.parseDouble(loanAmountInput.getText());

        double totalAmount = (((interest/100)+1)*(years*amount));
        double monthlyPay = totalAmount/12;
        totalPaymentDisplay.setText(String.valueOf(totalAmount));
        monthlyPaymentDisplay.setText(String.valueOf(monthlyPay));
    }






    }

