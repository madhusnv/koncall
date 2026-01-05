package g2;

import androidx.compose.ui.layout.AbstractC0264a;
import ex.InterfaceC2141e;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import t3.InterfaceC7028o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class pc implements t3.j0 {

    /* renamed from: a */
    public final boolean f12439a;

    /* renamed from: b */
    public final float f12440b;

    /* renamed from: c */
    public final o1.h1 f12441c;

    public pc(boolean z6, float f6, o1.h1 h1Var) {
        this.f12439a = z6;
        this.f12440b = f6;
        this.f12441c = h1Var;
    }

    /* renamed from: b */
    public static int m6263b(int i10, InterfaceC2141e interfaceC2141e, List list) {
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
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj4), "Prefix")) {
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
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj5), "Suffix")) {
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
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj6), "Leading")) {
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
                int iIntValue7 = i0Var6 != null ? ((Number) interfaceC2141e.invoke(i0Var6, Integer.valueOf(i10))).intValue() : 0;
                long j6 = h2.s0.f15773a;
                int i18 = nc.f12219a;
                int i19 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i19, Math.max(iIntValue7 + i19, iIntValue2)) + iIntValue6 + iIntValue3, C6745a.m12920k(j6));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: a */
    public final int m6264a(InterfaceC7028o interfaceC7028o, List list, int i10, InterfaceC2141e interfaceC2141e) {
        Object obj;
        int iMo13313y;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i11;
        Object obj5;
        int i12;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj), "Leading")) {
                break;
            }
            i13++;
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
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj2), "Trailing")) {
                break;
            }
            i14++;
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
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i15);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj3), "Label")) {
                break;
            }
            i15++;
        }
        Object obj8 = (t3.i0) obj3;
        int iIntValue3 = obj8 != null ? ((Number) interfaceC2141e.invoke(obj8, Integer.valueOf(iMo13313y))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj4), "Prefix")) {
                break;
            }
            i16++;
        }
        t3.i0 i0Var3 = (t3.i0) obj4;
        if (i0Var3 != null) {
            int iIntValue4 = ((Number) interfaceC2141e.invoke(i0Var3, Integer.valueOf(iMo13313y))).intValue();
            int iMo13313y3 = i0Var3.mo13313y(Integer.MAX_VALUE);
            if (iMo13313y != Integer.MAX_VALUE) {
                iMo13313y -= iMo13313y3;
            }
            i11 = iIntValue4;
        } else {
            i11 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i17);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj5), "Suffix")) {
                break;
            }
            i17++;
        }
        t3.i0 i0Var4 = (t3.i0) obj5;
        if (i0Var4 != null) {
            int iIntValue5 = ((Number) interfaceC2141e.invoke(i0Var4, Integer.valueOf(iMo13313y))).intValue();
            int iMo13313y4 = i0Var4.mo13313y(Integer.MAX_VALUE);
            if (iMo13313y != Integer.MAX_VALUE) {
                iMo13313y -= iMo13313y4;
            }
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            Object obj9 = list.get(i18);
            if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj9), "TextField")) {
                int iIntValue6 = ((Number) interfaceC2141e.invoke(obj9, Integer.valueOf(iMo13313y))).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i19);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj6), "Hint")) {
                        break;
                    }
                    i19++;
                }
                Object obj10 = (t3.i0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) interfaceC2141e.invoke(obj10, Integer.valueOf(iMo13313y))).intValue() : 0;
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i20);
                    if (AbstractC4154l.m8918a(h2.s0.m6922e((t3.i0) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i20++;
                }
                Object obj12 = (t3.i0) obj7;
                return nc.m6224c(iIntValue6, iIntValue3, iIntValue, iIntValue2, i11, i12, iIntValue7, obj12 != null ? ((Number) interfaceC2141e.invoke(obj12, Integer.valueOf(i10))).intValue() : 0, this.f12440b, h2.s0.f15773a, interfaceC7028o.mo155a(), this.f12441c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // t3.j0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6264a(interfaceC7028o, list, i10, a2.f11131E);
    }

    @Override // t3.j0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6263b(i10, a2.f11132F, list);
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        Object obj;
        Object obj2;
        Object obj3;
        int i10;
        t3.w0 w0VarMo13314z;
        Object obj4;
        int i11;
        t3.w0 w0VarMo13314z2;
        int i12;
        Object obj5;
        Object obj6;
        Object obj7;
        List list2 = list;
        o1.h1 h1Var = this.f12441c;
        int iE0 = l0Var.e0(h1Var.mo10344d());
        int iE02 = l0Var.e0(h1Var.mo10341a());
        long jM12911b = C6745a.m12911b(j6, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i13);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj), "Leading")) {
                break;
            }
            i13++;
        }
        t3.i0 i0Var = (t3.i0) obj;
        t3.w0 w0VarMo13314z3 = i0Var != null ? i0Var.mo13314z(jM12911b) : null;
        float f6 = h2.s0.f15774b;
        int i14 = w0VarMo13314z3 != null ? w0VarMo13314z3.f34030a : 0;
        int iMax = Math.max(0, w0VarMo13314z3 != null ? w0VarMo13314z3.f34031b : 0);
        int size2 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i15);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj2), "Trailing")) {
                break;
            }
            i15++;
        }
        t3.i0 i0Var2 = (t3.i0) obj2;
        t3.w0 w0VarMo13314z4 = i0Var2 != null ? i0Var2.mo13314z(AbstractC6746b.m12932j(-i14, 0, 2, jM12911b)) : null;
        int i16 = i14 + (w0VarMo13314z4 != null ? w0VarMo13314z4.f34030a : 0);
        int iMax2 = Math.max(iMax, w0VarMo13314z4 != null ? w0VarMo13314z4.f34031b : 0);
        int size3 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i17);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj3), "Prefix")) {
                break;
            }
            i17++;
        }
        t3.i0 i0Var3 = (t3.i0) obj3;
        if (i0Var3 != null) {
            i10 = i16;
            w0VarMo13314z = i0Var3.mo13314z(AbstractC6746b.m12932j(-i16, 0, 2, jM12911b));
        } else {
            i10 = i16;
            w0VarMo13314z = null;
        }
        int i18 = (w0VarMo13314z != null ? w0VarMo13314z.f34030a : 0) + i10;
        int iMax3 = Math.max(iMax2, w0VarMo13314z != null ? w0VarMo13314z.f34031b : 0);
        int size4 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i19);
            int i20 = size4;
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj4), "Suffix")) {
                break;
            }
            i19++;
            size4 = i20;
        }
        t3.i0 i0Var4 = (t3.i0) obj4;
        if (i0Var4 != null) {
            i11 = iE0;
            w0VarMo13314z2 = i0Var4.mo13314z(AbstractC6746b.m12932j(-i18, 0, 2, jM12911b));
        } else {
            i11 = iE0;
            w0VarMo13314z2 = null;
        }
        int i21 = i18 + (w0VarMo13314z2 != null ? w0VarMo13314z2.f34030a : 0);
        int iMax4 = Math.max(iMax3, w0VarMo13314z2 != null ? w0VarMo13314z2.f34031b : 0);
        int i22 = -i21;
        long jM12931i = AbstractC6746b.m12931i(i22, -iE02, jM12911b);
        int size5 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size5) {
                i12 = iE02;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i23);
            i12 = iE02;
            int i24 = size5;
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj5), "Label")) {
                break;
            }
            i23++;
            size5 = i24;
            iE02 = i12;
        }
        t3.i0 i0Var5 = (t3.i0) obj5;
        t3.w0 w0VarMo13314z5 = i0Var5 != null ? i0Var5.mo13314z(jM12931i) : null;
        int size6 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i25);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj6), "Supporting")) {
                break;
            }
            i25++;
        }
        t3.i0 i0Var6 = (t3.i0) obj6;
        int iA0 = i0Var6 != null ? i0Var6.a0(C6745a.m12920k(j6)) : 0;
        int i26 = i11 + (w0VarMo13314z5 != null ? w0VarMo13314z5.f34031b : 0);
        long jM12931i2 = AbstractC6746b.m12931i(i22, ((-i26) - i12) - iA0, C6745a.m12911b(j6, 0, 0, 0, 0, 11));
        int size7 = list2.size();
        int i27 = 0;
        while (i27 < size7) {
            int i28 = size7;
            t3.i0 i0Var7 = (t3.i0) list2.get(i27);
            int i29 = i27;
            int i30 = i26;
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var7), "TextField")) {
                t3.w0 w0VarMo13314z6 = i0Var7.mo13314z(jM12931i2);
                long jM12911b2 = C6745a.m12911b(jM12931i2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i31 = 0;
                while (true) {
                    if (i31 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i31);
                    int i32 = size8;
                    int i33 = i31;
                    if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj7), "Hint")) {
                        break;
                    }
                    i31 = i33 + 1;
                    size8 = i32;
                }
                t3.i0 i0Var8 = (t3.i0) obj7;
                t3.w0 w0VarMo13314z7 = i0Var8 != null ? i0Var8.mo13314z(jM12911b2) : null;
                int iMax5 = Math.max(iMax4, Math.max(w0VarMo13314z6.f34031b, w0VarMo13314z7 != null ? w0VarMo13314z7.f34031b : 0) + i30 + i12);
                int i34 = w0VarMo13314z3 != null ? w0VarMo13314z3.f34030a : 0;
                int i35 = w0VarMo13314z4 != null ? w0VarMo13314z4.f34030a : 0;
                int i36 = i34;
                int i37 = (w0VarMo13314z != null ? w0VarMo13314z.f34030a : 0) + (w0VarMo13314z2 != null ? w0VarMo13314z2.f34030a : 0);
                int iMax6 = Math.max(Math.max(w0VarMo13314z6.f34030a + i37, Math.max((w0VarMo13314z7 != null ? w0VarMo13314z7.f34030a : 0) + i37, w0VarMo13314z5 != null ? w0VarMo13314z5.f34030a : 0)) + i36 + i35, C6745a.m12920k(j6));
                t3.w0 w0VarMo13314z8 = i0Var6 != null ? i0Var6.mo13314z(C6745a.m12911b(AbstractC6746b.m12932j(0, -iMax5, 1, jM12911b), 0, iMax6, 0, 0, 9)) : null;
                int i38 = w0VarMo13314z8 != null ? w0VarMo13314z8.f34031b : 0;
                pc pcVar = this;
                int iM6224c = nc.m6224c(w0VarMo13314z6.f34031b, w0VarMo13314z5 != null ? w0VarMo13314z5.f34031b : 0, w0VarMo13314z3 != null ? w0VarMo13314z3.f34031b : 0, w0VarMo13314z4 != null ? w0VarMo13314z4.f34031b : 0, w0VarMo13314z != null ? w0VarMo13314z.f34031b : 0, w0VarMo13314z2 != null ? w0VarMo13314z2.f34031b : 0, w0VarMo13314z7 != null ? w0VarMo13314z7.f34031b : 0, w0VarMo13314z8 != null ? w0VarMo13314z8.f34031b : 0, pcVar.f12440b, j6, l0Var.mo155a(), pcVar.f12441c);
                int i39 = iM6224c - i38;
                int size9 = list2.size();
                int i40 = 0;
                while (i40 < size9) {
                    t3.i0 i0Var9 = (t3.i0) list2.get(i40);
                    t3.w0 w0Var = w0VarMo13314z5;
                    t3.w0 w0Var2 = w0VarMo13314z;
                    if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var9), "Container")) {
                        t3.w0 w0VarMo13314z9 = i0Var9.mo13314z(AbstractC6746b.m12923a(iMax6 != Integer.MAX_VALUE ? iMax6 : 0, iMax6, i39 != Integer.MAX_VALUE ? i39 : 0, i39));
                        t3.w0 w0Var3 = w0VarMo13314z6;
                        int i41 = iM6224c;
                        return l0Var.g0(iMax6, i41, C6669s.f31944a, new oc(w0Var, iMax6, i41, w0Var3, w0VarMo13314z7, w0VarMo13314z3, w0VarMo13314z4, w0Var2, w0VarMo13314z2, w0VarMo13314z9, w0VarMo13314z8, pcVar, i11, l0Var));
                    }
                    w0VarMo13314z5 = w0Var;
                    i40++;
                    iM6224c = iM6224c;
                    w0VarMo13314z6 = w0VarMo13314z6;
                    list2 = list;
                    w0VarMo13314z = w0Var2;
                    pcVar = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i27 = i29 + 1;
            list2 = list;
            size7 = i28;
            i26 = i30;
            jM12931i2 = jM12931i2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // t3.j0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6264a(interfaceC7028o, list, i10, a2.f11133G);
    }

    @Override // t3.j0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6263b(i10, a2.f11134H, list);
    }
}
