package p001o;

/* loaded from: classes4.dex */
public final class hce implements ocb {

    /* renamed from: a */
    public final rcb f26660a;

    /* renamed from: b */
    public final String f26661b;

    /* renamed from: c */
    public final Object[] f26662c;

    /* renamed from: d */
    public final int f26663d;

    public hce(rcb rcbVar, String str, Object[] objArr) {
        this.f26660a = rcbVar;
        this.f26661b = str;
        this.f26662c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f26663d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f26663d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // p001o.ocb
    /* renamed from: a */
    public boolean mo30235a() {
        return (this.f26663d & 2) == 2;
    }

    @Override // p001o.ocb
    /* renamed from: b */
    public rcb mo30236b() {
        return this.f26660a;
    }

    @Override // p001o.ocb
    /* renamed from: c */
    public u1e mo30237c() {
        return (this.f26663d & 1) == 1 ? u1e.PROTO2 : u1e.PROTO3;
    }

    /* renamed from: d */
    public Object[] m30238d() {
        return this.f26662c;
    }

    /* renamed from: e */
    public String m30239e() {
        return this.f26661b;
    }
}
