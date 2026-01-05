package b3;

import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import b2.C0566x;
import c3.C0848c;
import d4.C1582j;
import d4.C1583k;
import e1.r0;
import ex.InterfaceC2139c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import lv.C4535g;
import m2.C4640e;
import s3.AbstractC6744a;
import s4.EnumC6757m;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.a1;
import v3.x1;
import w2.AbstractC7878q;
import w3.C7904v;
import x2.C8278b;
import x2.C8279c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.q */
/* loaded from: classes.dex */
public final class C0585q implements InterfaceC0579k {

    /* renamed from: a */
    public final i1.e0 f3936a;

    /* renamed from: b */
    public final vr.b0 f3937b;

    /* renamed from: c */
    public final C0575g f3938c;

    /* renamed from: d */
    public final C0575g f3939d;

    /* renamed from: e */
    public final C0582n f3940e;

    /* renamed from: f */
    public final e0 f3941f = new e0(2, 6, null);

    /* renamed from: g */
    public final C0576h f3942g;

    /* renamed from: h */
    public final f0 f3943h;

    /* renamed from: i */
    public final FocusOwnerImpl$modifier$1 f3944i;

    /* renamed from: j */
    public e1.b0 f3945j;

    /* renamed from: k */
    public final e1.e0 f3946k;

