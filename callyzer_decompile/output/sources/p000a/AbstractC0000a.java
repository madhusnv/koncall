package p000a;

import android.os.Parcelable;
import b00.C0526k;
import java.io.EOFException;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4404d;
import l7.f0;
import l7.g0;
import l7.h0;
import l7.i0;
import l7.j0;
import l7.k0;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0000a {
    /* renamed from: a */
    public static k0 m0a(String str, String str2) {
        boolean zEquals = "integer".equals(str);
        C4404d c4404d = k0.f22072o;
        k0 k0Var = zEquals ? k0.f22059b : "integer[]".equals(str) ? k0.f22061d : "List<Int>".equals(str) ? k0.f22062e : "long".equals(str) ? k0.f22063f : "long[]".equals(str) ? k0.f22064g : "List<Long>".equals(str) ? k0.f22065h : "boolean".equals(str) ? k0.f22069l : "boolean[]".equals(str) ? k0.f22070m : "List<Boolean>".equals(str) ? k0.f22071n : "string".equals(str) ? c4404d : "string[]".equals(str) ? k0.f22073p : "List<String>".equals(str) ? k0.f22074q : "float".equals(str) ? k0.f22066i : "float[]".equals(str) ? k0.f22067j : "List<Float>".equals(str) ? k0.f22068k : null;
        if (k0Var != null) {
            return k0Var;
        }
        if ("reference".equals(str)) {
            return k0.f22060c;
        }
        if (str == null || str.length() == 0) {
            return c4404d;
        }
        try {
            String strConcat = (!AbstractC5185w.m10138t(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean zM10129k = AbstractC5185w.m10129k(str, "[]", false);
            if (zM10129k) {
                strConcat = strConcat.substring(0, strConcat.length() - 2);
                AbstractC4154l.m8922e(strConcat, "substring(...)");
            }
            k0 k0VarM2c = m2c(Class.forName(strConcat), zM10129k);
            if (k0VarM2c != null) {
                return k0VarM2c;
            }
            throw new IllegalArgumentException((strConcat + " is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    public static final boolean m1b(C0526k c0526k) {
        C0526k c0526k2;
        int i10;
        AbstractC4154l.m8923f(c0526k, "<this>");
        try {
            c0526k2 = new C0526k();
            long j6 = c0526k.f3638b;
            long j10 = 64;
            if (j6 <= 64) {
                j10 = j6;
            }
            c0526k.m1586A(c0526k2, 0L, j10);
        } catch (EOFException unused) {
        }
        for (i10 = 0; i10 < 16; i10++) {
            if (c0526k2.mo1545e()) {
                return true;
            }
            int iT0 = c0526k2.t0();
            if (Character.isISOControl(iT0) && !Character.isWhitespace(iT0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static k0 m2c(Class cls, boolean z6) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z6 ? new g0(cls) : new h0(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z6) {
            return new f0(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z6 ? new i0(cls) : new j0(cls);
        }
        return null;
    }
}
