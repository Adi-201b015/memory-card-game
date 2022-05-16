package com.example.memorycardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;
    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int image101, image102, image103, image104, image105, image106, image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    int turn = 1;
    int playerPoints = 0, cpuPoints=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        frontOfCardsResources();        // To load the card images

        Collections.shuffle(Arrays.asList(cardsArray));     // For shuffling

        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_23, theCard);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_24, theCard);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_31, theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_32, theCard);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_33, theCard);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_34, theCard);
            }
        });

    }

    private void doStuff(ImageView iv, int card){
        if(cardsArray[card] == 101){
            iv.setImageResource(image101);
        }
        else if(cardsArray[card] == 102){
            iv.setImageResource(image102);
        }
        else if(cardsArray[card] == 103){
            iv.setImageResource(image103);
        }
        else if(cardsArray[card] == 104){
            iv.setImageResource(image104);
        }
        else if(cardsArray[card] == 105){
            iv.setImageResource(image105);
        }
        else if(cardsArray[card] == 106){
            iv.setImageResource(image106);
        }
        else if(cardsArray[card] == 201){
            iv.setImageResource(image201);
        }
        else if(cardsArray[card] == 202){
            iv.setImageResource(image202);
        }
        else if(cardsArray[card] == 203){
            iv.setImageResource(image203);
        }
        else if(cardsArray[card] == 204){
            iv.setImageResource(image204);
        }
        else if(cardsArray[card] == 205){
            iv.setImageResource(image205);
        }
        else if(cardsArray[card] == 206){
            iv.setImageResource(image206);
        }
    }

    private void frontOfCardsResources(){
        image101 = R.drawable.im_101;
        image102 = R.drawable.im_102;
        image103 = R.drawable.im_103;
        image104 = R.drawable.im_104;
        image105 = R.drawable.im_105;
        image106 = R.drawable.im_106;
        image201 = R.drawable.im_201;
        image202 = R.drawable.im_202;
        image203 = R.drawable.im_203;
        image204 = R.drawable.im_204;
        image205 = R.drawable.im_205;
        image206 = R.drawable.im_206;
    }
}