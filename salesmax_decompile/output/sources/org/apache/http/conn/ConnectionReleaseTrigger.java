package org.apache.http.conn;

/* loaded from: classes6.dex */
public interface ConnectionReleaseTrigger {
    void abortConnection();

    void releaseConnection();
}
