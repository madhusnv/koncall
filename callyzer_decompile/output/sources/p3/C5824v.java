package p3;

import android.view.MotionEvent;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.v */
/* loaded from: classes.dex */
public final class C5824v extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f28505a;

    /* renamed from: b */
    public final /* synthetic */ C5825w f28506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5824v(C5825w c5825w, int i10) {
        super(1);
        this.f28505a = i10;
        this.f28506b = c5825w;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f28505a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                C5826x c5826x = this.f28506b.f28507a;
                if (c5826x != null) {
                    c5826x.invoke(motionEvent);
                    return qw.a0.f30746a;
                }
                AbstractC4154l.m8928k("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                C5826x c5826x2 = this.f28506b.f28507a;
                if (c5826x2 != null) {
                    c5826x2.invoke(motionEvent2);
                    return qw.a0.f30746a;
                }
                AbstractC4154l.m8928k("onTouchEvent");
                throw null;
        }
    }
}
