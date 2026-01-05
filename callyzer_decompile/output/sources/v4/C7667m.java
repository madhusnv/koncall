package v4;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k2.C3964m;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import t2.InterfaceC7009h;
import v3.p1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.m */
/* loaded from: classes.dex */
public final class C7667m extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ Context f37139a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f37140b;

    /* renamed from: c */
    public final /* synthetic */ C3964m f37141c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC7009h f37142d;

    /* renamed from: e */
    public final /* synthetic */ int f37143e;

    /* renamed from: f */
    public final /* synthetic */ View f37144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7667m(Context context, InterfaceC2139c interfaceC2139c, C3964m c3964m, InterfaceC7009h interfaceC7009h, int i10, View view) {
        super(0);
        this.f37139a = context;
        this.f37140b = interfaceC2139c;
        this.f37141c = c3964m;
        this.f37142d = interfaceC7009h;
        this.f37143e = i10;
        this.f37144f = view;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f37144f;
        AbstractC4154l.m8921d(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new C7672r(this.f37139a, this.f37140b, this.f37141c, this.f37142d, this.f37143e, (p1) callback).getLayoutNode();
    }
}
