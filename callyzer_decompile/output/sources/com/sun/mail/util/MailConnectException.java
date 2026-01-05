package com.sun.mail.util;

import jakarta.mail.MessagingException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class MailConnectException extends MessagingException {
    private static final long serialVersionUID = -3818807731125317729L;
    private int cto;
    private String host;
    private int port;

    public MailConnectException(SocketConnectException socketConnectException) {
        String str;
        StringBuilder sb2 = new StringBuilder("Couldn't connect to host, port: ");
        sb2.append(socketConnectException.getHost());
        sb2.append(", ");
        sb2.append(socketConnectException.getPort());
        sb2.append("; timeout ");
        sb2.append(socketConnectException.getConnectionTimeout());
        if (socketConnectException.getMessage() != null) {
            str = "; " + socketConnectException.getMessage();
        } else {
            str = "";
        }
        sb2.append(str);
        super(sb2.toString());
        this.host = socketConnectException.getHost();
        this.port = socketConnectException.getPort();
        this.cto = socketConnectException.getConnectionTimeout();
        setNextException(socketConnectException.getException());
    }

    public int getConnectionTimeout() {
        return this.cto;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }
}
