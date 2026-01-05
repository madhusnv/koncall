package com.sun.mail.smtp;

import jakarta.mail.AbstractC3633a;
import jakarta.mail.SendFailedException;
import jakarta.mail.internet.C3655d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SMTPSendFailedException extends SendFailedException {
    private static final long serialVersionUID = 8049122628728932894L;
    protected C3655d addr;
    protected String cmd;

    /* renamed from: rc, reason: collision with root package name */
    protected int f43932rc;

    public SMTPSendFailedException(String str, int i10, String str2, Exception exc, AbstractC3633a[] abstractC3633aArr, AbstractC3633a[] abstractC3633aArr2, AbstractC3633a[] abstractC3633aArr3) {
        super(str2, exc, abstractC3633aArr, abstractC3633aArr2, abstractC3633aArr3);
        this.cmd = str;
        this.f43932rc = i10;
    }

    public String getCommand() {
        return this.cmd;
    }

    public int getReturnCode() {
        return this.f43932rc;
    }
}
