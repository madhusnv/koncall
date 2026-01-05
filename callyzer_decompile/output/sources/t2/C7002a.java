package t2;

import k2.r1;
import k2.s0;
import l4.C4367l;
import o6.b0;
import og.hg;
import u2.InterfaceC7318o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t2.a */
/* loaded from: classes.dex */
public final class C7002a implements r1 {

    /* renamed from: a */
    public InterfaceC7012k f33924a;

    /* renamed from: b */
    public InterfaceC7009h f33925b;

    /* renamed from: c */
    public String f33926c;

    /* renamed from: d */
    public Object f33927d;

    /* renamed from: e */
    public Object[] f33928e;

    /* renamed from: f */
    public InterfaceC7008g f33929f;

    /* renamed from: g */
    public final b0 f33930g = new b0(5, this);

    public C7002a(InterfaceC7012k interfaceC7012k, InterfaceC7009h interfaceC7009h, String str, Object obj, Object[] objArr) {
        this.f33924a = interfaceC7012k;
        this.f33925b = interfaceC7009h;
        this.f33926c = str;
        this.f33927d = obj;
        this.f33928e = objArr;
    }

    /* renamed from: a */
    public final void m13271a() {
        String strM10690a;
        InterfaceC7009h interfaceC7009h = this.f33925b;
        if (this.f33929f != null) {
            throw new IllegalArgumentException(("entry(" + this.f33929f + ") is not null").toString());
        }
        if (interfaceC7009h != null) {
            b0 b0Var = this.f33930g;
            Object objInvoke = b0Var.invoke();
            if (objInvoke == null || interfaceC7009h.mo12856b(objInvoke)) {
                this.f33929f = interfaceC7009h.mo12859e(this.f33926c, b0Var);
                return;
            }
            if (objInvoke instanceof InterfaceC7318o) {
                InterfaceC7318o interfaceC7318o = (InterfaceC7318o) objInvoke;
                if (interfaceC7318o.mo8489c() == s0.f20544c || interfaceC7318o.mo8489c() == s0.f20547f || interfaceC7318o.mo8489c() == s0.f20545d) {
                    strM10690a = "MutableState containing " + interfaceC7318o.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM10690a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM10690a = hg.m10690a(objInvoke);
            }
            throw new IllegalArgumentException(strM10690a);
        }
    }

    @Override // k2.r1
    /* renamed from: b */
    public final void mo5874b() {
        InterfaceC7008g interfaceC7008g = this.f33929f;
        if (interfaceC7008g != null) {
            ((C4367l) interfaceC7008g).m9127N();
        }
    }

    @Override // k2.r1
    /* renamed from: c */
    public final void mo5875c() {
        InterfaceC7008g interfaceC7008g = this.f33929f;
        if (interfaceC7008g != null) {
            ((C4367l) interfaceC7008g).m9127N();
        }
    }

    @Override // k2.r1
    /* renamed from: e */
    public final void mo5876e() {
        m13271a();
    }
}
