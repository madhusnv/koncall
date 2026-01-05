package p001o;

import java.util.Arrays;
import p001o.qwh;

/* loaded from: classes5.dex */
public final class z51 extends qwh {

    /* renamed from: a */
    public final String f56547a;

    /* renamed from: b */
    public final byte[] f56548b;

    /* renamed from: c */
    public final fid f56549c;

    /* renamed from: o.z51$b */
    public static final class C18559b extends qwh.AbstractC16484a {

        /* renamed from: a */
        public String f56550a;

        /* renamed from: b */
        public byte[] f56551b;

        /* renamed from: c */
        public fid f56552c;

        @Override // p001o.qwh.AbstractC16484a
        /* renamed from: a */
        public qwh mo45897a() {
            String str = "";
            if (this.f56550a == null) {
                str = " backendName";
            }
            if (this.f56552c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new z51(this.f56550a, this.f56551b, this.f56552c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.qwh.AbstractC16484a
        /* renamed from: b */
        public qwh.AbstractC16484a mo45898b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f56550a = str;
            return this;
        }

        @Override // p001o.qwh.AbstractC16484a
        /* renamed from: c */
        public qwh.AbstractC16484a mo45899c(byte[] bArr) {
            this.f56551b = bArr;
            return this;
        }

        @Override // p001o.qwh.AbstractC16484a
        /* renamed from: d */
        public qwh.AbstractC16484a mo45900d(fid fidVar) {
            if (fidVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f56552c = fidVar;
            return this;
        }
    }

    @Override // p001o.qwh
    /* renamed from: b */
    public String mo45892b() {
        return this.f56547a;
    }

    @Override // p001o.qwh
    /* renamed from: c */
    public byte[] mo45893c() {
        return this.f56548b;
    }

    @Override // p001o.qwh
    /* renamed from: d */
    public fid mo45894d() {
        return this.f56549c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qwh)) {
            return false;
        }
        qwh qwhVar = (qwh) obj;
        if (this.f56547a.equals(qwhVar.mo45892b())) {
            if (Arrays.equals(this.f56548b, qwhVar instanceof z51 ? ((z51) qwhVar).f56548b : qwhVar.mo45893c()) && this.f56549c.equals(qwhVar.mo45894d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f56547a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f56548b)) * 1000003) ^ this.f56549c.hashCode();
    }

    public z51(String str, byte[] bArr, fid fidVar) {
        this.f56547a = str;
        this.f56548b = bArr;
        this.f56549c = fidVar;
    }
}
