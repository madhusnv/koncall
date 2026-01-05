package com.amplifyframework.statemachine.codegen.data;

import java.lang.annotation.Annotation;
import p001o.cj9;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.gi6;
import p001o.gi9;
import p001o.hi6;
import p001o.id5;
import p001o.kf9;
import p001o.kge;
import p001o.l8f;
import p001o.lo3;
import p001o.ni6;
import p001o.ob9;
import p001o.p8g;
import p001o.si9;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;
import p001o.uk7;

@dff
/* loaded from: classes5.dex */
public abstract class SignInMethod {
    public static final Companion Companion = new Companion(null);
    private static final gi9 $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, Companion.C106821.INSTANCE);

    @dff
    public static final class ApiBased extends SignInMethod {
        private final AuthType authType;
        public static final Companion Companion = new Companion(null);
        private static final dc9[] $childSerializers = {ni6.m40630b("com.amplifyframework.statemachine.codegen.data.SignInMethod.ApiBased.AuthType", AuthType.values())};

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class AuthType {
            private static final /* synthetic */ gi6 $ENTRIES;
            private static final /* synthetic */ AuthType[] $VALUES;
            public static final AuthType USER_SRP_AUTH = new AuthType("USER_SRP_AUTH", 0);
            public static final AuthType CUSTOM_AUTH = new AuthType("CUSTOM_AUTH", 1);
            public static final AuthType USER_PASSWORD_AUTH = new AuthType("USER_PASSWORD_AUTH", 2);
            public static final AuthType USER_AUTH = new AuthType("USER_AUTH", 3);
            public static final AuthType UNKNOWN = new AuthType("UNKNOWN", 4);

            private static final /* synthetic */ AuthType[] $values() {
                return new AuthType[]{USER_SRP_AUTH, CUSTOM_AUTH, USER_PASSWORD_AUTH, USER_AUTH, UNKNOWN};
            }

            static {
                AuthType[] authTypeArr$values = $values();
                $VALUES = authTypeArr$values;
                $ENTRIES = hi6.m30609a(authTypeArr$values);
            }

            private AuthType(String str, int i) {
            }

            public static gi6 getEntries() {
                return $ENTRIES;
            }

            public static AuthType valueOf(String str) {
                return (AuthType) Enum.valueOf(AuthType.class, str);
            }

            public static AuthType[] values() {
                return (AuthType[]) $VALUES.clone();
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return SignInMethod$ApiBased$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApiBased(int i, AuthType authType, fff fffVar) {
            super(i, fffVar);
            if (1 != (i & 1)) {
                tbd.m49692a(i, 1, SignInMethod$ApiBased$$serializer.INSTANCE.getDescriptor());
            }
            this.authType = authType;
        }

        public static /* synthetic */ ApiBased copy$default(ApiBased apiBased, AuthType authType, int i, Object obj) {
            if ((i & 1) != 0) {
                authType = apiBased.authType;
            }
            return apiBased.copy(authType);
        }

        public static final /* synthetic */ void write$Self(ApiBased apiBased, lo3 lo3Var, uef uefVar) {
            SignInMethod.write$Self(apiBased, lo3Var, uefVar);
            lo3Var.mo37566l(uefVar, 0, $childSerializers[0], apiBased.authType);
        }

        public final AuthType component1() {
            return this.authType;
        }

        public final ApiBased copy(AuthType authType) {
            sq8.m48649h(authType, "authType");
            return new ApiBased(authType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiBased) && this.authType == ((ApiBased) obj).authType;
        }

        public final AuthType getAuthType() {
            return this.authType;
        }

        public int hashCode() {
            return this.authType.hashCode();
        }

        public String toString() {
            return "ApiBased(authType=" + this.authType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiBased(AuthType authType) {
            super(null);
            sq8.m48649h(authType, "authType");
            this.authType = authType;
        }
    }

    public static final class Companion {

        /* renamed from: com.amplifyframework.statemachine.codegen.data.SignInMethod$Companion$1 */
        public static final class C106821 extends kf9 implements uk7 {
            public static final C106821 INSTANCE = new C106821();

            public C106821() {
                super(0);
            }

            @Override // p001o.uk7
            public final dc9 invoke() {
                return new l8f("com.amplifyframework.statemachine.codegen.data.SignInMethod", kge.m35689b(SignInMethod.class), new ob9[]{kge.m35689b(ApiBased.class), kge.m35689b(HostedUI.class)}, new dc9[]{SignInMethod$ApiBased$$serializer.INSTANCE, SignInMethod$HostedUI$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        private final /* synthetic */ dc9 get$cachedSerializer() {
            return (dc9) SignInMethod.$cachedSerializer$delegate.getValue();
        }

        public final dc9 serializer() {
            return get$cachedSerializer();
        }
    }

    @dff
    public static final class HostedUI extends SignInMethod {
        public static final Companion Companion = new Companion(null);
        private final String browserPackage;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return SignInMethod$HostedUI$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HostedUI() {
            this((String) null, 1, (id5) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ HostedUI copy$default(HostedUI hostedUI, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hostedUI.browserPackage;
            }
            return hostedUI.copy(str);
        }

        public static final /* synthetic */ void write$Self(HostedUI hostedUI, lo3 lo3Var, uef uefVar) {
            SignInMethod.write$Self(hostedUI, lo3Var, uefVar);
            boolean z = true;
            if (!lo3Var.mo37569r(uefVar, 0) && hostedUI.browserPackage == null) {
                z = false;
            }
            if (z) {
                lo3Var.mo37571z(uefVar, 0, p8g.f39602a, hostedUI.browserPackage);
            }
        }

        public final String component1() {
            return this.browserPackage;
        }

        public final HostedUI copy(String str) {
            return new HostedUI(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HostedUI) && sq8.m48644c(this.browserPackage, ((HostedUI) obj).browserPackage);
        }

        public final String getBrowserPackage() {
            return this.browserPackage;
        }

        public int hashCode() {
            String str = this.browserPackage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "HostedUI(browserPackage=" + this.browserPackage + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HostedUI(int i, String str, fff fffVar) {
            super(i, fffVar);
            if ((i & 0) != 0) {
                tbd.m49692a(i, 0, SignInMethod$HostedUI$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.browserPackage = null;
            } else {
                this.browserPackage = str;
            }
        }

        public HostedUI(String str) {
            super(null);
            this.browserPackage = str;
        }

        public /* synthetic */ HostedUI(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public /* synthetic */ SignInMethod(int i, fff fffVar) {
    }

    public /* synthetic */ SignInMethod(id5 id5Var) {
        this();
    }

    public static final /* synthetic */ void write$Self(SignInMethod signInMethod, lo3 lo3Var, uef uefVar) {
    }

    private SignInMethod() {
    }
}
