package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ProtocolException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPReferralException extends ProtocolException {
    private static final long serialVersionUID = 2578770669364251968L;
    private String url;

    public IMAPReferralException(String str, String str2) {
        super(str);
        this.url = str2;
    }

    public String getUrl() {
        return this.url;
    }
}
