package v4;

import android.view.View;
import android.view.ViewTreeObserver;
import b3.AbstractC0574f;
import b3.C0585q;
import b3.InterfaceC0579k;
import b3.InterfaceC0586r;
import b3.InterfaceC0590v;
import b3.e0;
import m2.C4640e;
import s3.AbstractC6744a;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.p1;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.p */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC7670p extends AbstractC7878q implements InterfaceC0590v, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: q */
    public View f37148q;

    /* renamed from: r */
    public ViewTreeObserver f37149r;

    /* renamed from: s */
    public final C7669o f37150s = new C7669o(this, 0);

    /* renamed from: t */
    public final C7669o f37151t = new C7669o(this, 1);

    @Override // b3.InterfaceC0590v
    /* renamed from: D */
    public final void mo1756D(InterfaceC0586r interfaceC0586r) {
        interfaceC0586r.mo1753d(false);
        interfaceC0586r.mo1754e(this.f37150s);
        interfaceC0586r.mo1755f(this.f37151t);
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        ViewTreeObserver viewTreeObserver = AbstractC7634f.m14565z(this).getViewTreeObserver();
        this.f37149r = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        ViewTreeObserver viewTreeObserver = this.f37149r;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f37149r = null;
        AbstractC7634f.m14565z(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f37148q = null;
    }

    public final e0 L0() {
        if (!this.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitLocalDescendants called on an unattached node");
        }
        AbstractC7878q abstractC7878q = this.f37670a;
        if ((abstractC7878q.f37673d & 1024) != 0) {
            boolean z6 = false;
            for (AbstractC7878q abstractC7878q2 = abstractC7878q.f37675f; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
                if ((abstractC7878q2.f37672c & 1024) != 0) {
                    AbstractC7878q abstractC7878qM14545f = abstractC7878q2;
                    C4640e c4640e = null;
                    while (abstractC7878qM14545f != null) {
                        if (abstractC7878qM14545f instanceof e0) {
                            e0 e0Var = (e0) abstractC7878qM14545f;
                            if (z6) {
                                return e0Var;
                            }
                            z6 = true;
                        } else if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                            int i10 = 0;
                            for (AbstractC7878q abstractC7878q3 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q3 != null; abstractC7878q3 = abstractC7878q3.f37675f) {
                                if ((abstractC7878q3.f37672c & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC7878qM14545f = abstractC7878q3;
                                    } else {
                                        if (c4640e == null) {
                                            c4640e = new C4640e(new AbstractC7878q[16]);
                                        }
                                        if (abstractC7878qM14545f != null) {
                                            c4640e.m9506b(abstractC7878qM14545f);
                                            abstractC7878qM14545f = null;
                                        }
                                        c4640e.m9506b(abstractC7878q3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC7634f.m14563x(this).f36855p == null) {
            return;
        }
        View viewM14683c = AbstractC7665k.m14683c(this);
        InterfaceC0579k focusOwner = ((C7904v) AbstractC7634f.m14564y(this)).getFocusOwner();
        p1 p1VarM14564y = AbstractC7634f.m14564y(this);
        boolean z6 = (view == null || view.equals(p1VarM14564y) || !AbstractC7665k.m14681a(viewM14683c, view)) ? false : true;
        boolean z10 = (view2 == null || view2.equals(p1VarM14564y) || !AbstractC7665k.m14681a(viewM14683c, view2)) ? false : true;
        if (z6 && z10) {
            this.f37148q = view2;
            return;
        }
        if (z10) {
            this.f37148q = view2;
            e0 e0VarL0 = L0();
            if (e0VarL0.N0().getHasFocus()) {
                return;
            }
            AbstractC0574f.m1738w(e0VarL0);
            return;
        }
        if (!z6) {
            this.f37148q = null;
            return;
        }
        this.f37148q = null;
        if (L0().N0().isFocused()) {
            ((C0585q) focusOwner).m1744c(8, false, false);
        }
    }
}
