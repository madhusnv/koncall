package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class cth {

    /* renamed from: b */
    public static final cth f18634b = m21797b((byte) 0);

    /* renamed from: a */
    public final byte f18635a;

    /* renamed from: o.cth$b */
    public static final class C12747b {

        /* renamed from: a */
        public byte f18636a;

        /* renamed from: a */
        public cth m21800a() {
            return cth.m21797b(this.f18636a);
        }

        /* renamed from: b */
        public C12747b m21801b(boolean z) {
            if (z) {
                this.f18636a = (byte) (this.f18636a | 1);
            } else {
                this.f18636a = (byte) (this.f18636a & (-2));
            }
            return this;
        }

        public C12747b(byte b) {
            this.f18636a = b;
        }
    }

    public cth(byte b) {
        this.f18635a = b;
    }

    /* renamed from: a */
    public static C12747b m21796a() {
        return new C12747b((byte) 0);
    }

    /* renamed from: b */
    public static cth m21797b(byte b) {
        return new cth(b);
    }

    /* renamed from: c */
    public final boolean m21798c(int i) {
        return (i & this.f18635a) != 0;
    }

    /* renamed from: d */
    public boolean m21799d() {
        return m21798c(1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cth) && this.f18635a == ((cth) obj).f18635a;
    }

    public int hashCode() {
        return Arrays.hashCode(new byte[]{this.f18635a});
    }

    public String toString() {
        return "TraceOptions{sampled=" + m21799d() + "}";
    }
}
