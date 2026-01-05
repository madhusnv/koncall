package j3;

import java.util.ArrayList;
import java.util.List;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.d */
/* loaded from: classes.dex */
public final class C3550d {

    /* renamed from: a */
    public final String f18963a;

    /* renamed from: b */
    public final float f18964b;

    /* renamed from: c */
    public final float f18965c;

    /* renamed from: d */
    public final float f18966d;

    /* renamed from: e */
    public final float f18967e;

    /* renamed from: f */
    public final float f18968f;

    /* renamed from: g */
    public final float f18969g;

    /* renamed from: h */
    public final float f18970h;

    /* renamed from: i */
    public final List f18971i;

    /* renamed from: j */
    public final ArrayList f18972j;

    public C3550d(String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f6 = (i10 & 2) != 0 ? 0.0f : f6;
        f10 = (i10 & 4) != 0 ? 0.0f : f10;
        f11 = (i10 & 8) != 0 ? 0.0f : f11;
        f12 = (i10 & 16) != 0 ? 1.0f : f12;
        f13 = (i10 & 32) != 0 ? 1.0f : f13;
        f14 = (i10 & 64) != 0 ? 0.0f : f14;
        f15 = (i10 & 128) != 0 ? 0.0f : f15;
        if ((i10 & 256) != 0) {
            int i11 = h0.f19025a;
            list = C6668r.f31943a;
        }
        ArrayList arrayList = new ArrayList();
        this.f18963a = str;
        this.f18964b = f6;
        this.f18965c = f10;
        this.f18966d = f11;
        this.f18967e = f12;
        this.f18968f = f13;
        this.f18969g = f14;
        this.f18970h = f15;
        this.f18971i = list;
        this.f18972j = arrayList;
    }
}
