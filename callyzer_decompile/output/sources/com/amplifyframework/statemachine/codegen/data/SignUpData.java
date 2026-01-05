package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.util.MaskUtilKt;
import com.sun.mail.util.AbstractC1452a;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import java.util.Map;
import jy.a1;
import jy.f0;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import og.nd;
import qw.EnumC6359i;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignUpData {
    private static final InterfaceC6357g[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> clientMetadata;
    private final String session;
    private final String userId;
    private final String username;
    private final Map<String, String> validationData;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return SignUpData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    static {
        EnumC6359i enumC6359i = EnumC6359i.PUBLICATION;
        $childSerializers = new InterfaceC6357g[]{null, nd.m10781b(enumC6359i, new C1226a(4)), nd.m10781b(enumC6359i, new C1226a(5)), null, null};
    }

    public /* synthetic */ SignUpData(int i10, String str, Map map, Map map2, String str2, String str3, w0 w0Var) {
        if (1 != (i10 & 1)) {
            n0.m8426g(i10, 1, SignUpData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.username = str;
        if ((i10 & 2) == 0) {
            this.validationData = null;
        } else {
            this.validationData = map;
        }
        if ((i10 & 4) == 0) {
            this.clientMetadata = null;
        } else {
            this.clientMetadata = map2;
        }
        if ((i10 & 8) == 0) {
            this.session = null;
        } else {
            this.session = str2;
        }
        if ((i10 & 16) == 0) {
            this.userId = null;
        } else {
            this.userId = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
        return new f0(a1.f19869a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$0() {
        return new f0(a1.f19869a);
    }

    public static /* synthetic */ SignUpData copy$default(SignUpData signUpData, String str, Map map, Map map2, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = signUpData.username;
        }
        if ((i10 & 2) != 0) {
            map = signUpData.validationData;
        }
        if ((i10 & 4) != 0) {
            map2 = signUpData.clientMetadata;
        }
        if ((i10 & 8) != 0) {
            str2 = signUpData.session;
        }
        if ((i10 & 16) != 0) {
            str3 = signUpData.userId;
        }
        String str4 = str3;
        Map map3 = map2;
        return signUpData.copy(str, map, map3, str2, str4);
    }

    public static final /* synthetic */ void write$Self$aws_auth_cognito_release(SignUpData signUpData, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        InterfaceC6357g[] interfaceC6357gArr = $childSerializers;
        C4597u c4597u = (C4597u) interfaceC3365b;
        c4597u.m9444w(interfaceC3055f, 0, signUpData.username);
        if (c4597u.mo7694i(interfaceC3055f) || signUpData.validationData != null) {
            c4597u.mo7695n(interfaceC3055f, 1, (InterfaceC2401a) interfaceC6357gArr[1].getValue(), signUpData.validationData);
        }
        if (c4597u.mo7694i(interfaceC3055f) || signUpData.clientMetadata != null) {
            c4597u.mo7695n(interfaceC3055f, 2, (InterfaceC2401a) interfaceC6357gArr[2].getValue(), signUpData.clientMetadata);
        }
        if (c4597u.mo7694i(interfaceC3055f) || signUpData.session != null) {
            c4597u.mo7695n(interfaceC3055f, 3, a1.f19869a, signUpData.session);
        }
        if (!c4597u.mo7694i(interfaceC3055f) && signUpData.userId == null) {
            return;
        }
        c4597u.mo7695n(interfaceC3055f, 4, a1.f19869a, signUpData.userId);
    }

    public final String component1() {
        return this.username;
    }

    public final Map<String, String> component2() {
        return this.validationData;
    }

    public final Map<String, String> component3() {
        return this.clientMetadata;
    }

    public final String component4() {
        return this.session;
    }

    public final String component5() {
        return this.userId;
    }

    public final SignUpData copy(String username, Map<String, String> map, Map<String, String> map2, String str, String str2) {
        AbstractC4154l.m8923f(username, "username");
        return new SignUpData(username, map, map2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpData)) {
            return false;
        }
        SignUpData signUpData = (SignUpData) obj;
        return AbstractC4154l.m8918a(this.username, signUpData.username) && AbstractC4154l.m8918a(this.validationData, signUpData.validationData) && AbstractC4154l.m8918a(this.clientMetadata, signUpData.clientMetadata) && AbstractC4154l.m8918a(this.session, signUpData.session) && AbstractC4154l.m8918a(this.userId, signUpData.userId);
    }

    public final Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public final String getSession() {
        return this.session;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final Map<String, String> getValidationData() {
        return this.validationData;
    }

    public int hashCode() {
        int iHashCode = this.username.hashCode() * 31;
        Map<String, String> map = this.validationData;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.clientMetadata;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.session;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.username;
        Map<String, String> map = this.validationData;
        Map<String, String> map2 = this.clientMetadata;
        String strMask = MaskUtilKt.mask(this.session);
        String str2 = this.userId;
        StringBuilder sb2 = new StringBuilder("SignUpData(username='");
        sb2.append(str);
        sb2.append("', validationData=");
        sb2.append(map);
        sb2.append(", clientMetadata=");
        sb2.append(map2);
        sb2.append(", session=");
        sb2.append(strMask);
        sb2.append(", userId=");
        return AbstractC1452a.m4564k(sb2, str2, ")");
    }

    public SignUpData(String username, Map<String, String> map, Map<String, String> map2, String str, String str2) {
        AbstractC4154l.m8923f(username, "username");
        this.username = username;
        this.validationData = map;
        this.clientMetadata = map2;
        this.session = str;
        this.userId = str2;
    }

    public /* synthetic */ SignUpData(String str, Map map, Map map2, String str2, String str3, int i10, AbstractC4148f abstractC4148f) {
        this(str, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : map2, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
    }
}
