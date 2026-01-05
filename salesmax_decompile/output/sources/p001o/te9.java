package p001o;

/* loaded from: classes6.dex */
public final class te9 implements Comparable {

    /* renamed from: e */
    public static final C17069a f46954e = new C17069a(null);

    /* renamed from: f */
    public static final te9 f46955f = ue9.m51400a();

    /* renamed from: a */
    public final int f46956a;

    /* renamed from: b */
    public final int f46957b;

    /* renamed from: c */
    public final int f46958c;

    /* renamed from: d */
    public final int f46959d;

    /* renamed from: o.te9$a */
    public static final class C17069a {
        public C17069a() {
        }

        public /* synthetic */ C17069a(id5 id5Var) {
            this();
        }
    }

    public te9(int i, int i2, int i3) {
        this.f46956a = i;
        this.f46957b = i2;
        this.f46958c = i3;
        this.f46959d = m49784c(i, i2, i3);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(te9 te9Var) {
        sq8.m48649h(te9Var, "other");
        return this.f46959d - te9Var.f46959d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m49784c(int i, int i2, int i3) {
        boolean z = true;
        if (i >= 0 && i < 256) {
            if (i2 >= 0 && i2 < 256) {
                if (!(i3 >= 0 && i3 < 256)) {
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        te9 te9Var = obj instanceof te9 ? (te9) obj : null;
        return te9Var != null && this.f46959d == te9Var.f46959d;
    }

    public int hashCode() {
        return this.f46959d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46956a);
        sb.append('.');
        sb.append(this.f46957b);
        sb.append('.');
        sb.append(this.f46958c);
        return sb.toString();
    }
}
