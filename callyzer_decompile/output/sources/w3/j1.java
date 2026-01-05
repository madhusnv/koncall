package w3;

import android.content.Context;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends AbstractC7883a {

    /* renamed from: a */
    public final k2.e1 f37812a;

    /* renamed from: b */
    public boolean f37813b;

    public j1(Context context) {
        super(context);
        this.f37812a = C3953b.m8517t(null);
    }

    @Override // w3.AbstractC7883a
    public final void Content(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(420213850);
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f37812a.getValue();
        if (interfaceC2141e == null) {
            c3966o.m8607Y(358356153);
        } else {
            c3966o.m8607Y(150107208);
            interfaceC2141e.invoke(c3966o, 0);
        }
        c3966o.m8623p(false);
        c3966o.m8623p(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return j1.class.getName();
    }

    @Override // w3.AbstractC7883a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f37813b;
    }

    public final void setContent(InterfaceC2141e interfaceC2141e) {
        this.f37813b = true;
        this.f37812a.setValue(interfaceC2141e);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
