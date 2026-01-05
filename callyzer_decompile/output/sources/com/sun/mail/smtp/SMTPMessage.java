package com.sun.mail.smtp;

import jakarta.mail.c0;
import jakarta.mail.internet.C3665n;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SMTPMessage extends C3665n {
    public static final int NOTIFY_DELAY = 4;
    public static final int NOTIFY_FAILURE = 2;
    public static final int NOTIFY_NEVER = -1;
    public static final int NOTIFY_SUCCESS = 1;
    public static final int RETURN_FULL = 1;
    public static final int RETURN_HDRS = 2;
    private static final String[] returnOptionString = {null, "FULL", "HDRS"};
    private boolean allow8bitMIME;
    private String envelopeFrom;
    private String extension;
    private int notifyOptions;
    private int returnOption;
    private boolean sendPartial;
    private String submitter;

    public SMTPMessage(c0 c0Var) {
        super(c0Var);
        this.notifyOptions = 0;
        this.returnOption = 0;
        this.sendPartial = false;
        this.allow8bitMIME = false;
        this.submitter = null;
        this.extension = null;
    }

    public boolean getAllow8bitMIME() {
        return this.allow8bitMIME;
    }

    public String getDSNNotify() {
        int i10 = this.notifyOptions;
        if (i10 == 0) {
            return null;
        }
        if (i10 == -1) {
            return "NEVER";
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.notifyOptions & 1) != 0) {
            sb2.append("SUCCESS");
        }
        if ((this.notifyOptions & 2) != 0) {
            if (sb2.length() != 0) {
                sb2.append(',');
            }
            sb2.append("FAILURE");
        }
        if ((this.notifyOptions & 4) != 0) {
            if (sb2.length() != 0) {
                sb2.append(',');
            }
            sb2.append("DELAY");
        }
        return sb2.toString();
    }

    public String getDSNRet() {
        return returnOptionString[this.returnOption];
    }

    public String getEnvelopeFrom() {
        return this.envelopeFrom;
    }

    public String getMailExtension() {
        return this.extension;
    }

    public int getNotifyOptions() {
        return this.notifyOptions;
    }

    public int getReturnOption() {
        return this.returnOption;
    }

    public boolean getSendPartial() {
        return this.sendPartial;
    }

    public String getSubmitter() {
        return this.submitter;
    }

    public void setAllow8bitMIME(boolean z6) {
        this.allow8bitMIME = z6;
    }

    public void setEnvelopeFrom(String str) {
        this.envelopeFrom = str;
    }

    public void setMailExtension(String str) {
        this.extension = str;
    }

    public void setNotifyOptions(int i10) {
        if (i10 < -1 || i10 >= 8) {
            throw new IllegalArgumentException("Bad return option");
        }
        this.notifyOptions = i10;
    }

    public void setReturnOption(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Bad return option");
        }
        this.returnOption = i10;
    }

    public void setSendPartial(boolean z6) {
        this.sendPartial = z6;
    }

    public void setSubmitter(String str) {
        this.submitter = str;
    }

    public SMTPMessage(c0 c0Var, InputStream inputStream) {
        super(c0Var, inputStream);
        this.notifyOptions = 0;
        this.returnOption = 0;
        this.sendPartial = false;
        this.allow8bitMIME = false;
        this.submitter = null;
        this.extension = null;
    }

    public SMTPMessage(C3665n c3665n) {
        super(c3665n);
        this.notifyOptions = 0;
        this.returnOption = 0;
        this.sendPartial = false;
        this.allow8bitMIME = false;
        this.submitter = null;
        this.extension = null;
    }
}
