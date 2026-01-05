package p001o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p001o.e9b;
import p001o.mz5;
import p001o.x8b;

/* loaded from: classes2.dex */
public abstract class be1 implements x8b {

    /* renamed from: a */
    public final ArrayList f15994a = new ArrayList(1);

    /* renamed from: b */
    public final HashSet f15995b = new HashSet(1);

    /* renamed from: c */
    public final e9b.C13130a f15996c = new e9b.C13130a();

    /* renamed from: d */
    public final mz5.C15451a f15997d = new mz5.C15451a();

    /* renamed from: e */
    public Looper f15998e;

    /* renamed from: f */
    public lmh f15999f;

    /* renamed from: g */
    public jbd f16000g;

    /* renamed from: A */
    public final boolean m18728A() {
        return !this.f15995b.isEmpty();
    }

    /* renamed from: B */
    public abstract void mo6919B(juh juhVar);

    /* renamed from: C */
    public final void m18729C(lmh lmhVar) {
        this.f15999f = lmhVar;
        Iterator it = this.f15994a.iterator();
        while (it.hasNext()) {
            ((x8b.InterfaceC18077c) it.next()).mo30023a(this, lmhVar);
        }
    }

    /* renamed from: D */
    public abstract void mo6920D();

    @Override // p001o.x8b
    /* renamed from: c */
    public final void mo18730c(Handler handler, mz5 mz5Var) {
        op0.m42515e(handler);
        op0.m42515e(mz5Var);
        this.f15997d.m39902g(handler, mz5Var);
    }

    @Override // p001o.x8b
    /* renamed from: d */
    public final void mo18731d(mz5 mz5Var) {
        this.f15997d.m39909t(mz5Var);
    }

    @Override // p001o.x8b
    /* renamed from: f */
    public final void mo18732f(x8b.InterfaceC18077c interfaceC18077c) {
        this.f15994a.remove(interfaceC18077c);
        if (!this.f15994a.isEmpty()) {
            mo18735q(interfaceC18077c);
            return;
        }
        this.f15998e = null;
        this.f15999f = null;
        this.f16000g = null;
        this.f15995b.clear();
        mo6920D();
    }

    @Override // p001o.x8b
    /* renamed from: g */
    public final void mo18733g(x8b.InterfaceC18077c interfaceC18077c) {
        op0.m42515e(this.f15998e);
        boolean zIsEmpty = this.f15995b.isEmpty();
        this.f15995b.add(interfaceC18077c);
        if (zIsEmpty) {
            mo18743y();
        }
    }

    @Override // p001o.x8b
    /* renamed from: h */
    public final void mo18734h(x8b.InterfaceC18077c interfaceC18077c, juh juhVar, jbd jbdVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f15998e;
        op0.m42511a(looper == null || looper == looperMyLooper);
        this.f16000g = jbdVar;
        lmh lmhVar = this.f15999f;
        this.f15994a.add(interfaceC18077c);
        if (this.f15998e == null) {
            this.f15998e = looperMyLooper;
            this.f15995b.add(interfaceC18077c);
            mo6919B(juhVar);
        } else if (lmhVar != null) {
            mo18733g(interfaceC18077c);
            interfaceC18077c.mo30023a(this, lmhVar);
        }
    }

    @Override // p001o.x8b
    /* renamed from: q */
    public final void mo18735q(x8b.InterfaceC18077c interfaceC18077c) {
        boolean z = !this.f15995b.isEmpty();
        this.f15995b.remove(interfaceC18077c);
        if (z && this.f15995b.isEmpty()) {
            mo18742x();
        }
    }

    @Override // p001o.x8b
    /* renamed from: r */
    public final void mo18736r(e9b e9bVar) {
        this.f15996c.m24547B(e9bVar);
    }

    @Override // p001o.x8b
    /* renamed from: s */
    public final void mo18737s(Handler handler, e9b e9bVar) {
        op0.m42515e(handler);
        op0.m42515e(e9bVar);
        this.f15996c.m24551g(handler, e9bVar);
    }

    /* renamed from: t */
    public final mz5.C15451a m18738t(int i, x8b.C18076b c18076b) {
        return this.f15997d.m39910u(i, c18076b);
    }

    /* renamed from: u */
    public final mz5.C15451a m18739u(x8b.C18076b c18076b) {
        return this.f15997d.m39910u(0, c18076b);
    }

    /* renamed from: v */
    public final e9b.C13130a m18740v(int i, x8b.C18076b c18076b) {
        return this.f15996c.m24550E(i, c18076b);
    }

    /* renamed from: w */
    public final e9b.C13130a m18741w(x8b.C18076b c18076b) {
        return this.f15996c.m24550E(0, c18076b);
    }

    /* renamed from: x */
    public void mo18742x() {
    }

    /* renamed from: y */
    public void mo18743y() {
    }

    /* renamed from: z */
    public final jbd m18744z() {
        return (jbd) op0.m42519i(this.f16000g);
    }
}
