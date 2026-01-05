package com.google.api;

import com.google.api.JwtLocation;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p001o.hxc;
import p001o.jf3;
import p001o.qp6;
import p001o.r8;
import p001o.wn7;
import p001o.xq1;
import p001o.yn8;

/* loaded from: classes3.dex */
public final class AuthProvider extends wn7 implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile hxc PARSER;
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private yn8.InterfaceC18446j jwtLocations_ = wn7.emptyProtobufList();

    /* renamed from: com.google.api.AuthProvider$1 */
    public static /* synthetic */ class C111881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f13287xa1df5c61;

        static {
            int[] iArr = new int[wn7.EnumC17940g.values().length];
            f13287xa1df5c61 = iArr;
            try {
                iArr[wn7.EnumC17940g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13287xa1df5c61[wn7.EnumC17940g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13287xa1df5c61[wn7.EnumC17940g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13287xa1df5c61[wn7.EnumC17940g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13287xa1df5c61[wn7.EnumC17940g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13287xa1df5c61[wn7.EnumC17940g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13287xa1df5c61[wn7.EnumC17940g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends wn7.AbstractC17934a implements AuthProviderOrBuilder {
        public /* synthetic */ Builder(C111881 c111881) {
            this();
        }

        public Builder addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
            copyOnWrite();
            ((AuthProvider) this.instance).addAllJwtLocations(iterable);
            return this;
        }

        public Builder addJwtLocations(JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(jwtLocation);
            return this;
        }

        public Builder clearAudiences() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearAudiences();
            return this;
        }

        public Builder clearAuthorizationUrl() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearAuthorizationUrl();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearId();
            return this;
        }

        public Builder clearIssuer() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearIssuer();
            return this;
        }

        public Builder clearJwksUri() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearJwksUri();
            return this;
        }

        public Builder clearJwtLocations() {
            copyOnWrite();
            ((AuthProvider) this.instance).clearJwtLocations();
            return this;
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getAudiences() {
            return ((AuthProvider) this.instance).getAudiences();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public xq1 getAudiencesBytes() {
            return ((AuthProvider) this.instance).getAudiencesBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getAuthorizationUrl() {
            return ((AuthProvider) this.instance).getAuthorizationUrl();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public xq1 getAuthorizationUrlBytes() {
            return ((AuthProvider) this.instance).getAuthorizationUrlBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getId() {
            return ((AuthProvider) this.instance).getId();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public xq1 getIdBytes() {
            return ((AuthProvider) this.instance).getIdBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getIssuer() {
            return ((AuthProvider) this.instance).getIssuer();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public xq1 getIssuerBytes() {
            return ((AuthProvider) this.instance).getIssuerBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getJwksUri() {
            return ((AuthProvider) this.instance).getJwksUri();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public xq1 getJwksUriBytes() {
            return ((AuthProvider) this.instance).getJwksUriBytes();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public JwtLocation getJwtLocations(int i) {
            return ((AuthProvider) this.instance).getJwtLocations(i);
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public int getJwtLocationsCount() {
            return ((AuthProvider) this.instance).getJwtLocationsCount();
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public List<JwtLocation> getJwtLocationsList() {
            return Collections.unmodifiableList(((AuthProvider) this.instance).getJwtLocationsList());
        }

        public Builder removeJwtLocations(int i) {
            copyOnWrite();
            ((AuthProvider) this.instance).removeJwtLocations(i);
            return this;
        }

        public Builder setAudiences(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAudiences(str);
            return this;
        }

        public Builder setAudiencesBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAudiencesBytes(xq1Var);
            return this;
        }

        public Builder setAuthorizationUrl(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAuthorizationUrl(str);
            return this;
        }

        public Builder setAuthorizationUrlBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AuthProvider) this.instance).setAuthorizationUrlBytes(xq1Var);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AuthProvider) this.instance).setIdBytes(xq1Var);
            return this;
        }

        public Builder setIssuer(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setIssuer(str);
            return this;
        }

        public Builder setIssuerBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AuthProvider) this.instance).setIssuerBytes(xq1Var);
            return this;
        }

        public Builder setJwksUri(String str) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwksUri(str);
            return this;
        }

        public Builder setJwksUriBytes(xq1 xq1Var) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwksUriBytes(xq1Var);
            return this;
        }

        public Builder setJwtLocations(int i, JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwtLocations(i, jwtLocation);
            return this;
        }

        private Builder() {
            super(AuthProvider.DEFAULT_INSTANCE);
        }

        public Builder addJwtLocations(int i, JwtLocation jwtLocation) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(i, jwtLocation);
            return this;
        }

        public Builder setJwtLocations(int i, JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).setJwtLocations(i, (JwtLocation) builder.build());
            return this;
        }

        public Builder addJwtLocations(JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations((JwtLocation) builder.build());
            return this;
        }

        public Builder addJwtLocations(int i, JwtLocation.Builder builder) {
            copyOnWrite();
            ((AuthProvider) this.instance).addJwtLocations(i, (JwtLocation) builder.build());
            return this;
        }
    }

    static {
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        wn7.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    private AuthProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        ensureJwtLocationsIsMutable();
        r8.addAll((Iterable) iterable, (List) this.jwtLocations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJwtLocations(JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jwtLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorizationUrl() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIssuer() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwksUri() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwtLocations() {
        this.jwtLocations_ = wn7.emptyProtobufList();
    }

    private void ensureJwtLocationsIsMutable() {
        yn8.InterfaceC18446j interfaceC18446j = this.jwtLocations_;
        if (interfaceC18446j.mo28212k()) {
            return;
        }
        this.jwtLocations_ = wn7.mutableCopy(interfaceC18446j);
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) {
        return (AuthProvider) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hxc parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeJwtLocations(int i) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiences(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiencesBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.audiences_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationUrl(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationUrlBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.authorizationUrl_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.id_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssuer(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssuerBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.issuer_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwksUri(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwksUriBytes(xq1 xq1Var) {
        r8.checkByteStringIsUtf8(xq1Var);
        this.jwksUri_ = xq1Var.m56593N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtLocations(int i, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(i, jwtLocation);
    }

    @Override // p001o.wn7
    public final Object dynamicMethod(wn7.EnumC17940g enumC17940g, Object obj, Object obj2) {
        C111881 c111881 = null;
        switch (C111881.f13287xa1df5c61[enumC17940g.ordinal()]) {
            case 1:
                return new AuthProvider();
            case 2:
                return new Builder(c111881);
            case 3:
                return wn7.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hxc c17935b = PARSER;
                if (c17935b == null) {
                    synchronized (AuthProvider.class) {
                        c17935b = PARSER;
                        if (c17935b == null) {
                            c17935b = new wn7.C17935b(DEFAULT_INSTANCE);
                            PARSER = c17935b;
                        }
                    }
                }
                return c17935b;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getAudiences() {
        return this.audiences_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public xq1 getAudiencesBytes() {
        return xq1.m56589q(this.audiences_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public xq1 getAuthorizationUrlBytes() {
        return xq1.m56589q(this.authorizationUrl_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public xq1 getIdBytes() {
        return xq1.m56589q(this.id_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getIssuer() {
        return this.issuer_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public xq1 getIssuerBytes() {
        return xq1.m56589q(this.issuer_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getJwksUri() {
        return this.jwksUri_;
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public xq1 getJwksUriBytes() {
        return xq1.m56589q(this.jwksUri_);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public JwtLocation getJwtLocations(int i) {
        return (JwtLocation) this.jwtLocations_.get(i);
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public JwtLocationOrBuilder getJwtLocationsOrBuilder(int i) {
        return (JwtLocationOrBuilder) this.jwtLocations_.get(i);
    }

    public List<? extends JwtLocationOrBuilder> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    public static Builder newBuilder(AuthProvider authProvider) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, qp6 qp6Var) {
        return (AuthProvider) wn7.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, qp6 qp6Var) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, byteBuffer, qp6Var);
    }

    public static AuthProvider parseFrom(xq1 xq1Var) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJwtLocations(int i, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(i, jwtLocation);
    }

    public static AuthProvider parseFrom(xq1 xq1Var, qp6 qp6Var) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, xq1Var, qp6Var);
    }

    public static AuthProvider parseFrom(byte[] bArr) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthProvider parseFrom(byte[] bArr, qp6 qp6Var) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, bArr, qp6Var);
    }

    public static AuthProvider parseFrom(InputStream inputStream) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, qp6 qp6Var) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, inputStream, qp6Var);
    }

    public static AuthProvider parseFrom(jf3 jf3Var) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var);
    }

    public static AuthProvider parseFrom(jf3 jf3Var, qp6 qp6Var) {
        return (AuthProvider) wn7.parseFrom(DEFAULT_INSTANCE, jf3Var, qp6Var);
    }
}
