package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    private  Context mcontext;

    public WordAdapter(Context context, ArrayList<Word> wordsList, int colorResourceId){

        super(context,0,wordsList);

        this.mcontext = context;
        mColorResourceId = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        final Word currentWord = getItem(position);


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);

        miwokTextView.setText(currentWord.getMiwokTranslation());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_word);

        defaultTextView.setText(currentWord.getDefaultTRanslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);


        if (currentWord.getImageSourceId()>0){
            // Find the ImageView in the list_item.xml layout with the ID list_item_icon

            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView

            iconView.setImageResource(currentWord.getImageSourceId());
        }else{

            iconView.setImageResource(R.mipmap.ic_launcher);
            iconView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        RelativeLayout playImageParent = (RelativeLayout) listItemView.findViewById(R.id.play_image_parent);
        playImageParent.setBackgroundColor(color);
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(mcontext, currentWord.getAudioSourceId());
                mediaPlayer.start();

            }
        });
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView*/
        return listItemView;

    }
}
