package com.example.android.quizapp;

import android.support.annotation.Px;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.R.attr.x;

/**
 * This app is IT Security Quiz
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the end test button is clicked.
     */
    public void end_Test(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //Called question checking methods
        question_1();
        question_2();
        question_3();
        question_4();
        question_5();
        question_6();
        question_7();
        question_8();
        question_9();
        question_10();

        // Display the test result on the screen
        String test_result = createTestResult(name, score);
        displayResult(test_result);

        // Disabled "End Test" button after clicking on it.
        Button endTestButton = (Button) findViewById(R.id.end_test_button);
        endTestButton.setEnabled(false);
    }

    /**
     * Create summary of the test result.
     *
     * @param name of the passing the test
     * @param score of the counting of right answers
     * @return text of the test result
     */
    private String createTestResult(String name, int score) {
        String test_result = getString(R.string.test_result_name) + name;
        test_result += "\n" + getString(R.string.test_result_score) + score;
        return test_result;
    }

    /**
     * Confirming the best 2 answers for Question 1
     */
    public void question_1() {
        // Figure out if the user chose "Coal" answer
        CheckBox CoalCheckBox = (CheckBox) findViewById(R.id.Coal_checkbox);
        boolean hasCoal = CoalCheckBox.isChecked();

        if (hasCoal) {
            increment_score();
        }

        // Figure out if the user chose "Uranium" answer
        CheckBox UraniumCheckBox = (CheckBox) findViewById(R.id.Uranium_checkbox);
        boolean hasUranium = UraniumCheckBox.isChecked();

        if (hasUranium) {
            increment_score();
        }

    }

    /**
     Confirming the best 2 answers for Question 2
     */
    public void question_2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_2);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_2_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_1_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_4_radiobutton);
        }
    }

    /**
     Confirming the best answers for Question 3
     */
    public void question_3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.wood_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.wood_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.oil_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.natural_gas_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.petrol_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.diesel_radiobutton);
        }
    }

    /**
     Confirming the best 3 answers for Question 4
     */
    public void question_4() {

        CheckBox Option1CheckBox = (CheckBox) findViewById(R.id.answer41);
        boolean hasOption1 = Option1CheckBox.isChecked();

        if (hasOption1) {
            increment_score();
        }


        CheckBox Option2CheckBox = (CheckBox) findViewById(R.id.answer42);
        boolean hasOption2 = Option2CheckBox.isChecked();

        if (hasOption2) {
            increment_score();
        }


        CheckBox Option4CheckBox = (CheckBox) findViewById(R.id.answer44);
        boolean hasOption4 = Option4CheckBox.isChecked();

        if (hasOption4) {
            increment_score();
        }
    }

    /**
     Confirming the best answers for Question 5
     */
    public void question_5() {

           CheckBox Answer_5_1_CheckBox = (CheckBox) findViewById(R.id.answer_5_1_checkbox);
        boolean hasAnswer_5_1_CheckBox = Answer_5_1_CheckBox.isChecked();

        if (hasAnswer_5_1_CheckBox) {
            increment_score();
        }


        CheckBox Answer_5_3_CheckBox = (CheckBox) findViewById(R.id.answer_5_3_checkbox);
        boolean hasAnswer_5_3_CheckBox = Answer_5_3_CheckBox.isChecked();

        if (hasAnswer_5_3_CheckBox) {
            increment_score();
        }

            CheckBox Answer_5_2_CheckBox = (CheckBox) findViewById(R.id.answer_5_2_checkbox);
        boolean hasAnswer_5_2_CheckBox = Answer_5_2_CheckBox.isChecked();

        if (hasAnswer_5_2_CheckBox) {
            increment_score();
        }

        CheckBox Answer_5_5_CheckBox = (CheckBox) findViewById(R.id.answer_5_5_checkbox);
        boolean hasAnswer_5_5_CheckBox = Answer_5_5_CheckBox.isChecked();

        if (hasAnswer_5_5_CheckBox) {
            increment_score();
        }
    }

    /**
    picking and confirming the right answers to question 6
     */
    public void question_6() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_6);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_6_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_6_1_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_6_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_6_5_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_6_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_6_4_radiobutton);
        }
    }

    /**
     * This method also confirm the correct answer to questions 7
     */
    public void question_7() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_7);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_7_2_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_7_2_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_7_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_7_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_7_4_radiobutton);
        }
    }

    /**
     picking best answers for question 8
     */
    public void question_8() {

        CheckBox Answer_8_1_CheckBox = (CheckBox) findViewById(R.id.answer_8_1_checkbox);
        boolean hasAnswer_8_1_CheckBox = Answer_8_1_CheckBox.isChecked();

        if (hasAnswer_8_1_CheckBox) {
            increment_score();
        }


        CheckBox Answer_8_2_CheckBox = (CheckBox) findViewById(R.id.answer_8_2_checkbox);
        boolean hasAnswer_8_2_CheckBox = Answer_8_2_CheckBox.isChecked();

        if (hasAnswer_8_2_CheckBox) {
            increment_score();
        }


        CheckBox Answer_8_5_CheckBox = (CheckBox) findViewById(R.id.answer_8_5_checkbox);
        boolean hasAnswer_8_5_CheckBox =  Answer_8_5_CheckBox.isChecked();

        if (hasAnswer_8_5_CheckBox) {
            increment_score();
        }
    }

    /**
     Method for questions 9
     */
    public void question_9() {

        CheckBox Answer_9_1_CheckBox = (CheckBox) findViewById(R.id.answer_9_1_checkbox);
        boolean hasAnswer_9_1_CheckBox = Answer_9_1_CheckBox.isChecked();

        if (hasAnswer_9_1_CheckBox) {
            increment_score();
        }


        CheckBox Answer_9_4_CheckBox = (CheckBox) findViewById(R.id.answer_9_4_checkbox);
        boolean hasAnswer_9_4_CheckBox = Answer_9_4_CheckBox.isChecked();

        if (hasAnswer_9_4_CheckBox) {
            increment_score();
        }


        CheckBox Answer_9_5_CheckBox = (CheckBox) findViewById(R.id.answer_9_5_checkbox);
        boolean hasAnswer_9_5_CheckBox = Answer_9_5_CheckBox.isChecked();

        if (hasAnswer_9_5_CheckBox) {
            increment_score();
        }
    }

    /**
     final questions method
     */
    public void question_10() {

        CheckBox Answer_10_2_CheckBox = (CheckBox) findViewById(R.id.answer_10_2_checkbox);
        boolean hasAnswer_10_2_CheckBox = Answer_10_2_CheckBox.isChecked();

        if (hasAnswer_10_2_CheckBox) {
            increment_score();
        }


        CheckBox Answer_10_3_CheckBox = (CheckBox) findViewById(R.id.answer_10_3_checkbox);
        boolean hasAnswer_10_3_CheckBox = Answer_10_3_CheckBox.isChecked();

        if (hasAnswer_10_3_CheckBox) {
            increment_score();
        }

        CheckBox Answer_10_4_CheckBox = (CheckBox) findViewById(R.id.answer_10_4_checkbox);
        boolean hasAnswer_10_4_CheckBox = Answer_10_4_CheckBox.isChecked();

        if (hasAnswer_10_4_CheckBox) {
            increment_score();
        }
        CheckBox Answer_10_6_CheckBox = (CheckBox) findViewById(R.id.answer_10_6_checkbox);
        boolean hasAnswer_10_6_CheckBox = Answer_10_6_CheckBox.isChecked();

        if (hasAnswer_10_6_CheckBox) {
            increment_score();
        }
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayResult(String result) {
        TextView testResultTextView = (TextView) findViewById(R.id.test_result_text_view);
        testResultTextView.setText(result);
    }

    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score = ++score;
        return score;
    }
}