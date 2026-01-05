package p001o;

import com.google.android.gms.common.api.Api;

/* loaded from: classes6.dex */
public abstract class bmf {

    /* renamed from: a */
    public static final lgg f16537a = new lgg("NO_VALUE");

    /* renamed from: a */
    public static final zpb m19384a(int i, int i2, wl1 wl1Var) {
        boolean z = true;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        if (i <= 0 && i2 <= 0 && wl1Var != wl1.SUSPEND) {
            z = false;
        }
        if (z) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return new amf(i, i3, wl1Var);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + wl1Var).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ zpb m19385b(int i, int i2, wl1 wl1Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            wl1Var = wl1.SUSPEND;
        }
        return m19384a(i, i2, wl1Var);
    }

    /* renamed from: e */
    public static final v37 m19388e(zlf zlfVar, q74 q74Var, int i, wl1 wl1Var) {
        return ((i == 0 || i == -3) && wl1Var == wl1.SUSPEND) ? zlfVar : new qg2(zlfVar, q74Var, i, wl1Var);
    }

    /* renamed from: f */
    public static final Object m19389f(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* renamed from: g */
    public static final void m19390g(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
