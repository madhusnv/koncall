package p001o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.InterfaceC1893c;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p001o.sc8;

/* loaded from: classes2.dex */
public abstract class mjg {

    /* renamed from: a */
    public int f35571a = new dd2().m22808a();

    /* renamed from: o.mjg$a */
    public interface InterfaceC15344a {
        /* renamed from: a */
        void mo28888a(mjg mjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m39229q(int i) {
        if (mo39242l() != null) {
            mo39242l().m48174a(i);
        } else {
            mo39240j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m39230r(vc8 vc8Var) {
        mo39240j();
        if (!(mo39242l() != null)) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        sc8.InterfaceC16802f interfaceC16802fMo39242l = mo39242l();
        Objects.requireNonNull(interfaceC16802fMo39242l);
        interfaceC16802fMo39242l.mo864e(vc8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m39231s(Bitmap bitmap) {
        if (mo39242l() != null) {
            mo39242l().m48175b(bitmap);
        } else {
            mo39240j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m39232t(sc8.C16804h c16804h) {
        sc8.InterfaceC16802f interfaceC16802fMo39242l = mo39242l();
        Objects.requireNonNull(interfaceC16802fMo39242l);
        Objects.requireNonNull(c16804h);
        interfaceC16802fMo39242l.mo863d(c16804h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m39233u(InterfaceC1893c interfaceC1893c) {
        mo39240j();
        throw null;
    }

    /* renamed from: v */
    public static mjg m39234v(Executor executor, sc8.AbstractC16801e abstractC16801e, sc8.InterfaceC16802f interfaceC16802f, sc8.C16803g c16803g, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        fgd.m26658b((interfaceC16802f == null) == (c16803g == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        fgd.m26658b(!(interfaceC16802f == null), "One and only one on-disk or in-memory callback should be present.");
        return new x51(executor, abstractC16801e, interfaceC16802f, c16803g, rect, matrix, i, i2, i3, list);
    }

    /* renamed from: A */
    public void m39235A(final sc8.C16804h c16804h) {
        mo39237g().execute(new Runnable() { // from class: o.kjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f32314a.m39232t(c16804h);
            }
        });
    }

    /* renamed from: f */
    public boolean m39236f() {
        elh.m25220a();
        int i = this.f35571a;
        if (i <= 0) {
            return false;
        }
        this.f35571a = i - 1;
        return true;
    }

    /* renamed from: g */
    public abstract Executor mo39237g();

    /* renamed from: h */
    public abstract int mo39238h();

    /* renamed from: i */
    public abstract Rect mo39239i();

    /* renamed from: j */
    public abstract sc8.AbstractC16801e mo39240j();

    /* renamed from: k */
    public abstract int mo39241k();

    /* renamed from: l */
    public abstract sc8.InterfaceC16802f mo39242l();

    /* renamed from: m */
    public abstract sc8.C16803g mo39243m();

    /* renamed from: n */
    public abstract int mo39244n();

    /* renamed from: o */
    public abstract Matrix mo39245o();

    /* renamed from: p */
    public abstract List mo39246p();

    /* renamed from: w */
    public void m39247w(final int i) {
        mo39237g().execute(new Runnable() { // from class: o.ijg
            @Override // java.lang.Runnable
            public final void run() {
                this.f28750a.m39229q(i);
            }
        });
    }

    /* renamed from: x */
    public void m39248x(final vc8 vc8Var) {
        mo39237g().execute(new Runnable() { // from class: o.hjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f27063a.m39230r(vc8Var);
            }
        });
    }

    /* renamed from: y */
    public void m39249y(final Bitmap bitmap) {
        mo39237g().execute(new Runnable() { // from class: o.jjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f30514a.m39231s(bitmap);
            }
        });
    }

    /* renamed from: z */
    public void m39250z(final InterfaceC1893c interfaceC1893c) {
        mo39237g().execute(new Runnable() { // from class: o.ljg
            @Override // java.lang.Runnable
            public final void run() {
                this.f33924a.m39233u(interfaceC1893c);
            }
        });
    }
}
