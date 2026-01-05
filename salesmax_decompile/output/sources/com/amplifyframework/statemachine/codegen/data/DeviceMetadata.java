package com.amplifyframework.statemachine.codegen.data;

import java.lang.annotation.Annotation;
import p001o.cj9;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.gi9;
import p001o.id5;
import p001o.kf9;
import p001o.kge;
import p001o.l8f;
import p001o.lo3;
import p001o.o6c;
import p001o.ob9;
import p001o.p8g;
import p001o.si9;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;
import p001o.uk7;

@dff
/* loaded from: classes5.dex */
public abstract class DeviceMetadata {
    public static final Companion Companion = new Companion(null);
    private static final gi9 $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, Companion.C106801.INSTANCE);

    public static final class Companion {

        /* renamed from: com.amplifyframework.statemachine.codegen.data.DeviceMetadata$Companion$1 */
        public static final class C106801 extends kf9 implements uk7 {
            public static final C106801 INSTANCE = new C106801();

            public C106801() {
                super(0);
            }

            @Override // p001o.uk7
            public final dc9 invoke() {
                return new l8f("com.amplifyframework.statemachine.codegen.data.DeviceMetadata", kge.m35689b(DeviceMetadata.class), new ob9[]{kge.m35689b(Empty.class), kge.m35689b(Metadata.class)}, new dc9[]{new o6c("empty", Empty.INSTANCE, new Annotation[0]), DeviceMetadata$Metadata$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        private final /* synthetic */ dc9 get$cachedSerializer() {
            return (dc9) DeviceMetadata.$cachedSerializer$delegate.getValue();
        }

        public final dc9 serializer() {
            return get$cachedSerializer();
        }
    }

    @dff
    public static final class Empty extends DeviceMetadata {
        public static final Empty INSTANCE = new Empty();
        private static final /* synthetic */ gi9 $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, C106811.INSTANCE);

        /* renamed from: com.amplifyframework.statemachine.codegen.data.DeviceMetadata$Empty$1 */
        public static final class C106811 extends kf9 implements uk7 {
            public static final C106811 INSTANCE = new C106811();

            public C106811() {
                super(0);
            }

            @Override // p001o.uk7
            public final dc9 invoke() {
                return new o6c("empty", Empty.INSTANCE, new Annotation[0]);
            }
        }

        private Empty() {
            super(null);
        }

        private final /* synthetic */ dc9 get$cachedSerializer() {
            return (dc9) $cachedSerializer$delegate.getValue();
        }

        public final dc9 serializer() {
            return get$cachedSerializer();
        }
    }

    @dff
    public static final class Metadata extends DeviceMetadata {
        public static final Companion Companion = new Companion(null);
        private final String deviceGroupKey;
        private final String deviceKey;
        private final String deviceSecret;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return DeviceMetadata$Metadata$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Metadata(int i, String str, String str2, String str3, fff fffVar) {
            super(i, fffVar);
            if (3 != (i & 3)) {
                tbd.m49692a(i, 3, DeviceMetadata$Metadata$$serializer.INSTANCE.getDescriptor());
            }
            this.deviceKey = str;
            this.deviceGroupKey = str2;
            if ((i & 4) == 0) {
                this.deviceSecret = null;
            } else {
                this.deviceSecret = str3;
            }
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadata.deviceKey;
            }
            if ((i & 2) != 0) {
                str2 = metadata.deviceGroupKey;
            }
            if ((i & 4) != 0) {
                str3 = metadata.deviceSecret;
            }
            return metadata.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self(Metadata metadata, lo3 lo3Var, uef uefVar) {
            DeviceMetadata.write$Self(metadata, lo3Var, uefVar);
            lo3Var.mo37568p(uefVar, 0, metadata.deviceKey);
            lo3Var.mo37568p(uefVar, 1, metadata.deviceGroupKey);
            if (lo3Var.mo37569r(uefVar, 2) || metadata.deviceSecret != null) {
                lo3Var.mo37571z(uefVar, 2, p8g.f39602a, metadata.deviceSecret);
            }
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

        public final Metadata copy(String str, String str2, String str3) {
            sq8.m48649h(str, "deviceKey");
            sq8.m48649h(str2, "deviceGroupKey");
            return new Metadata(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return sq8.m48644c(this.deviceKey, metadata.deviceKey) && sq8.m48644c(this.deviceGroupKey, metadata.deviceGroupKey) && sq8.m48644c(this.deviceSecret, metadata.deviceSecret);
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
            int iHashCode = ((this.deviceKey.hashCode() * 31) + this.deviceGroupKey.hashCode()) * 31;
            String str = this.deviceSecret;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Metadata(deviceKey=" + this.deviceKey + ", deviceGroupKey=" + this.deviceGroupKey + ", deviceSecret=" + this.deviceSecret + ")";
        }

        public /* synthetic */ Metadata(String str, String str2, String str3, int i, id5 id5Var) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metadata(String str, String str2, String str3) {
            super(null);
            sq8.m48649h(str, "deviceKey");
            sq8.m48649h(str2, "deviceGroupKey");
            this.deviceKey = str;
            this.deviceGroupKey = str2;
            this.deviceSecret = str3;
        }
    }

    public /* synthetic */ DeviceMetadata(int i, fff fffVar) {
    }

    public /* synthetic */ DeviceMetadata(id5 id5Var) {
        this();
    }

    public static final /* synthetic */ void write$Self(DeviceMetadata deviceMetadata, lo3 lo3Var, uef uefVar) {
    }

    private DeviceMetadata() {
    }
}
