package p001o;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.InterfaceC1893c;
import java.util.concurrent.Executor;
import p001o.zd8;

/* loaded from: classes2.dex */
public class gzb implements zd8 {

    /* renamed from: a */
    public final zd8 f25996a;

    /* renamed from: b */
    public gjd f25997b;

    public gzb(zd8 zd8Var) {
        this.f25996a = zd8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m29683l(zd8.InterfaceC18614a interfaceC18614a, zd8 zd8Var) {
        interfaceC18614a.mo27818a(this);
    }

    @Override // p001o.zd8
    /* renamed from: a */
    public Surface mo4668a() {
        return this.f25996a.mo4668a();
    }

    @Override // p001o.zd8
    /* renamed from: c */
    public InterfaceC1893c mo4669c() {
        return m29686k(this.f25996a.mo4669c());
    }

    @Override // p001o.zd8
    public void close() {
        this.f25996a.close();
    }

    @Override // p001o.zd8
    /* renamed from: d */
    public int mo4670d() {
        return this.f25996a.mo4670d();
    }

    @Override // p001o.zd8
    /* renamed from: e */
    public void mo4671e() {
        this.f25996a.mo4671e();
    }

    @Override // p001o.zd8
    /* renamed from: f */
    public int mo4672f() {
        return this.f25996a.mo4672f();
    }

    @Override // p001o.zd8
    /* renamed from: g */
    public void mo4673g(final zd8.InterfaceC18614a interfaceC18614a, Executor executor) {
        this.f25996a.mo4673g(new zd8.InterfaceC18614a() { // from class: o.fzb
            @Override // p001o.zd8.InterfaceC18614a
            /* renamed from: a */
            public final void mo27818a(zd8 zd8Var) {
                this.f24276a.m29683l(interfaceC18614a, zd8Var);
            }
        }, executor);
    }

    @Override // p001o.zd8
    public int getHeight() {
        return this.f25996a.getHeight();
    }

    @Override // p001o.zd8
    public int getWidth() {
        return this.f25996a.getWidth();
    }

    @Override // p001o.zd8
    /* renamed from: h */
    public InterfaceC1893c mo4674h() {
        return m29686k(this.f25996a.mo4674h());
    }

    /* renamed from: i */
    public void m29684i(gjd gjdVar) {
        fgd.m26666j(this.f25997b == null, "Pending request should be null");
        this.f25997b = gjdVar;
    }

    /* renamed from: j */
    public void m29685j() {
        this.f25997b = null;
    }

    /* renamed from: k */
    public final InterfaceC1893c m29686k(InterfaceC1893c interfaceC1893c) {
        if (interfaceC1893c == null) {
            return null;
        }
        wig wigVarM54615b = this.f25997b == null ? wig.m54615b() : wig.m54614a(new Pair(this.f25997b.m28872i(), this.f25997b.m28871h().get(0)));
        this.f25997b = null;
        return new rif(interfaceC1893c, new Size(interfaceC1893c.getWidth(), interfaceC1893c.getHeight()), new v72(new r0j(wigVarM54615b, interfaceC1893c.y2().getTimestamp())));
    }
}
