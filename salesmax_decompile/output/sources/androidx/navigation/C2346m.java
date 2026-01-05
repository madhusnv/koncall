package androidx.navigation;

import androidx.navigation.C2345l;
import p001o.cg0;
import p001o.f9g;
import p001o.led;
import p001o.ob9;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.navigation.m */
/* loaded from: classes2.dex */
public final class C2346m {

    /* renamed from: b */
    public boolean f9665b;

    /* renamed from: c */
    public boolean f9666c;

    /* renamed from: e */
    public String f9668e;

    /* renamed from: f */
    public boolean f9669f;

    /* renamed from: g */
    public boolean f9670g;

    /* renamed from: h */
    public ob9 f9671h;

    /* renamed from: i */
    public Object f9672i;

    /* renamed from: a */
    public final C2345l.a f9664a = new C2345l.a();

    /* renamed from: d */
    public int f9667d = -1;

    /* renamed from: a */
    public final void m8825a(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "animBuilder");
        cg0 cg0Var = new cg0();
        xk7Var.invoke(cg0Var);
        this.f9664a.m8815b(cg0Var.m21132a()).m8816c(cg0Var.m21133b()).m8818e(cg0Var.m21134c()).m8819f(cg0Var.m21135d());
    }

    /* renamed from: b */
    public final C2345l m8826b() {
        C2345l.a aVar = this.f9664a;
        aVar.m8817d(this.f9665b);
        aVar.m8824l(this.f9666c);
        String str = this.f9668e;
        if (str != null) {
            aVar.m8822i(str, this.f9669f, this.f9670g);
        } else {
            ob9 ob9Var = this.f9671h;
            if (ob9Var != null) {
                sq8.m48646e(ob9Var);
                aVar.m8823j(ob9Var, this.f9669f, this.f9670g);
            } else {
                Object obj = this.f9672i;
                if (obj != null) {
                    sq8.m48646e(obj);
                    aVar.m8821h(obj, this.f9669f, this.f9670g);
                } else {
                    aVar.m8820g(this.f9667d, this.f9669f, this.f9670g);
                }
            }
        }
        return aVar.m8814a();
    }

    /* renamed from: c */
    public final void m8827c(int i, xk7 xk7Var) {
        sq8.m48649h(xk7Var, "popUpToBuilder");
        m8829e(i);
        m8830f(null);
        led ledVar = new led();
        xk7Var.invoke(ledVar);
        this.f9669f = ledVar.m37040a();
        this.f9670g = ledVar.m37041b();
    }

    /* renamed from: d */
    public final void m8828d(boolean z) {
        this.f9665b = z;
    }

    /* renamed from: e */
    public final void m8829e(int i) {
        this.f9667d = i;
        this.f9669f = false;
    }

    /* renamed from: f */
    public final void m8830f(String str) {
        if (str != null) {
            if (!(!f9g.d0(str))) {
                throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
            }
            this.f9668e = str;
            this.f9669f = false;
        }
    }

    /* renamed from: g */
    public final void m8831g(boolean z) {
        this.f9666c = z;
    }
}
