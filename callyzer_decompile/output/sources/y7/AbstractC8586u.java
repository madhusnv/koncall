package y7;

import android.graphics.Rect;
import android.view.View;
import jf.C3758a;
import k8.InterfaceC4024a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.u */
/* loaded from: classes.dex */
public abstract class AbstractC8586u {

    /* renamed from: a */
    public int f41810a;

    /* renamed from: b */
    public final Object f41811b;

    /* renamed from: c */
    public final Object f41812c;

    public AbstractC8586u(int i10, String str, String str2) {
        this.f41810a = i10;
        this.f41811b = str;
        this.f41812c = str2;
    }

    /* renamed from: b */
    public static AbstractC8586u m15932b(f0 f0Var, int i10) {
        if (i10 == 0) {
            return new C8585t(f0Var, 0);
        }
        if (i10 == 1) {
            return new C8585t(f0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: a */
    public abstract void mo15933a(InterfaceC4024a interfaceC4024a);

    /* renamed from: c */
    public abstract void mo15934c(InterfaceC4024a interfaceC4024a);

    /* renamed from: d */
    public abstract int mo15902d(View view);

    /* renamed from: e */
    public abstract int mo15903e(View view);

    /* renamed from: f */
    public abstract int mo15904f(View view);

    /* renamed from: g */
    public abstract int mo15905g(View view);

    /* renamed from: h */
    public abstract int mo15906h();

    /* renamed from: i */
    public abstract int mo15907i();

    /* renamed from: j */
    public abstract int mo15908j();

    /* renamed from: k */
    public abstract int mo15909k();

    /* renamed from: l */
    public abstract int mo15910l();

    /* renamed from: m */
    public abstract int mo15911m();

    /* renamed from: n */
    public abstract int mo15912n();

    /* renamed from: o */
    public abstract int mo15913o(View view);

    /* renamed from: p */
    public abstract int mo15914p(View view);

    /* renamed from: q */
    public abstract void mo15915q(int i10);

    /* renamed from: r */
    public abstract void mo15935r(InterfaceC4024a interfaceC4024a);

    /* renamed from: s */
    public abstract void mo15936s(InterfaceC4024a interfaceC4024a);

    /* renamed from: t */
    public abstract void mo15937t(InterfaceC4024a interfaceC4024a);

    /* renamed from: u */
    public abstract void mo15938u(InterfaceC4024a interfaceC4024a);

    /* renamed from: v */
    public abstract C3758a mo15939v(InterfaceC4024a interfaceC4024a);

    public AbstractC8586u(f0 f0Var) {
        this.f41810a = Integer.MIN_VALUE;
        this.f41812c = new Rect();
        this.f41811b = f0Var;
    }
}
