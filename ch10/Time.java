public class Time
{
    private int hour;
    private int minute;

    public Time(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public String getMilitaryTime()
    {
        String formattedTime = hour + ":" + minute;
        return formattedTime;
    }

    public String getTime()
    {
        String otherTime;
        String amPm = "AM";
        if(hour > 12)
        {
            hour -= 12;
            amPm = "PM";
        }
        otherTime = hour + ":" + minute +  " " + amPm;

        return otherTime;
    }

    public Time(int hour, int minute, boolean pm)
    {
        if(pm)
        {
            hour = hour + 12;
        }
        this.hour = hour;
        this.minute = minute;


    }
}
