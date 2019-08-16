package org.ohmstheresistance.gameonandroidchallenge.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Games {

    private int id;
    private String createdDatetime;
    private String updatedDatetime;
    private String date;
    private String status;
    private String timeIncrement;
    private String currentIncrement;
    private HomeTeam homeTeam;
    private String homeTeamCity;
    private String homeTeamName;
    private VisitorTeam visitorTeam;
    private String visitorTeamCity;
    private String visitorTeamName;
    private int homeTeamPoints;
    private int visitorTeamPoints;
    private String picksOpenTime;
    private int timezone;
    private String broadcastInfo;
    private League league;
    private Sponsor sponsor;
    private List<Prize> prizes = null;
    private boolean hasUserPicks;
    private String prizeDescription;
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    public Games(int id, String createdDatetime, String updatedDatetime, String date, String status, String timeIncrement, String currentIncrement, HomeTeam homeTeam, String homeTeamCity, String homeTeamName, VisitorTeam visitorTeam, String visitorTeamCity, String visitorTeamName, int homeTeamPoints, int visitorTeamPoints, String picksOpenTime, int timezone, String broadcastInfo, League league, Sponsor sponsor, List<Prize> prizes, boolean hasUserPicks, String prizeDescription, Map<String, String> additionalProperties) {
        this.id = id;
        this.createdDatetime = createdDatetime;
        this.updatedDatetime = updatedDatetime;
        this.date = date;
        this.status = status;
        this.timeIncrement = timeIncrement;
        this.currentIncrement = currentIncrement;
        this.homeTeam = homeTeam;
        this.homeTeamCity = homeTeamCity;
        this.homeTeamName = homeTeamName;
        this.visitorTeam = visitorTeam;
        this.visitorTeamCity = visitorTeamCity;
        this.visitorTeamName = visitorTeamName;
        this.homeTeamPoints = homeTeamPoints;
        this.visitorTeamPoints = visitorTeamPoints;
        this.picksOpenTime = picksOpenTime;
        this.timezone = timezone;
        this.broadcastInfo = broadcastInfo;
        this.league = league;
        this.sponsor = sponsor;
        this.prizes = prizes;
        this.hasUserPicks = hasUserPicks;
        this.prizeDescription = prizeDescription;
        this.additionalProperties = additionalProperties;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(String createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public String getUpdatedDatetime() {
        return updatedDatetime;
    }

    public void setUpdatedDatetime(String updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeIncrement() {
        return timeIncrement;
    }

    public void setTimeIncrement(String timeIncrement) {
        this.timeIncrement = timeIncrement;
    }

    public String getCurrentIncrement() {
        return currentIncrement;
    }

    public void setCurrentIncrement(String currentIncrement) {
        this.currentIncrement = currentIncrement;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getHomeTeamCity() {
        return homeTeamCity;
    }

    public void setHomeTeamCity(String homeTeamCity) {
        this.homeTeamCity = homeTeamCity;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public VisitorTeam getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(VisitorTeam visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public String getVisitorTeamCity() {
        return visitorTeamCity;
    }

    public void setVisitorTeamCity(String visitorTeamCity) {
        this.visitorTeamCity = visitorTeamCity;
    }

    public String getVisitorTeamName() {
        return visitorTeamName;
    }

    public void setVisitorTeamName(String visitorTeamName) {
        this.visitorTeamName = visitorTeamName;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public void setHomeTeamPoints(int homeTeamPoints) {
        this.homeTeamPoints = homeTeamPoints;
    }

    public int getVisitorTeamPoints() {
        return visitorTeamPoints;
    }

    public void setVisitorTeamPoints(int visitorTeamPoints) {
        this.visitorTeamPoints = visitorTeamPoints;
    }

    public String getPicksOpenTime() {
        return picksOpenTime;
    }

    public void setPicksOpenTime(String picksOpenTime) {
        this.picksOpenTime = picksOpenTime;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public String getBroadcastInfo() {
        return broadcastInfo;
    }

    public void setBroadcastInfo(String broadcastInfo) {
        this.broadcastInfo = broadcastInfo;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    public boolean isHasUserPicks() {
        return hasUserPicks;
    }

    public void setHasUserPicks(boolean hasUserPicks) {
        this.hasUserPicks = hasUserPicks;
    }

    public String getPrizeDescription() {
        return prizeDescription;
    }

    public void setPrizeDescription(String prizeDescription) {
        this.prizeDescription = prizeDescription;
    }

    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
    }


    public class HomeTeam {

        public HomeTeam(int id, String name, String logo, Map<String, String> additionalProperties) {
            this.id = id;
            this.name = name;
            this.logo = logo;
            this.additionalProperties = additionalProperties;
        }

        private int id;
        private String name;
        private String logo;
        private Map<String, String> additionalProperties;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public Map<String, String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, String value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class League {

        public League(int id, String name, Sport sport, Map<String, String> additionalProperties) {
            this.id = id;
            this.name = name;
            this.sport = sport;
            this.additionalProperties = additionalProperties;
        }

        private int id;
        private String name;
        private Sport sport;
        private Map<String, String> additionalProperties;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Sport getSport() {
            return sport;
        }

        public void setSport(Sport sport) {
            this.sport = sport;
        }

        public Map<String, String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, String value) {
            this.additionalProperties.put(name, value);
        }
    }

    public class Prize {

        public Prize(int id, int amount, int position, Map<String, String> additionalProperties) {
            this.id = id;
            this.amount = amount;
            this.position = position;
            this.additionalProperties = additionalProperties;
        }

        private int id;
        private int amount;
        private int position;
        private Map<String, String> additionalProperties;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public Map<String, String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, String value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Sponsor {

        public Sponsor(int id, String name, String logo, String image, String link, Map<String, String> additionalProperties) {
            this.id = id;
            this.name = name;
            this.logo = logo;
            this.image = image;
            this.link = link;
            this.additionalProperties = additionalProperties;
        }

        private int id;
        private String name;
        private String logo;
        private String image;
        private String link;
        private Map<String, String> additionalProperties;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public Map<String, String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, String value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Sport {

        public Sport(int id, String name, String matchDuration, Map<String, String> additionalProperties) {
            this.id = id;
            this.name = name;
            this.matchDuration = matchDuration;
            this.additionalProperties = additionalProperties;
        }

        private int id;
        private String name;
        private String matchDuration;
        private Map<String, String> additionalProperties;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMatchDuration() {
            return matchDuration;
        }

        public void setMatchDuration(String matchDuration) {
            this.matchDuration = matchDuration;
        }

        public Map<String, String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, String value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class VisitorTeam {

        public VisitorTeam(int id, String name, String logo, Map<String, String> additionalProperties) {
            this.id = id;
            this.name = name;
            this.logo = logo;
            this.additionalProperties = additionalProperties;
        }

        private int id;
        private String name;
        private String logo;
        private Map<String, String> additionalProperties;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public Map<String, String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, String value) {
            this.additionalProperties.put(name, value);
        }
    }
}