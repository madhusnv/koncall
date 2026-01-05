package i0;

import a0.C0001a;
import c0.InterfaceC0818k;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import og.oa;
import p020v.C7612v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public final StringBuilder f16542a = new StringBuilder();

    /* renamed from: b */
    public final Object f16543b;

    /* renamed from: c */
    public int f16544c;

    /* renamed from: d */
    public final C0001a f16545d;

    /* renamed from: e */
    public final HashMap f16546e;

    /* renamed from: f */
    public int f16547f;

    public o0(C0001a c0001a) {
        Object obj = new Object();
        this.f16543b = obj;
        this.f16546e = new HashMap();
        this.f16544c = 1;
        synchronized (obj) {
            this.f16545d = c0001a;
            this.f16547f = this.f16544c;
        }
    }

    /* renamed from: c */
    public static void m7394c(C7612v c7612v, f0 f0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (oa.m10793c()) {
            oa.m10794d(f0Var.ordinal(), "CX:State[" + c7612v + "]");
        }
    }

    /* renamed from: a */
    public final n0 m7395a(String str) {
        HashMap map = this.f16546e;
        for (InterfaceC0818k interfaceC0818k : map.keySet()) {
            if (str.equals(interfaceC0818k.mo2207c().mo7323e())) {
                return (n0) map.get(interfaceC0818k);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m7396b() {
        boolean zM10946e = og.u1.m10946e("CameraStateRegistry");
        StringBuilder sb2 = this.f16542a;
        if (zM10946e) {
            sb2.setLength(0);
            sb2.append("Recalculating open cameras:\n");
            sb2.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb2.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry entry : this.f16546e.entrySet()) {
            if (og.u1.m10946e("CameraStateRegistry")) {
                sb2.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0818k) entry.getKey()).toString(), ((n0) entry.getValue()).f16538a != null ? ((n0) entry.getValue()).f16538a.toString() : "UNKNOWN"));
            }
            f0 f0Var = ((n0) entry.getValue()).f16538a;
            if (f0Var != null && f0Var.holdsCameraSlot()) {
                i10++;
            }
        }
        if (og.u1.m10946e("CameraStateRegistry")) {
            sb2.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb2.append(m0.m7377j(i10, this.f16544c, "Open count: ", " (Max allowed: ", ")"));
            og.u1.m10942a("CameraStateRegistry");
        }
        this.f16547f = Math.max(this.f16544c - i10, 0);
    }

    /* renamed from: d */
    public final boolean m7397d(C7612v c7612v) {
        boolean z6;
        synchronized (this.f16543b) {
            try {
                n0 n0Var = (n0) this.f16546e.get(c7612v);
                og.y0.m11055e(n0Var, "Camera must first be registered with registerCamera()");
                z6 = true;
                if (og.u1.m10946e("CameraStateRegistry")) {
                    this.f16542a.setLength(0);
                    StringBuilder sb2 = this.f16542a;
                    Locale locale = Locale.US;
                    int i10 = this.f16547f;
                    f0 f0Var = n0Var.f16538a;
                    boolean z10 = f0Var != null && f0Var.holdsCameraSlot();
                    sb2.append("tryOpenCamera(" + c7612v + ") [Available Cameras: " + i10 + ", Already Open: " + z10 + " (Previous state: " + n0Var.f16538a + ")]");
                }
                if (this.f16547f > 0) {
                    f0 f0Var2 = f0.OPENING;
                    n0Var.f16538a = f0Var2;
                    m7394c(c7612v, f0Var2);
                } else {
                    f0 f0Var3 = n0Var.f16538a;
                    if (f0Var3 != null && f0Var3.holdsCameraSlot()) {
                        f0 f0Var22 = f0.OPENING;
                        n0Var.f16538a = f0Var22;
                        m7394c(c7612v, f0Var22);
                    } else {
                        z6 = false;
                    }
                }
                if (og.u1.m10946e("CameraStateRegistry")) {
                    StringBuilder sb3 = this.f16542a;
                    Locale locale2 = Locale.US;
                    sb3.append(" --> ".concat(z6 ? "SUCCESS" : "FAIL"));
                    og.u1.m10942a("CameraStateRegistry");
                }
                if (z6) {
                    m7396b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }

    /* renamed from: e */
    public final boolean m7398e(String str, String str2) {
        synchronized (this.f16543b) {
            try {
                boolean z6 = true;
                if (this.f16545d.m4b() != 2) {
                    return true;
                }
                n0 n0VarM7395a = m7395a(str);
                f0 f0Var = n0VarM7395a != null ? n0VarM7395a.f16538a : null;
                n0 n0VarM7395a2 = str2 != null ? m7395a(str2) : null;
                f0 f0Var2 = n0VarM7395a2 != null ? n0VarM7395a2.f16538a : null;
                f0 f0Var3 = f0.OPEN;
                boolean z10 = f0Var3.equals(f0Var) || f0.CONFIGURED.equals(f0Var);
                boolean z11 = f0Var3.equals(f0Var2) || f0.CONFIGURED.equals(f0Var2);
                if (!z10 || !z11) {
                    z6 = false;
                }
                return z6;
            } finally {
            }
        }
    }
}
