package org.ohmstheresistance.gameonandroidchallenge.recyclerview;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
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
        String[] splitHomeTeamName = homeTeam.split(" ");


        SpannableStringBuilder homeTeamNameBuilder = new SpannableStringBuilder();
        SpannableStringBuilder homeTeamNameBuilder1 = new SpannableStringBuilder();
        SpannableStringBuilder visitorTeamNameBuilder = new SpannableStringBuilder();
        SpannableStringBuilder visitorTeamNameBuilder1 = new SpannableStringBuilder();

        if (splitHomeTeamName.length > 1 && splitHomeTeamName.length <= 2) {


            String firstWordOfHomeTeam = splitHomeTeamName[0] + "\n";
            SpannableString firstWordOfHomeTeamSpannable= new SpannableString(firstWordOfHomeTeam);
            firstWordOfHomeTeamSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#B3B3B3")), 0, firstWordOfHomeTeam.length(), 0);
            homeTeamNameBuilder.append(firstWordOfHomeTeamSpannable);

            String secondWordOfHomeTeam = splitHomeTeamName[1];
            SpannableString secondWordOfHomeTeamSpannable= new SpannableString(secondWordOfHomeTeam);
            secondWordOfHomeTeamSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#141414")), 0, secondWordOfHomeTeam.length(), 0);
            homeTeamNameBuilder.append(secondWordOfHomeTeamSpannable);

            homeTeamName.setText(homeTeamNameBuilder, TextView.BufferType.SPANNABLE);


        }
        if (splitHomeTeamName.length > 2) {


            String firstWordOfHomeTeam1 = splitHomeTeamName[0] + " ";
            SpannableString firstWordOfHomeTeamSpannable1= new SpannableString(firstWordOfHomeTeam1);
            firstWordOfHomeTeamSpannable1.setSpan(new ForegroundColorSpan(Color.parseColor("#B3B3B3")), 0, firstWordOfHomeTeam1.length(), 0);
            homeTeamNameBuilder1.append(firstWordOfHomeTeamSpannable1);

            String secondWordOfHomeTeam1 = splitHomeTeamName[1] + "\n";
            SpannableString secondWordOfHomeTeamSpannable1 = new SpannableString(secondWordOfHomeTeam1);
            secondWordOfHomeTeamSpannable1.setSpan(new ForegroundColorSpan(Color.parseColor("#B3B3B3")), 0, secondWordOfHomeTeam1.length(), 0);
            homeTeamNameBuilder1.append(secondWordOfHomeTeamSpannable1);

            String thirdWordOfHomeTeam = splitHomeTeamName[2] + " ";
            SpannableString thirdWordOfHomeTeamSpannable = new SpannableString(thirdWordOfHomeTeam);
            thirdWordOfHomeTeamSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#141414")), 0, thirdWordOfHomeTeam.length(), 0);
            homeTeamNameBuilder1.append(thirdWordOfHomeTeamSpannable);
            homeTeamName.setText(homeTeamNameBuilder1, TextView.BufferType.SPANNABLE);

        }


        String visitorTeam = games.getVisitor_team().getName();
        String[] splitVisitorTeamName = visitorTeam.split(" ");

        if (splitVisitorTeamName.length > 1 && splitVisitorTeamName.length <= 2) {

            String firstWordOfVisitorTeam = splitVisitorTeamName[0] + "\n";
            SpannableString firstWordOfVisitorTeamSpannable= new SpannableString(firstWordOfVisitorTeam);
            firstWordOfVisitorTeamSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#B3B3B3")), 0, firstWordOfVisitorTeam.length(), 0);
            visitorTeamNameBuilder.append(firstWordOfVisitorTeamSpannable);

            String secondWordOfVisitorTeam = splitVisitorTeamName[1];
            SpannableString secondWordOfVisitorTeamSpannable= new SpannableString(secondWordOfVisitorTeam);
            secondWordOfVisitorTeamSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#141414")), 0, secondWordOfVisitorTeam.length(), 0);
            visitorTeamNameBuilder.append(secondWordOfVisitorTeamSpannable);

            visitorTeamName.setText(visitorTeamNameBuilder, TextView.BufferType.SPANNABLE);

        }

        if (splitVisitorTeamName.length > 2) {

            String firstWordOfVisitorTeam1 = splitVisitorTeamName[0] + " ";
            SpannableString firstWordOfVisitorTeamSpannable1 = new SpannableString(firstWordOfVisitorTeam1);
            firstWordOfVisitorTeamSpannable1.setSpan(new ForegroundColorSpan(Color.parseColor("#B3B3B3")), 0, firstWordOfVisitorTeam1.length(), 0);
            visitorTeamNameBuilder1.append(firstWordOfVisitorTeamSpannable1);

            String secondWordOfVisitorTeam1 = splitVisitorTeamName[1] + "\n";
            SpannableString secondWordOfVisitorTeamSpannable1 = new SpannableString(secondWordOfVisitorTeam1);
            secondWordOfVisitorTeamSpannable1.setSpan(new ForegroundColorSpan(Color.parseColor("#B3B3B3")), 0, secondWordOfVisitorTeam1.length(), 0);
            visitorTeamNameBuilder1.append(secondWordOfVisitorTeamSpannable1);

            String thirdWordOfVisitorTeam = splitVisitorTeamName[2];
            SpannableString thirdWordOfVisitorTeamSpannable= new SpannableString(thirdWordOfVisitorTeam);
            thirdWordOfVisitorTeamSpannable.setSpan(new ForegroundColorSpan(Color.parseColor("#141414")), 0, thirdWordOfVisitorTeam.length(), 0);
            visitorTeamNameBuilder1.append(thirdWordOfVisitorTeamSpannable);

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


                if (myDate.equals("8/14/19")) {

                    pickTimeButton.setText("GameOn in \n 2hr:35m:48s\n");
                    playNowButton.setText("Picks Complete");
                    playNowButton.setEnabled(false);
                    playNowButton.setBackgroundResource(R.drawable.curved_pickscomplete_button);

                } else {

                    pickTimeButton.setText("GameOn @ \n" + myDate + ", " + timeOfGame + " PM");
                    playNowButton.setText("Play Now");

                }


            } catch (java.text.ParseException e) {

                e.printStackTrace();


            }
        }
    }

}