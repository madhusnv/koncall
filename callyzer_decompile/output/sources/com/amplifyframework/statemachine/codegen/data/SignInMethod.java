package com.amplifyframework.statemachine.codegen.data;

import fy.C2403c;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import java.lang.annotation.Annotation;
import jy.a1;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import lx.InterfaceC4564c;
import ly.C4597u;
import og.nd;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.b8;
import qw.EnumC6359i;
import qw.InterfaceC6357g;
import xw.InterfaceC8493a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SignInMethod {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC6357g $cachedSerializer$delegate = nd.m10781b(EnumC6359i.PUBLICATION, new C1226a(2));

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ApiBased extends SignInMethod {
        private final AuthType authType;
        public static final Companion Companion = new Companion(null);
        private static final InterfaceC6357g[] $childSerializers = {nd.m10781b(EnumC6359i.PUBLICATION, new C1226a(3))};

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class AuthType {
            private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
                $ENTRIES = b8.m11548b(authTypeArr$values);
            }

            private AuthType(String str, int i10) {
            }

            public static InterfaceC8493a getEntries() {
                return $ENTRIES;
            }

            public static AuthType valueOf(String str) {
                return (AuthType) Enum.valueOf(AuthType.class, str);
            }

            public static AuthType[] values() {
                return (AuthType[]) $VALUES.clone();
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return SignInMethod$ApiBased$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApiBased(int i10, AuthType authType, w0 w0Var) {
            super(i10, w0Var);
            if (1 != (i10 & 1)) {
                n0.m8426g(i10, 1, SignInMethod$ApiBased$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.authType = authType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
            return n0.m8424e("com.amplifyframework.statemachine.codegen.data.SignInMethod.ApiBased.AuthType", AuthType.values());
        }

        public static /* synthetic */ ApiBased copy$default(ApiBased apiBased, AuthType authType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                authType = apiBased.authType;
            }
            return apiBased.copy(authType);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(ApiBased apiBased, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            SignInMethod.write$Self(apiBased, interfaceC3365b, interfaceC3055f);
            ((C4597u) interfaceC3365b).m9443v(interfaceC3055f, 0, (InterfaceC2401a) $childSerializers[0].getValue(), apiBased.authType);
        }

        public final AuthType component1() {
            return this.authType;
        }

        public final ApiBased copy(AuthType authType) {
            AbstractC4154l.m8923f(authType, "authType");
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
            AbstractC4154l.m8923f(authType, "authType");
            this.authType = authType;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ InterfaceC2401a get$cachedSerializer() {
            return (InterfaceC2401a) SignInMethod.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC2401a serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class HostedUI extends SignInMethod {
        public static final Companion Companion = new Companion(null);
        private final String browserPackage;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return SignInMethod$HostedUI$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HostedUI() {
            this((String) null, 1, (AbstractC4148f) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ HostedUI copy$default(HostedUI hostedUI, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hostedUI.browserPackage;
            }
            return hostedUI.copy(str);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(HostedUI hostedUI, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            SignInMethod.write$Self(hostedUI, interfaceC3365b, interfaceC3055f);
            if (!interfaceC3365b.mo7694i(interfaceC3055f) && hostedUI.browserPackage == null) {
                return;
            }
            interfaceC3365b.mo7695n(interfaceC3055f, 0, a1.f19869a, hostedUI.browserPackage);
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
            return (obj instanceof HostedUI) && AbstractC4154l.m8918a(this.browserPackage, ((HostedUI) obj).browserPackage);
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
            return AbstractC5601a.m11238i("HostedUI(browserPackage=", this.browserPackage, ")");
        }

        public /* synthetic */ HostedUI(int i10, String str, w0 w0Var) {
            super(i10, w0Var);
            if ((i10 & 1) == 0) {
                this.browserPackage = null;
            } else {
                this.browserPackage = str;
            }
        }

        public HostedUI(String str) {
            super(null);
            this.browserPackage = str;
        }

        public /* synthetic */ HostedUI(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? null : str);
        }
    }

    public /* synthetic */ SignInMethod(AbstractC4148f abstractC4148f) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC2401a _init_$_anonymous_() {
        return new C2403c("com.amplifyframework.statemachine.codegen.data.SignInMethod", a0.m8901a(SignInMethod.class), new InterfaceC4564c[]{a0.m8901a(ApiBased.class), a0.m8901a(HostedUI.class)}, new InterfaceC2401a[]{SignInMethod$ApiBased$$serializer.INSTANCE, SignInMethod$HostedUI$$serializer.INSTANCE}, new Annotation[0]);
    }

    private SignInMethod() {
    }

    public /* synthetic */ SignInMethod(int i10, w0 w0Var) {
    }

    public static final /* synthetic */ void write$Self(SignInMethod signInMethod, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
    }
}
