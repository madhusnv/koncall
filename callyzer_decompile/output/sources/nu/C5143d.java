package nu;

import android.content.Context;
import android.provider.Settings;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import io.C3328c;
import kotlin.NoWhenBranchMatchedException;
import nn.C5113e;
import og.od;
import pg.f9;
import pu.AbstractC6038f;
import pu.C6034b;
import pu.C6036d;
import pu.C6037e;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.EnumC8797l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nu.d */
/* loaded from: classes3.dex */
public final class C5143d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f25195a;

    /* renamed from: b */
    public int f25196b;

    /* renamed from: c */
    public final /* synthetic */ C3328c f25197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5143d(C3328c c3328c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f25195a = i10;
        this.f25197c = c3328c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f25195a) {
            case 0:
                return new C5143d(this.f25197c, interfaceC7559c, 0);
            default:
                return new C5143d(this.f25197c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f25195a) {
        }
        return ((C5143d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f25195a;
        C3328c c3328c = this.f25197c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f25196b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f25196b = 1;
                    c3328c.getClass();
                    C0496f c0496f = m0.f34659a;
                    obj = c0.m13475K(ExecutorC0495e.f3538c, new C5144e(c3328c, null, 0), this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                AbstractC6038f abstractC6038f = (AbstractC6038f) obj;
                Context context = (Context) c3328c.f17617i;
                Context context2 = (Context) c3328c.f17617i;
                return abstractC6038f instanceof C6036d ? new C6036d(((C6036d) abstractC6038f).f29485a, new C6034b(false)) : Settings.canDrawOverlays(context) ? new C6037e(f9.m11628b(context2, R.string.ts_note_permission_suss_msg)) : new C6036d(f9.m11628b(context2, R.string.ts_note_permission_error), new C6034b(true));
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f25196b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C5113e c5113e = (C5113e) c3328c.f17615g;
                    this.f25196b = 1;
                    obj = c5113e.f25030a.m15714d(this);
                    if (obj == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                int i13 = AbstractC5147h.f25203a[((EnumC8797l) obj).ordinal()];
                if (i13 == 1) {
                    return new C6037e(f9.m11628b((Context) c3328c.f17617i, R.string.ts_note_popup_always));
                }
                if (i13 == 2) {
                    return new C6037e(f9.m11628b((Context) c3328c.f17617i, R.string.ts_note_popup_lead));
                }
                if (i13 == 3) {
                    return new C6036d(f9.m11628b((Context) c3328c.f17617i, R.string.ts_note_popup_never), null);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
