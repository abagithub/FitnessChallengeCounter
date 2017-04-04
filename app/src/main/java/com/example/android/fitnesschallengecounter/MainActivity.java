package com.example.android.fitnesschallengecounter;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    boolean start = false;
    boolean finish = false;
    int pushUps;
    int squats;
    int abs;
    int scoreContestant1 = 0;
    int scoreContestant2 = 0;
    int scorePushUpsContestant1 = 0;
    int scoreSquatsContestant1 = 0;
    int scoreAbsContestant1 = 0;
    int scorePushUpsContestant2 = 0;
    int scoreSquatsContestant2 = 0;
    int scoreAbsContestant2 = 0;
    EditText name1, name2;
    TextView scoreView1, scoreView2, pushUpsSetsView, squatsSetsView, absSetsView, pushUpsContestant1, pushUpsContestant2, squatsContestant1,
            squatsContestant2, absContestant1, absContestant2;
    Button pushUpsButton1, pushUpsButton2, squatsButton1, squatsButton2, absButton1, absButton2,
            startButton, finishButton;
    View sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1 = (EditText) findViewById(R.id.contestant1_name);
        name2 = (EditText) findViewById(R.id.contestant2_name);
        scoreView1 = (TextView) findViewById(R.id.contestant1_score);
        scoreView1.setTypeface(Typeface.SERIF);
        scoreView2 = (TextView) findViewById(R.id.contestant2_score);
        scoreView2.setTypeface(Typeface.SERIF);
        pushUpsSetsView = (TextView) findViewById(R.id.pushUpsSets);
        squatsSetsView = (TextView) findViewById(R.id.squatsSets);
        absSetsView = (TextView) findViewById(R.id.absSets);
        pushUpsContestant1 = (TextView) findViewById(R.id.pushUpsContestant1);
        pushUpsContestant2 = (TextView) findViewById(R.id.pushUpsContestant2);
        squatsContestant1 = (TextView) findViewById(R.id.squatsContestant1);
        squatsContestant2 = (TextView) findViewById(R.id.squatsContestant2);
        absContestant1 = (TextView) findViewById(R.id.absContestant1);
        absContestant2 = (TextView) findViewById(R.id.absContestant2);
        pushUpsButton1 = (Button) findViewById(R.id.pushUpsButton1);
        pushUpsButton2 = (Button) findViewById(R.id.pushUpsButton2);
        squatsButton1 = (Button) findViewById(R.id.squatsButton1);
        squatsButton2 = (Button) findViewById(R.id.squatsButton2);
        absButton1 = (Button) findViewById(R.id.absButton1);
        absButton2 = (Button) findViewById(R.id.absButton2);
        startButton = (Button) findViewById(R.id.start);
        finishButton = (Button) findViewById(R.id.finish);

    }

    // counts and display the sets selected for the challenge on the + button
    public void pushUpsSets(View view) {
        if (!start) {
            pushUps += 1;
            displayPushUpsSets(pushUps);
        }
    }

    public void squatsSets(View view) {
        if (!start) {
            squats += 1;
            displaySquatsSets(squats);
        }
    }

    public void absSets(View view) {
        if (!start) {
            abs += 1;
            displayAbsSets(abs);
        }
    }

    // counts and display exercise sets done for both contestants
    public void pushUpsContestant1(View view) {
        if (start) {
            if (scorePushUpsContestant1 == pushUps - 1) {
                scorePushUpsContestant1 += 1;
                displayPushUpsDone1(scorePushUpsContestant1);
                scoreContestant1 += 1;
                displayContestant1(scoreContestant1);
            } else if (scorePushUpsContestant1 != pushUps) {
                scorePushUpsContestant1 += 1;
                displayPushUpsDone1(scorePushUpsContestant1);
            } else Toast.makeText(this, R.string.maxSets, Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, R.string.sets, Toast.LENGTH_SHORT).show();
    }

    public void squatsContestant1(View view) {
        if (start) {
            if (scoreSquatsContestant1 == squats - 1) {
                scoreSquatsContestant1 += 1;
                displaySquatsDone1(scoreSquatsContestant1);
                scoreContestant1 += 1;
                displayContestant1(scoreContestant1);
            } else if (scoreSquatsContestant1 != squats) {
                scoreSquatsContestant1 += 1;
                displaySquatsDone1(scoreSquatsContestant1);
            } else Toast.makeText(this, R.string.maxSets, Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, R.string.sets, Toast.LENGTH_SHORT).show();
    }

    public void absContestant1(View view) {
        if (start) {
            if (scoreAbsContestant1 == abs - 1) {
                scoreAbsContestant1 += 1;
                displayAbsDone1(scoreAbsContestant1);
                scoreContestant1 += 1;
                displayContestant1(scoreContestant1);
            } else if (scoreAbsContestant1 != abs) {
                scoreAbsContestant1 += 1;
                displayAbsDone1(scoreAbsContestant1);
            } else Toast.makeText(this, R.string.maxSets, Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, R.string.sets, Toast.LENGTH_SHORT).show();
    }

    public void pushUpsContestant2(View view) {
        if (start) {
            if (scorePushUpsContestant2 == pushUps - 1) {
                scorePushUpsContestant2 += 1;
                displayPushUpsDone2(scorePushUpsContestant2);
                scoreContestant2 += 1;
                displayContestant2(scoreContestant2);
            } else if (scorePushUpsContestant2 != pushUps) {
                scorePushUpsContestant2 += 1;
                displayPushUpsDone2(scorePushUpsContestant2);
            } else Toast.makeText(this, R.string.maxSets, Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, R.string.sets, Toast.LENGTH_SHORT).show();
    }

    public void squatsContestant2(View view) {
        if (start) {
            if (scoreSquatsContestant2 == squats - 1) {
                scoreSquatsContestant2 += 1;
                displaySquatsDone2(scoreSquatsContestant2);
                scoreContestant2 += 1;
                displayContestant2(scoreContestant2);
            } else if (scoreSquatsContestant2 != squats) {
                scoreSquatsContestant2 += 1;
                displaySquatsDone2(scoreSquatsContestant2);
            } else Toast.makeText(this, R.string.maxSets, Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, R.string.sets, Toast.LENGTH_SHORT).show();
    }

    public void absContestant2(View view) {
        if (start) {
            if (scoreAbsContestant2 == abs - 1) {
                scoreAbsContestant2 += 1;
                displayAbsDone2(scoreAbsContestant2);
                scoreContestant2 += 1;
                displayContestant2(scoreContestant2);
            } else if (scoreAbsContestant2 != abs) {
                scoreAbsContestant2 += 1;
                displayAbsDone2(scoreAbsContestant2);
            } else Toast.makeText(this, R.string.maxSets, Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, R.string.sets, Toast.LENGTH_SHORT).show();
    }

    //reset button
    public void reset(View view) {
        start = false;
        finish = false;
        pushUps = 0;
        squats = 0;
        abs = 0;
        scoreContestant1 = 0;
        scoreContestant2 = 0;
        scorePushUpsContestant1 = 0;
        scoreSquatsContestant1 = 0;
        scoreAbsContestant1 = 0;
        scorePushUpsContestant2 = 0;
        scoreSquatsContestant2 = 0;
        scoreAbsContestant2 = 0;
        displayContestant1(scoreContestant1);
        displayContestant2(scoreContestant2);
        displayPushUpsSets(pushUps);
        displaySquatsSets(squats);
        displayAbsSets(abs);
        displayPushUpsDone1(scorePushUpsContestant1);
        displaySquatsDone1(scoreSquatsContestant1);
        displayAbsDone1(scoreAbsContestant1);
        displayPushUpsDone2(scorePushUpsContestant2);
        displaySquatsDone2(scoreSquatsContestant2);
        displayAbsDone2(scoreAbsContestant2);
        name1.setText("");
        name2.setText("");
        restoreAppearance(view);

    }

    //restore all the buttons and text views like at the start of app
    public void restoreAppearance(View view) {

        name1.setTextSize(15);
        name1.setTypeface(Typeface.DEFAULT);
        name1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        name1.getBackground().setColorFilter(ContextCompat.getColor(this, R.color.colorAccent), PorterDuff.Mode.SRC_ATOP);

        scoreView1.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        scoreView1.setTypeface(Typeface.SERIF);

        pushUpsContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        squatsContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        absContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));

        name2.setTextSize(15);
        name2.setTypeface(Typeface.DEFAULT);
        name2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        name2.getBackground().setColorFilter(ContextCompat.getColor(this, R.color.colorAccent), PorterDuff.Mode.SRC_ATOP);

        scoreView2.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        scoreView2.setTypeface(Typeface.SERIF);

        pushUpsContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        squatsContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        absContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));

        pushUpsButton1.setBackgroundResource(R.drawable.sets_button);
        pushUpsButton1.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        pushUpsButton1.setTextSize(14);
        pushUpsButton1.setText("+1 SETS");

        pushUpsButton2.setBackgroundResource(R.drawable.sets_button);
        pushUpsButton2.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        pushUpsButton2.setTextSize(14);
        pushUpsButton2.setText("+1 SETS");

        squatsButton1.setBackgroundResource(R.drawable.sets_button);
        squatsButton1.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        squatsButton1.setTextSize(14);
        squatsButton1.setText("+1 SETS");

        squatsButton2.setBackgroundResource(R.drawable.sets_button);
        squatsButton2.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        squatsButton2.setTextSize(14);
        squatsButton2.setText("+1 SETS");

        absButton1.setBackgroundResource(R.drawable.sets_button);
        absButton1.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        absButton1.setTextSize(14);
        absButton1.setText("+1 SETS");

        absButton2.setBackgroundResource(R.drawable.sets_button);
        absButton2.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        absButton2.setTextSize(14);
        absButton2.setText("+1 SETS");

        startButton.setBackgroundResource(R.drawable.big_button);
        startButton.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        finishButton.setBackgroundResource(R.drawable.big_button);
        finishButton.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
    }

    //start button
    public void start(View view) {
        if (pushUps > 0 || squats > 0 || abs > 0) {//if no exercise was selected then start is not possible
            start = true;
            startButton.setBackgroundResource(R.color.trans);
            startButton.setTextColor(ContextCompat.getColor(this, R.color.viewColor));
        } else Toast.makeText(this, R.string.start, Toast.LENGTH_SHORT).show();
    }

    //finish button
    public void finish(View view) {
        int totalSetsContestant1 = scorePushUpsContestant1 + scoreSquatsContestant1 + scoreAbsContestant1;
        int totalSetsContestant2 = scorePushUpsContestant2 + scoreSquatsContestant2 + scoreAbsContestant2;

        if (totalSetsContestant1 > 0 || totalSetsContestant2 > 0) {//if no sets have been done then it's not a finish.
            finishButton.setBackgroundResource(R.color.trans);
            finishButton.setTextColor(ContextCompat.getColor(this, R.color.viewColor));

            if (scoreContestant1 > scoreContestant2) {
                displayWinnerContestant1(view);
            } else if (scoreContestant1 < scoreContestant2) {
                displayWinnerContestant2(view);
            } else if (scoreContestant1 == scoreContestant2) {
                if (totalSetsContestant1 > totalSetsContestant2) {
                    displayWinnerContestant1(view);
                } else if (totalSetsContestant1 < totalSetsContestant2) {
                    displayWinnerContestant2(view);
                } else {
                    displayDraw(view);
                }
            }
            finish = true;
        } else Toast.makeText(this, R.string.finish, Toast.LENGTH_SHORT).show();
    }

    public void displayWinnerContestant1(View view) {
        if (!finish) { //this condition is for not executing this method after the finish button was hit. otherwise every time will add --> WINNER <--
            String contestantName = name1.getText().toString();
            name1.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));
            name1.setTextSize(17);
            name1.setTypeface(Typeface.DEFAULT_BOLD);
            name1.setText("--> "+ contestantName + " is the WINNER <--");
            name1.getBackground().setColorFilter(ContextCompat.getColor(this, R.color.textColorScore), PorterDuff.Mode.SRC_ATOP);

            scoreView1.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));
            scoreView1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

            pushUpsContestant1.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));
            squatsContestant1.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));
            absContestant1.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));

            scoreView2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            scoreView2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

            pushUpsContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            squatsContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            absContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));

            finishButtonsWinner1(view);
        }
    }

    public void displayWinnerContestant2(View view) {
        if (!finish) {
            String contestantName = name2.getText().toString();
            name2.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));
            name2.setTextSize(17);
            name2.setTypeface(Typeface.DEFAULT_BOLD);
            name2.setText("--> "+ contestantName + " is the WINNER <--");
            name2.getBackground().setColorFilter(ContextCompat.getColor(this, R.color.textColorScore), PorterDuff.Mode.SRC_ATOP);

            scoreView2.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));
            scoreView2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

            pushUpsContestant2.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));
            squatsContestant2.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));
            absContestant2.setTextColor(ContextCompat.getColor(this, R.color.textColorScore));

            scoreView1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            scoreView1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

            pushUpsContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            squatsContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            absContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));

            finishButtonsWinner2(view);
        }
    }

    public void displayDraw(View view) {
        if (!finish) {
            String contestantName1 = name1.getText().toString();
            name1.setText(contestantName1 + " -- NO WINNER --");

            scoreView1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));

            pushUpsContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            squatsContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            absContestant1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));

            String contestantName2 = name2.getText().toString();
            name2.setText(contestantName2 + " -- NO WINNER --");

            scoreView2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));

            pushUpsContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            squatsContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
            absContestant2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));

            finishButtonsDraw(view);
        }
    }

    // modifies appearance for the side of the winner
    public void finishButtonsWinner1(View view) {

        pushUpsButton1.setBackgroundResource(R.color.trans);
        pushUpsButton1.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        pushUpsButton1.setTextSize(17);
        pushUpsButton1.setText("S E T S");

        pushUpsButton2.setBackgroundResource(R.color.trans);
        pushUpsButton2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        pushUpsButton2.setTextSize(17);
        pushUpsButton2.setText("S E T S");

        squatsButton1.setBackgroundResource(R.color.trans);
        squatsButton1.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        squatsButton1.setTextSize(17);
        squatsButton1.setText("S E T S");

        squatsButton2.setBackgroundResource(R.color.trans);
        squatsButton2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        squatsButton2.setTextSize(17);
        squatsButton2.setText("S E T S");

        absButton1.setBackgroundResource(R.color.trans);
        absButton1.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        absButton1.setTextSize(17);
        absButton1.setText("S E T S");

        absButton2.setBackgroundResource(R.color.trans);
        absButton2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        absButton2.setTextSize(17);
        absButton2.setText("S E T S");

    }

    public void finishButtonsWinner2(View view) {

        pushUpsButton1.setBackgroundResource(R.color.trans);
        pushUpsButton1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        pushUpsButton1.setTextSize(17);
        pushUpsButton1.setText("S E T S");

        pushUpsButton2.setBackgroundResource(R.color.trans);
        pushUpsButton2.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        pushUpsButton2.setTextSize(17);
        pushUpsButton2.setText("S E T S");

        squatsButton1.setBackgroundResource(R.color.trans);
        squatsButton1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        squatsButton1.setTextSize(17);
        squatsButton1.setText("S E T S");

        squatsButton2.setBackgroundResource(R.color.trans);
        squatsButton2.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        squatsButton2.setTextSize(17);
        squatsButton2.setText("S E T S");

        absButton1.setBackgroundResource(R.color.trans);
        absButton1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        absButton1.setTextSize(17);
        absButton1.setText("S E T S");

        absButton2.setBackgroundResource(R.color.trans);
        absButton2.setTextColor(ContextCompat.getColor(this, R.color.colorButtonNormal));
        absButton2.setTextSize(17);
        absButton2.setText("S E T S");

    }

    public void finishButtonsDraw(View view) {

        pushUpsButton1.setBackgroundResource(R.color.trans);
        pushUpsButton1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        pushUpsButton1.setTextSize(17);
        pushUpsButton1.setText("S E T S");

        pushUpsButton2.setBackgroundResource(R.color.trans);
        pushUpsButton2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        pushUpsButton2.setTextSize(17);
        pushUpsButton2.setText("S E T S");

        squatsButton1.setBackgroundResource(R.color.trans);
        squatsButton1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        squatsButton1.setTextSize(17);
        squatsButton1.setText("S E T S");

        squatsButton2.setBackgroundResource(R.color.trans);
        squatsButton2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        squatsButton2.setTextSize(17);
        squatsButton2.setText("S E T S");

        absButton1.setBackgroundResource(R.color.trans);
        absButton1.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        absButton1.setTextSize(17);
        absButton1.setText("S E T S");

        absButton2.setBackgroundResource(R.color.trans);
        absButton2.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        absButton2.setTextSize(17);
        absButton2.setText("S E T S");

    }

    /**
     * Displays the sets for each challenge
     */

    public void displayPushUpsSets(int pushUps) {
        pushUpsSetsView.setText(String.valueOf(pushUps));
    }

    public void displaySquatsSets(int squats) {
        squatsSetsView.setText(String.valueOf(squats));
    }

    public void displayAbsSets(int abs) {
        absSetsView.setText(String.valueOf(abs));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayContestant1(int scoreContestant1) {
        scoreView1.setText(String.valueOf(scoreContestant1));
    }

    public void displayPushUpsDone1(int scorePushUpsContestant1) {
        pushUpsContestant1.setText(String.valueOf(scorePushUpsContestant1));
    }

    public void displaySquatsDone1(int scoreSquatsContestant1) {
        squatsContestant1.setText(String.valueOf(scoreSquatsContestant1));
    }

    public void displayAbsDone1(int scoreAbsContestant1) {
        absContestant1.setText(String.valueOf(scoreAbsContestant1));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayContestant2(int score) {
        scoreView2.setText(String.valueOf(score));
    }

    public void displayPushUpsDone2(int scorePushUpsContestant2) {
        pushUpsContestant2.setText(String.valueOf(scorePushUpsContestant2));
    }

    public void displaySquatsDone2(int scoreSquatsContestant2) {
        squatsContestant2.setText(String.valueOf(scoreSquatsContestant2));
    }

    public void displayAbsDone2(int scoreAbsContestant2) {
        absContestant2.setText(String.valueOf(scoreAbsContestant2));
    }

}

