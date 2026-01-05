package sf;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p020v.x0;
import pf.C5905e;
import qf.InterfaceC6204c;
import qf.InterfaceC6207f;
import qf.InterfaceC6208g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.h */
/* loaded from: classes.dex */
public abstract class AbstractC6822h extends AbstractC6819e implements InterfaceC6204c {

    /* renamed from: C */
    public final Set f32431C;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6822h(Context context, Looper looper, int i10, x0 x0Var, InterfaceC6207f interfaceC6207f, InterfaceC6208g interfaceC6208g, int i11) {
        k0 k0VarM13017a = k0.m13017a(context);
        C5905e c5905e = C5905e.f28746d;
        AbstractC6840z.m13036g(interfaceC6207f);
        AbstractC6840z.m13036g(interfaceC6208g);
        super(context, looper, k0VarM13017a, c5905e, i10, new C6826l(interfaceC6207f), new C6826l(interfaceC6208g), (String) x0Var.f36757e);
        Set set = (Set) x0Var.f36755c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f32431C = set;
    }

    @Override // qf.InterfaceC6204c
    /* renamed from: a */
    public final Set mo12210a() {
        return mo12221m() ? this.f32431C : Collections.EMPTY_SET;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: p */
    public final Account mo13007p() {
        return null;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: s */
    public final Set mo13008s() {
        return this.f32431C;
    }
}
