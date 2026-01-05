package p001o;

import android.os.IBinder;
import p001o.la8;

/* loaded from: classes2.dex */
public class yxh {

    /* renamed from: a */
    public final la8 f56240a;

    public yxh(la8 la8Var) {
        this.f56240a = la8Var;
    }

    /* renamed from: a */
    public static yxh m58467a(IBinder iBinder) {
        la8 la8VarL0 = iBinder == null ? null : la8.AbstractBinderC15047a.L0(iBinder);
        if (la8VarL0 == null) {
            return null;
        }
        return new yxh(la8VarL0);
    }
}
