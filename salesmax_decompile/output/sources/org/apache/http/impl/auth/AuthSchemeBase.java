package org.apache.http.impl.auth;

import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes6.dex */
public abstract class AuthSchemeBase implements ContextAwareAuthScheme {
    protected ChallengeState challengeState;

    @Deprecated
    public AuthSchemeBase(ChallengeState challengeState) {
        this.challengeState = challengeState;
    }

    @Override // org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authenticate(credentials, httpRequest);
    }

    public ChallengeState getChallengeState() {
        return this.challengeState;
    }

    public boolean isProxy() {
        ChallengeState challengeState = this.challengeState;
        return challengeState != null && challengeState == ChallengeState.PROXY;
    }

    public abstract void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2);

    @Override // org.apache.http.auth.AuthScheme
    public void processChallenge(Header header) throws MalformedChallengeException {
        CharArrayBuffer charArrayBuffer;
        int valuePos;
        Args.notNull(header, "Header");
        String name = header.getName();
        if (name.equalsIgnoreCase("WWW-Authenticate")) {
            this.challengeState = ChallengeState.TARGET;
        } else {
            if (!name.equalsIgnoreCase("Proxy-Authenticate")) {
                throw new MalformedChallengeException("Unexpected header name: " + name);
            }
            this.challengeState = ChallengeState.PROXY;
        }
        if (header instanceof FormattedHeader) {
            FormattedHeader formattedHeader = (FormattedHeader) header;
            charArrayBuffer = formattedHeader.getBuffer();
            valuePos = formattedHeader.getValuePos();
        } else {
            String value = header.getValue();
            if (value == null) {
                throw new MalformedChallengeException("Header value is null");
            }
            charArrayBuffer = new CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
            valuePos = 0;
        }
        while (valuePos < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(valuePos))) {
            valuePos++;
        }
        int i = valuePos;
        while (i < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
            i++;
        }
        String strSubstring = charArrayBuffer.substring(valuePos, i);
        if (strSubstring.equalsIgnoreCase(getSchemeName())) {
            parseChallenge(charArrayBuffer, i, charArrayBuffer.length());
            return;
        }
        throw new MalformedChallengeException("Invalid scheme identifier: " + strSubstring);
    }

    public String toString() {
        String schemeName = getSchemeName();
        return schemeName != null ? schemeName.toUpperCase(Locale.ROOT) : super.toString();
    }

    public AuthSchemeBase() {
    }
}
