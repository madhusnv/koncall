package jc;

import iz.k0;
import iz.n0;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC4154l;
import xc.C8326g;
import xc.C8328i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC3744t {

    /* renamed from: a */
    public final /* synthetic */ int f19549a = 1;

    /* renamed from: b */
    public final Long f19550b;

    /* renamed from: c */
    public final /* synthetic */ Closeable f19551c;

    public a0(k0 k0Var) {
        Long lValueOf;
        this.f19551c = k0Var;
        n0 n0Var = k0Var.f17923g;
        AbstractC4154l.m8920c(n0Var);
        if (n0Var.mo7460h() >= 0) {
            AbstractC4154l.m8920c(n0Var);
            lValueOf = Long.valueOf(n0Var.mo7460h());
        } else {
            lValueOf = null;
        }
        this.f19550b = lValueOf;
    }

    @Override // jc.AbstractC3745u
    public final Long getContentLength() {
        switch (this.f19549a) {
        }
        return this.f19550b;
    }

    @Override // jc.AbstractC3745u
    public final boolean isOneShot() {
        switch (this.f19549a) {
        }
        return true;
    }

    @Override // jc.AbstractC3744t
    public final wc.e0 readFrom() {
        switch (this.f19549a) {
            case 0:
                return (wc.e0) this.f19551c;
            default:
                n0 n0Var = ((k0) this.f19551c).f17923g;
                AbstractC4154l.m8920c(n0Var);
                b00.i0 i0VarMo7462n = n0Var.mo7462n();
                AbstractC4154l.m8923f(i0VarMo7462n, "<this>");
                return i0VarMo7462n instanceof C8328i ? ((C8328i) i0VarMo7462n).f39902a : new C8326g(i0VarMo7462n);
        }
    }

    public a0(Long l9, wc.e0 e0Var) {
        this.f19551c = e0Var;
        this.f19550b = l9;
    }
}
