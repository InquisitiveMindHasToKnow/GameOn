package org.ohmstheresistance.gameonandroidchallenge.model;

import java.util.List;

public class Games {

    private Integer id;
    private String created_datetime;
    private String updated_datetime;
    private String date;
    private String status;
    private String time_increment;
    private String current_increment;
    private HomeTeam home_team;
    private String home_team_city;
    private String home_team_name;
    private VisitorTeam visitor_team;
    private String visitor_team_city;
    private String visitor_team_name;
    private Integer home_team_points;
    private Integer visitor_team_points;
    private String picks_open_time;
    private Integer timezone;
    private String broadcast_info;
    private League league;
    private Sponsor sponsor;

    private List<Prize> prizes;
    private Boolean hasUserPicks;
    private String prizeDescription;


    public Games(Integer id, String created_datetime, String updated_datetime, String date, String status, String time_increment, String current_increment, HomeTeam home_team, String home_team_city, String home_team_name, VisitorTeam visitor_team, String visitor_team_city, String visitor_team_name, Integer home_team_points, Integer visitor_team_points, String picks_open_time, Integer timezone, String broadcast_info, League league, Sponsor sponsor, List<Prize> prizes, Boolean hasUserPicks, String prizeDescription) {
        this.id = id;
        this.created_datetime = created_datetime;
        this.updated_datetime = updated_datetime;
        this.date = date;
        this.status = status;
        this.time_increment = time_increment;
        this.current_increment = current_increment;
        this.home_team = home_team;
        this.home_team_city = home_team_city;
        this.home_team_name = home_team_name;
        this.visitor_team = visitor_team;
        this.visitor_team_city = visitor_team_city;
        this.visitor_team_name = visitor_team_name;
        this.home_team_points = home_team_points;
        this.visitor_team_points = visitor_team_points;
        this.picks_open_time = picks_open_time;
        this.timezone = timezone;
        this.broadcast_info = broadcast_info;
        this.league = league;
        this.sponsor = sponsor;
        this.prizes = prizes;
        this.hasUserPicks = hasUserPicks;
        this.prizeDescription = prizeDescription;
    }

    public Integer getId() {
        return id;
    }

    public String getCreated_datetime() {
        return created_datetime;
    }

    public String getUpdated_datetime() {
        return updated_datetime;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getTime_increment() {
        return time_increment;
    }

    public String getCurrent_increment() {
        return current_increment;
    }

    public HomeTeam getHome_team() {
        return home_team;
    }

    public String getHome_team_city() {
        return home_team_city;
    }

    public String getHome_team_name() {
        return home_team_name;
    }

    public VisitorTeam getVisitor_team() {
        return visitor_team;
    }

    public String getVisitor_team_city() {
        return visitor_team_city;
    }

    public String getVisitor_team_name() {
        return visitor_team_name;
    }

    public Integer getHome_team_points() {
        return home_team_points;
    }

    public Integer getVisitor_team_points() {
        return visitor_team_points;
    }

    public String getPicks_open_time() {
        return picks_open_time;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public String getBroadcast_info() {
        return broadcast_info;
    }

    public League getLeague() {
        return league;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public List<Prize> getPrizes() {
        return prizes;
    }

    public Boolean getHasUserPicks() {
        return hasUserPicks;
    }

    public String getPrizeDescription() {
        return prizeDescription;
    }

    public class HomeTeam {

        private Integer id;
        private String name;
        private String logo;


        public HomeTeam(Integer id, String name, String logo) {
            super();
            this.id = id;
            this.name = name;
            this.logo = logo;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getLogo() {
            return logo;
        }
    }

    public class League {

        private Integer id;
        private String name;
        private Sport sport;

        public League(Integer id, String name, Sport sport) {
            super();
            this.id = id;
            this.name = name;
            this.sport = sport;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Sport getSport() {
            return sport;
        }
    }

    public class Prize {

        private Integer id;
        private Integer amount;
        private Integer position;

        public Prize(Integer id, Integer amount, Integer position) {
            super();
            this.id = id;
            this.amount = amount;
            this.position = position;
        }

        public Integer getId() {
            return id;
        }

        public Integer getAmount() {
            return amount;
        }

        public Integer getPosition() {
            return position;
        }
    }

    public class Sponsor {

        private Integer id;
        private String name;
        private String logo;
        private String image;
        private String link;

        public Sponsor(Integer id, String name, String logo, String image, String link) {
            super();
            this.id = id;
            this.name = name;
            this.logo = logo;
            this.image = image;
            this.link = link;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getLogo() {
            return logo;
        }

        public String getImage() {
            return image;
        }

        public String getLink() {
            return link;
        }
    }

    public class Sport {

        private Integer id;
        private String name;
        private String matchDuration;

        public Sport(Integer id, String name, String matchDuration) {
            super();
            this.id = id;
            this.name = name;
            this.matchDuration = matchDuration;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getMatchDuration() {
            return matchDuration;
        }
    }

    public class VisitorTeam {

        private Integer id;
        private String name;
        private String logo;

        public VisitorTeam(Integer id, String name, String logo) {
            super();
            this.id = id;
            this.name = name;
            this.logo = logo;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getLogo() {
            return logo;
        }
    }

}
