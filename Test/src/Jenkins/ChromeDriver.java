package Jenkins;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;

public class ChromeDriver extends RemoteWebDriver {

    public  ChromeDriver(URL url, String sessionId) {
        super();
        setSessionId(sessionId);
        setCommandExecutor(new HttpCommandExecutor(url) {
            @Override
            public Response execute(Command command) throws IOException {
                if (command.getName() != "newSession") {
                    return super.execute(command);
                }
                return super.execute(new Command(getSessionId(), "getCapabilities"));
            }
        });
        startSession(new DesiredCapabilities());
    }
    public static void main(String[] args) throws MalformedURLException {
    	URL  url = new URL("http://www.google.com");
    	ChromeDriver chromeDriver= new ChromeDriver(url, "http://10.10.203.41");
    	//chromeDriver.setCommandExecutor(executor);
		
	}
}