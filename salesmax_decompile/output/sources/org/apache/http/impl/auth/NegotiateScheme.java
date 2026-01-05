package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;
import p001o.eja;
import p001o.sia;

@Deprecated
/* loaded from: classes6.dex */
public class NegotiateScheme extends GGSSchemeBase {
    private static final String KERBEROS_OID = "1.2.840.113554.1.2.2";
    private static final String SPNEGO_OID = "1.3.6.1.5.5.2";
    private final sia log;
    private final SpnegoTokenGenerator spengoGenerator;

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator, boolean z) {
        super(z);
        eja.m25143k(getClass());
        this.spengoGenerator = spnegoTokenGenerator;
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, org.apache.http.auth.AuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, null);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase
    public byte[] generateToken(byte[] bArr, String str) {
        return super.generateToken(bArr, str);
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getParameter(String str) {
        Args.notNull(str, "Parameter name");
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getRealm() {
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "Negotiate";
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return true;
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return super.authenticate(credentials, httpRequest, httpContext);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.ietf.jgss.GSSException */
    @Override // org.apache.http.impl.auth.GGSSchemeBase
    public byte[] generateToken(byte[] bArr, String str, Credentials credentials) throws GSSException {
        try {
            return generateGSSToken(bArr, new Oid(SPNEGO_OID), str, credentials);
        } catch (GSSException e) {
            if (e.getMajor() == 2) {
                throw null;
            }
            throw e;
        }
    }

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator) {
        this(spnegoTokenGenerator, false);
    }

    public NegotiateScheme() {
        this(null, false);
    }
}
