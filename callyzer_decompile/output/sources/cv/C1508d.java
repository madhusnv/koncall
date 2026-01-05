package cv;

import ct.C1502a;
import dv.C1840a;
import dv.C1845f;
import dv.C1850k;
import ex.InterfaceC2139c;
import fv.C2386k;
import java.util.Calendar;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import qw.a0;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1508d implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f7621a;

    /* renamed from: b */
    public final /* synthetic */ w0 f7622b;

    /* renamed from: c */
    public final /* synthetic */ C2386k f7623c;

    public /* synthetic */ C1508d(C2386k c2386k, w0 w0Var) {
        this.f7621a = 2;
        this.f7623c = c2386k;
        this.f7622b = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f7621a;
        a0 a0Var = a0.f30746a;
        w0 w0Var = this.f7622b;
        C2386k c2386k = this.f7623c;
        switch (i10) {
            case 0:
                String text = (String) obj;
                AbstractC4154l.m8923f(text, "text");
                w0Var.setValue(AbstractC5178p.h0(text).toString());
                c2386k.m6074s(new C1845f(text));
                break;
            case 1:
                C1502a it = (C1502a) obj;
                AbstractC4154l.m8923f(it, "it");
                w0Var.setValue(Boolean.FALSE);
                c2386k.m6074s(new C1850k(it.f7591d));
                break;
            default:
                Calendar selectedDateTime = (Calendar) obj;
                AbstractC4154l.m8923f(selectedDateTime, "selectedDateTime");
                w0Var.setValue(Boolean.FALSE);
                C8800o c8800o = C8800o.f42459a;
                c2386k.m6074s(new C1840a(C8800o.m16182F(selectedDateTime.getTimeInMillis())));
                break;
        }
        return a0Var;
    }

    public /* synthetic */ C1508d(w0 w0Var, C2386k c2386k, int i10) {
        this.f7621a = i10;
        this.f7622b = w0Var;
        this.f7623c = c2386k;
    }
}
