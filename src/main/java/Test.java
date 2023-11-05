import java.util.logging.Logger;

public class Test {

    private String file;
    private String host;
    private int port = -1;
    private String protocol;
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.protocol != null) {
            stringBuffer.append(this.protocol);
            stringBuffer.append("://");
        }
        stringBuffer.append(this.host);
        if (this.port != -1) {
            stringBuffer.append(":");
            stringBuffer.append(this.port);
        }
        if (this.file != null)
            stringBuffer.append(this.file);
        Logger.getLogger("com.xk72.charles.CharlesContext").info("Transcation URL: " + stringBuffer.toString());
        return stringBuffer.toString();
    }

}
