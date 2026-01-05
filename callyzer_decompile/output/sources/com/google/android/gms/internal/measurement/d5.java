package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d5 {

    /* renamed from: c */
    public static final /* synthetic */ int f6112c = 0;

    /* renamed from: a */
    public final k6 f6113a = new k6();

    /* renamed from: b */
    public boolean f6114b;

    static {
        new d5(0);
    }

    public d5() {
    }

    /* renamed from: b */
    public static void m3229b(a5 a5Var, u6 u6Var, int i10, Object obj) {
        if (u6Var == u6.zzj) {
            Charset charset = p5.f6342a;
            a5Var.m3114c(i10, 3);
            ((i5) ((t4) obj)).m3335d(a5Var);
            a5Var.m3114c(i10, 4);
            return;
        }
        a5Var.m3114c(i10, u6Var.zzb());
        v6 v6Var = v6.INT;
        switch (u6Var.ordinal()) {
            case 0:
                a5Var.m3126o(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                a5Var.m3124m(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                a5Var.m3125n(((Long) obj).longValue());
                break;
            case 3:
                a5Var.m3125n(((Long) obj).longValue());
                break;
            case 4:
                a5Var.m3122k(((Integer) obj).intValue());
                break;
            case 5:
                a5Var.m3126o(((Long) obj).longValue());
                break;
            case 6:
                a5Var.m3124m(((Integer) obj).intValue());
                break;
            case 7:
                a5Var.m3121j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof z4)) {
                    a5Var.m3128q((String) obj);
                    break;
                } else {
                    a5Var.m3120i((z4) obj);
                    break;
                }
            case 9:
                ((i5) ((t4) obj)).m3335d(a5Var);
                break;
            case 10:
                a5Var.getClass();
                i5 i5Var = (i5) ((t4) obj);
                a5Var.m3123l(i5Var.m3342k());
                i5Var.m3335d(a5Var);
                break;
            case 11:
                if (!(obj instanceof z4)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    a5Var.m3123l(length);
                    a5Var.m3127p(length, bArr);
                    break;
                } else {
                    a5Var.m3120i((z4) obj);
                    break;
                }
            case 12:
                a5Var.m3123l(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof k5)) {
                    a5Var.m3122k(((Integer) obj).intValue());
                    break;
                } else {
                    a5Var.m3122k(((k5) obj).zza());
                    break;
                }
            case 14:
                a5Var.m3124m(((Integer) obj).intValue());
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                a5Var.m3126o(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                a5Var.m3123l((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                a5Var.m3125n((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* renamed from: a */
    public final void m3230a() {
        if (this.f6114b) {
            return;
        }
        k6 k6Var = this.f6113a;
        int i10 = k6Var.f6266b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = k6Var.m3472b(i11).f6285b;
            if (obj instanceof i5) {
                ((i5) obj).m3338g();
            }
        }
        Iterator it = k6Var.m3473d().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof i5) {
                ((i5) value).m3338g();
            }
        }
        if (!k6Var.f6268d) {
            if (k6Var.f6266b > 0) {
                k6Var.m3472b(0).f6284a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = k6Var.m3473d().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!k6Var.f6268d) {
            k6Var.f6267c = k6Var.f6267c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k6Var.f6267c);
            k6Var.f6270f = k6Var.f6270f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k6Var.f6270f);
            k6Var.f6268d = true;
        }
        this.f6114b = true;
    }

    public final Object clone() {
        d5 d5Var = new d5();
        k6 k6Var = this.f6113a;
        if (k6Var.f6266b > 0) {
            k6Var.m3472b(0).f6284a.getClass();
            throw new ClassCastException();
        }
        Iterator it = k6Var.m3473d().iterator();
        if (!it.hasNext()) {
            return d5Var;
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
        if (obj instanceof d5) {
            return this.f6113a.equals(((d5) obj).f6113a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6113a.hashCode();
    }

    public d5(int i10) {
        m3230a();
        m3230a();
    }
}
