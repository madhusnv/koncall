package org.apache.http.io;

import org.apache.http.HttpMessage;

/* loaded from: classes6.dex */
public interface HttpMessageParser<T extends HttpMessage> {
    T parse();
}
