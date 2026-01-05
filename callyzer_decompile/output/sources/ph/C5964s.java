package ph;

import android.graphics.Matrix;
import android.graphics.Path;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.s */
/* loaded from: classes.dex */
public final class C5964s {

    /* renamed from: a */
    public float f29205a;

    /* renamed from: b */
    public float f29206b;

    /* renamed from: c */
    public float f29207c;

    /* renamed from: d */
    public float f29208d;

    /* renamed from: e */
    public float f29209e;

    /* renamed from: f */
    public final ArrayList f29210f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f29211g = new ArrayList();

    public C5964s() {
        m12003d(DefinitionKt.NO_Float_VALUE, 270.0f, DefinitionKt.NO_Float_VALUE);
    }

    /* renamed from: a */
    public final void m12000a(float f6) {
        float f10 = this.f29208d;
        if (f10 == f6) {
            return;
        }
        float f11 = ((f6 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f29206b;
        float f13 = this.f29207c;
        C5960o c5960o = new C5960o(f12, f13, f12, f13);
        c5960o.f29199f = this.f29208d;
        c5960o.f29200g = f11;
        this.f29211g.add(new C5958m(c5960o));
        this.f29208d = f6;
    }

    /* renamed from: b */
    public final void m12001b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f29210f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5962q) arrayList.get(i10)).mo11999a(matrix, path);
        }
    }

    /* renamed from: c */
    public final void m12002c(float f6, float f10) {
        C5961p c5961p = new C5961p();
        c5961p.f29201b = f6;
        c5961p.f29202c = f10;
        this.f29210f.add(c5961p);
        C5959n c5959n = new C5959n(c5961p, this.f29206b, this.f29207c);
        float fM11998b = c5959n.m11998b() + 270.0f;
        float fM11998b2 = c5959n.m11998b() + 270.0f;
        m12000a(fM11998b);
        this.f29211g.add(c5959n);
        this.f29208d = fM11998b2;
        this.f29206b = f6;
        this.f29207c = f10;
    }

    /* renamed from: d */
    public final void m12003d(float f6, float f10, float f11) {
        this.f29205a = f6;
        this.f29206b = DefinitionKt.NO_Float_VALUE;
        this.f29207c = f6;
        this.f29208d = f10;
        this.f29209e = (f10 + f11) % 360.0f;
        this.f29210f.clear();
        this.f29211g.clear();
    }
}
