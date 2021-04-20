package location_web_app_practice.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;


@Component
public class EmailUtil{ 
	@Autowired
	JavaMailSender mailsender;
	
	public void sendEmail(String toAddress,String emailSubject,String emailBody) {
		MimeMessage message = mailsender.createMimeMessage();
		MimeMessageHelper messageHelper=new MimeMessageHelper(message);
		try {
		
			messageHelper.setTo(toAddress);
			messageHelper.setText(emailSubject);
			messageHelper.setSubject(emailBody);
			mailsender.send(message);
		} catch (Exception e) {
			System.out.println(e);
	
		}
	}
  
}
