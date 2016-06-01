/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.qutan.data;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @version 1.0     Jun 1, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Mail
 */
public class Mail {
    private final static String EMAIL_FROM = "qutan.help@gmail.com";
    private final static String EMAIL_PWD = "QutanProject";

    public static void sendMail(String to,
            String subject, String body, boolean bodyIsHTML)
            throws MessagingException {

        // 1 - get a mail session
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtps.host", "smtp.gmail.com");
        props.put("mail.smtps.port", 465);
        props.put("mail.smtps.auth", "true");
        props.put("mail.smtps.quitwait", "false");
        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);

        // 2 - create a message
        Message message = new MimeMessage(session);
        message.setSubject(subject);
        if (bodyIsHTML) {
            message.setContent(body, "text/html");
        } else {
            message.setText(body);
        }

        // 3 - address the message
        Address fromAddress = new InternetAddress(EMAIL_PWD);
        Address toAddress = new InternetAddress(to);
        message.setFrom(fromAddress);
        message.setRecipient(Message.RecipientType.TO, toAddress);

        // 4 - send the message
        Transport transport = session.getTransport();
        transport.connect(EMAIL_FROM, EMAIL_PWD);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }

    public static String generateMessage(String user) {
        String body = "<table style='text-align:center;'> "
                + "<thead>"
                    +"<tr><th><h1 style='background-color:#DB563A;color:white;'>QUTAN</h1></th></tr> "
                + "</thead> "
                + "<tbody>"
                    +"<tr><td><h2 style='color:#ab3327;'><i>Dear " + user.trim() + ",</i><h2>"
                        + "<p style='color:#ab3327;'> Thank you for your email!<br/>"
                        + "We have received your message and appreciate you contacting us. "
                        + "Our team tries to respond as soon as possible, so one of Qutan-ers will get back to you within a few hours.</p>"
                    + "</td></tr>"
                + "<tr><td style='text-align:left;color:#DB563A;'>Have a great day ahead,<br/>Qutan team<br/> <img alt='Qutan' src='https://photos-1.dropbox.com/t/2/AACZ_wucpSjGVRH7DDqzSJlRnt9kMK7l8Qu5LIX5TTNNnA/12/383795473/png/32x32/1/_/1/2/qutan_red.svg/EJOZ7oYDGN8DIAEoASgH/MgZT1nzKv0pEkKCvGk2WYZLiAvgqBEdWeh9Y6BVwV9U?size=1280x960&size_mode=3' width='80px' height=auto</td> </tr>"
                + "</tbody>"
          + "</table>";
        return body;
    }
    public static String generateSubscriber(String user) {
        String body = "<table style='text-align:center;'> "
                + "<thead>"
                    +"<tr><th><h1 style='background-color:#DB563A;color:white;'>QUTAN</h1></th></tr> "
                + "</thead> "
                + "<tbody>"
                    +"<tr><td><h2 style='color:#ab3327;'><i>Dear " + user.trim() + ",</i><h2>"
                        + "<p style='color:#ab3327;'> Thank you for your email!<br/>"
                        + "We have received your message and appreciate you contacting us. "
                        + "Our team tries to respond as soon as possible, so one of Qutan-ers will get back to you within a few hours.</p>"
                    + "</td></tr>"
                + "<tr><td style='text-align:left;color:#DB563A;'>Have a great day ahead,<br/>Qutan team<br/> <img alt='Qutan' src='https://photos-1.dropbox.com/t/2/AACZ_wucpSjGVRH7DDqzSJlRnt9kMK7l8Qu5LIX5TTNNnA/12/383795473/png/32x32/1/_/1/2/qutan_red.svg/EJOZ7oYDGN8DIAEoASgH/MgZT1nzKv0pEkKCvGk2WYZLiAvgqBEdWeh9Y6BVwV9U?size=1280x960&size_mode=3' width='80px' height=auto</td> </tr>"
                + "</tbody>"
          + "</table>";
        return body;
    }

}
