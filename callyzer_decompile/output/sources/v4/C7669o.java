package v4;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import b3.AbstractC0574f;
import b3.C0569a;
import b3.InterfaceC0579k;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import v3.AbstractC7634f;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.o */
/* loaded from: classes.dex */
public final class C7669o extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f37146a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC7670p f37147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7669o(ViewTreeObserverOnGlobalFocusChangeListenerC7670p viewTreeObserverOnGlobalFocusChangeListenerC7670p, int i10) {
        super(1);
        this.f37146a = i10;
        this.f37147b = viewTreeObserverOnGlobalFocusChangeListenerC7670p;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f37146a) {
            case 0:
                C0569a c0569a = (C0569a) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC7670p viewTreeObserverOnGlobalFocusChangeListenerC7670p = this.f37147b;
                View viewM14683c = AbstractC7665k.m14683c(viewTreeObserverOnGlobalFocusChangeListenerC7670p);
                if (!viewM14683c.isFocused() && !viewM14683c.hasFocus()) {
                    if (!AbstractC0574f.m1741z(viewM14683c, AbstractC0574f.m1713D(c0569a.f3895a), AbstractC7665k.m14682b(((C7904v) AbstractC7634f.m14564y(viewTreeObserverOnGlobalFocusChangeListenerC7670p)).getFocusOwner(), AbstractC7634f.m14565z(viewTreeObserverOnGlobalFocusChangeListenerC7670p), viewM14683c))) {
                        c0569a.f3896b = true;
                    }
                }
                return a0.f30746a;
            default:
                C0569a c0569a2 = (C0569a) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC7670p viewTreeObserverOnGlobalFocusChangeListenerC7670p2 = this.f37147b;
                View viewM14683c2 = AbstractC7665k.m14683c(viewTreeObserverOnGlobalFocusChangeListenerC7670p2);
                if (viewM14683c2.hasFocus()) {
                    InterfaceC0579k focusOwner = ((C7904v) AbstractC7634f.m14564y(viewTreeObserverOnGlobalFocusChangeListenerC7670p2)).getFocusOwner();
                    View viewM14565z = AbstractC7634f.m14565z(viewTreeObserverOnGlobalFocusChangeListenerC7670p2);
                    if (viewM14683c2 instanceof ViewGroup) {
                        Rect rectM14682b = AbstractC7665k.m14682b(focusOwner, viewM14565z, viewM14683c2);
                        Integer numM1713D = AbstractC0574f.m1713D(c0569a2.f3895a);
                        int iIntValue = numM1713D != null ? numM1713D.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = viewTreeObserverOnGlobalFocusChangeListenerC7670p2.f37148q;
                        View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewM14565z, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewM14565z, rectM14682b, iIntValue);
                        if (viewFindNextFocus != null && AbstractC7665k.m14681a(viewM14683c2, viewFindNextFocus)) {
                            viewFindNextFocus.requestFocus(iIntValue, rectM14682b);
                            c0569a2.f3896b = true;
                        } else if (!viewM14565z.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!viewM14565z.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return a0.f30746a;
        }
    }
}
