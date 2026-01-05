package com.sun.mail.iap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ConnectionException extends ProtocolException {
    private static final long serialVersionUID = 5749739604257464727L;

    /* renamed from: p */
    private transient Protocol f7245p;

    public ConnectionException() {
    }

    public Protocol getProtocol() {
        return this.f7245p;
    }

    public ConnectionException(String str) {
        super(str);
    }

    public ConnectionException(Protocol protocol, Response response) {
        super(response);
        this.f7245p = protocol;
    }
}
