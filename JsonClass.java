package homework7;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.ArrayList;
public class JsonClass {



    public class Headline{
        @JsonProperty("EffectiveDate")
        public String effectiveDate;
        @JsonProperty("EffectiveEpochDate")
        public String effectiveEpochDate;
        @JsonProperty("Severity")
        public String severity;
        @JsonProperty("Text")
        public String text;
        @JsonProperty("Category")
        public String category;
        @JsonProperty("EndDate")
        public String endDate;
        @JsonProperty("EndEpochDate")
        public String endEpochDate;
        @JsonProperty("MobileLink")
        public String mobileLink;
        @JsonProperty("Link")
        public String link;
    }

    public class Minimum{
        @JsonProperty("Value")
        public String value;
        @JsonProperty("Unit")
        public String unit;
        @JsonProperty("UnitType")
        public String unitType;
    }

    public class Maximum{
        @JsonProperty("Value")
        public String value;
        @JsonProperty("Unit")
        public String unit;
        @JsonProperty("UnitType")
        public String unitType;
    }

    public class Temperature{
        @JsonProperty("Minimum")
        public Minimum minimum;
        @JsonProperty("Maximum")
        public Maximum maximum;
    }

    public class Day{
        @JsonProperty("Icon")
        public String icon;
        @JsonProperty("IconPhrase")
        public String iconPhrase;
        @JsonProperty("HasPrecipitation")
        public String hasPrecipitation;
    }

    public class Night{
        @JsonProperty("Icon")
        public String icon;
        @JsonProperty("IconPhrase")
        public String iconPhrase;
        @JsonProperty("HasPrecipitation")
        public String hasPrecipitation;
    }

    public class DailyForecast{
        @JsonProperty("Date")
        public String date;
        @JsonProperty("EpochDate")
        public String epochDate;
        @JsonProperty("Temperature")
        public Temperature temperature;
        @JsonProperty("Day")
        public Day day;
        @JsonProperty("Night")
        public Night night;
        @JsonProperty("Sources")
        public java.util.ArrayList<String> sources;
        @JsonProperty("MobileLink")
        public String mobileLink;
        @JsonProperty("Link")
        public String link;
    }

    public  class Root{
        @JsonProperty("Headline")
        public Headline headline;
        @JsonProperty("DailyForecasts")
        public java.util.ArrayList<DailyForecast> dailyForecasts;
    }


}