    /* renamed from: l */
    public e0 f3947l;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public C0585q(vr.b0 b0Var, i1.e0 e0Var, vr.b0 b0Var2, C0575g c0575g, C0575g c0575g2, C0582n c0582n) {
        this.f3936a = e0Var;
        this.f3937b = b0Var2;
        this.f3938c = c0575g;
        this.f3939d = c0575g2;
        this.f3940e = c0582n;
        int i10 = 0;
        int i11 = 0;
        this.f3942g = new C0576h(b0Var, new C0575g(i10, this, C0585q.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 1), new C0581m(i10, i11, C0585q.class, this, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;"), new C0582n(i10, i11, C0585q.class, this, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;"));
        f0 f0Var = new f0();
        r0.m5609b();
        this.f3943h = f0Var;
        this.f3944i = new a1() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // v3.a1
            /* renamed from: h */
            public final AbstractC7878q mo621h() {
                return this.f2103a.f3941f;
            }

            public final int hashCode() {
                return this.f2103a.f3941f.hashCode();
            }

            @Override // v3.a1
            /* renamed from: i */
            public final /* bridge */ /* synthetic */ void mo622i(AbstractC7878q abstractC7878q) {
            }
        };
        this.f3946k = new e1.e0(1);
    }

    /* renamed from: b */
    public final boolean m1743b(boolean z6) {
        C4535g c4535g;
        e0 e0Var = this.f3947l;
        if (e0Var != null) {
            m1748g(null);
            e0Var.L0(c0.Active, c0.Inactive);
            if (!e0Var.f37670a.f37683p) {
                AbstractC6744a.m12907b("visitAncestors called on an unattached node");
            }
            AbstractC7878q abstractC7878q = e0Var.f37670a.f37674e;
            v3.g0 g0VarM14563x = AbstractC7634f.m14563x(e0Var);
            while (g0VarM14563x != null) {
                if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 1024) != 0) {
                    while (abstractC7878q != null) {
                        if ((abstractC7878q.f37672c & 1024) != 0) {
                            C4640e c4640e = null;
                            AbstractC7878q abstractC7878qM14545f = abstractC7878q;
                            while (abstractC7878qM14545f != null) {
                                if (abstractC7878qM14545f instanceof e0) {
                                    ((e0) abstractC7878qM14545f).L0(c0.ActiveParent, c0.Inactive);
                                } else if ((abstractC7878qM14545f.f37672c & 1024) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                    int i10 = 0;
                                    for (AbstractC7878q abstractC7878q2 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
                                        if ((abstractC7878q2.f37672c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC7878qM14545f = abstractC7878q2;
                                            } else {
                                                if (c4640e == null) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7878qM14545f != null) {
                                                    c4640e.m9506b(abstractC7878qM14545f);
                                                    abstractC7878qM14545f = null;
                                                }
                                                c4640e.m9506b(abstractC7878q2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                        abstractC7878q = abstractC7878q.f37674e;
                    }
                }
                g0VarM14563x = g0VarM14563x.m14609v();
                abstractC7878q = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (x1) c4535g.f22541e;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m1744c(int i10, boolean z6, boolean z10) {
        boolean z11 = true;
        if (z6) {
            m1743b(z6);
        } else {
            int i11 = AbstractC0580l.f3927a[AbstractC0574f.m1735t(this.f3941f, i10).ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                z11 = false;
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                m1743b(z6);
            }
        }
        if (z11 && z10) {
            this.f3938c.invoke();
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r15v5, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r15v9, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v36, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1745d(android.view.KeyEvent r14, ex.InterfaceC2137a r15) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0585q.m1745d(android.view.KeyEvent, ex.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r10v8, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13, types: [v3.x1] */
    /* JADX WARN: Type inference failed for: r3v7, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r5v12, types: [b3.e0] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [m2.e] */
    /* renamed from: e */
    public final Boolean m1746e(int i10, C0848c c0848c, InterfaceC2139c interfaceC2139c) {
        Boolean bool;
        boolean zM1716a;
        Boolean bool2;
        C4535g c4535g;
        e0 e0Var = this.f3941f;
        e0 e0VarM1722g = AbstractC0574f.m1722g(e0Var);
        int i11 = 4;
        C0582n c0582n = this.f3940e;
        if (e0VarM1722g != null) {
            EnumC6757m enumC6757m = (EnumC6757m) c0582n.get();
            bool = null;
            C0588t c0588tM0 = e0VarM1722g.M0();
            C0592x c0592x = c0588tM0.f3959h;
            C0592x c0592x2 = c0588tM0.f3960i;
            if (i10 == 1) {
                c0592x = c0588tM0.f3953b;
            } else if (i10 == 2) {
                c0592x = c0588tM0.f3954c;
            } else if (i10 == 5) {
                c0592x = c0588tM0.f3955d;
            } else if (i10 == 6) {
                c0592x = c0588tM0.f3956e;
            } else if (i10 == 3) {
                int i12 = h0.f3916a[enumC6757m.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0592x = c0592x2;
                }
                if (c0592x == C0592x.f3965b) {
                    c0592x = null;
                }
                if (c0592x == null) {
                    c0592x = c0588tM0.f3957f;
                }
            } else if (i10 == 4) {
                int i13 = h0.f3916a[enumC6757m.ordinal()];
                if (i13 == 1) {
                    c0592x = c0592x2;
                } else if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c0592x == C0592x.f3965b) {
                    c0592x = null;
                }
                if (c0592x == null) {
                    c0592x = c0588tM0.f3958g;
                }
            } else {
                if (i10 != 7 && i10 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                C0569a c0569a = new C0569a(i10);
                AbstractC0574f.m1730o(e0VarM1722g);
                C0585q c0585q = (C0585q) ((C7904v) AbstractC7634f.m14564y(e0VarM1722g)).getFocusOwner();
                e0 e0Var2 = c0585q.f3947l;
                if (i10 == 7) {
                    c0588tM0.f3961j.invoke(c0569a);
                } else {
                    c0588tM0.f3962k.invoke(c0569a);
                }
                c0592x = c0569a.f3896b ? C0592x.f3966c : e0Var2 != c0585q.f3947l ? C0592x.f3967d : C0592x.f3965b;
            }
            if (!AbstractC4154l.m8918a(c0592x, C0592x.f3966c)) {
                if (AbstractC4154l.m8918a(c0592x, C0592x.f3967d)) {
                    e0 e0VarM1722g2 = AbstractC0574f.m1722g(e0Var);
                    if (e0VarM1722g2 != null) {
                        return (Boolean) interfaceC2139c.invoke(e0VarM1722g2);
                    }
                } else if (!AbstractC4154l.m8918a(c0592x, C0592x.f3965b)) {
                    return Boolean.valueOf(c0592x.m1758a(interfaceC2139c));
                }
            }
            return bool;
        }
        bool = null;
        e0VarM1722g = null;
        EnumC6757m enumC6757m2 = (EnumC6757m) c0582n.get();
        C0566x c0566x = new C0566x(e0VarM1722g, this, interfaceC2139c);
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                zM1716a = AbstractC0574f.m1726k(e0Var, c0566x);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zM1716a = AbstractC0574f.m1716a(e0Var, c0566x);
            }
            return Boolean.valueOf(zM1716a);
        }
        if (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            return AbstractC0574f.m1715F(i10, c0566x, e0Var, c0848c);
        }
        if (i10 == 7) {
            int i14 = h0.f3916a[enumC6757m2.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = 3;
            }
            e0 e0VarM1722g3 = AbstractC0574f.m1722g(e0Var);
            if (e0VarM1722g3 != null) {
                return AbstractC0574f.m1715F(i11, c0566x, e0VarM1722g3, c0848c);
            }
            return bool;
        }
        if (i10 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C0572d.m1709a(i10))).toString());
        }
        e0 e0VarM1722g4 = AbstractC0574f.m1722g(e0Var);
        boolean zBooleanValue = false;
        if (e0VarM1722g4 == null) {
            bool2 = bool;
        } else {
            if (!e0VarM1722g4.f37670a.f37683p) {
                AbstractC6744a.m12907b("visitAncestors called on an unattached node");
            }
            ?? r32 = e0VarM1722g4.f37670a.f37674e;
            v3.g0 g0VarM14563x = AbstractC7634f.m14563x(e0VarM1722g4);
            loop0: while (g0VarM14563x != null) {
                if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 1024) != 0) {
                    for (AbstractC7878q abstractC7878q = r32; abstractC7878q != null; abstractC7878q = abstractC7878q.f37674e) {
                        if ((abstractC7878q.f37672c & 1024) != 0) {
                            AbstractC7642n abstractC7642nM14545f = abstractC7878q;
                            ?? c4640e = bool;
                            while (abstractC7642nM14545f != 0) {
                                if (abstractC7642nM14545f instanceof e0) {
                                    ?? r52 = (e0) abstractC7642nM14545f;
                                    if (r52.M0().f3952a) {
                                        bool2 = r52;
                                        break loop0;
                                    }
                                } else if ((abstractC7642nM14545f.f37672c & 1024) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                    AbstractC7878q abstractC7878q2 = abstractC7642nM14545f.f36953r;
                                    int i15 = 0;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                    while (abstractC7878q2 != null) {
                                        if ((abstractC7878q2.f37672c & 1024) != 0) {
                                            i15++;
                                            c4640e = c4640e;
                                            if (i15 == 1) {
                                                abstractC7642nM14545f = abstractC7878q2;
                                            } else {
                                                if (c4640e == 0) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7642nM14545f != 0) {
                                                    c4640e.m9506b(abstractC7642nM14545f);
                                                    abstractC7642nM14545f = bool;
                                                }
                                                c4640e.m9506b(abstractC7878q2);
                                            }
                                        }
                                        abstractC7878q2 = abstractC7878q2.f37675f;
                                        abstractC7642nM14545f = abstractC7642nM14545f;
                                        c4640e = c4640e;
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                    }
                }
                g0VarM14563x = g0VarM14563x.m14609v();
                r32 = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? bool : (x1) c4535g.f22541e;
            }
            bool2 = bool;
        }
        if (bool2 != null && !bool2.equals(e0Var)) {
            zBooleanValue = ((Boolean) c0566x.invoke(bool2)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* renamed from: f */
    public final boolean m1747f(int i10) {
        C4168z c4168z = new C4168z();
        c4168z.f21164a = Boolean.FALSE;
        this.f3943h.getClass();
        e0 e0Var = this.f3947l;
        Boolean boolM1746e = m1746e(i10, (C0848c) this.f3939d.invoke(), new C0583o(c4168z, i10, 0));
        Boolean bool = Boolean.TRUE;
        if (!AbstractC4154l.m8918a(boolM1746e, bool) || e0Var == this.f3947l) {
            if (boolM1746e != null && c4168z.f21164a != null) {
                if (!boolM1746e.equals(bool) || !AbstractC4154l.m8918a(c4168z.f21164a, bool)) {
                    if (i10 != 1 && i10 != 2) {
                        if (((Boolean) this.f3937b.invoke(new C0572d(i10))).booleanValue()) {
                        }
                    } else if (m1744c(i10, false, false)) {
                        Boolean boolM1746e2 = m1746e(i10, null, new C0584p(i10, 0));
                        if (boolM1746e2 != null ? boolM1746e2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m1748g(e0 e0Var) {
        v3.g0 g0VarM14563x;
        C1583k c1583kM14611x;
        v3.g0 g0VarM14563x2;
        C1583k c1583kM14611x2;
        e0 e0Var2 = this.f3947l;
        this.f3947l = e0Var;
        e1.e0 e0Var3 = this.f3946k;
        Object[] objArr = e0Var3.f8956a;
        int i10 = e0Var3.f8957b;
        for (int i11 = 0; i11 < i10; i11++) {
            C8279c c8279c = (C8279c) ((InterfaceC0577i) objArr[i11]);
            c8279c.getClass();
            if (e0Var2 != null && (g0VarM14563x2 = AbstractC7634f.m14563x(e0Var2)) != null && (c1583kM14611x2 = g0VarM14563x2.m14611x()) != null && c1583kM14611x2.f7868a.m5569b(C1582j.f7848g)) {
                c8279c.f39803a.m1924g(c8279c.f39805c, g0VarM14563x2.f36843b);
            }
            if (e0Var != null && (g0VarM14563x = AbstractC7634f.m14563x(e0Var)) != null && (c1583kM14611x = g0VarM14563x.m14611x()) != null && c1583kM14611x.f7868a.m5569b(C1582j.f7848g)) {
                int i12 = g0VarM14563x.f36843b;
                c8279c.f39806d.f9178a.m1644n(i12, new C8278b(c8279c, i12));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r3 = r4.m5525b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r4.f8935e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (((r4.f8931a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r3 = r4.f8933c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        if (java.lang.Long.compare((r4.f8934d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
    
        r3 = r4.f8931a;
        r8 = r4.f8933c;
        r9 = r4.f8932b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0111, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = rw.AbstractC6662l.m12734x(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0132, code lost:
    
        if (r5 == r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0134, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0141, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0143, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
    
        if (r13 == 254) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.m5525b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016a, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018a, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018d, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019e, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a0, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c4, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ed, code lost:
    
        r33 = r7;
        r4.f8935e = e1.r0.m5608a(r4.f8933c) - r4.f8934d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fe, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0200, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0205, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0208, code lost:
    
        r3 = e1.r0.m5610c(r4.f8933c);
        r5 = r4.f8931a;
        r6 = r4.f8932b;
        r7 = r4.f8933c;
        r4.m5526c(r3);
        r3 = r4.f8931a;
        r8 = r4.f8932b;
        r9 = r4.f8933c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021f, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022e, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0230, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.m5525b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026e, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0274, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027d, code lost:
    
        r3 = r4.m5525b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0281, code lost:
    
        r32 = r3;
        r4.f8934d++;
        r3 = r4.f8935e;
        r5 = r4.f8931a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029b, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029d, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029f, code lost:
    
        r4.f8935e = r3 - r21;
        r3 = r4.f8933c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0349, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x034b, code lost:
    
        r11 = -1;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1749h(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0585q.m1749h(android.view.KeyEvent):boolean");
    }
}
