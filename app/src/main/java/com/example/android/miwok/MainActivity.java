/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView numbersTextView;
    TextView phrasesTextView;
    TextView colorsTextView;
    TextView familyMembersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        numbersTextView = (TextView) findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(this);
        phrasesTextView = (TextView) findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(this);
        colorsTextView = (TextView) findViewById(R.id.colors);
        colorsTextView.setOnClickListener(this);
        familyMembersTextView = (TextView) findViewById(R.id.family);
        familyMembersTextView.setOnClickListener(this);


       /* numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        familyMembersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
*/

    }

    public void openNumbersList(View view){
        Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(numbersIntent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numbers:
                //Toast.makeText(this, "Numbers Selected",Toast.LENGTH_SHORT).show();
                Intent numbersIntent = new Intent(this, NumbersActivity.class);
                startActivity(numbersIntent);
                break;
            case R.id.colors:
                //Toast.makeText(this, "Colors Selected",Toast.LENGTH_SHORT).show();
                Intent colorsIntent = new Intent(this, ColorsActivity.class);
                startActivity(colorsIntent);
                break;
            case R.id.phrases:
                //Toast.makeText(this, "Phrases Selected",Toast.LENGTH_SHORT).show();
                Intent phrasesIntent = new Intent(this, PhrasesActivity.class);
                startActivity(phrasesIntent);
                break;
            case R.id.family:
                //Toast.makeText(this, "Family Members Selected",Toast.LENGTH_SHORT).show();
                Intent familyMembersIntent = new Intent(this, FamilyMembersActivity.class);
                startActivity(familyMembersIntent);
                break;
        }
    }
}
