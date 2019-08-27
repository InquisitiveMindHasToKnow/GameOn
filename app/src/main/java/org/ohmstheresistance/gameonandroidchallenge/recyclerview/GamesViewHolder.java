package org.ohmstheresistance.gameonandroidchallenge.recyclerview;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    private static final String TAG = "GameJSON.TAG";


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


        if (splitHomeTeamName.length <= 2 && splitHomeTeamName.length >1) {
            homeTeamName.setText(splitHomeTeamName[0] + "\n" + splitHomeTeamName[1]);

        }
        if(splitHomeTeamName.length > 2){

            homeTeamName.setText(splitHomeTeamName[0] + " " + splitHomeTeamName[1] + "\n" + splitHomeTeamName[2]);

            //homeTeamName.setTextColor(Color.parseColor("#B3B3B3"));
            //homeTeamName.setTextColor(Color.parseColor("#141414"));

        }


        String visitorTeam = games.getVisitor_team().getName();
        String[] splitVisitorTeamName = visitorTeam.split(" ");

        if (splitVisitorTeamName.length <= 2 && splitVisitorTeamName.length > 1) {
            visitorTeamName.setText(splitVisitorTeamName[0] + "\n" + splitVisitorTeamName[1]);


        }

        if(splitVisitorTeamName.length > 2){

            visitorTeamName.setText(splitVisitorTeamName[0] + " " + splitVisitorTeamName[1] + "\n" + splitVisitorTeamName[2]);

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
                    playNowButton.setText("Picks Completed");
                    playNowButton.setEnabled(false);
                    playNowButton.setBackgroundResource(R.drawable.curved_pickscomplete_button);

                } else {

                    pickTimeButton.setText("GameOn @ \n" + myDate + ", " + timeOfGame + " PM");
                    playNowButton.setText("Play Now");

                }


            } catch (java.text.ParseException e) {

                e.printStackTrace();


            }
        } else {
//            Toast.makeText(itemView.getContext(), "All games already displayed!",
//                    Toast.LENGTH_LONG).show();


        }
    }

}