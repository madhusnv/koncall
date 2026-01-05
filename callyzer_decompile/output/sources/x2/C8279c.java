package x2;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import b3.InterfaceC0577i;
import bg.C0657b;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.C1590r;
import d4.InterfaceC1584l;
import e1.C1923y;
import e4.C1944a;
import ex.InterfaceC2139c;
import p020v.a1;
import pg.q9;
import v3.g0;
import w3.C7892j;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x2.c */
/* loaded from: classes.dex */
public final class C8279c extends AbstractC8286j implements InterfaceC1584l, InterfaceC0577i {

    /* renamed from: a */
    public final C0657b f39803a;

    /* renamed from: b */
    public final C1590r f39804b;

    /* renamed from: c */
    public final C7904v f39805c;

    /* renamed from: d */
    public final C1944a f39806d;

    /* renamed from: e */
    public final String f39807e;

    /* renamed from: f */
    public final Rect f39808f = new Rect();

    /* renamed from: g */
    public final AutofillId f39809g;

    /* renamed from: h */
    public final C1923y f39810h;

    /* renamed from: i */
    public boolean f39811i;

    public C8279c(C0657b c0657b, C1590r c1590r, C7904v c7904v, C1944a c1944a, String str) {
        this.f39803a = c0657b;
        this.f39804b = c1590r;
        this.f39805c = c7904v;
        this.f39806d = c1944a;
        this.f39807e = str;
        c7904v.setImportantForAutofill(1);
        C0657b c0657bM11835a = q9.m11835a(c7904v);
        AutofillId autofillId = c0657bM11835a != null ? (AutofillId) c0657bM11835a.f4200a : null;
        if (autofillId == null) {
            throw a1.m14342v("Required value was null.");
        }
        this.f39809g = autofillId;
        this.f39810h = new C1923y();
    }

    /* renamed from: a */
    public final void m15486a(SparseArray sparseArray) {
        C1583k c1583kM14611x;
        InterfaceC2139c interfaceC2139c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueM14963e = C7892j.m14963e(sparseArray.get(iKeyAt));
            if (autofillValueM14963e.isText()) {
                g0 g0Var = (g0) this.f39804b.f7885c.m5595b(iKeyAt);
                if (g0Var != null && (c1583kM14611x = g0Var.m14611x()) != null) {
                    Object objM5574g = c1583kM14611x.f7868a.m5574g(C1582j.f7848g);
                    if (objM5574g == null) {
                        objM5574g = null;
                    }
                    C1573a c1573a = (C1573a) objM5574g;
                    if (c1573a != null && (interfaceC2139c = (InterfaceC2139c) c1573a.f7826b) != null) {
                    }
                }
            } else if (!autofillValueM14963e.isDate() && !autofillValueM14963e.isList()) {
                autofillValueM14963e.isToggle();
            }
        }
    }
}
