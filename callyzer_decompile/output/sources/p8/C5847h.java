package p8;

import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.h */
/* loaded from: classes.dex */
public final class C5847h extends AbstractC5858s {

    /* renamed from: a */
    public final /* synthetic */ int f28583a;

    /* renamed from: b */
    public Object f28584b;

    public /* synthetic */ C5847h() {
        this.f28583a = 2;
    }

    @Override // p8.AbstractC5858s, p8.InterfaceC5856q
    /* renamed from: c */
    public void mo11424c(AbstractC5857r abstractC5857r) {
        switch (this.f28583a) {
            case 2:
                C5862w c5862w = (C5862w) this.f28584b;
                if (!c5862w.f28633C) {
                    c5862w.m11446H();
                    c5862w.f28633C = true;
                    break;
                }
                break;
        }
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: e */
    public final void mo11422e(AbstractC5857r abstractC5857r) {
        switch (this.f28583a) {
            case 0:
                View view = (View) this.f28584b;
                b0 b0Var = AbstractC5865z.f28643a;
                b0Var.mo11416d(view, 1.0f);
                b0Var.getClass();
                abstractC5857r.m11461y(this);
                break;
            case 1:
                ((AbstractC5857r) this.f28584b).mo11440B();
                abstractC5857r.m11461y(this);
                break;
            default:
                C5862w c5862w = (C5862w) this.f28584b;
                int i10 = c5862w.f28632B - 1;
                c5862w.f28632B = i10;
                if (i10 == 0) {
                    c5862w.f28633C = false;
                    c5862w.m11456o();
                }
                abstractC5857r.m11461y(this);
                break;
        }
    }

    public /* synthetic */ C5847h(int i10, Object obj) {
        this.f28583a = i10;
        this.f28584b = obj;
    }
}
