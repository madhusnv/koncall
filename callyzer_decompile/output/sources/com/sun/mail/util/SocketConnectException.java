package com.sun.mail.util;

import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class SocketConnectException extends IOException {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 3997871560538755463L;
    private int cto;
    private String host;
    private int port;

    public SocketConnectException(String str, Exception exc, String str2, int i10, int i11) {
        super(str);
        initCause(exc);
        this.host = str2;
        this.port = i10;
        this.cto = i11;
    }

    public int getConnectionTimeout() {
        return this.cto;
    }

    public Exception getException() {
        return (Exception) getCause();
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }
}
