package f2;

import a2.C0036i;
import android.view.ViewGroup;
import d3.AbstractC1550d;
import d3.C1565s;
import d3.InterfaceC1563q;
import f3.C2196b;
import gx.AbstractC2747a;
import i1.q0;
import java.util.LinkedHashMap;
import k2.C3953b;
import k2.e1;
import k2.r1;
import k2.w0;
import tb.C7105p;
import v3.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.a */
/* loaded from: classes.dex */
public final class C2178a implements r1, InterfaceC2185h, q0 {

    /* renamed from: a */
    public final boolean f10052a;

    /* renamed from: b */
    public final C2193p f10053b;

    /* renamed from: c */
    public final boolean f10054c;

    /* renamed from: d */
    public final float f10055d;

    /* renamed from: e */
    public final w0 f10056e;

    /* renamed from: f */
    public final w0 f10057f;

    /* renamed from: g */
    public final ViewGroup f10058g;

    /* renamed from: h */
    public C2184g f10059h;

    /* renamed from: j */
    public final e1 f10060j = C3953b.m8517t(null);

    /* renamed from: k */
    public final e1 f10061k = C3953b.m8517t(Boolean.TRUE);

    /* renamed from: l */
    public long f10062l = 0;

    /* renamed from: m */
    public int f10063m = -1;

    /* renamed from: n */
    public final C0036i f10064n = new C0036i(4, this);

    public C2178a(boolean z6, float f6, w0 w0Var, w0 w0Var2, ViewGroup viewGroup) {
        this.f10052a = z6;
        this.f10053b = new C2193p(z6, new C2187j(w0Var2, 0));
        this.f10054c = z6;
        this.f10055d = f6;
        this.f10056e = w0Var;
        this.f10057f = w0Var2;
        this.f10058g = viewGroup;
    }

    @Override // i1.q0
    /* renamed from: a */
    public final void mo5873a(i0 i0Var) {
        C2196b c2196b = i0Var.f36917a;
        this.f10062l = c2196b.mo5913e();
        float f6 = this.f10055d;
        this.f10063m = Float.isNaN(f6) ? AbstractC2747a.m6747k(AbstractC2183f.m5882a(i0Var, this.f10054c, c2196b.mo5913e())) : c2196b.e0(f6);
        long j6 = ((C1565s) this.f10056e.getValue()).f7819a;
        float f10 = ((C2182e) this.f10057f.getValue()).f10084d;
        i0Var.m14622b();
        this.f10053b.m5892d(i0Var, Float.isNaN(f6) ? AbstractC2183f.m5882a(i0Var, this.f10052a, c2196b.mo5913e()) : i0Var.mo8435T(f6), j6);
        InterfaceC1563q interfaceC1563qM75t = c2196b.f10124b.m75t();
        ((Boolean) this.f10061k.getValue()).booleanValue();
        C2186i c2186i = (C2186i) this.f10060j.getValue();
        if (c2186i != null) {
            c2186i.m5888e(c2196b.mo5913e(), this.f10063m, j6, f10);
            c2186i.draw(AbstractC1550d.m5119a(interfaceC1563qM75t));
        }
    }

    @Override // k2.r1
    /* renamed from: b */
    public final void mo5874b() {
        C2184g c2184g = this.f10059h;
        if (c2184g != null) {
            mo5877z();
            C7105p c7105p = c2184g.f10089d;
            C2186i c2186i = (C2186i) ((LinkedHashMap) c7105p.f34290b).get(this);
            if (c2186i != null) {
                c2186i.m5886c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c7105p.f34290b;
                C2186i c2186i2 = (C2186i) linkedHashMap.get(this);
                if (c2186i2 != null) {
                }
                linkedHashMap.remove(this);
                c2184g.f10088c.add(c2186i);
            }
        }
    }

    @Override // k2.r1
    /* renamed from: c */
    public final void mo5875c() {
        C2184g c2184g = this.f10059h;
        if (c2184g != null) {
            mo5877z();
            C7105p c7105p = c2184g.f10089d;
            C2186i c2186i = (C2186i) ((LinkedHashMap) c7105p.f34290b).get(this);
            if (c2186i != null) {
                c2186i.m5886c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c7105p.f34290b;
                C2186i c2186i2 = (C2186i) linkedHashMap.get(this);
                if (c2186i2 != null) {
                }
                linkedHashMap.remove(this);
                c2184g.f10088c.add(c2186i);
            }
        }
    }

    @Override // f2.InterfaceC2185h
    /* renamed from: z */
    public final void mo5877z() {
        this.f10060j.setValue(null);
    }

    @Override // k2.r1
    /* renamed from: e */
    public final void mo5876e() {
    }
}
