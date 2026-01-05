package com.sun.mail.iap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ProtocolException extends Exception {
    private static final long serialVersionUID = -4360500807971797439L;
    protected transient Response response;

    public ProtocolException() {
        this.response = null;
    }

    public Response getResponse() {
        return this.response;
    }

    public ProtocolException(String str) {
        super(str);
        this.response = null;
    }

    public ProtocolException(String str, Throwable th2) {
        super(str, th2);
        this.response = null;
    }

    public ProtocolException(Response response) {
        super(response.toString());
        this.response = response;
    }
}
