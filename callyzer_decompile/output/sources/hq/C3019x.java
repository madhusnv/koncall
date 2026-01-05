package hq;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2139c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4181k;
import mq.C4836d;
import mq.C4838f;
import mq.C4850r;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import tq.AbstractC7201m;
import tq.C7189a;
import tq.C7190b;
import tq.C7191c;
import tq.C7192d;
import tq.C7193e;
import tq.C7194f;
import tq.C7195g;
import tq.C7196h;
import tq.C7197i;
import tq.C7198j;
import tq.C7199k;
import tq.C7200l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.x */
/* loaded from: classes3.dex */
public final class C3019x implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2139c f16297a;

    /* renamed from: b */
    public final /* synthetic */ C4181k f16298b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f16299c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f16300d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f16301e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2139c f16302f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2139c f16303g;

    /* renamed from: h */
    public final /* synthetic */ Context f16304h;

    public C3019x(InterfaceC2139c interfaceC2139c, C4181k c4181k, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, InterfaceC2139c interfaceC2139c4, InterfaceC2139c interfaceC2139c5, InterfaceC2139c interfaceC2139c6, Context context) {
        this.f16297a = interfaceC2139c;
        this.f16298b = c4181k;
        this.f16299c = interfaceC2139c2;
        this.f16300d = interfaceC2139c3;
        this.f16301e = interfaceC2139c4;
        this.f16302f = interfaceC2139c5;
        this.f16303g = interfaceC2139c6;
        this.f16304h = context;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        AbstractC7201m callLogAction = (AbstractC7201m) obj;
        AbstractC4154l.m8923f(callLogAction, "callLogAction");
        boolean zEquals = callLogAction.equals(C7189a.f34479e);
        InterfaceC2139c interfaceC2139c = this.f16297a;
        C4181k c4181k = this.f16298b;
        if (zEquals) {
            interfaceC2139c.invoke(new C4836d(c4181k.f21202n, c4181k.f21192c, c4181k.f21193d, c4181k.f21191b));
        } else if (callLogAction.equals(C7190b.f34480e)) {
            this.f16299c.invoke(c4181k.f21211y);
        } else if (callLogAction.equals(C7191c.f34481e)) {
            this.f16302f.invoke(Integer.valueOf(c4181k.f21190a));
        } else if (callLogAction.equals(C7193e.f34483e)) {
            this.f16303g.invoke(Integer.valueOf(c4181k.f21190a));
        } else if (callLogAction.equals(C7195g.f34485e)) {
            this.f16301e.invoke(Integer.valueOf(c4181k.f21190a));
        } else {
            boolean zEquals2 = callLogAction.equals(C7196h.f34486e);
            Context context = this.f16304h;
            if (zEquals2 || callLogAction.equals(C7194f.f34484e)) {
                AbstractC5601a.m11254y(context, R.string.call_recording_is_being_processed, "getString(...)", context);
            } else if (callLogAction.equals(C7192d.f34482e)) {
                AbstractC5601a.m11254y(context, R.string.deleted_recording_msg, "getString(...)", context);
            } else if (callLogAction.equals(C7197i.f34487e)) {
                interfaceC2139c.invoke(new C4838f(c4181k.f21211y));
            } else if (callLogAction.equals(C7198j.f34488e)) {
                interfaceC2139c.invoke(new C4850r(c4181k.f21193d + c4181k.f21192c));
            } else if (callLogAction.equals(C7199k.f34489e)) {
                c4181k.getClass();
            } else {
                if (!callLogAction.equals(C7200l.f34490e)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f16300d.invoke(c4181k);
            }
        }
        return qw.a0.f30746a;
    }
}
