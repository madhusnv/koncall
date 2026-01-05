package com.sun.mail.iap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class BadCommandException extends ProtocolException {
    private static final long serialVersionUID = 5769722539397237515L;

    public BadCommandException() {
    }

    public BadCommandException(String str) {
        super(str);
    }

    public BadCommandException(Response response) {
        super(response);
    }
}
