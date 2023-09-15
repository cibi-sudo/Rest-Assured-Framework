package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
    public static String getcurrenttime() {
        return new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy").format(new Date());
    }
}
