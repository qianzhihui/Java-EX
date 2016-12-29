package xdean.jex.util.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {  
  public static String getStackTraceString(Throwable tr) {
    if (tr == null) {
      return "";
    }
    Throwable t = tr;
    while (t.getCause() != null) {
      t = t.getCause();
    }
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    t.printStackTrace(pw);
    pw.flush();
    return sw.toString();
  }
}
