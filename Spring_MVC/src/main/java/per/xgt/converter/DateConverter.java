package per.xgt.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/9/16 15:24
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String dateStr) {
        //将日期的字符串转换成真正的日期对象
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            date = null;
        }
        return date;
    }
}
