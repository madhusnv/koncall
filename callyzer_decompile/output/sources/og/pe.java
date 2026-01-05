package og;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import d9.ExecutorC1668m;
import dr.C1770t;
import ex.InterfaceC2139c;
import f8.C2208c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.RejectedExecutionException;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4433g;
import nx.AbstractC5185w;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.AbstractC5939t;
import rw.AbstractC6662l;
import rw.C6660j;
import rw.C6668r;
import sw.C6957a;
import sw.C6959c;
import tx.C7251k;
import uw.InterfaceC7559c;
import uw.InterfaceC7561e;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import yt.C8769a;
import yx.C8810d;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class pe {
    /* renamed from: a */
    public static ArrayList m10826a(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C6660j(objArr, true));
    }

    /* renamed from: b */
    public static int m10827b(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        AbstractC4154l.m8923f(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(size, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(i0.m0.m7377j(size, size2, "toIndex (", ") is greater than size (", ")."));
        }
        int i10 = size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int iM11866a = AbstractC5939t.m11866a((Comparable) arrayList.get(i12), comparable);
            if (iM11866a < 0) {
                i11 = i12 + 1;
            } else {
                if (iM11866a <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* renamed from: c */
    public static C6959c m10828c(C6959c c6959c) {
        c6959c.m13223s();
        c6959c.f33702c = true;
        return c6959c.f33701b > 0 ? c6959c : C6959c.f33699d;
    }

    /* renamed from: d */
    public static C6959c m10829d() {
        return new C6959c(10);
    }

    /* renamed from: e */
    public static final void m10830e(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        C6959c c6959cM10829d = m10829d();
        InterfaceC4026c interfaceC4026cY0 = connection.y0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC4026cY0.r0()) {
            try {
                c6959cM10829d.add(interfaceC4026cY0.mo1777W(0));
            } finally {
            }
        }
        mb.m10760a(interfaceC4026cY0, null);
        ListIterator listIterator = m10828c(c6959cM10829d).listIterator(0);
        while (true) {
            C6957a c6957a = (C6957a) listIterator;
            if (!c6957a.hasNext()) {
                return;
            }
            String str = (String) c6957a.next();
            if (AbstractC5185w.m10138t(str, "room_fts_content_sync_", false)) {
                pg.a9.m11538a(connection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    /* renamed from: f */
    public static final InterfaceC7564h m10831f(AbstractC8894w abstractC8894w, boolean z6, AbstractC8193c abstractC8193c) {
        if (!abstractC8894w.m16393p()) {
            return ((C8810d) abstractC8894w.m16390i()).f42488a;
        }
        z7.c0 c0Var = (z7.c0) abstractC8193c.getContext().o0(z7.c0.f42717c);
        if (c0Var != null) {
            InterfaceC7561e interfaceC7561e = c0Var.f42718a;
            C8810d c8810d = abstractC8894w.f42831a;
            if (c8810d == null) {
                AbstractC4154l.m8928k("coroutineScope");
                throw null;
            }
            InterfaceC7564h interfaceC7564hT0 = c8810d.f42488a.t0(interfaceC7561e);
            if (interfaceC7564hT0 != null) {
                return interfaceC7564hT0;
            }
        }
        if (z6) {
            InterfaceC7564h interfaceC7564h = abstractC8894w.f42832b;
            if (interfaceC7564h != null) {
                return interfaceC7564h;
            }
            AbstractC4154l.m8928k("transactionContext");
            throw null;
        }
        C8810d c8810d2 = abstractC8894w.f42831a;
        if (c8810d2 != null) {
            return c8810d2.f42488a;
        }
        AbstractC4154l.m8928k("coroutineScope");
        throw null;
    }

    /* renamed from: g */
    public static int m10832g(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: h */
    public static List m10833h(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC4154l.m8922e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* renamed from: i */
    public static List m10834i(Object... elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return elements.length > 0 ? AbstractC6662l.m12711a(elements) : C6668r.f31943a;
    }

    /* renamed from: j */
    public static ArrayList m10835j(Object... elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C6660j(elements, true));
    }

    /* renamed from: k */
    public static final List m10836k(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m10833h(list.get(0)) : C6668r.f31943a;
    }

    /* renamed from: l */
    public static final Object m10837l(AbstractC8894w db2, boolean z6, boolean z10, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(db2, "db");
        db2.m16387a();
        db2.m16388b();
        return a1.m10523a(new C2208c(db2, z10, z6, interfaceC2139c, (InterfaceC7559c) null));
    }

    /* renamed from: m */
    public static final Object m10838m(AbstractC8894w abstractC8894w, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        ExecutorC1668m executorC1668m;
        InterfaceC7559c interfaceC7559c2 = null;
        if (!abstractC8894w.m16393p()) {
            return tx.c0.m13475K(((C8810d) abstractC8894w.m16390i()).f42488a, new C1770t(abstractC8894w, interfaceC2139c, (InterfaceC7559c) null), interfaceC7559c);
        }
        C8769a c8769a = new C8769a(new an.b3(abstractC8894w, interfaceC2139c, null), interfaceC7559c2, 4);
        z7.c0 c0Var = (z7.c0) interfaceC7559c.getContext().o0(z7.c0.f42717c);
        InterfaceC7561e interfaceC7561e = c0Var != null ? c0Var.f42718a : null;
        if (interfaceC7561e != null) {
            return tx.c0.m13475K(interfaceC7561e, c8769a, interfaceC7559c);
        }
        InterfaceC7564h context = interfaceC7559c.getContext();
        C7251k c7251k = new C7251k(1, pg.n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        try {
            executorC1668m = abstractC8894w.f42834d;
        } catch (RejectedExecutionException e2) {
            c7251k.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        if (executorC1668m == null) {
            AbstractC4154l.m8928k("internalTransactionExecutor");
            throw null;
        }
        executorC1668m.execute(new c6.b1(context, c7251k, abstractC8894w, c8769a, 13));
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10839n(uw.InterfaceC7559c r14, z7.AbstractC8894w r15, boolean r16, boolean r17, ex.InterfaceC2139c r18) {
        /*
            boolean r0 = r14 instanceof f8.C2211f
            if (r0 == 0) goto L14
            r0 = r14
            f8.f r0 = (f8.C2211f) r0
            int r1 = r0.f10167f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f10167f = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            f8.f r0 = new f8.f
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.f10166e
            vw.a r7 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r14.f10167f
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L4b
            if (r1 == r8) goto L47
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            og.od.m10798c(r0)
            return r0
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L37:
            boolean r1 = r14.f10165d
            boolean r3 = r14.f10164c
            ex.c r4 = r14.f10163b
            z7.w r5 = r14.f10162a
            og.od.m10798c(r0)
            r12 = r1
            r11 = r3
            r13 = r4
            r10 = r5
            goto L96
        L47:
            og.od.m10798c(r0)
            return r0
        L4b:
            og.od.m10798c(r0)
            boolean r0 = r15.m16393p()
            if (r0 == 0) goto L7a
            boolean r0 = r15.m16397t()
            if (r0 == 0) goto L7a
            boolean r0 = r15.m16394q()
            if (r0 == 0) goto L7a
            f8.b r0 = new f8.b
            r4 = 0
            r6 = 1
            r3 = r15
            r2 = r16
            r1 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r14.f10167f = r8
            java.lang.Object r14 = r15.m16400w(r1, r2, r14)
            if (r14 != r7) goto L79
            goto Lab
        L79:
            return r14
        L7a:
            r1 = r16
            r4 = r17
            r14.f10162a = r15
            r5 = r18
            r14.f10163b = r5
            r14.f10164c = r1
            r14.f10165d = r4
            r14.f10167f = r3
            uw.h r3 = m10831f(r15, r4, r14)
            if (r3 != r7) goto L91
            goto Lab
        L91:
            r10 = r15
            r11 = r1
            r0 = r3
            r12 = r4
            r13 = r5
        L96:
            uw.h r0 = (uw.InterfaceC7564h) r0
            f8.c r8 = new f8.c
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r1 = 0
            r14.f10162a = r1
            r14.f10163b = r1
            r14.f10167f = r2
            java.lang.Object r14 = tx.c0.m13475K(r0, r8, r14)
            if (r14 != r7) goto Lac
        Lab:
            return r7
        Lac:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: og.pe.m10839n(uw.c, z7.w, boolean, boolean, ex.c):java.lang.Object");
    }

    /* renamed from: o */
    public static final Cursor m10840o(AbstractC8894w db2, InterfaceC4433g interfaceC4433g, boolean z6) {
        AbstractC4154l.m8923f(db2, "db");
        db2.m16387a();
        db2.m16388b();
        Cursor cursorQ0 = db2.m16392k().mo9273O().q0(interfaceC4433g);
        if (z6 && (cursorQ0 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQ0;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorQ0.getColumnNames(), cursorQ0.getCount());
                    while (cursorQ0.moveToNext()) {
                        Object[] objArr = new Object[cursorQ0.getColumnCount()];
                        int columnCount = cursorQ0.getColumnCount();
                        for (int i10 = 0; i10 < columnCount; i10++) {
                            int type = cursorQ0.getType(i10);
                            if (type == 0) {
                                objArr[i10] = null;
                            } else if (type == 1) {
                                objArr[i10] = Long.valueOf(cursorQ0.getLong(i10));
                            } else if (type == 2) {
                                objArr[i10] = Double.valueOf(cursorQ0.getDouble(i10));
                            } else if (type == 3) {
                                objArr[i10] = cursorQ0.getString(i10);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i10] = cursorQ0.getBlob(i10);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    cursorQ0.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorQ0;
    }

    /* renamed from: p */
    public static void m10841p() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: q */
    public static void m10842q() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
