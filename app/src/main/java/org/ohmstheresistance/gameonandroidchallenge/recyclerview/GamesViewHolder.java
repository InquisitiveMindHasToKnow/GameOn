package org.ohmstheresistance.gameonandroidchallenge.recyclerview;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import org.ohmstheresistance.gameonandroidchallenge.R;
import org.ohmstheresistance.gameonandroidchallenge.model.Games;

import java.text.SimpleDateFormat;
import java.util.Date;


public class GamesViewHolder extends RecyclerView.ViewHolder {

    private CircularImageView homeTeamCircularImageView;
    private CircularImageView visitorTeamCircularImageView;
    private TextView homeTeamName;
    private TextView visitorTeamName;
    private TextView homeTeamScore;
    private TextView visitorTeamScore;
    private Button playNowButton;
    private Button pickTimeButton;


    private String homeTeamLogo;
    private String visitorTeamLogo;


    public GamesViewHolder(@NonNull View itemView) {

        super(itemView);

        homeTeamCircularImageView = itemView.findViewById(R.id.home_team_circularimageview);
        visitorTeamCircularImageView = itemView.findViewById(R.id.visitor_team_circularimageview);
        homeTeamName = itemView.findViewById(R.id.home_team_name_textview);
        visitorTeamName = itemView.findViewById(R.id.visitor_team_name_textview);
        homeTeamScore = itemView.findViewById(R.id.home_team_score_textview);
        visitorTeamScore = itemView.findViewById(R.id.visitor_team_score_textview);
        playNowButton = itemView.findViewById(R.id.play_now_button);
        pickTimeButton = itemView.findViewById(R.id.gameon_date_and_time_button);


    }


