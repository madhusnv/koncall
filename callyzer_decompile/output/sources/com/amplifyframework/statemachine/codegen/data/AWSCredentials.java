package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import jy.a1;
import jy.j0;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCredentials {
    public static final Companion Companion = new Companion(null);
    private static final AWSCredentials empty = new AWSCredentials(null, null, null, 0L);
    private final String accessKeyId;
    private final Long expiration;
    private final String secretAccessKey;
    private final String sessionToken;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AWSCredentials getEmpty() {
            return AWSCredentials.empty;
        }

        public final InterfaceC2401a serializer() {
            return AWSCredentials$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AWSCredentials(int i10, String str, String str2, String str3, Long l9, w0 w0Var) {
        if (15 != (i10 & 15)) {
            n0.m8426g(i10, 15, AWSCredentials$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiration = l9;
    }

    public static /* synthetic */ AWSCredentials copy$default(AWSCredentials aWSCredentials, String str, String str2, String str3, Long l9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aWSCredentials.accessKeyId;
        }
        if ((i10 & 2) != 0) {
            str2 = aWSCredentials.secretAccessKey;
        }
        if ((i10 & 4) != 0) {
            str3 = aWSCredentials.sessionToken;
        }
        if ((i10 & 8) != 0) {
            l9 = aWSCredentials.expiration;
        }
        return aWSCredentials.copy(str, str2, str3, l9);
    }

    public static final /* synthetic */ void write$Self$aws_auth_cognito_release(AWSCredentials aWSCredentials, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        a1 a1Var = a1.f19869a;
        interfaceC3365b.mo7695n(interfaceC3055f, 0, a1Var, aWSCredentials.accessKeyId);
        interfaceC3365b.mo7695n(interfaceC3055f, 1, a1Var, aWSCredentials.secretAccessKey);
        interfaceC3365b.mo7695n(interfaceC3055f, 2, a1Var, aWSCredentials.sessionToken);
        interfaceC3365b.mo7695n(interfaceC3055f, 3, j0.f19910a, aWSCredentials.expiration);
    }

    public final String component1() {
        return this.accessKeyId;
    }

    public final String component2() {
        return this.secretAccessKey;
    }

    public final String component3() {
        return this.sessionToken;
    }

    public final Long component4() {
        return this.expiration;
    }

    public final AWSCredentials copy(String str, String str2, String str3, Long l9) {
        return new AWSCredentials(str, str2, str3, l9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCredentials)) {
            return false;
        }
        AWSCredentials aWSCredentials = (AWSCredentials) obj;
        return AbstractC4154l.m8918a(this.accessKeyId, aWSCredentials.accessKeyId) && AbstractC4154l.m8918a(this.secretAccessKey, aWSCredentials.secretAccessKey) && AbstractC4154l.m8918a(this.sessionToken, aWSCredentials.sessionToken) && AbstractC4154l.m8918a(this.expiration, aWSCredentials.expiration);
    }

    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final Long getExpiration() {
        return this.expiration;
    }

    public final String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        String str = this.accessKeyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secretAccessKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sessionToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l9 = this.expiration;
        return iHashCode3 + (l9 != null ? l9.hashCode() : 0);
    }

    public String toString() {
        String str = this.accessKeyId;
        String strM10114Y = str != null ? AbstractC5178p.m10114Y(str, new C4266h(0, 4, 1)) : null;
        String str2 = this.secretAccessKey;
        String strM10114Y2 = str2 != null ? AbstractC5178p.m10114Y(str2, new C4266h(0, 4, 1)) : null;
        String str3 = this.sessionToken;
        String strM10114Y3 = str3 != null ? AbstractC5178p.m10114Y(str3, new C4266h(0, 4, 1)) : null;
        Long l9 = this.expiration;
        StringBuilder sbM127r = AbstractC0030c.m127r("AWSCredentials(accessKeyId = ", strM10114Y, "***, secretAccessKey = ", strM10114Y2, "***, sessionToken = ");
        sbM127r.append(strM10114Y3);
        sbM127r.append("***, expiration = ");
        sbM127r.append(l9);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public AWSCredentials(String str, String str2, String str3, Long l9) {
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiration = l9;
    }
}
