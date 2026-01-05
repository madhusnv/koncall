package com.sun.mail.imap;

import a2.AbstractC0030c;
import jakarta.mail.AuthenticationFailedException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ReferralException extends AuthenticationFailedException {
    private static final long serialVersionUID = -3414063558596287683L;
    private String text;
    private String url;

    public ReferralException(String str, String str2) {
        super(AbstractC0030c.m121l("[REFERRAL ", str, "] ", str2));
        this.url = str;
        this.text = str2;
    }

    public String getText() {
        return this.text;
    }

    public String getUrl() {
        return this.url;
    }
}
