package com.sun.mail.smtp;

import com.sun.mail.auth.OAuth2SaslClientFactory;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.MailLogger;
import java.util.Properties;
import java.util.logging.Level;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.sasl.RealmCallback;
import javax.security.sasl.RealmChoiceCallback;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SMTPSaslAuthenticator implements SaslAuthenticator {

    /* renamed from: a */
    public static final /* synthetic */ int f7247a = 0;
    private String host;
    private MailLogger logger;
    private String name;

    /* renamed from: pr, reason: collision with root package name */
    private SMTPTransport f43931pr;
    private Properties props;

    static {
        try {
            OAuth2SaslClientFactory.init();
        } catch (Throwable unused) {
        }
    }

    public SMTPSaslAuthenticator(SMTPTransport sMTPTransport, String str, Properties properties, MailLogger mailLogger, String str2) {
        this.f43931pr = sMTPTransport;
        this.name = str;
        this.props = properties;
        this.logger = mailLogger;
        this.host = str2;
    }

    private static final String responseText(SMTPTransport sMTPTransport) {
        String strTrim = sMTPTransport.getLastServerResponse().trim();
        return strTrim.length() > 4 ? strTrim.substring(4) : "";
    }

    @Override // com.sun.mail.smtp.SaslAuthenticator
    public boolean authenticate(String[] strArr, final String str, String str2, final String str3, final String str4) {
        String string;
        String str5;
        byte[] bArrEvaluateChallenge;
        if (this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("SASL Mechanisms:");
            for (String str6 : strArr) {
                this.logger.fine(" " + str6);
            }
            this.logger.fine("");
        }
        try {
            SaslClient saslClientCreateSaslClient = Sasl.createSaslClient(strArr, str2, this.name, this.host, this.props, new CallbackHandler() { // from class: com.sun.mail.smtp.SMTPSaslAuthenticator.1
                @Override // javax.security.auth.callback.CallbackHandler
                public void handle(Callback[] callbackArr) {
                    if (SMTPSaslAuthenticator.this.logger.isLoggable(Level.FINE)) {
                        SMTPSaslAuthenticator.this.logger.fine("SASL callback length: " + callbackArr.length);
                    }
                    for (int i10 = 0; i10 < callbackArr.length; i10++) {
                        if (SMTPSaslAuthenticator.this.logger.isLoggable(Level.FINE)) {
                            MailLogger mailLogger = SMTPSaslAuthenticator.this.logger;
                            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "SASL callback ", ": ");
                            sbM4567n.append(callbackArr[i10]);
                            mailLogger.fine(sbM4567n.toString());
                        }
                        Callback callback = callbackArr[i10];
                        if (callback instanceof NameCallback) {
                            ((NameCallback) callback).setName(str3);
                        } else if (callback instanceof PasswordCallback) {
                            ((PasswordCallback) callback).setPassword(str4.toCharArray());
                        } else if (callback instanceof RealmCallback) {
                            RealmCallback realmCallback = (RealmCallback) callback;
                            String defaultText = str;
                            if (defaultText == null) {
                                defaultText = realmCallback.getDefaultText();
                            }
                            realmCallback.setText(defaultText);
                        } else if (callback instanceof RealmChoiceCallback) {
                            RealmChoiceCallback realmChoiceCallback = (RealmChoiceCallback) callback;
                            if (str == null) {
                                realmChoiceCallback.setSelectedIndex(realmChoiceCallback.getDefaultChoice());
                            } else {
                                String[] choices = realmChoiceCallback.getChoices();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= choices.length) {
                                        break;
                                    }
                                    if (choices[i11].equals(str)) {
                                        realmChoiceCallback.setSelectedIndex(i11);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
            });
            if (saslClientCreateSaslClient == null) {
                this.logger.fine("No SASL support");
                throw new UnsupportedOperationException("No SASL support");
            }
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("SASL client " + saslClientCreateSaslClient.getMechanismName());
            }
            try {
                String mechanismName = saslClientCreateSaslClient.getMechanismName();
                if (saslClientCreateSaslClient.hasInitialResponse()) {
                    byte[] bArrEvaluateChallenge2 = saslClientCreateSaslClient.evaluateChallenge(new byte[0]);
                    if (bArrEvaluateChallenge2.length > 0) {
                        byte[] bArrEncode = BASE64EncoderStream.encode(bArrEvaluateChallenge2);
                        string = ASCIIUtility.toString(bArrEncode, 0, bArrEncode.length);
                    } else {
                        string = "=";
                    }
                } else {
                    string = null;
                }
                int iSimpleCommand = string != null ? this.f43931pr.simpleCommand("AUTH " + mechanismName + " " + string) : this.f43931pr.simpleCommand("AUTH " + mechanismName);
                if (iSimpleCommand == 530) {
                    this.f43931pr.startTLS();
                    iSimpleCommand = string != null ? this.f43931pr.simpleCommand("AUTH " + mechanismName + " " + string) : this.f43931pr.simpleCommand("AUTH " + mechanismName);
                }
                if (iSimpleCommand == 235) {
                    return true;
                }
                if (iSimpleCommand != 334) {
                    return false;
                }
                int iSimpleCommand2 = iSimpleCommand;
                boolean z6 = false;
                while (!z6) {
                    if (iSimpleCommand2 == 334) {
                        try {
                            if (saslClientCreateSaslClient.isComplete()) {
                                bArrEvaluateChallenge = null;
                            } else {
                                byte[] bytes = ASCIIUtility.getBytes(responseText(this.f43931pr));
                                if (bytes.length > 0) {
                                    bytes = BASE64DecoderStream.decode(bytes);
                                }
                                if (this.logger.isLoggable(Level.FINE)) {
                                    this.logger.fine("SASL challenge: " + ASCIIUtility.toString(bytes, 0, bytes.length) + " :");
                                }
                                bArrEvaluateChallenge = saslClientCreateSaslClient.evaluateChallenge(bytes);
                            }
                            if (bArrEvaluateChallenge == null) {
                                this.logger.fine("SASL: no response");
                                iSimpleCommand2 = this.f43931pr.simpleCommand("");
                            } else {
                                if (this.logger.isLoggable(Level.FINE)) {
                                    this.logger.fine("SASL response: " + ASCIIUtility.toString(bArrEvaluateChallenge, 0, bArrEvaluateChallenge.length) + " :");
                                }
                                iSimpleCommand2 = this.f43931pr.simpleCommand(BASE64EncoderStream.encode(bArrEvaluateChallenge));
                            }
                        } catch (Exception e2) {
                            this.logger.log(Level.FINE, "SASL Exception", (Throwable) e2);
                        }
                    }
                    z6 = true;
                }
                if (iSimpleCommand2 != 235) {
                    return false;
                }
                if (!saslClientCreateSaslClient.isComplete() || (str5 = (String) saslClientCreateSaslClient.getNegotiatedProperty("javax.security.sasl.qop")) == null || (!str5.equalsIgnoreCase("auth-int") && !str5.equalsIgnoreCase("auth-conf"))) {
                    return true;
                }
                this.logger.fine("SASL Mechanism requires integrity or confidentiality");
                return false;
            } catch (Exception e10) {
                this.logger.log(Level.FINE, "SASL AUTHENTICATE Exception", (Throwable) e10);
                return false;
            }
        } catch (SaslException e11) {
            this.logger.log(Level.FINE, "Failed to create SASL client", e11);
            throw new UnsupportedOperationException(e11.getMessage(), e11);
        }
    }
}
