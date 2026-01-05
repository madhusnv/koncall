package p001o;

/* loaded from: classes2.dex */
public final class sth {

    /* renamed from: d */
    public static final sth f45921d = new sth(new qth[0]);

    /* renamed from: e */
    public static final String f45922e = sqi.B0(0);

    /* renamed from: a */
    public final int f45923a;

    /* renamed from: b */
    public final nf8 f45924b;

    /* renamed from: c */
    public int f45925c;

    public sth(qth... qthVarArr) {
        this.f45924b = nf8.m40512z(qthVarArr);
        this.f45923a = qthVarArr.length;
        m48917f();
    }

    /* renamed from: e */
    public static /* synthetic */ Integer m48913e(qth qthVar) {
        return Integer.valueOf(qthVar.f42402c);
    }

    /* renamed from: b */
    public qth m48914b(int i) {
        return (qth) this.f45924b.get(i);
    }

    /* renamed from: c */
    public nf8 m48915c() {
        return nf8.m40511y(fga.m26655k(this.f45924b, new ol7() { // from class: o.rth
            @Override // p001o.ol7
            public final Object apply(Object obj) {
                return sth.m48913e((qth) obj);
            }
        }));
    }

    /* renamed from: d */
    public int m48916d(qth qthVar) {
        int iIndexOf = this.f45924b.indexOf(qthVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sth.class != obj.getClass()) {
            return false;
        }
        sth sthVar = (sth) obj;
        return this.f45923a == sthVar.f45923a && this.f45924b.equals(sthVar.f45924b);
    }

    /* renamed from: f */
    public final void m48917f() {
        int i = 0;
        while (i < this.f45924b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f45924b.size(); i3++) {
                if (((qth) this.f45924b.get(i)).equals(this.f45924b.get(i3))) {
                    ria.m46820d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public int hashCode() {
        if (this.f45925c == 0) {
            this.f45925c = this.f45924b.hashCode();
        }
        return this.f45925c;
    }
}
