package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import fy.C2403c;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import java.lang.annotation.Annotation;
import jy.C3884u;
import jy.a1;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import lx.InterfaceC4564c;
import ly.C4597u;
import og.nd;
import qw.EnumC6359i;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class DeviceMetadata {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC6357g $cachedSerializer$delegate = nd.m10781b(EnumC6359i.PUBLICATION, new C1226a(0));

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ InterfaceC2401a get$cachedSerializer() {
            return (InterfaceC2401a) DeviceMetadata.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC2401a serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Empty extends DeviceMetadata {
        public static final Empty INSTANCE = new Empty();
        private static final /* synthetic */ InterfaceC6357g $cachedSerializer$delegate = nd.m10781b(EnumC6359i.PUBLICATION, new C1226a(1));

        private Empty() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _init_$_anonymous_() {
            return new C3884u(INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ InterfaceC2401a get$cachedSerializer() {
            return (InterfaceC2401a) $cachedSerializer$delegate.getValue();
        }

        public final InterfaceC2401a serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Metadata extends DeviceMetadata {
        public static final Companion Companion = new Companion(null);
        private final String deviceGroupKey;
        private final String deviceKey;
        private final String deviceSecret;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return DeviceMetadata$Metadata$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Metadata(int i10, String str, String str2, String str3, w0 w0Var) {
            super(i10, w0Var);
            if (3 != (i10 & 3)) {
                n0.m8426g(i10, 3, DeviceMetadata$Metadata$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.deviceKey = str;
            this.deviceGroupKey = str2;
            if ((i10 & 4) == 0) {
                this.deviceSecret = null;
            } else {
                this.deviceSecret = str3;
            }
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = metadata.deviceKey;
            }
            if ((i10 & 2) != 0) {
                str2 = metadata.deviceGroupKey;
            }
            if ((i10 & 4) != 0) {
                str3 = metadata.deviceSecret;
            }
            return metadata.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(Metadata metadata, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            DeviceMetadata.write$Self(metadata, interfaceC3365b, interfaceC3055f);
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9444w(interfaceC3055f, 0, metadata.deviceKey);
            c4597u.m9444w(interfaceC3055f, 1, metadata.deviceGroupKey);
            if (!c4597u.mo7694i(interfaceC3055f) && metadata.deviceSecret == null) {
                return;
            }
            c4597u.mo7695n(interfaceC3055f, 2, a1.f19869a, metadata.deviceSecret);
        }

        public final String component1() {
            return this.deviceKey;
        }

        public final String component2() {
            return this.deviceGroupKey;
        }

        public final String component3() {
            return this.deviceSecret;
        }

        public final Metadata copy(String deviceKey, String deviceGroupKey, String str) {
            AbstractC4154l.m8923f(deviceKey, "deviceKey");
            AbstractC4154l.m8923f(deviceGroupKey, "deviceGroupKey");
            return new Metadata(deviceKey, deviceGroupKey, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return AbstractC4154l.m8918a(this.deviceKey, metadata.deviceKey) && AbstractC4154l.m8918a(this.deviceGroupKey, metadata.deviceGroupKey) && AbstractC4154l.m8918a(this.deviceSecret, metadata.deviceSecret);
        }

        public final String getDeviceGroupKey() {
            return this.deviceGroupKey;
        }

        public final String getDeviceKey() {
            return this.deviceKey;
        }

        public final String getDeviceSecret() {
            return this.deviceSecret;
        }

        public int hashCode() {
            int iM113d = AbstractC0030c.m113d(this.deviceKey.hashCode() * 31, 31, this.deviceGroupKey);
            String str = this.deviceSecret;
            return iM113d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.deviceKey;
            String str2 = this.deviceGroupKey;
            return AbstractC1452a.m4564k(AbstractC0030c.m127r("Metadata(deviceKey=", str, ", deviceGroupKey=", str2, ", deviceSecret="), this.deviceSecret, ")");
        }

        public /* synthetic */ Metadata(String str, String str2, String str3, int i10, AbstractC4148f abstractC4148f) {
            this(str, str2, (i10 & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metadata(String deviceKey, String deviceGroupKey, String str) {
            super(null);
            AbstractC4154l.m8923f(deviceKey, "deviceKey");
            AbstractC4154l.m8923f(deviceGroupKey, "deviceGroupKey");
            this.deviceKey = deviceKey;
            this.deviceGroupKey = deviceGroupKey;
            this.deviceSecret = str;
        }
    }

    public /* synthetic */ DeviceMetadata(AbstractC4148f abstractC4148f) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC2401a _init_$_anonymous_() {
        return new C2403c("com.amplifyframework.statemachine.codegen.data.DeviceMetadata", a0.m8901a(DeviceMetadata.class), new InterfaceC4564c[]{a0.m8901a(Empty.class), a0.m8901a(Metadata.class)}, new InterfaceC2401a[]{new C3884u(Empty.INSTANCE, new Annotation[0]), DeviceMetadata$Metadata$$serializer.INSTANCE}, new Annotation[0]);
    }

    private DeviceMetadata() {
    }

    public /* synthetic */ DeviceMetadata(int i10, w0 w0Var) {
    }

    public static final /* synthetic */ void write$Self(DeviceMetadata deviceMetadata, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
    }
}
