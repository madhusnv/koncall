package w3;

import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import c3.C0848c;
import c3.C0849d;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1558l;
import d3.C1555i;
import d4.AbstractC1592t;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.C1589q;
import d4.C1590r;
import d4.C1595w;
import e1.AbstractC1911m;
import e1.C1922x;
import ex.InterfaceC2139c;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6355e;
import u2.InterfaceC7318o;
import v4.AbstractC7663i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class m0 implements s2 {

    /* renamed from: a */
    public static final Class[] f37856a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b */
    public static final C0848c f37857b = new C0848c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 10.0f, 10.0f);

    /* renamed from: h */
    public static final boolean m14981h(Object obj) {
        if (obj instanceof InterfaceC7318o) {
            InterfaceC7318o interfaceC7318o = (InterfaceC7318o) obj;
            if (interfaceC7318o.mo8489c() == k2.s0.f20544c || interfaceC7318o.mo8489c() == k2.s0.f20547f || interfaceC7318o.mo8489c() == k2.s0.f20545d) {
                Object value = interfaceC7318o.getValue();
                if (value == null) {
                    return true;
                }
                return m14981h(value);
            }
        } else {
            if ((obj instanceof InterfaceC6355e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i10 = 0; i10 < 7; i10++) {
                if (f37856a[i10].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final int m14982i(float f6) {
        return ((int) (f6 >= DefinitionKt.NO_Float_VALUE ? Math.ceil(f6) : Math.floor(f6))) * (-1);
    }

    /* renamed from: j */
    public static final float m14983j(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    /* renamed from: k */
    public static final C1922x m14984k(C1590r c1590r) {
        C1589q c1589qM5221a = c1590r.m5221a();
        v3.g0 g0Var = c1589qM5221a.f7878c;
        if (!g0Var.m14579I() || !g0Var.m14578H()) {
            C1922x c1922x = AbstractC1911m.f9027a;
            AbstractC4154l.m8921d(c1922x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return c1922x;
        }
        C1922x c1922x2 = new C1922x(48);
        C0848c c0848cM5211e = c1589qM5221a.m5211e();
        m14985l(new Region(Math.round(c0848cM5211e.f5354a), Math.round(c0848cM5211e.f5355b), Math.round(c0848cM5211e.f5356c), Math.round(c0848cM5211e.f5357d)), c1589qM5221a, c1922x2, c1589qM5221a, new Region());
        return c1922x2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[EDGE_INSN: B:43:0x00cf->B:46:0x00e5 BREAK  A[LOOP:1: B:40:0x00c4->B:44:0x00d2]] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14985l(android.graphics.Region r17, d4.C1589q r18, e1.C1922x r19, d4.C1589q r20, android.graphics.Region r21) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.m0.m14985l(android.graphics.Region, d4.q, e1.x, d4.q, android.graphics.Region):void");
    }

    /* renamed from: m */
    public static final g4.l0 m14986m(C1583k c1583k) {
        InterfaceC2139c interfaceC2139c;
        ArrayList arrayList = new ArrayList();
        Object objM5574g = c1583k.f7868a.m5574g(C1582j.f7842a);
        if (objM5574g == null) {
            objM5574g = null;
        }
        C1573a c1573a = (C1573a) objM5574g;
        if (c1573a == null || (interfaceC2139c = (InterfaceC2139c) c1573a.f7826b) == null || !((Boolean) interfaceC2139c.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (g4.l0) arrayList.get(0);
    }

    /* renamed from: n */
    public static final boolean m14987n(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f6 * f14) - (f10 * f13);
        float f26 = (f6 * f15) - (f11 * f13);
        float f27 = (f6 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 != DefinitionKt.NO_Float_VALUE) {
            float f38 = 1.0f / f37;
            fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
            fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
            fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
            fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
            float f39 = -f13;
            fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
            fArr2[5] = ((f12 * f32) + ((f36 * f6) - (f11 * f33))) * f38;
            float f40 = -f21;
            fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
            fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
            fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
            fArr2[9] = (((f33 * f10) + ((-f6) * f35)) - (f12 * f31)) * f38;
            fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
            fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
            fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
            fArr2[13] = ((f11 * f31) + ((f6 * f34) - (f10 * f32))) * f38;
            fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
            fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        }
        return !(f37 == DefinitionKt.NO_Float_VALUE);
    }

    /* renamed from: o */
    public static final boolean m14988o(C1589q c1589q) {
        v3.h1 h1VarM5209c = c1589q.m5209c();
        C1583k c1583k = c1589q.f7879d;
        if (h1VarM5209c != null ? h1VarM5209c.b1() : false) {
            return true;
        }
        C1595w c1595w = AbstractC1592t.f7917a;
        if (c1583k.f7868a.m5570c(AbstractC1592t.f7931o)) {
            return true;
        }
        return c1583k.f7868a.m5570c(AbstractC1592t.f7930n);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m14989p(d4.C1589q r14) {
        /*
            boolean r0 = m14988o(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            d4.k r14 = r14.f7879d
            boolean r0 = r14.f7870c
            if (r0 != 0) goto L59
            e1.j0 r14 = r14.f7868a
            java.lang.Object[] r0 = r14.f8999b
            java.lang.Object[] r2 = r14.f9000c
            long[] r14 = r14.f8998a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            d4.w r11 = (d4.C1595w) r11
            boolean r10 = r11.f7947c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.m0.m14989p(d4.q):boolean");
    }

    /* renamed from: q */
    public static final boolean m14990q(d3.h0 h0Var, float f6, float f10) {
        if (h0Var instanceof d3.d0) {
            C0848c c0848c = ((d3.d0) h0Var).f7738e;
            return c0848c.f5354a <= f6 && f6 < c0848c.f5356c && c0848c.f5355b <= f10 && f10 < c0848c.f5357d;
        }
        if (!(h0Var instanceof d3.e0)) {
            if (h0Var instanceof d3.c0) {
                return m14991r(((d3.c0) h0Var).f7736e, f6, f10);
            }
            throw new NoWhenBranchMatchedException();
        }
        C0849d c0849d = ((d3.e0) h0Var).f7743e;
        float f11 = c0849d.f5358a;
        long j6 = c0849d.f5363f;
        long j10 = c0849d.f5365h;
        long j11 = c0849d.f5364g;
        float f12 = c0849d.f5361d;
        float f13 = c0849d.f5359b;
        float f14 = c0849d.f5360c;
        long j12 = c0849d.f5362e;
        if (f6 < f11 || f6 >= f14 || f10 < f13 || f10 >= f12) {
            return false;
        }
        int i10 = (int) (j12 >> 32);
        int i11 = (int) (j6 >> 32);
        if (Float.intBitsToFloat(i11) + Float.intBitsToFloat(i10) <= c0849d.m2289b()) {
            int i12 = (int) (j10 >> 32);
            int i13 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i13) + Float.intBitsToFloat(i12) <= c0849d.m2289b()) {
                int i14 = (int) (j12 & 4294967295L);
                int i15 = (int) (j10 & 4294967295L);
                if (Float.intBitsToFloat(i15) + Float.intBitsToFloat(i14) <= c0849d.m2288a()) {
                    int i16 = (int) (j6 & 4294967295L);
                    int i17 = (int) (j11 & 4294967295L);
                    if (Float.intBitsToFloat(i17) + Float.intBitsToFloat(i16) <= c0849d.m2288a()) {
                        float fIntBitsToFloat = Float.intBitsToFloat(i10) + f11;
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i14) + f13;
                        float fIntBitsToFloat3 = f14 - Float.intBitsToFloat(i11);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i16) + f13;
                        float fIntBitsToFloat5 = f14 - Float.intBitsToFloat(i13);
                        float fIntBitsToFloat6 = f12 - Float.intBitsToFloat(i17);
                        float fIntBitsToFloat7 = f12 - Float.intBitsToFloat(i15);
                        float fIntBitsToFloat8 = Float.intBitsToFloat(i12) + f11;
                        if (f6 < fIntBitsToFloat && f10 < fIntBitsToFloat2) {
                            return m14992s(f6, f10, fIntBitsToFloat, fIntBitsToFloat2, c0849d.f5362e);
                        }
                        if (f6 < fIntBitsToFloat8 && f10 > fIntBitsToFloat7) {
                            return m14992s(f6, f10, fIntBitsToFloat8, fIntBitsToFloat7, c0849d.f5365h);
                        }
                        if (f6 > fIntBitsToFloat3 && f10 < fIntBitsToFloat4) {
                            return m14992s(f6, f10, fIntBitsToFloat3, fIntBitsToFloat4, c0849d.f5363f);
                        }
                        if (f6 <= fIntBitsToFloat5 || f10 <= fIntBitsToFloat6) {
                            return true;
                        }
                        return m14992s(f6, f10, fIntBitsToFloat5, fIntBitsToFloat6, c0849d.f5364g);
                    }
                }
            }
        }
        C1555i c1555iM5178a = AbstractC1558l.m5178a();
        d3.g0.m5128b(c1555iM5178a, c0849d);
        return m14991r(c1555iM5178a, f6, f10);
    }

    /* renamed from: r */
    public static final boolean m14991r(d3.g0 g0Var, float f6, float f10) {
        C0848c c0848c = new C0848c(f6 - 0.005f, f10 - 0.005f, f6 + 0.005f, f10 + 0.005f);
        C1555i c1555iM5178a = AbstractC1558l.m5178a();
        d3.g0.m5127a(c1555iM5178a, c0848c);
        C1555i c1555iM5178a2 = AbstractC1558l.m5178a();
        c1555iM5178a2.m5157f(g0Var, c1555iM5178a, 1);
        boolean zIsEmpty = c1555iM5178a2.f7752a.isEmpty();
        c1555iM5178a2.m5158g();
        c1555iM5178a.m5158g();
        return !zIsEmpty;
    }

    /* renamed from: s */
    public static final boolean m14992s(float f6, float f10, float f11, float f12, long j6) {
        float f13 = f6 - f11;
        float f14 = f10 - f12;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f13 * f13) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* renamed from: t */
    public static final void m14993t(float[] fArr, float[] fArr2) {
        float fM14983j = m14983j(fArr2, 0, fArr, 0);
        float fM14983j2 = m14983j(fArr2, 0, fArr, 1);
        float fM14983j3 = m14983j(fArr2, 0, fArr, 2);
        float fM14983j4 = m14983j(fArr2, 0, fArr, 3);
        float fM14983j5 = m14983j(fArr2, 1, fArr, 0);
        float fM14983j6 = m14983j(fArr2, 1, fArr, 1);
        float fM14983j7 = m14983j(fArr2, 1, fArr, 2);
        float fM14983j8 = m14983j(fArr2, 1, fArr, 3);
        float fM14983j9 = m14983j(fArr2, 2, fArr, 0);
        float fM14983j10 = m14983j(fArr2, 2, fArr, 1);
        float fM14983j11 = m14983j(fArr2, 2, fArr, 2);
        float fM14983j12 = m14983j(fArr2, 2, fArr, 3);
        float fM14983j13 = m14983j(fArr2, 3, fArr, 0);
        float fM14983j14 = m14983j(fArr2, 3, fArr, 1);
        float fM14983j15 = m14983j(fArr2, 3, fArr, 2);
        float fM14983j16 = m14983j(fArr2, 3, fArr, 3);
        fArr[0] = fM14983j;
        fArr[1] = fM14983j2;
        fArr[2] = fM14983j3;
        fArr[3] = fM14983j4;
        fArr[4] = fM14983j5;
        fArr[5] = fM14983j6;
        fArr[6] = fM14983j7;
        fArr[7] = fM14983j8;
        fArr[8] = fM14983j9;
        fArr[9] = fM14983j10;
        fArr[10] = fM14983j11;
        fArr[11] = fM14983j12;
        fArr[12] = fM14983j13;
        fArr[13] = fM14983j14;
        fArr[14] = fM14983j15;
        fArr[15] = fM14983j16;
    }

    /* renamed from: u */
    public static final AbstractC7663i m14994u(z0 z0Var, int i10) {
        Object next;
        Iterator<T> it = z0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((v3.g0) ((Map.Entry) next).getKey()).f36843b == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC7663i) entry.getValue();
        }
        return null;
    }

    /* renamed from: v */
    public static final String m14995v(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* renamed from: w */
    public static final String m14996w(int i10) {
        if (i10 == 0) {
            return "android.widget.Button";
        }
        if (i10 == 1) {
            return "android.widget.CheckBox";
        }
        if (i10 == 3) {
            return "android.widget.RadioButton";
        }
        if (i10 == 5) {
            return "android.widget.ImageView";
        }
        if (i10 == 6) {
            return "android.widget.Spinner";
        }
        if (i10 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* renamed from: x */
    public static void m14997x(View view) {
        try {
            if (!u2.f37986v) {
                u2.f37986v = true;
                if (Build.VERSION.SDK_INT < 28) {
                    u2.f37984s = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    u2.f37985t = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    u2.f37984s = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    u2.f37985t = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = u2.f37984s;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = u2.f37985t;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = u2.f37985t;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = u2.f37984s;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            u2.f37987w = true;
        }
    }
}
