package core.concretes;

import core.abstracts.SendService;
import twilioSms.TwilioSmsManager;

public class TwilioSmsManagerAdapter implements SendService {
	private TwilioSmsManager twilioSmsManager;
	public TwilioSmsManagerAdapter() {
		twilioSmsManager = new TwilioSmsManager();
	}
	
	@Override
	public void send(String serviceTypeContact, String message) {
		twilioSmsManager.send(serviceTypeContact, message);
			
		}
	
		
	}
