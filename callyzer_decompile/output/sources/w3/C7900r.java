package w3;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b3.AbstractC0574f;
import b3.C0572d;
import b3.C0585q;
import c3.C0848c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import n3.AbstractC4947a;
import n3.AbstractC4949c;
import n3.C4948b;
import tx.InterfaceC7266z;
import v4.RunnableC7655a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.r */
/* loaded from: classes.dex */
public final class C7900r extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f37943a;

    /* renamed from: b */
    public final /* synthetic */ C7904v f37944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7900r(C7904v c7904v, int i10) {
        super(1);
        this.f37943a = i10;
        this.f37944b = c7904v;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C0572d c0572d;
        switch (this.f37943a) {
            case 0:
                KeyEvent keyEvent = ((C4948b) obj).f24634a;
                C7904v c7904v = this.f37944b;
                int[] iArr = c7904v.X0;
                long jM9891c = AbstractC4949c.m9891c(keyEvent);
                if (AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24625g)) {
                    c0572d = new C0572d(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24623e)) {
                    c0572d = new C0572d(4);
                } else if (AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24622d)) {
                    c0572d = new C0572d(3);
                } else {
                    c0572d = AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24620b) ? true : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24630l) ? new C0572d(5) : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24621c) ? true : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24631m) ? new C0572d(6) : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24624f) ? true : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24627i) ? true : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24632n) ? new C0572d(7) : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24619a) ? true : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24629k) ? new C0572d(8) : null;
                }
                if (c0572d != null) {
                    int i10 = c0572d.f3900a;
                    if (AbstractC4949c.m9892d(keyEvent) == 2) {
                        Integer numM1713D = AbstractC0574f.m1713D(i10);
                        C0848c c0848cM15042y = c7904v.m15042y();
                        Boolean boolM1746e = ((C0585q) c7904v.getFocusOwner()).m1746e(i10, c0848cM15042y, new C7899q(c0572d, 1));
                        if (boolM1746e != null ? boolM1746e.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i10 == 1 || i10 == 2)) {
                            return Boolean.FALSE;
                        }
                        if (numM1713D != null) {
                            int iIntValue = numM1713D.intValue();
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View viewFindNextFocus = c7904v;
                            while (true) {
                                if (viewFindNextFocus != null) {
                                    View rootView = c7904v.getRootView();
                                    AbstractC4154l.m8921d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                                    if (viewFindNextFocus != null) {
                                        if (!viewFindNextFocus.equals(c7904v)) {
                                            for (ViewParent parent = viewFindNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == c7904v) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    viewFindNextFocus = null;
                                }
                            }
                            if (AbstractC4154l.m8918a(viewFindNextFocus, c7904v)) {
                                viewFindNextFocus = null;
                            }
                            if (viewFindNextFocus != null) {
                                Rect rectM5146r = c0848cM15042y != null ? d3.h0.m5146r(c0848cM15042y) : null;
                                if (rectM5146r == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                viewFindNextFocus.getLocationInWindow(iArr);
                                int i11 = iArr[0];
                                int i12 = iArr[1];
                                c7904v.getLocationInWindow(iArr);
                                rectM5146r.offset(iArr[0] - i11, iArr[1] - i12);
                                if (AbstractC0574f.m1741z(viewFindNextFocus, numM1713D, rectM5146r)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((C0585q) c7904v.getFocusOwner()).m1744c(i10, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolM1746e2 = ((C0585q) c7904v.getFocusOwner()).m1746e(i10, null, new C7899q(c0572d, 0));
                        return Boolean.valueOf(boolM1746e2 != null ? boolM1746e2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 1:
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) obj;
                C7904v c7904v2 = this.f37944b;
                Handler handler = c7904v2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC2137a.invoke();
                } else {
                    Handler handler2 = c7904v2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC7655a(3, interfaceC2137a));
                    }
                }
                return qw.a0.f30746a;
            default:
                C7904v c7904v3 = this.f37944b;
                return new r0(c7904v3, c7904v3.getTextInputService(), (InterfaceC7266z) obj);
        }
    }
}
