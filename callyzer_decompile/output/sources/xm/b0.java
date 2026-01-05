package xm;

import androidx.recyclerview.widget.RecyclerView;
import b6.C0602c;
import fn.C2336i;
import hn.C2987d;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import y7.C8566a;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a */
    public Object f40147a;

    /* renamed from: b */
    public Object f40148b;

    /* renamed from: c */
    public Object f40149c;

    /* renamed from: d */
    public Object f40150d;

    /* renamed from: e */
    public Object f40151e;

    public b0(C2336i dataStoreSource, gn.x2 localDataSource, C2987d remoteDataSource, C8805t c8805t, C8810d c8810d) {
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        this.f40150d = remoteDataSource;
        this.f40147a = localDataSource;
        this.f40148b = dataStoreSource;
        this.f40149c = c8805t;
        this.f40151e = c8810d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r14 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15555a(xm.b0 r12, java.lang.String r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15555a(xm.b0, java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public boolean m15556b(int i10) {
        ArrayList arrayList = (ArrayList) this.f40147a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C8566a c8566a = (C8566a) arrayList.get(i11);
            int i12 = c8566a.f41562a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = c8566a.f41563b;
                    int i14 = c8566a.f41564c + i13;
                    while (i13 < i14) {
                        if (m15563i(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m15563i(c8566a.f41564c, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m15557c() {
        ug.g1 g1Var = (ug.g1) this.f40148b;
        ArrayList arrayList = (ArrayList) this.f40147a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ug.g1) this.f40148b).m13927r((C8566a) arrayList.get(i10));
        }
        m15569o(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f40151e;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C8566a c8566a = (C8566a) arrayList2.get(i11);
            int i12 = c8566a.f41562a;
            if (i12 == 1) {
                g1Var.m13927r(c8566a);
                g1Var.m13933y(c8566a.f41563b, c8566a.f41564c);
            } else if (i12 == 2) {
                g1Var.m13927r(c8566a);
                int i13 = c8566a.f41563b;
                int i14 = c8566a.f41564c;
                RecyclerView recyclerView = (RecyclerView) g1Var.f35448a;
                recyclerView.m1330N(i13, i14, true);
                recyclerView.f43702l1 = true;
                recyclerView.f43699i1.f41753c += i14;
            } else if (i12 == 4) {
                g1Var.m13927r(c8566a);
                g1Var.m13932x(c8566a.f41563b, c8566a.f41564c);
            } else if (i12 == 8) {
                g1Var.m13927r(c8566a);
                g1Var.m13934z(c8566a.f41563b, c8566a.f41564c);
            }
        }
        m15569o(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15558d(java.lang.String r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xm.t3
            if (r0 == 0) goto L13
            r0 = r6
            xm.t3 r0 = (xm.t3) r0
            int r1 = r0.f40864c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40864c = r1
            goto L18
        L13:
            xm.t3 r0 = new xm.t3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40862a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40864c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            java.lang.Object r6 = r4.f40147a
            gn.x2 r6 = (gn.x2) r6
            r0.f40864c = r3
            java.lang.Object r6 = r6.m6690j(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L52
            java.lang.Object r5 = r4.f40151e
            xm.q4 r5 = (xm.q4) r5
            im.p1 r0 = im.p1.MESSAGE_TEMPLATE_DATA_UPDATE
            qt.c r1 = qt.EnumC6308c.UpdateMessageTemplateData
            r5.m15601a(r0, r1)
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15558d(java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: e */
    public void m15559e(C8566a c8566a) {
        int i10;
        C0602c c0602c = (C0602c) this.f40150d;
        int i11 = c8566a.f41562a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM15571q = m15571q(c8566a.f41563b, i11);
        int i12 = c8566a.f41563b;
        int i13 = c8566a.f41562a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c8566a);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < c8566a.f41564c; i15++) {
            int iM15571q2 = m15571q((i10 * i15) + c8566a.f41563b, c8566a.f41562a);
            int i16 = c8566a.f41562a;
            if (i16 == 2 ? iM15571q2 != iM15571q : !(i16 == 4 && iM15571q2 == iM15571q + 1)) {
                C8566a c8566aM15567m = m15567m(i16, iM15571q, i14);
                m15560f(c8566aM15567m, i12);
                c0602c.mo1765d(c8566aM15567m);
                if (c8566a.f41562a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iM15571q = iM15571q2;
            } else {
                i14++;
            }
        }
        c0602c.mo1765d(c8566a);
        if (i14 > 0) {
            C8566a c8566aM15567m2 = m15567m(c8566a.f41562a, iM15571q, i14);
            m15560f(c8566aM15567m2, i12);
            c0602c.mo1765d(c8566aM15567m2);
        }
    }

    /* renamed from: f */
    public void m15560f(C8566a c8566a, int i10) {
        ug.g1 g1Var = (ug.g1) this.f40148b;
        g1Var.m13927r(c8566a);
        int i11 = c8566a.f41562a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            g1Var.m13932x(i10, c8566a.f41564c);
        } else {
            int i12 = c8566a.f41564c;
            RecyclerView recyclerView = (RecyclerView) g1Var.f35448a;
            recyclerView.m1330N(i10, i12, true);
            recyclerView.f43702l1 = true;
            recyclerView.f43699i1.f41753c += i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (r1 == r4) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.websoptimization.callyzerbiz.data.model.request.message_template_request.FetchAllMessageTemplateRequest] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0128 -> B:41:0x0132). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ae -> B:26:0x00c1). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15561g(mm.C4802m r20, int r21, ww.AbstractC8193c r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15561g(mm.m, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15562h(mm.C4802m r11, ww.AbstractC8193c r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15562h(mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: i */
    public int m15563i(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f40147a;
        int size = arrayList.size();
        while (i11 < size) {
            C8566a c8566a = (C8566a) arrayList.get(i11);
            int i12 = c8566a.f41562a;
            if (i12 == 8) {
                int i13 = c8566a.f41563b;
                if (i13 == i10) {
                    i10 = c8566a.f41564c;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (c8566a.f41564c <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = c8566a.f41563b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = c8566a.f41564c;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += c8566a.f41564c;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        if (r2 != r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15564j(java.lang.String r19, mm.C4802m r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15564j(java.lang.String, mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public boolean m15565k() {
        return ((ArrayList) this.f40151e).size() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02db, code lost:
    
        if (r12 != r5) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02de, code lost:
    
        if (r1 != r5) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r1 == r5) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c9 -> B:119:0x02e2). Please report as a decompilation issue!!! */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15566l(ww.AbstractC8193c r44) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15566l(ww.c):java.lang.Object");
    }

    /* renamed from: m */
    public C8566a m15567m(int i10, int i11, int i12) {
        C8566a c8566a = (C8566a) ((C0602c) this.f40150d).mo1762a();
        if (c8566a != null) {
            c8566a.f41562a = i10;
            c8566a.f41563b = i11;
            c8566a.f41564c = i12;
            return c8566a;
        }
        C8566a c8566a2 = new C8566a();
        c8566a2.f41562a = i10;
        c8566a2.f41563b = i11;
        c8566a2.f41564c = i12;
        return c8566a2;
    }

    /* renamed from: n */
    public void m15568n(C8566a c8566a) {
        ug.g1 g1Var = (ug.g1) this.f40148b;
        ((ArrayList) this.f40147a).add(c8566a);
        int i10 = c8566a.f41562a;
        if (i10 == 1) {
            g1Var.m13933y(c8566a.f41563b, c8566a.f41564c);
            return;
        }
        if (i10 == 2) {
            int i11 = c8566a.f41563b;
            int i12 = c8566a.f41564c;
            RecyclerView recyclerView = (RecyclerView) g1Var.f35448a;
            recyclerView.m1330N(i11, i12, false);
            recyclerView.f43702l1 = true;
            return;
        }
        if (i10 == 4) {
            g1Var.m13932x(c8566a.f41563b, c8566a.f41564c);
        } else if (i10 == 8) {
            g1Var.m13934z(c8566a.f41563b, c8566a.f41564c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c8566a);
        }
    }

    /* renamed from: o */
    public void m15569o(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8566a c8566a = (C8566a) arrayList.get(i10);
            c8566a.getClass();
            ((C0602c) this.f40150d).mo1765d(c8566a);
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (r13 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[PHI: r12
      0x00e4: PHI (r12v5 java.util.List) = (r12v4 java.util.List), (r12v4 java.util.List), (r12v11 java.util.List) binds: [B:29:0x00d5, B:31:0x00e1, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15570p(java.util.ArrayList r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15570p(java.util.ArrayList, ww.c):java.lang.Object");
    }

    /* renamed from: q */
    public int m15571q(int i10, int i11) {
        int i12;
        int i13;
        C0602c c0602c = (C0602c) this.f40150d;
        ArrayList arrayList = (ArrayList) this.f40147a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C8566a c8566a = (C8566a) arrayList.get(size);
            int i14 = c8566a.f41562a;
            if (i14 == 8) {
                int i15 = c8566a.f41563b;
                int i16 = c8566a.f41564c;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            c8566a.f41563b = i15 + 1;
                            c8566a.f41564c = i16 + 1;
                        } else if (i11 == 2) {
                            c8566a.f41563b = i15 - 1;
                            c8566a.f41564c = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        c8566a.f41564c = i16 + 1;
                    } else if (i11 == 2) {
                        c8566a.f41564c = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        c8566a.f41563b = i15 + 1;
                    } else if (i11 == 2) {
                        c8566a.f41563b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = c8566a.f41563b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= c8566a.f41564c;
                    } else if (i14 == 2) {
                        i10 += c8566a.f41564c;
                    }
                } else if (i11 == 1) {
                    c8566a.f41563b = i17 + 1;
                } else if (i11 == 2) {
                    c8566a.f41563b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C8566a c8566a2 = (C8566a) arrayList.get(size2);
            if (c8566a2.f41562a == 8) {
                int i18 = c8566a2.f41564c;
                if (i18 == c8566a2.f41563b || i18 < 0) {
                    arrayList.remove(size2);
                    c0602c.mo1765d(c8566a2);
                }
            } else if (c8566a2.f41564c <= 0) {
                arrayList.remove(size2);
                c0602c.mo1765d(c8566a2);
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x014d, code lost:
    
        if (r2.f0(r14, r3) == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0165, code lost:
    
        if (r2.f0(r14, r3) == r4) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0151 -> B:51:0x0168). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0165 -> B:51:0x0168). Please report as a decompilation issue!!! */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15572r(com.websoptimization.callyzerbiz.data.model.response.message_template.FetchAllMessageTemplateResponse r22, ww.AbstractC8193c r23) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15572r(com.websoptimization.callyzerbiz.data.model.response.message_template.FetchAllMessageTemplateResponse, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m15573s(rt.C6621e r11, boolean r12, ww.AbstractC8193c r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f40147a
            gn.x2 r0 = (gn.x2) r0
            boolean r1 = r13 instanceof xm.z3
            if (r1 == 0) goto L17
            r1 = r13
            xm.z3 r1 = (xm.z3) r1
            int r2 = r1.f41097e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f41097e = r2
            goto L1c
        L17:
            xm.z3 r1 = new xm.z3
            r1.<init>(r10, r13)
        L1c:
            java.lang.Object r13 = r1.f41095c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f41097e
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L51
            if (r3 == r7) goto L4d
            if (r3 == r6) goto L45
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            og.od.m10798c(r13)
            return r13
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            boolean r11 = r1.f41094b
            rt.e r12 = r1.f41093a
            og.od.m10798c(r13)
            goto La2
        L45:
            boolean r12 = r1.f41094b
            rt.e r11 = r1.f41093a
            og.od.m10798c(r13)
            goto L75
        L4d:
            og.od.m10798c(r13)
            return r13
        L51:
            og.od.m10798c(r13)
            if (r12 != 0) goto L64
            r1.f41093a = r8
            r1.f41094b = r12
            r1.f41097e = r7
            java.lang.Object r11 = r0.f0(r11, r1)
            if (r11 != r2) goto L63
            goto Lb6
        L63:
            return r11
        L64:
            qm.b r13 = r11.f31806a
            java.lang.String r13 = r13.f30279e
            r1.f41093a = r11
            r1.f41094b = r12
            r1.f41097e = r6
            java.lang.Object r13 = r0.m6663I(r13, r1)
            if (r13 != r2) goto L75
            goto Lb6
        L75:
            java.lang.String r13 = (java.lang.String) r13
            qm.b r3 = r11.f31806a
            j$.time.LocalDateTime r3 = r3.f30278d
            if (r3 == 0) goto L84
            yv.o r6 = yv.C8800o.f42459a
            java.lang.String r3 = yv.C8800o.m16212u(r3)
            goto L85
        L84:
            r3 = r8
        L85:
            boolean r13 = kotlin.jvm.internal.AbstractC4154l.m8918a(r13, r3)
            if (r13 == 0) goto L8e
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L8e:
            qm.b r13 = r11.f31806a
            java.lang.String r13 = r13.f30279e
            r1.f41093a = r11
            r1.f41094b = r12
            r1.f41097e = r5
            java.lang.Object r13 = r0.m6690j(r13, r1)
            if (r13 != r2) goto L9f
            goto Lb6
        L9f:
            r9 = r12
            r12 = r11
            r11 = r9
        La2:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lb8
            r1.f41093a = r8
            r1.f41094b = r11
            r1.f41097e = r4
            java.lang.Object r11 = r0.f0(r12, r1)
            if (r11 != r2) goto Lb7
        Lb6:
            return r2
        Lb7:
            return r11
        Lb8:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.b0.m15573s(rt.e, boolean, ww.c):java.lang.Object");
    }

    public b0(gn.x2 localDataSource, C2336i dataStoreSource, C2987d remoteDataSource, q4 sessionConfigurationRepository, C8805t c8805t) {
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        AbstractC4154l.m8923f(sessionConfigurationRepository, "sessionConfigurationRepository");
        this.f40147a = localDataSource;
        this.f40148b = dataStoreSource;
        this.f40150d = remoteDataSource;
        this.f40151e = sessionConfigurationRepository;
        this.f40149c = c8805t;
    }
}
