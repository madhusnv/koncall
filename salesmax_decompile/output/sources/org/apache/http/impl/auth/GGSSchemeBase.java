package org.apache.http.impl.auth;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.KerberosCredentials;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;
import p001o.bb1;
import p001o.eja;
import p001o.sia;

/* loaded from: classes6.dex */
public abstract class GGSSchemeBase extends AuthSchemeBase {
    private final bb1 base64codec;
    private final sia log;
    private State state;
    private final boolean stripPort;
    private byte[] token;
    private final boolean useCanonicalHostname;

    /* renamed from: org.apache.http.impl.auth.GGSSchemeBase$1 */
    public static /* synthetic */ class C187511 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State = iArr;
            try {
                iArr[State.UNINITIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State[State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State[State.CHALLENGE_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State[State.TOKEN_GENERATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    public GGSSchemeBase(boolean z, boolean z2) {
        eja.m25143k(getClass());
        this.base64codec = new bb1(0);
        this.stripPort = z;
        this.useCanonicalHostname = z2;
        this.state = State.UNINITIATED;
    }

    private String resolveCanonicalHostname(String str) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName(str);
        String canonicalHostName = byName.getCanonicalHostName();
        return byName.getHostAddress().contentEquals(canonicalHostName) ? str : canonicalHostName;
    }

    @Override // org.apache.http.auth.AuthScheme
    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, null);
    }

    public GSSContext createGSSContext(GSSManager gSSManager, Oid oid, GSSName gSSName, GSSCredential gSSCredential) {
        GSSContext gSSContextCreateContext = gSSManager.createContext(gSSName.canonicalize(oid), oid, gSSCredential, 0);
        gSSContextCreateContext.requestMutualAuth(true);
        return gSSContextCreateContext;
    }

    public byte[] generateGSSToken(byte[] bArr, Oid oid, String str) {
        return generateGSSToken(bArr, oid, str, null);
    }

    @Deprecated
    public byte[] generateToken(byte[] bArr, String str) {
        return null;
    }

    public GSSManager getManager() {
        return GSSManager.getInstance();
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        State state = this.state;
        return state == State.TOKEN_GENERATED || state == State.FAILED;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) {
        charArrayBuffer.substringTrimmed(i, i2);
        throw null;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) throws AuthenticationException {
        HttpHost targetHost;
        Args.notNull(httpRequest, "HTTP request");
        int i = C187511.$SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State[this.state.ordinal()];
        if (i == 1) {
            throw new AuthenticationException(getSchemeName() + " authentication has not been initiated");
        }
        if (i == 2) {
            throw new AuthenticationException(getSchemeName() + " authentication has failed");
        }
        if (i != 3) {
            if (i == 4) {
                new String(this.base64codec.m26476f(this.token));
                throw null;
            }
            throw new IllegalStateException("Illegal state: " + this.state);
        }
        try {
            HttpRoute httpRoute = (HttpRoute) httpContext.getAttribute("http.route");
            if (httpRoute == null) {
                throw new AuthenticationException("Connection route is not available");
            }
            if (!isProxy() || (targetHost = httpRoute.getProxyHost()) == null) {
                targetHost = httpRoute.getTargetHost();
            }
            String hostName = targetHost.getHostName();
            if (this.useCanonicalHostname) {
                try {
                    hostName = resolveCanonicalHostname(hostName);
                } catch (UnknownHostException unused) {
                }
            }
            if (this.stripPort) {
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(hostName);
            sb.append(":");
            sb.append(targetHost.getPort());
            throw null;
        } catch (GSSException e) {
            this.state = State.FAILED;
            if (e.getMajor() == 9 || e.getMajor() == 8) {
                throw new InvalidCredentialsException(e.getMessage(), e);
            }
            if (e.getMajor() == 13) {
                throw new InvalidCredentialsException(e.getMessage(), e);
            }
            if (e.getMajor() == 10 || e.getMajor() == 19 || e.getMajor() == 20) {
                throw new AuthenticationException(e.getMessage(), e);
            }
            throw new AuthenticationException(e.getMessage());
        }
    }

    public byte[] generateGSSToken(byte[] bArr, Oid oid, String str, Credentials credentials) {
        GSSManager manager = getManager();
        GSSContext gSSContextCreateGSSContext = createGSSContext(manager, oid, manager.createName("HTTP@" + str, GSSName.NT_HOSTBASED_SERVICE), credentials instanceof KerberosCredentials ? ((KerberosCredentials) credentials).getGSSCredential() : null);
        return bArr != null ? gSSContextCreateGSSContext.initSecContext(bArr, 0, bArr.length) : gSSContextCreateGSSContext.initSecContext(new byte[0], 0, 0);
    }

    public byte[] generateToken(byte[] bArr, String str, Credentials credentials) {
        return generateToken(bArr, str);
    }

    public GGSSchemeBase(boolean z) {
        this(z, true);
    }

    public GGSSchemeBase() {
        this(true, true);
    }
}
