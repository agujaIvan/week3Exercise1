package edu.matc.taglibdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.MonthDay;

public class HelloWorldTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        HolidaysAndTimes holidays = new HolidaysAndTimes();
        MonthDay currentDate;
        //currentDate = MonthDay.now();
        currentDate = MonthDay.parse("--12-31");

        JspWriter out = getJspContext().getOut();
        out.println("Hello Ivan");
        out.println(holidays.checkingForTime("04:00"));
        out.println(holidays.checkingForHoliday(currentDate.toString()));




    }
}
