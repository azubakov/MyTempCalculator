package tomer.edu.mytempcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity  {

    EditText etTotal;

    RadioButton rbCelsius, rbFahr, rbKelvin, rbRank;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix;
    Button btnSeven, btnEight, btnNine, btnZero, btnPoint;

    Button btnPlus, btnMinus,  btnMulti, btnDivide, btnSqrt, btnProc, btnSquare, btnPower;

    Button btnBacksp, btnEnter, btnReset;

    Button btnCelsius, btnFahr;

    Button btnTemreature;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubstruct, mMultiplication,  mDivision, mSqrt, mSquare, mProc, mPower;
    boolean mCelsius, mFahr, mKelvin,mRank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_main);

        etTotal = (EditText) findViewById(R.id.etTotal);

        rbCelsius = (RadioButton) findViewById(R.id.rbCelsius);
        rbFahr = (RadioButton) findViewById(R.id.rbFahr);
        rbKelvin = (RadioButton) findViewById(R.id.rbKelvin);
        rbRank = (RadioButton) findViewById(R.id.rbRank);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnPoint = (Button) findViewById(R.id.btnPoint);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnSqrt = (Button) findViewById(R.id.btnSqrt);
        btnProc = (Button) findViewById(R.id.btnProc);
        btnSquare = (Button) findViewById(R.id.btnSquare);
        btnPower = (Button) findViewById(R.id.btnPower);

        btnBacksp = (Button) findViewById(R.id.btnBacksp);
        btnEnter = (Button) findViewById(R.id.btnEnter);
        btnReset = (Button) findViewById(R.id.btnReset);

        btnCelsius = (Button) findViewById(R.id.btnCelsius);
        btnFahr = (Button) findViewById(R.id.btnFahr);


        btnTemreature = (Button) findViewById(R.id.btnTemp);




        //btnEnter.setOnClickListener(this);

       btnTemreature.setOnClickListener(new View.OnClickListener() {
           @Override
               public void onClick(View view) {

                  try
                  {
                      String tempString = etTotal.getText().toString();
                      double temp = Double.valueOf(tempString);
                      String symbol = " C";
                      //Convert from Celsius to Fahr and vise a verse
                      if (rbCelsius.isChecked()) {
                          temp = (temp - 32) * 5 / 9;
                      }
                      /*else {
                          temp = (temp * 9 / 5) + 32;
                          symbol = " F";
                      }*/

                      if (rbFahr.isChecked())
                      {
                          temp = (temp * 9 / 5) + 32;
                          symbol = " F";
                      }

                      //etTotal.setText(String.format("%f%s",temp,symbol));

                      if (rbKelvin.isChecked())
                      {
                          temp = temp + 273.15;
                          symbol = " Kel";
                      }

                      if (rbRank.isChecked())
                      {
                          temp = (temp * 1.8) + 491.67;
                          symbol = " Rank";
                      }


                      etTotal.setText(String.format("%f%s",temp,symbol));
                  }
                   catch (Exception e)
                   {
                          e.printStackTrace();
                   }
           }

       });



        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"2");
            }
        });


        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"7");
            }
        });


        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+"0");
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText(etTotal.getText()+".");
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etTotal.setText("");
            }
        });

        btnBacksp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // clearCalcDisplay = DONT_CLEAR;
                String str=etTotal.getText().toString();
                if (str.length() > 1 ) {
                    str = str.substring(0, str.length() - 1);
                    etTotal.setText(str);
                }
                else if (str.length() <=1 ) {
                    etTotal.setText("");
                }
            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etTotal == null)
                {
                    etTotal.setText("");
                }
                else
                {
                    mValueOne = Float.parseFloat(etTotal.getText()+"");
                    mAddition = true;
                    etTotal.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    mValueOne = Float.parseFloat(etTotal.getText()+"");
                    mSubstruct = true;
                    etTotal.setText(null);

            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(etTotal.getText()+"");
                mMultiplication = true;
                etTotal.setText(null);

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(etTotal.getText()+"");
                mDivision = true;
                etTotal.setText(null);

            }
        });

        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(etTotal.getText()+"");
                etTotal.setText(Math.sqrt(mValueOne) + "");
            }
        });

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(etTotal.getText()+"");
                etTotal.setText(mValueOne * mValueOne + "");
            }
        });

        btnProc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(etTotal.getText()+"");
                mProc = true;
                etTotal.setText(null);

            }
        });

        btnCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(etTotal.getText()+"");
                etTotal.setText((mValueOne - 32) * 5 / 9   + " C");
            }
        });

        btnFahr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(etTotal.getText()+"");
                etTotal.setText((mValueOne * 9 / 5) + 32   + " F");
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(etTotal.getText()+"");
                mPower = true;
                etTotal.setText(null);
            }
        });

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    mValueTwo = Float.parseFloat(etTotal.getText() + "");

                    if (mAddition == true)
                    {
                        etTotal.setText(mValueOne + mValueTwo + "");
                        mAddition = false;
                    }

                    if (mSubstruct == true)
                    {
                        etTotal.setText(mValueOne - mValueTwo + "");
                        mSubstruct = false;
                    }

                    if (mMultiplication == true)
                    {
                        etTotal.setText(mValueOne * mValueTwo + "");
                        mMultiplication = false;
                    }

                    if (mDivision == true)
                    {
                        etTotal.setText(mValueOne / mValueTwo + "");
                        mDivision = false;
                    }

                    if (mProc == true)
                    {
                        etTotal.setText(mValueOne * mValueTwo / 100 + "");
                        mProc = false;
                    }

                    if (mPower == true)
                    {
                        etTotal.setText(Math.pow(mValueOne,mValueTwo)  + "");
                        mProc = false;
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });


    }






}
