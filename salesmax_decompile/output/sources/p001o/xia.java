package p001o;

import com.google.firebase.encoders.proto.ProtoEnum;

/* loaded from: classes5.dex */
public final class xia {

    /* renamed from: c */
    public static final xia f53823c = new C18166a().m56361a();

    /* renamed from: a */
    public final long f53824a;

    /* renamed from: b */
    public final EnumC18167b f53825b;

    /* renamed from: o.xia$a */
    public static final class C18166a {

        /* renamed from: a */
        public long f53826a = 0;

        /* renamed from: b */
        public EnumC18167b f53827b = EnumC18167b.REASON_UNKNOWN;

        /* renamed from: a */
        public xia m56361a() {
            return new xia(this.f53826a, this.f53827b);
        }

        /* renamed from: b */
        public C18166a m56362b(long j) {
            this.f53826a = j;
            return this;
        }

        /* renamed from: c */
        public C18166a m56363c(EnumC18167b enumC18167b) {
            this.f53827b = enumC18167b;
            return this;
        }
    }

    /* renamed from: o.xia$b */
    public enum EnumC18167b implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        EnumC18167b(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public xia(long j, EnumC18167b enumC18167b) {
        this.f53824a = j;
        this.f53825b = enumC18167b;
    }

    /* renamed from: c */
    public static C18166a m56358c() {
        return new C18166a();
    }

    /* renamed from: a */
    public long m56359a() {
        return this.f53824a;
    }

    /* renamed from: b */
    public EnumC18167b m56360b() {
        return this.f53825b;
    }
}