    @SuppressLint({"SetTextI18n", "SimpleDateFormat"})
    public void onBind(final Games games) {


        String homeTeam = games.getHome_team().getName();
        String[] splitHomeTeamName = homeTeam.split(" ", 3);


        SpannableStringBuilder homeTeamNameBuilder = new SpannableStringBuilder();
        SpannableStringBuilder homeTeamNameBuilder1 = new SpannableStringBuilder();
        SpannableStringBuilder visitorTeamNameBuilder = new SpannableStringBuilder();
        SpannableStringBuilder visitorTeamNameBuilder1 = new SpannableStringBuilder();

        if (splitHomeTeamName.length > 1 && splitHomeTeamName.length <= 2) {


            String topHalfOfHomeTeamName = splitHomeTeamName[0] + "\n";
            SpannableString topHalfOfHomeTeamNameSpannable= new SpannableString(topHalfOfHomeTeamName);
            topHalfOfHomeTeamNameSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#909090")), 0, topHalfOfHomeTeamName.length(), 0);
            homeTeamNameBuilder.append(topHalfOfHomeTeamNameSpannable);

            String bottomHalfOfHomeTeamName = splitHomeTeamName[1];
            SpannableString bottomHalfOfHomeTeamNameSpannable= new SpannableString(bottomHalfOfHomeTeamName);
            bottomHalfOfHomeTeamNameSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#141414")), 0, bottomHalfOfHomeTeamName.length(), 0);
            bottomHalfOfHomeTeamNameSpannable.setSpan(new RelativeSizeSpan(1.2f), 0, bottomHalfOfHomeTeamName.length(), 0);
            homeTeamNameBuilder.append(bottomHalfOfHomeTeamNameSpannable);

            homeTeamName.setText(homeTeamNameBuilder, TextView.BufferType.SPANNABLE);


        }
        if (splitHomeTeamName.length > 2) {


            String topHalfOfHomeTeamName1 = splitHomeTeamName[0] + " " + splitHomeTeamName[1];
            SpannableString topHalfOfHomeTeamNameSpannable1= new SpannableString(topHalfOfHomeTeamName1);
            topHalfOfHomeTeamNameSpannable1.setSpan(new ForegroundColorSpan(Color.parseColor("#909090")), 0, topHalfOfHomeTeamName1.length(), 0);
            homeTeamNameBuilder1.append(topHalfOfHomeTeamNameSpannable1);


            String bottomHalfOfHomeTeamName1 = "\n" + splitHomeTeamName[2];
            SpannableString bottomHalfOfHomeTeamName1Spannable = new SpannableString(bottomHalfOfHomeTeamName1);
            bottomHalfOfHomeTeamName1Spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#141414")), 0, bottomHalfOfHomeTeamName1.length(), 0);
            bottomHalfOfHomeTeamName1Spannable.setSpan(new RelativeSizeSpan(1.2f), 0, bottomHalfOfHomeTeamName1.length(), 0);

            homeTeamNameBuilder1.append(bottomHalfOfHomeTeamName1Spannable);

            homeTeamName.setText(homeTeamNameBuilder1, TextView.BufferType.SPANNABLE);

        }


        String visitorTeam = games.getVisitor_team().getName();
        String[] splitVisitorTeamName = visitorTeam.split(" ", 3);

        if (splitVisitorTeamName.length > 1 && splitVisitorTeamName.length <= 2) {

            String topHalfOfVisitorTeamName = splitVisitorTeamName[0] + "\n";
            SpannableString topHalfOfVisitorTeamNameSpannable= new SpannableString(topHalfOfVisitorTeamName);
            topHalfOfVisitorTeamNameSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#909090")), 0, topHalfOfVisitorTeamName.length(), 0);
            visitorTeamNameBuilder.append(topHalfOfVisitorTeamNameSpannable);

            String bottomHalfOfVisitorTeamName = splitVisitorTeamName[1];
            SpannableString bottomHalfOfVisitorTeamNameSpannable= new SpannableString(bottomHalfOfVisitorTeamName);
            bottomHalfOfVisitorTeamNameSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#141414")), 0, bottomHalfOfVisitorTeamName.length(), 0);
            bottomHalfOfVisitorTeamNameSpannable.setSpan(new RelativeSizeSpan(1.2f), 0, bottomHalfOfVisitorTeamName.length(), 0);

            visitorTeamNameBuilder.append(bottomHalfOfVisitorTeamNameSpannable);

            visitorTeamName.setText(visitorTeamNameBuilder, TextView.BufferType.SPANNABLE);

        }

        if (splitVisitorTeamName.length > 2) {

            String topHalfOfVisitorTeamName1 = splitVisitorTeamName[0]+ " " + splitVisitorTeamName[1];
            SpannableString topHalfOfVisitorTeamNameSpannable1 = new SpannableString(topHalfOfVisitorTeamName1);
            topHalfOfVisitorTeamNameSpannable1.setSpan(new ForegroundColorSpan(Color.parseColor("#909090")), 0, topHalfOfVisitorTeamName1.length(), 0);
            visitorTeamNameBuilder1.append(topHalfOfVisitorTeamNameSpannable1);

            String bottomHalfOfVisitorTeamName1 = "\n" + splitVisitorTeamName[2];
            SpannableString bottomHalfOfVisitorTeamName1Spannable= new SpannableString(bottomHalfOfVisitorTeamName1);
            bottomHalfOfVisitorTeamName1Spannable.setSpan(new ForegroundColorSpan(Color.parseColor("#141414")), 0, bottomHalfOfVisitorTeamName1.length(), 0);
            bottomHalfOfVisitorTeamName1Spannable.setSpan(new RelativeSizeSpan(1.2f), 0, bottomHalfOfVisitorTeamName1.length(), 0);

            visitorTeamNameBuilder1.append(bottomHalfOfVisitorTeamName1Spannable);

            visitorTeamName.setText(visitorTeamNameBuilder1, TextView.BufferType.SPANNABLE);
        }

        visitorTeamLogo = games.getVisitor_team().getLogo();
        homeTeamLogo = games.getHome_team().getLogo();


//        homeTeamScore.setText(games.getHome_team_points());
//        visitorTeamScore.setText(games.getVisitor_team_points());

        Picasso.get()
                .load(homeTeamLogo)
                .into(homeTeamCircularImageView);


        Picasso.get()
                .load(visitorTeamLogo)
                .into(visitorTeamCircularImageView);


        String dateAndTime = games.getDate();

        if (dateAndTime != null) {

            String dayOfGame = dateAndTime.substring(0, 10);
            String timeOfGame = dateAndTime.substring(11, 16);


            try {


                SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dateFormat2.parse(dayOfGame);

                SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yy");
                String myDate = dateFormat.format(date);


                SimpleDateFormat time24HrTo12Hr = new SimpleDateFormat("HH:mm");
                Date dateObj = time24HrTo12Hr.parse(timeOfGame);
                timeOfGame = new SimpleDateFormat("h:mm").format(dateObj);

                Log.d("Game Date: ", myDate + " Game Time:" + timeOfGame + " Home Team: " + homeTeam);


                String gameDateAndTime = myDate + ", " + timeOfGame;
                SpannableStringBuilder gameDateAndTimeBuilder = new SpannableStringBuilder();
                SpannableString gameDateAndTimeSpannable= new SpannableString(gameDateAndTime);
                gameDateAndTimeSpannable.setSpan(new StyleSpan(Typeface.BOLD), 0, gameDateAndTime.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                gameDateAndTimeBuilder.append(gameDateAndTimeSpannable);



                if (myDate.equals("8/14/19")) {

                    pickTimeButton.setText("GameOn in \n 2hr:35m:48s\n");
                    playNowButton.setText("Picks Complete");
                    playNowButton.setEnabled(false);
                    playNowButton.setBackgroundResource(R.drawable.curved_pickscomplete_button);

                } else {

                    pickTimeButton.setText("GameOn @ \n" + gameDateAndTimeBuilder + " PM", TextView.BufferType.SPANNABLE);
                    //pickTimeButton.setText("GameOn @ \n" + myDate + ", " + timeOfGame + " PM");
                    playNowButton.setText("Play Now");

                }


            } catch (java.text.ParseException e) {

                e.printStackTrace();


            }
        }
    }

}