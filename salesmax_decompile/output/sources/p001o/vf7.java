package p001o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class vf7 extends nmh {

    /* renamed from: f */
    public nmh f50279f;

    public vf7(nmh nmhVar) {
        sq8.m48649h(nmhVar, "delegate");
        this.f50279f = nmhVar;
    }

    @Override // p001o.nmh
    /* renamed from: a */
    public nmh mo40790a() {
        return this.f50279f.mo40790a();
    }

    @Override // p001o.nmh
    /* renamed from: b */
    public nmh mo40791b() {
        return this.f50279f.mo40791b();
    }

    @Override // p001o.nmh
    /* renamed from: c */
    public long mo40792c() {
        return this.f50279f.mo40792c();
    }

    @Override // p001o.nmh
    /* renamed from: d */
    public nmh mo40793d(long j) {
        return this.f50279f.mo40793d(j);
    }

    @Override // p001o.nmh
    /* renamed from: e */
    public boolean mo40794e() {
        return this.f50279f.mo40794e();
    }

    @Override // p001o.nmh
    /* renamed from: f */
    public void mo40795f() throws InterruptedIOException {
        this.f50279f.mo40795f();
    }

    @Override // p001o.nmh
    /* renamed from: g */
    public nmh mo40796g(long j, TimeUnit timeUnit) {
        sq8.m48649h(timeUnit, "unit");
        return this.f50279f.mo40796g(j, timeUnit);
    }

    @Override // p001o.nmh
    /* renamed from: h */
    public long mo40797h() {
        return this.f50279f.mo40797h();
    }

    /* renamed from: i */
    public final nmh m52701i() {
        return this.f50279f;
    }

    /* renamed from: j */
    public final vf7 m52702j(nmh nmhVar) {
        sq8.m48649h(nmhVar, "delegate");
        this.f50279f = nmhVar;
        return this;
    }
}
