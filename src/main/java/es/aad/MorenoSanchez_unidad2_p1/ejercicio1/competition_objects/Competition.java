package es.aad.MorenoSanchez_unidad2_p1.ejercicio1;



public class Competition
{
    private int competition_id;
    private int season_id;
    private String country_name;
    private String competition_name;
    private String competition_gender;
    private boolean competition_youth;
    private boolean competition_international;
    private String season_name;
    private String match_updated;
    private String match_updated_360;
    private String match_available;
    private String match_available_360;

    public int getCompetition_id()
    {
        return this.competition_id;
    }

    public void setCompetition_id(int competition_id)
    {
        this.competition_id = competition_id;
    }

    public int getSeason_id()
    {
        return this.season_id;
    }

    public void setSeason_id(int season_id)
    {
        this.season_id = season_id;
    }

    public String getCountry_name()
    {
        return this.country_name;
    }

    public void setCountry_name(String country_name)
    {
        this.country_name = country_name;
    }

    public String getCompetition_name()
    {
        return this.competition_name;
    }

    public void setCompetition_name(String competition_name)
    {
        this.competition_name = competition_name;
    }

    public String getCompetition_gender()
    {
        return this.competition_gender;
    }

    public void setCompetition_gender(String competition_gender)
    {
        this.competition_gender = competition_gender;
    }

    public boolean isCompetition_youth()
    {
        return this.competition_youth;
    }

    public void setCompetition_youth(boolean competition_youth)
    {
        this.competition_youth = competition_youth;
    }

    public boolean isCompetition_international()
    {
        return this.competition_international;
    }

    public void setCompetition_international(boolean competition_international)
    {
        this.competition_international = competition_international;
    }

    public String getSeason_name()
    {
        return this.season_name;
    }

    public void setSeason_name(String season_name)
    {
        this.season_name = season_name;
    }

    public String getMatch_updated()
    {
        return this.match_updated;
    }

    public void setMatch_updated(String match_updated)
    {
        this.match_updated = match_updated;
    }

    public String getMatch_updated_360()
    {
        return this.match_updated_360;
    }

    public void setMatch_updated_360(String match_updated_360)
    {
        this.match_updated_360 = match_updated_360;
    }

    public String getMatch_available()
    {
        return this.match_available;
    }

    public void setMatch_available(String match_available)
    {
        this.match_available = match_available;
    }

    public String getMatch_available_360()
    {
        return this.match_available_360;
    }

    public void setMatch_available_360(String match_available_360)
    {
        this.match_available_360 = match_available_360;
    }

    @Override
    public String toString()
    {
        return "Competition{" +
                "competition_id=" + competition_id +
                ", season_id=" + season_id +
                ", country_name='" + country_name + '\'' +
                ", competition_name='" + competition_name + '\'' +
                ", competition_gender='" + competition_gender + '\'' +
                ", competition_youth=" + competition_youth +
                ", competition_international=" + competition_international +
                ", season_name='" + season_name + '\'' +
                ", match_updated='" + match_updated + '\'' +
                ", match_updated_360='" + match_updated_360 + '\'' +
                ", match_available='" + match_available + '\'' +
                ", match_available_360='" + match_available_360 + '\'' +
                '}';
    }
}
