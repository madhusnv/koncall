package p001o;

import androidx.media3.exoplayer.InterfaceC2218o;
import androidx.media3.exoplayer.InterfaceC2221p;
import p001o.x8b;

/* loaded from: classes2.dex */
public abstract class auh {

    /* renamed from: a */
    public InterfaceC12254a f15268a;

    /* renamed from: b */
    public ta1 f15269b;

    /* renamed from: o.auh$a */
    public interface InterfaceC12254a {
        /* renamed from: a */
        void mo7236a(InterfaceC2218o interfaceC2218o);

        /* renamed from: b */
        void mo7237b();
    }

    /* renamed from: b */
    public final ta1 m17850b() {
        return (ta1) op0.m42519i(this.f15269b);
    }

    /* renamed from: c */
    public abstract yth mo17851c();

    /* renamed from: d */
    public abstract InterfaceC2221p.a mo17852d();

    /* renamed from: e */
    public void m17853e(InterfaceC12254a interfaceC12254a, ta1 ta1Var) {
        this.f15268a = interfaceC12254a;
        this.f15269b = ta1Var;
    }

    /* renamed from: f */
    public final void m17854f() {
        InterfaceC12254a interfaceC12254a = this.f15268a;
        if (interfaceC12254a != null) {
            interfaceC12254a.mo7237b();
        }
    }

    /* renamed from: g */
    public final void m17855g(InterfaceC2218o interfaceC2218o) {
        InterfaceC12254a interfaceC12254a = this.f15268a;
        if (interfaceC12254a != null) {
            interfaceC12254a.mo7236a(interfaceC2218o);
        }
    }

    /* renamed from: h */
    public abstract boolean mo17856h();

    /* renamed from: i */
    public abstract void mo17857i(Object obj);

    /* renamed from: j */
    public void mo17858j() {
        this.f15268a = null;
        this.f15269b = null;
    }

    /* renamed from: k */
    public abstract buh mo17859k(InterfaceC2221p[] interfaceC2221pArr, sth sthVar, x8b.C18076b c18076b, lmh lmhVar);

    /* renamed from: l */
    public abstract void mo17860l(wx0 wx0Var);

    /* renamed from: m */
    public abstract void mo17861m(yth ythVar);
}
