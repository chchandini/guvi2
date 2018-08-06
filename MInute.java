 int totalMinutesInt = Integer.valueOf(totalMinutes.toString());

        int hours = totalMinutesInt / 60;
        int hoursToDisplay = hours;

        if (hours > 12) {
            hoursToDisplay = hoursToDisplay - 12;
        }

        int minutesToDisplay = totalMinutesInt - (hours * 60);

        String minToDisplay = null;
        if(minutesToDisplay == 0 ) minToDisplay = "00";     
        else if( minutesToDisplay < 10 ) minToDisplay = "0" + minutesToDisplay ;
        else minToDisplay = "" + minutesToDisplay ;

        String displayValue = hoursToDisplay + ":" + minToDisplay;

        if (hours < 12)
            displayValue = displayValue + " AM";
        else
            displayValue = displayValue + " PM";

        return displayValue;
    } catch (Exception e) {
        LOGGER.error("Error while converting currency.");
    }
    return totalMinutes.toString();
