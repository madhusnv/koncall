package g2;

import android.graphics.Rect;
import android.view.View;
import c3.C0848c;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import og.ze;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i5 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ View f11795a;

    /* renamed from: b */
    public final /* synthetic */ int f11796b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f11797c;

    /* renamed from: d */
    public final /* synthetic */ k2.b1 f11798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(View view, int i10, k2.w0 w0Var, k2.b1 b1Var) {
        super(0);
        this.f11795a = view;
        this.f11796b = i10;
        this.f11797c = w0Var;
        this.f11798d = b1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        View rootView = this.f11795a.getRootView();
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        C0848c c0848cM5150v = d3.h0.m5150v(rect);
        InterfaceC7033t interfaceC7033t = (InterfaceC7033t) this.f11797c.getValue();
        this.f11798d.m8527g(p5.m6229c(this.f11796b, c0848cM5150v, interfaceC7033t == null ? C0848c.f5353e : og.b2.m10543a(interfaceC7033t.mo13303f(0L), ze.m11098d(interfaceC7033t.mo13307v()))));
        return qw.a0.f30746a;
    }
}
