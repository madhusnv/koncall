package e5;

import com.skydoves.balloon.internals.DefinitionKt;
import d5.InterfaceC1604h;
import g5.C2514d;
import g5.C2517g;
import g5.C2522l;
import java.util.ArrayList;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e5.h */
/* loaded from: classes.dex */
public final class C1953h implements InterfaceC1950e, InterfaceC1604h {

    /* renamed from: a */
    public final C8553n f9193a;

    /* renamed from: b */
    public int f9194b;

    /* renamed from: c */
    public C2522l f9195c;

    /* renamed from: d */
    public int f9196d = -1;

    /* renamed from: e */
    public int f9197e = -1;

    /* renamed from: f */
    public float f9198f = DefinitionKt.NO_Float_VALUE;

    /* renamed from: g */
    public String f9199g;

    public C1953h(C8553n c8553n) {
        this.f9193a = c8553n;
    }

    @Override // d5.InterfaceC1604h
    /* renamed from: a */
    public final void mo5237a(C2517g c2517g) {
        if (c2517g instanceof C2522l) {
            this.f9195c = (C2522l) c2517g;
        } else {
            this.f9195c = null;
        }
    }

    @Override // e5.InterfaceC1950e, d5.InterfaceC1604h
    public final void apply() {
        C2522l c2522l = this.f9195c;
        int i10 = this.f9194b;
        C2514d[] c2514dArr = c2522l.f13769I;
        ArrayList arrayList = c2522l.f13770J;
        if (c2522l.f44273k0 != i10) {
            c2522l.f44273k0 = i10;
            arrayList.clear();
            if (c2522l.f44273k0 == 1) {
                c2522l.f44272j0 = c2522l.f13761A;
            } else {
                c2522l.f44272j0 = c2522l.f13762B;
            }
            arrayList.add(c2522l.f44272j0);
            int length = c2514dArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                c2514dArr[i11] = c2522l.f44272j0;
            }
        }
        int i12 = this.f9196d;
        if (i12 != -1) {
            C2522l c2522l2 = this.f9195c;
            if (i12 <= -1) {
                c2522l2.getClass();
                return;
            }
            c2522l2.f44269g0 = -1.0f;
            c2522l2.f44270h0 = i12;
            c2522l2.f44271i0 = -1;
            return;
        }
        int i13 = this.f9197e;
        if (i13 != -1) {
            C2522l c2522l3 = this.f9195c;
            if (i13 <= -1) {
                c2522l3.getClass();
                return;
            }
            c2522l3.f44269g0 = -1.0f;
            c2522l3.f44270h0 = -1;
            c2522l3.f44271i0 = i13;
            return;
        }
        C2522l c2522l4 = this.f9195c;
        float f6 = this.f9198f;
        if (f6 <= -1.0f) {
            c2522l4.getClass();
            return;
        }
        c2522l4.f44269g0 = f6;
        c2522l4.f44270h0 = -1;
        c2522l4.f44271i0 = -1;
    }

    @Override // d5.InterfaceC1604h
    /* renamed from: b */
    public final C2517g mo5238b() {
        if (this.f9195c == null) {
            C2522l c2522l = new C2522l();
            c2522l.f44269g0 = -1.0f;
            c2522l.f44270h0 = -1;
            c2522l.f44271i0 = -1;
            c2522l.f44272j0 = c2522l.f13762B;
            c2522l.f44273k0 = 0;
            c2522l.f13770J.clear();
            c2522l.f13770J.add(c2522l.f44272j0);
            int length = c2522l.f13769I.length;
            for (int i10 = 0; i10 < length; i10++) {
                c2522l.f13769I[i10] = c2522l.f44272j0;
            }
            this.f9195c = c2522l;
        }
        return this.f9195c;
    }

    @Override // d5.InterfaceC1604h
    /* renamed from: c */
    public final InterfaceC1950e mo5239c() {
        return null;
    }

    @Override // d5.InterfaceC1604h
    public final Object getKey() {
        return this.f9199g;
    }
}
