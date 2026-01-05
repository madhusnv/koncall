package p001o;

import java.util.List;
import p001o.bhf;

/* loaded from: classes2.dex */
public final class l51 extends bhf.AbstractC12406f {

    /* renamed from: a */
    public final yj5 f33265a;

    /* renamed from: b */
    public final List f33266b;

    /* renamed from: c */
    public final String f33267c;

    /* renamed from: d */
    public final int f33268d;

    /* renamed from: e */
    public final int f33269e;

    /* renamed from: f */
    public final y16 f33270f;

    /* renamed from: o.l51$b */
    public static final class C15000b extends bhf.AbstractC12406f.a {

        /* renamed from: a */
        public yj5 f33271a;

        /* renamed from: b */
        public List f33272b;

        /* renamed from: c */
        public String f33273c;

        /* renamed from: d */
        public Integer f33274d;

        /* renamed from: e */
        public Integer f33275e;

        /* renamed from: f */
        public y16 f33276f;

        @Override // p001o.bhf.AbstractC12406f.a
        /* renamed from: a */
        public bhf.AbstractC12406f mo19072a() {
            String str = "";
            if (this.f33271a == null) {
                str = " surface";
            }
            if (this.f33272b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f33274d == null) {
                str = str + " mirrorMode";
            }
            if (this.f33275e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f33276f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new l51(this.f33271a, this.f33272b, this.f33273c, this.f33274d.intValue(), this.f33275e.intValue(), this.f33276f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.bhf.AbstractC12406f.a
        /* renamed from: b */
        public bhf.AbstractC12406f.a mo19073b(y16 y16Var) {
            if (y16Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f33276f = y16Var;
            return this;
        }

        @Override // p001o.bhf.AbstractC12406f.a
        /* renamed from: c */
        public bhf.AbstractC12406f.a mo19074c(int i) {
            this.f33274d = Integer.valueOf(i);
            return this;
        }

        @Override // p001o.bhf.AbstractC12406f.a
        /* renamed from: d */
        public bhf.AbstractC12406f.a mo19075d(String str) {
            this.f33273c = str;
            return this;
        }

        @Override // p001o.bhf.AbstractC12406f.a
        /* renamed from: e */
        public bhf.AbstractC12406f.a mo19076e(List list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f33272b = list;
            return this;
        }

        @Override // p001o.bhf.AbstractC12406f.a
        /* renamed from: f */
        public bhf.AbstractC12406f.a mo19077f(int i) {
            this.f33275e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: g */
        public bhf.AbstractC12406f.a m36584g(yj5 yj5Var) {
            if (yj5Var == null) {
                throw new NullPointerException("Null surface");
            }
            this.f33271a = yj5Var;
            return this;
        }
    }

    @Override // p001o.bhf.AbstractC12406f
    /* renamed from: b */
    public y16 mo19066b() {
        return this.f33270f;
    }

    @Override // p001o.bhf.AbstractC12406f
    /* renamed from: c */
    public int mo19067c() {
        return this.f33268d;
    }

    @Override // p001o.bhf.AbstractC12406f
    /* renamed from: d */
    public String mo19068d() {
        return this.f33267c;
    }

    @Override // p001o.bhf.AbstractC12406f
    /* renamed from: e */
    public List mo19069e() {
        return this.f33266b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bhf.AbstractC12406f)) {
            return false;
        }
        bhf.AbstractC12406f abstractC12406f = (bhf.AbstractC12406f) obj;
        return this.f33265a.equals(abstractC12406f.mo19070f()) && this.f33266b.equals(abstractC12406f.mo19069e()) && ((str = this.f33267c) != null ? str.equals(abstractC12406f.mo19068d()) : abstractC12406f.mo19068d() == null) && this.f33268d == abstractC12406f.mo19067c() && this.f33269e == abstractC12406f.mo19071g() && this.f33270f.equals(abstractC12406f.mo19066b());
    }

    @Override // p001o.bhf.AbstractC12406f
    /* renamed from: f */
    public yj5 mo19070f() {
        return this.f33265a;
    }

    @Override // p001o.bhf.AbstractC12406f
    /* renamed from: g */
    public int mo19071g() {
        return this.f33269e;
    }

    public int hashCode() {
        int iHashCode = (((this.f33265a.hashCode() ^ 1000003) * 1000003) ^ this.f33266b.hashCode()) * 1000003;
        String str = this.f33267c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f33268d) * 1000003) ^ this.f33269e) * 1000003) ^ this.f33270f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f33265a + ", sharedSurfaces=" + this.f33266b + ", physicalCameraId=" + this.f33267c + ", mirrorMode=" + this.f33268d + ", surfaceGroupId=" + this.f33269e + ", dynamicRange=" + this.f33270f + "}";
    }

    public l51(yj5 yj5Var, List list, String str, int i, int i2, y16 y16Var) {
        this.f33265a = yj5Var;
        this.f33266b = list;
        this.f33267c = str;
        this.f33268d = i;
        this.f33269e = i2;
        this.f33270f = y16Var;
    }
}
