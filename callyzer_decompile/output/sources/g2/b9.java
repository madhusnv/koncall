package g2;

import androidx.compose.ui.layout.AbstractC0264a;
import c3.C0850e;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5941v;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import t3.InterfaceC7028o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b9 implements t3.j0 {

    /* renamed from: a */
    public final InterfaceC2139c f11259a;

    /* renamed from: b */
    public final boolean f11260b;

    /* renamed from: c */
    public final float f11261c;

    /* renamed from: d */
    public final o1.h1 f11262d;

    public b9(InterfaceC2139c interfaceC2139c, boolean z6, float f6, o1.h1 h1Var) {
        this.f11259a = interfaceC2139c;
        this.f11260b = z6;
        this.f11261c = f6;
        this.f11262d = h1Var;
    }

    /* renamed from: a */
    public final int m6121a(InterfaceC7028o interfaceC7028o, List list, int i10, InterfaceC2141e interfaceC2141e) {
        Object obj;
        int iMo13313y;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i11;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i12);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj), "Leading")) {
                break;
            }
            i12++;
        }
        t3.i0 i0Var = (t3.i0) obj;
        if (i0Var != null) {
            iMo13313y = i10 == Integer.MAX_VALUE ? i10 : i10 - i0Var.mo13313y(Integer.MAX_VALUE);
            iIntValue = ((Number) interfaceC2141e.invoke(i0Var, Integer.valueOf(i10))).intValue();
        } else {
            iMo13313y = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i13);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj2), "Trailing")) {
                break;
            }
            i13++;
        }
        t3.i0 i0Var2 = (t3.i0) obj2;
        if (i0Var2 != null) {
            int iMo13313y2 = i0Var2.mo13313y(Integer.MAX_VALUE);
            if (iMo13313y != Integer.MAX_VALUE) {
                iMo13313y -= iMo13313y2;
            }
            iIntValue2 = ((Number) interfaceC2141e.invoke(i0Var2, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i14);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj3), "Label")) {
                break;
            }
            i14++;
        }
        Object obj8 = (t3.i0) obj3;
        int iIntValue4 = obj8 != null ? ((Number) interfaceC2141e.invoke(obj8, Integer.valueOf(AbstractC5941v.m11892f(this.f11261c, iMo13313y, i10)))).intValue() : 0;
        int size4 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i15);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj4), "Prefix")) {
                break;
            }
            i15++;
        }
        t3.i0 i0Var3 = (t3.i0) obj4;
        if (i0Var3 != null) {
            iIntValue3 = ((Number) interfaceC2141e.invoke(i0Var3, Integer.valueOf(iMo13313y))).intValue();
            int iMo13313y3 = i0Var3.mo13313y(Integer.MAX_VALUE);
            if (iMo13313y != Integer.MAX_VALUE) {
                iMo13313y -= iMo13313y3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i16);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj5), "Suffix")) {
                break;
            }
            i16++;
        }
        t3.i0 i0Var4 = (t3.i0) obj5;
        if (i0Var4 != null) {
            int iIntValue5 = ((Number) interfaceC2141e.invoke(i0Var4, Integer.valueOf(iMo13313y))).intValue();
            int iMo13313y4 = i0Var4.mo13313y(Integer.MAX_VALUE);
            if (iMo13313y != Integer.MAX_VALUE) {
                iMo13313y -= iMo13313y4;
            }
            i11 = iIntValue5;
        } else {
            i11 = 0;
        }
        int size6 = list.size();
        for (int i17 = 0; i17 < size6; i17++) {
            Object obj9 = list.get(i17);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj9), "TextField")) {
                int iIntValue6 = ((Number) interfaceC2141e.invoke(obj9, Integer.valueOf(iMo13313y))).intValue();
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i18);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj6), "Hint")) {
                        break;
                    }
                    i18++;
                }
                Object obj10 = (t3.i0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) interfaceC2141e.invoke(obj10, Integer.valueOf(iMo13313y))).intValue() : 0;
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i19);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i19++;
                }
                Object obj12 = (t3.i0) obj7;
                return z8.m6359d(iIntValue, iIntValue2, iIntValue3, i11, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) interfaceC2141e.invoke(obj12, Integer.valueOf(i10))).intValue() : 0, this.f11261c, h2.s0.f15773a, interfaceC7028o.mo155a(), this.f11262d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: b */
    public final int m6122b(InterfaceC7028o interfaceC7028o, List list, int i10, InterfaceC2141e interfaceC2141e) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj7 = list.get(i11);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj7), "TextField")) {
                int iIntValue = ((Number) interfaceC2141e.invoke(obj7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                t3.i0 i0Var = (t3.i0) obj2;
                int iIntValue2 = i0Var != null ? ((Number) interfaceC2141e.invoke(i0Var, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                t3.i0 i0Var2 = (t3.i0) obj3;
                int iIntValue3 = i0Var2 != null ? ((Number) interfaceC2141e.invoke(i0Var2, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                t3.i0 i0Var3 = (t3.i0) obj4;
                int iIntValue4 = i0Var3 != null ? ((Number) interfaceC2141e.invoke(i0Var3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i15);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj5), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                t3.i0 i0Var4 = (t3.i0) obj5;
                int iIntValue5 = i0Var4 != null ? ((Number) interfaceC2141e.invoke(i0Var4, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj6), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                t3.i0 i0Var5 = (t3.i0) obj6;
                int iIntValue6 = i0Var5 != null ? ((Number) interfaceC2141e.invoke(i0Var5, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i17);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i17++;
                }
                t3.i0 i0Var6 = (t3.i0) obj;
                return z8.m6360e(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, i0Var6 != null ? ((Number) interfaceC2141e.invoke(i0Var6, Integer.valueOf(i10))).intValue() : 0, this.f11261c, h2.s0.f15773a, interfaceC7028o.mo155a(), this.f11262d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // t3.j0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6121a(interfaceC7028o, list, i10, a2.f11156y);
    }

    @Override // t3.j0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6122b(interfaceC7028o, list, i10, a2.f11157z);
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        Object obj;
        Object obj2;
        Object obj3;
        t3.w0 w0Var;
        t3.w0 w0VarMo13314z;
        Object obj4;
        int i10;
        t3.w0 w0VarMo13314z2;
        int i11;
        Object obj5;
        Object obj6;
        Object obj7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        b9 b9Var = this;
        List list2 = list;
        o1.h1 h1Var = b9Var.f11262d;
        int iE0 = l0Var.e0(h1Var.mo10341a());
        long jM12911b = C6745a.m12911b(j6, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i20);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj), "Leading")) {
                break;
            }
            i20++;
        }
        t3.i0 i0Var = (t3.i0) obj;
        t3.w0 w0VarMo13314z3 = i0Var != null ? i0Var.mo13314z(jM12911b) : null;
        float f6 = h2.s0.f15774b;
        int i21 = w0VarMo13314z3 != null ? w0VarMo13314z3.f34030a : 0;
        int iMax = Math.max(0, w0VarMo13314z3 != null ? w0VarMo13314z3.f34031b : 0);
        int size2 = list2.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i22);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj2), "Trailing")) {
                break;
            }
            i22++;
        }
        t3.i0 i0Var2 = (t3.i0) obj2;
        t3.w0 w0VarMo13314z4 = i0Var2 != null ? i0Var2.mo13314z(AbstractC6746b.m12932j(-i21, 0, 2, jM12911b)) : null;
        int i23 = i21 + (w0VarMo13314z4 != null ? w0VarMo13314z4.f34030a : 0);
        int iMax2 = Math.max(iMax, w0VarMo13314z4 != null ? w0VarMo13314z4.f34031b : 0);
        int size3 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i24);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj3), "Prefix")) {
                break;
            }
            i24++;
        }
        t3.i0 i0Var3 = (t3.i0) obj3;
        if (i0Var3 != null) {
            w0Var = w0VarMo13314z3;
            w0VarMo13314z = i0Var3.mo13314z(AbstractC6746b.m12932j(-i23, 0, 2, jM12911b));
        } else {
            w0Var = w0VarMo13314z3;
            w0VarMo13314z = null;
        }
        int i25 = i23 + (w0VarMo13314z != null ? w0VarMo13314z.f34030a : 0);
        int iMax3 = Math.max(iMax2, w0VarMo13314z != null ? w0VarMo13314z.f34031b : 0);
        int size4 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i26);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj4), "Suffix")) {
                break;
            }
            i26++;
        }
        t3.i0 i0Var4 = (t3.i0) obj4;
        if (i0Var4 != null) {
            i10 = i25;
            w0VarMo13314z2 = i0Var4.mo13314z(AbstractC6746b.m12932j(-i25, 0, 2, jM12911b));
        } else {
            i10 = i25;
            w0VarMo13314z2 = null;
        }
        int i27 = i10 + (w0VarMo13314z2 != null ? w0VarMo13314z2.f34030a : 0);
        int iMax4 = Math.max(iMax3, w0VarMo13314z2 != null ? w0VarMo13314z2.f34031b : 0);
        int iE02 = l0Var.e0(h1Var.mo10343c(l0Var.getLayoutDirection())) + l0Var.e0(h1Var.mo10342b(l0Var.getLayoutDirection()));
        int i28 = -i27;
        int iM11892f = AbstractC5941v.m11892f(b9Var.f11261c, i28 - iE02, -iE02);
        int i29 = -iE0;
        long jM12931i = AbstractC6746b.m12931i(iM11892f, i29, jM12911b);
        int size5 = list2.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size5) {
                i11 = iE0;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i30);
            int i31 = i30;
            i11 = iE0;
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj5), "Label")) {
                break;
            }
            i30 = i31 + 1;
            iE0 = i11;
        }
        t3.i0 i0Var5 = (t3.i0) obj5;
        t3.w0 w0VarMo13314z5 = i0Var5 != null ? i0Var5.mo13314z(jM12931i) : null;
        b9Var.f11259a.invoke(new C0850e(w0VarMo13314z5 != null ? og.d2.m10598a(w0VarMo13314z5.f34030a, w0VarMo13314z5.f34031b) : 0L));
        int size6 = list2.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i32);
            int i33 = size6;
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj6), "Supporting")) {
                break;
            }
            i32++;
            size6 = i33;
        }
        t3.i0 i0Var6 = (t3.i0) obj6;
        int iA0 = i0Var6 != null ? i0Var6.a0(C6745a.m12920k(j6)) : 0;
        int iMax5 = Math.max((w0VarMo13314z5 != null ? w0VarMo13314z5.f34031b : 0) / 2, l0Var.e0(h1Var.mo10344d()));
        long jM12911b2 = C6745a.m12911b(AbstractC6746b.m12931i(i28, (i29 - iMax5) - iA0, j6), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i34 = 0;
        while (i34 < size7) {
            t3.i0 i0Var7 = (t3.i0) list2.get(i34);
            int i35 = i34;
            int i36 = size7;
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var7), "TextField")) {
                t3.w0 w0VarMo13314z6 = i0Var7.mo13314z(jM12911b2);
                long jM12911b3 = C6745a.m12911b(jM12911b2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i37 = 0;
                while (true) {
                    if (i37 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i37);
                    int i38 = size8;
                    int i39 = i37;
                    if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj7), "Hint")) {
                        break;
                    }
                    i37 = i39 + 1;
                    size8 = i38;
                }
                t3.i0 i0Var8 = (t3.i0) obj7;
                t3.w0 w0VarMo13314z7 = i0Var8 != null ? i0Var8.mo13314z(jM12911b3) : null;
                int iMax6 = Math.max(iMax4, Math.max(w0VarMo13314z6.f34031b, w0VarMo13314z7 != null ? w0VarMo13314z7.f34031b : 0) + iMax5 + i11);
                t3.w0 w0Var2 = w0Var;
                int i40 = w0Var != null ? w0Var2.f34030a : 0;
                int i41 = w0VarMo13314z4 != null ? w0VarMo13314z4.f34030a : 0;
                if (w0VarMo13314z != null) {
                    i12 = w0VarMo13314z.f34030a;
                    i40 = i40;
                } else {
                    i12 = 0;
                }
                if (w0VarMo13314z2 != null) {
                    i13 = i40;
                    i14 = w0VarMo13314z2.f34030a;
                } else {
                    i13 = i40;
                    i14 = 0;
                }
                int i42 = w0VarMo13314z6.f34030a;
                if (w0VarMo13314z5 != null) {
                    i17 = w0VarMo13314z5.f34030a;
                    i16 = i13;
                    i15 = i42;
                } else {
                    int i43 = i13;
                    i15 = i42;
                    i16 = i43;
                    i17 = 0;
                }
                if (w0VarMo13314z7 != null) {
                    i18 = w0VarMo13314z7.f34030a;
                    i16 = i16;
                } else {
                    i18 = 0;
                }
                int iM6360e = z8.m6360e(i16, i41, i12, i14, i15, i17, i18, b9Var.f11261c, j6, l0Var.mo155a(), b9Var.f11262d);
                int i44 = 0;
                int i45 = iM6360e;
                t3.w0 w0VarMo13314z8 = i0Var6 != null ? i0Var6.mo13314z(C6745a.m12911b(AbstractC6746b.m12932j(0, -iMax6, 1, jM12911b), 0, iM6360e, 0, 0, 9)) : null;
                int i46 = w0VarMo13314z8 != null ? w0VarMo13314z8.f34031b : 0;
                int i47 = w0Var2 != null ? w0Var2.f34031b : 0;
                if (w0VarMo13314z4 != null) {
                    i19 = 0;
                    i44 = w0VarMo13314z4.f34031b;
                } else {
                    i19 = 0;
                }
                t3.w0 w0Var3 = w0VarMo13314z;
                t3.w0 w0Var4 = w0VarMo13314z5;
                int iM6359d = z8.m6359d(i47, i44, w0VarMo13314z != null ? w0VarMo13314z.f34031b : i19, w0VarMo13314z2 != null ? w0VarMo13314z2.f34031b : i19, w0VarMo13314z6.f34031b, w0VarMo13314z5 != null ? w0VarMo13314z5.f34031b : i19, w0VarMo13314z7 != null ? w0VarMo13314z7.f34031b : i19, w0VarMo13314z8 != null ? w0VarMo13314z8.f34031b : i19, b9Var.f11261c, j6, l0Var.mo155a(), b9Var.f11262d);
                int i48 = iM6359d - i46;
                int size9 = list2.size();
                int i49 = i19;
                while (i49 < size9) {
                    t3.i0 i0Var9 = (t3.i0) list2.get(i49);
                    if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var9), "Container")) {
                        t3.w0 w0VarMo13314z9 = i0Var9.mo13314z(AbstractC6746b.m12923a(i45 != Integer.MAX_VALUE ? i45 : i19, i45, i48 != Integer.MAX_VALUE ? i48 : i19, i48));
                        t3.w0 w0Var5 = w0VarMo13314z6;
                        t3.w0 w0Var6 = w0VarMo13314z8;
                        int i50 = i45;
                        return l0Var.g0(i50, iM6359d, C6669s.f31944a, new a9(iM6359d, i50, w0Var2, w0VarMo13314z4, w0Var3, w0VarMo13314z2, w0Var5, w0Var4, w0VarMo13314z7, w0VarMo13314z9, w0Var6, b9Var, l0Var));
                    }
                    i49++;
                    i45 = i45;
                    w0VarMo13314z8 = w0VarMo13314z8;
                    w0VarMo13314z6 = w0VarMo13314z6;
                    w0Var3 = w0Var3;
                    w0VarMo13314z2 = w0VarMo13314z2;
                    w0Var2 = w0Var2;
                    b9Var = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i34 = i35 + 1;
            b9Var = this;
            list2 = list;
            w0VarMo13314z2 = w0VarMo13314z2;
            size7 = i36;
            jM12911b2 = jM12911b2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // t3.j0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6121a(interfaceC7028o, list, i10, a2.f11128B);
    }

    @Override // t3.j0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6122b(interfaceC7028o, list, i10, a2.f11129C);
    }
}
