package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.s */
/* loaded from: classes.dex */
public final class C0324s {

    /* renamed from: c */
    public static final /* synthetic */ int f2413c = 0;

    /* renamed from: a */
    public final c1 f2414a = c1.m853j();

    /* renamed from: b */
    public boolean f2415b;

    static {
        new C0324s(0);
    }

    public C0324s() {
    }

    /* renamed from: b */
    public static void m1068b(C0318m c0318m, s1 s1Var, int i10, Object obj) {
        if (s1Var == s1.GROUP) {
            c0318m.m974E(i10, 3);
            ((AbstractC0306a) obj).mo809b(c0318m);
            c0318m.m974E(i10, 4);
        }
        c0318m.m974E(i10, s1Var.getWireType());
        switch (AbstractC0323r.f2409b[s1Var.ordinal()]) {
            case 1:
                c0318m.m995y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                c0318m.m993w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                c0318m.m978I(((Long) obj).longValue());
                break;
            case 4:
                c0318m.m978I(((Long) obj).longValue());
                break;
            case 5:
                c0318m.m970A(((Integer) obj).intValue());
                break;
            case 6:
                c0318m.m995y(((Long) obj).longValue());
                break;
            case 7:
                c0318m.m993w(((Integer) obj).intValue());
                break;
            case 8:
                c0318m.m987q(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((AbstractC0306a) obj).mo809b(c0318m);
                break;
            case 10:
                AbstractC0306a abstractC0306a = (AbstractC0306a) obj;
                c0318m.getClass();
                c0318m.m976G(((AbstractC0335z) abstractC0306a).mo808a(null));
                abstractC0306a.mo809b(c0318m);
                break;
            case 11:
                if (!(obj instanceof C0312g)) {
                    c0318m.m973D((String) obj);
                    break;
                } else {
                    c0318m.m991u((C0312g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof C0312g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0318m.m976G(length);
                    c0318m.m988r(bArr, 0, length);
                    break;
                } else {
                    c0318m.m991u((C0312g) obj);
                    break;
                }
            case 13:
                c0318m.m976G(((Integer) obj).intValue());
                break;
            case 14:
                c0318m.m993w(((Integer) obj).intValue());
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                c0318m.m995y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0318m.m976G((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0318m.m978I((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                c0318m.m970A(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a */
    public final void m1069a() {
        if (this.f2415b) {
            return;
        }
        c1 c1Var = this.f2414a;
        int size = c1Var.f2301a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry entryM856f = c1Var.m856f(i10);
            if (entryM856f.getValue() instanceof AbstractC0335z) {
                AbstractC0335z abstractC0335z = (AbstractC0335z) entryM856f.getValue();
                abstractC0335z.getClass();
                x0 x0Var = x0.f2424c;
                x0Var.getClass();
                x0Var.m1073a(abstractC0335z.getClass()).mo810a(abstractC0335z);
                abstractC0335z.m1082h();
            }
        }
        if (!c1Var.f2303c) {
            if (c1Var.f2301a.size() > 0) {
                c1Var.m856f(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c1Var.m857h().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c1Var.f2303c) {
            c1Var.f2302b = c1Var.f2302b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1Var.f2302b);
            c1Var.f2305e = c1Var.f2305e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1Var.f2305e);
            c1Var.f2303c = true;
        }
        this.f2415b = true;
    }

    public final Object clone() {
        C0324s c0324s = new C0324s();
        c1 c1Var = this.f2414a;
        if (c1Var.f2301a.size() > 0) {
            Map.Entry entryM856f = c1Var.m856f(0);
            if (entryM856f.getKey() != null) {
                throw new ClassCastException();
            }
            entryM856f.getValue();
            throw null;
        }
        Iterator it = c1Var.m857h().iterator();
        if (!it.hasNext()) {
            return c0324s;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0324s) {
            return this.f2414a.equals(((C0324s) obj).f2414a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2414a.hashCode();
    }

    public C0324s(int i10) {
        m1069a();
        m1069a();
    }
}
