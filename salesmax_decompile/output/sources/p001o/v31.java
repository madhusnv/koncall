package p001o;

import java.util.Arrays;
import p001o.o91;

/* loaded from: classes5.dex */
public final class v31 extends o91 {

    /* renamed from: a */
    public final Iterable f49818a;

    /* renamed from: b */
    public final byte[] f49819b;

    /* renamed from: o.v31$b */
    public static final class C17505b extends o91.AbstractC15736a {

        /* renamed from: a */
        public Iterable f49820a;

        /* renamed from: b */
        public byte[] f49821b;

        @Override // p001o.o91.AbstractC15736a
        /* renamed from: a */
        public o91 mo41790a() {
            String str = "";
            if (this.f49820a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new v31(this.f49820a, this.f49821b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.o91.AbstractC15736a
        /* renamed from: b */
        public o91.AbstractC15736a mo41791b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f49820a = iterable;
            return this;
        }

        @Override // p001o.o91.AbstractC15736a
        /* renamed from: c */
        public o91.AbstractC15736a mo41792c(byte[] bArr) {
            this.f49821b = bArr;
            return this;
        }
    }

    @Override // p001o.o91
    /* renamed from: b */
    public Iterable mo41788b() {
        return this.f49818a;
    }

    @Override // p001o.o91
    /* renamed from: c */
    public byte[] mo41789c() {
        return this.f49819b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o91)) {
            return false;
        }
        o91 o91Var = (o91) obj;
        if (this.f49818a.equals(o91Var.mo41788b())) {
            if (Arrays.equals(this.f49819b, o91Var instanceof v31 ? ((v31) o91Var).f49819b : o91Var.mo41789c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f49818a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f49819b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f49818a + ", extras=" + Arrays.toString(this.f49819b) + "}";
    }

    public v31(Iterable iterable, byte[] bArr) {
        this.f49818a = iterable;
        this.f49819b = bArr;
    }
}
