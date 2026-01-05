package p001o;

import com.google.android.gms.common.api.Api;

/* loaded from: classes6.dex */
public final class tag extends amf implements q4g {
    public tag(int i) {
        super(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, wl1.DROP_OLDEST);
        mo17498b(Integer.valueOf(i));
    }

    @Override // p001o.q4g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) m17485L()).intValue());
        }
        return numValueOf;
    }

    /* renamed from: Z */
    public final boolean m49661Z(int i) {
        boolean zMo17498b;
        synchronized (this) {
            zMo17498b = mo17498b(Integer.valueOf(((Number) m17485L()).intValue() + i));
        }
        return zMo17498b;
    }
}
