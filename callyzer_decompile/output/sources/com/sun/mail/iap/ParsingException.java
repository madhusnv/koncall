package com.sun.mail.iap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ParsingException extends ProtocolException {
    private static final long serialVersionUID = 7756119840142724839L;

    public ParsingException() {
    }

    public ParsingException(String str) {
        super(str);
    }

    public ParsingException(Response response) {
        super(response);
    }
}
