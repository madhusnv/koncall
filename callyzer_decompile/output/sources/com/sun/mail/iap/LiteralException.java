package com.sun.mail.iap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class LiteralException extends ProtocolException {
    private static final long serialVersionUID = -6919179828339609913L;

    public LiteralException(Response response) {
        super(response.toString());
        this.response = response;
    }
}
