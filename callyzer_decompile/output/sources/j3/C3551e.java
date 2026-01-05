package j3;

import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import d3.n0;
import java.util.ArrayList;
import s3.AbstractC6744a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.e */
/* loaded from: classes.dex */
public final class C3551e {

    /* renamed from: a */
    public final String f18974a;

    /* renamed from: b */
    public final float f18975b;

    /* renamed from: c */
    public final float f18976c;

    /* renamed from: d */
    public final float f18977d;

    /* renamed from: e */
    public final float f18978e;

    /* renamed from: f */
    public final long f18979f;

    /* renamed from: g */
    public final int f18980g;

    /* renamed from: h */
    public final boolean f18981h;

    /* renamed from: i */
    public final ArrayList f18982i;

    /* renamed from: j */
    public final C3550d f18983j;

    /* renamed from: k */
    public boolean f18984k;

    public C3551e(String str, float f6, float f10, float f11, float f12, long j6, int i10, boolean z6, int i11) {
        str = (i11 & 1) != 0 ? "" : str;
        long j10 = (i11 & 32) != 0 ? C1565s.f7817j : j6;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        this.f18974a = str;
        this.f18975b = f6;
        this.f18976c = f10;
        this.f18977d = f11;
        this.f18978e = f12;
        this.f18979f = j10;
        this.f18980g = i12;
        this.f18981h = z6;
        ArrayList arrayList = new ArrayList();
        this.f18982i = arrayList;
        C3550d c3550d = new C3550d(null, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 1023);
        this.f18983j = c3550d;
        arrayList.add(c3550d);
    }

    /* renamed from: a */
    public static void m8090a(C3551e c3551e, ArrayList arrayList, n0 n0Var) {
        if (c3551e.f18984k) {
            AbstractC6744a.m12907b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C3550d) c3551e.f18982i.get(r0.size() - 1)).f18972j.add(new k0("", arrayList, 0, n0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, DefinitionKt.NO_Float_VALUE, 1.0f, DefinitionKt.NO_Float_VALUE));
    }

    /* renamed from: b */
    public final C3552f m8091b() {
        if (this.f18984k) {
            AbstractC6744a.m12907b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f18982i;
            if (arrayList.size() <= 1) {
                C3550d c3550d = this.f18983j;
                C3552f c3552f = new C3552f(this.f18974a, this.f18975b, this.f18976c, this.f18977d, this.f18978e, new g0(c3550d.f18963a, c3550d.f18964b, c3550d.f18965c, c3550d.f18966d, c3550d.f18967e, c3550d.f18968f, c3550d.f18969g, c3550d.f18970h, c3550d.f18971i, c3550d.f18972j), this.f18979f, this.f18980g, this.f18981h);
                this.f18984k = true;
                return c3552f;
            }
            if (this.f18984k) {
                AbstractC6744a.m12907b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C3550d c3550d2 = (C3550d) arrayList.remove(arrayList.size() - 1);
            ((C3550d) arrayList.get(arrayList.size() - 1)).f18972j.add(new g0(c3550d2.f18963a, c3550d2.f18964b, c3550d2.f18965c, c3550d2.f18966d, c3550d2.f18967e, c3550d2.f18968f, c3550d2.f18969g, c3550d2.f18970h, c3550d2.f18971i, c3550d2.f18972j));
        }
    }
}
