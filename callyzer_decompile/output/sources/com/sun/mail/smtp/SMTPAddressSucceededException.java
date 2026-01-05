package com.sun.mail.smtp;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.C3655d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SMTPAddressSucceededException extends MessagingException {
    private static final long serialVersionUID = -1168335848623096749L;
    protected C3655d addr;
    protected String cmd;

    /* renamed from: rc, reason: collision with root package name */
    protected int f43930rc;

    public SMTPAddressSucceededException(C3655d c3655d, String str, int i10, String str2) {
        super(str2);
        this.addr = c3655d;
        this.cmd = str;
        this.f43930rc = i10;
    }

    public C3655d getAddress() {
        return this.addr;
    }

    public String getCommand() {
        return this.cmd;
    }

    public int getReturnCode() {
        return this.f43930rc;
    }
}
