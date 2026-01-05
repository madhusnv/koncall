package org.apache.http.client;

import org.apache.http.util.TextUtils;

/* loaded from: classes6.dex */
public class HttpResponseException extends ClientProtocolException {
    private static final long serialVersionUID = -7186627969477257933L;
    private final String reasonPhrase;
    private final int statusCode;

    public HttpResponseException(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("status code: %d");
        sb.append(TextUtils.isBlank(str) ? "" : ", reason phrase: %s");
        super(String.format(sb.toString(), Integer.valueOf(i), str));
        this.statusCode = i;
        this.reasonPhrase = str;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
