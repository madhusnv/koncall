package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.AbstractC1892b;
import androidx.camera.core.InterfaceC1893c;
import java.util.concurrent.Executor;
import p001o.xtf;
import p001o.zd8;

/* renamed from: androidx.camera.core.e */
/* loaded from: classes2.dex */
public class C1895e implements zd8 {

    /* renamed from: d */
    public final zd8 f6115d;

    /* renamed from: e */
    public final Surface f6116e;

    /* renamed from: f */
    public AbstractC1892b.a f6117f;

    /* renamed from: a */
    public final Object f6112a = new Object();

    /* renamed from: b */
    public int f6113b = 0;

    /* renamed from: c */
    public boolean f6114c = false;

    /* renamed from: g */
    public final AbstractC1892b.a f6118g = new AbstractC1892b.a() { // from class: o.tze
        @Override // androidx.camera.core.AbstractC1892b.a
        /* renamed from: b */
        public final void mo4662b(InterfaceC1893c interfaceC1893c) {
            this.f48120a.m4685k(interfaceC1893c);
        }
    };

    public C1895e(zd8 zd8Var) {
        this.f6115d = zd8Var;
        this.f6116e = zd8Var.mo4668a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m4685k(InterfaceC1893c interfaceC1893c) {
        AbstractC1892b.a aVar;
        synchronized (this.f6112a) {
            int i = this.f6113b - 1;
            this.f6113b = i;
            if (this.f6114c && i == 0) {
                close();
            }
            aVar = this.f6117f;
        }
        if (aVar != null) {
            aVar.mo4662b(interfaceC1893c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m4686l(zd8.InterfaceC18614a interfaceC18614a, zd8 zd8Var) {
        interfaceC18614a.mo27818a(this);
    }

    @Override // p001o.zd8
    /* renamed from: a */
    public Surface mo4668a() {
        Surface surfaceMo4668a;
        synchronized (this.f6112a) {
            surfaceMo4668a = this.f6115d.mo4668a();
        }
        return surfaceMo4668a;
    }

    @Override // p001o.zd8
    /* renamed from: c */
    public InterfaceC1893c mo4669c() {
        InterfaceC1893c interfaceC1893cM4690o;
        synchronized (this.f6112a) {
            interfaceC1893cM4690o = m4690o(this.f6115d.mo4669c());
        }
        return interfaceC1893cM4690o;
    }

    @Override // p001o.zd8
    public void close() {
        synchronized (this.f6112a) {
            Surface surface = this.f6116e;
            if (surface != null) {
                surface.release();
            }
            this.f6115d.close();
        }
    }

    @Override // p001o.zd8
    /* renamed from: d */
    public int mo4670d() {
        int iMo4670d;
        synchronized (this.f6112a) {
            iMo4670d = this.f6115d.mo4670d();
        }
        return iMo4670d;
    }

    @Override // p001o.zd8
    /* renamed from: e */
    public void mo4671e() {
        synchronized (this.f6112a) {
            this.f6115d.mo4671e();
        }
    }

    @Override // p001o.zd8
    /* renamed from: f */
    public int mo4672f() {
        int iMo4672f;
        synchronized (this.f6112a) {
            iMo4672f = this.f6115d.mo4672f();
        }
        return iMo4672f;
    }

    @Override // p001o.zd8
    /* renamed from: g */
    public void mo4673g(final zd8.InterfaceC18614a interfaceC18614a, Executor executor) {
        synchronized (this.f6112a) {
            this.f6115d.mo4673g(new zd8.InterfaceC18614a() { // from class: o.uze
                @Override // p001o.zd8.InterfaceC18614a
                /* renamed from: a */
                public final void mo27818a(zd8 zd8Var) {
                    this.f49712a.m4686l(interfaceC18614a, zd8Var);
                }
            }, executor);
        }
    }

    @Override // p001o.zd8
    public int getHeight() {
        int height;
        synchronized (this.f6112a) {
            height = this.f6115d.getHeight();
        }
        return height;
    }

    @Override // p001o.zd8
    public int getWidth() {
        int width;
        synchronized (this.f6112a) {
            width = this.f6115d.getWidth();
        }
        return width;
    }

    @Override // p001o.zd8
    /* renamed from: h */
    public InterfaceC1893c mo4674h() {
        InterfaceC1893c interfaceC1893cM4690o;
        synchronized (this.f6112a) {
            interfaceC1893cM4690o = m4690o(this.f6115d.mo4674h());
        }
        return interfaceC1893cM4690o;
    }

    /* renamed from: j */
    public int m4687j() {
        int iMo4672f;
        synchronized (this.f6112a) {
            iMo4672f = this.f6115d.mo4672f() - this.f6113b;
        }
        return iMo4672f;
    }

    /* renamed from: m */
    public void m4688m() {
        synchronized (this.f6112a) {
            this.f6114c = true;
            this.f6115d.mo4671e();
            if (this.f6113b == 0) {
                close();
            }
        }
    }

    /* renamed from: n */
    public void m4689n(AbstractC1892b.a aVar) {
        synchronized (this.f6112a) {
            this.f6117f = aVar;
        }
    }

    /* renamed from: o */
    public final InterfaceC1893c m4690o(InterfaceC1893c interfaceC1893c) {
        if (interfaceC1893c == null) {
            return null;
        }
        this.f6113b++;
        xtf xtfVar = new xtf(interfaceC1893c);
        xtfVar.m4660a(this.f6118g);
        return xtfVar;
    }
}
