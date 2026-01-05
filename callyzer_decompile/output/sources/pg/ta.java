package pg;

import og.tb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ta extends ra {

    /* renamed from: e */
    public static final ta f29070e = new ta(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f29071c;

    /* renamed from: d */
    public final transient int f29072d;

    public ta(int i10, Object[] objArr) {
        this.f29071c = objArr;
        this.f29072d = i10;
    }

    @Override // pg.ra, pg.l9
    /* renamed from: a */
    public final int mo11769a(Object[] objArr) {
        Object[] objArr2 = this.f29071c;
        int i10 = this.f29072d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // pg.l9
    /* renamed from: b */
    public final int mo11770b() {
        return this.f29072d;
    }

    @Override // pg.l9
    /* renamed from: c */
    public final int mo11771c() {
        return 0;
    }

    @Override // pg.l9
    /* renamed from: e */
    public final Object[] mo11772e() {
        return this.f29071c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        tb.m10929b(i10, this.f29072d);
        Object obj = this.f29071c[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29072d;
    }
}
