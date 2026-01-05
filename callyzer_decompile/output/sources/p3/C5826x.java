package p3;

import a3.C0043b;
import android.view.MotionEvent;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import v3.p1;
import v4.C7672r;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.x */
/* loaded from: classes.dex */
public final class C5826x extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f28511a;

    /* renamed from: b */
    public final /* synthetic */ C7672r f28512b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5826x(C7672r c7672r, int i10) {
        super(1);
        this.f28511a = i10;
        this.f28512b = c7672r;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f28511a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                C7672r c7672r = this.f28512b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = c7672r.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = c7672r.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            default:
                p1 p1Var = (p1) obj;
                C7904v c7904v = p1Var instanceof C7904v ? (C7904v) p1Var : null;
                C7672r c7672r2 = this.f28512b;
                if (c7904v != null) {
                    C0043b c0043b = new C0043b(25, c7904v, c7672r2);
                    e1.e0 e0Var = c7904v.A1;
                    if (e0Var.m5548f(c0043b) < 0) {
                        e0Var.m5543a(c0043b);
                    }
                }
                c7672r2.removeAllViewsInLayout();
                return qw.a0.f30746a;
        }
    }
}
