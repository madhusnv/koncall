package androidx.compose.foundation.lazy.layout;

import b2.C0554l;
import com.sun.mail.util.AbstractC1452a;
import e1.j0;
import e1.k0;
import e1.r0;
import e1.t0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import s1.C6723r;
import s1.InterfaceC6730y;
import v3.a1;
import w2.AbstractC7878q;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.lazy.layout.b */
/* loaded from: classes.dex */
public final class C0248b {

    /* renamed from: a */
    public final j0 f1988a;

    /* renamed from: b */
    public C0554l f1989b;

    /* renamed from: c */
    public final k0 f1990c;

    /* renamed from: d */
    public final ArrayList f1991d;

    /* renamed from: e */
    public final ArrayList f1992e;

    /* renamed from: f */
    public final ArrayList f1993f;

    /* renamed from: g */
    public final ArrayList f1994g;

    /* renamed from: h */
    public final ArrayList f1995h;

    /* renamed from: i */
    public final InterfaceC7879r f1996i;

    public C0248b() {
        long[] jArr = r0.f9045a;
        this.f1988a = new j0();
        int i10 = t0.f9058a;
        this.f1990c = new k0();
        this.f1991d = new ArrayList();
        this.f1992e = new ArrayList();
        this.f1993f = new ArrayList();
        this.f1994g = new ArrayList();
        this.f1995h = new ArrayList();
        this.f1996i = new a1(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a */
            public final C0248b f1982a;

            {
                this.f1982a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && AbstractC4154l.m8918a(this.f1982a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f1982a);
            }

            @Override // v3.a1
            /* renamed from: h */
            public final AbstractC7878q mo621h() {
                C6723r c6723r = new C6723r();
                c6723r.f32122q = this.f1982a;
                return c6723r;
            }

            public final int hashCode() {
                return this.f1982a.hashCode();
            }

            @Override // v3.a1
            /* renamed from: i */
            public final void mo622i(AbstractC7878q abstractC7878q) {
                C6723r c6723r = (C6723r) abstractC7878q;
                C0248b c0248b = c6723r.f32122q;
                C0248b c0248b2 = this.f1982a;
                if (AbstractC4154l.m8918a(c0248b, c0248b2) || !c6723r.f37670a.f37683p) {
                    return;
                }
                C0248b c0248b3 = c6723r.f32122q;
                c0248b3.m695d();
                c0248b3.f1989b = null;
                c6723r.f32122q = c0248b2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f1982a + ')';
            }
        };
    }

    /* renamed from: e */
    public static int m691e(int[] iArr, InterfaceC6730y interfaceC6730y) {
        int iMo12122j = interfaceC6730y.mo12122j();
        int iMo12116d = interfaceC6730y.mo12116d() + iMo12122j;
        int iMax = 0;
        while (iMo12122j < iMo12116d) {
            int iMo12114b = interfaceC6730y.mo12114b() + iArr[iMo12122j];
            iArr[iMo12122j] = iMo12114b;
            iMax = Math.max(iMax, iMo12114b);
            iMo12122j++;
        }
        return iMax;
    }

    /* renamed from: a */
    public final void m692a(int i10, Object obj) {
        AbstractC1452a.m4578y(this.f1988a.m5574g(obj));
    }

    /* renamed from: b */
    public final long m693b() {
        ArrayList arrayList = this.f1995h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        AbstractC1452a.m4578y(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m694c(int r27, int r28, java.util.ArrayList r29, b2.C0554l r30, s1.a0 r31, boolean r32, int r33, boolean r34, int r35, int r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0248b.m694c(int, int, java.util.ArrayList, b2.l, s1.a0, boolean, int, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m695d() {
        /*
            r15 = this;
            e1.j0 r0 = r15.f1988a
            int r1 = r0.f9002e
            if (r1 == 0) goto L4e
            java.lang.Object[] r1 = r0.f9000c
            long[] r2 = r0.f8998a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L4b
            r4 = 0
            r5 = r4
        L11:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L46
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2b:
            if (r10 >= r8) goto L44
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L3a
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2b
        L3a:
            int r0 = r5 << 3
            int r0 = r0 + r10
            r0 = r1[r0]
            com.sun.mail.util.AbstractC1452a.m4578y(r0)
            r0 = 0
            throw r0
        L44:
            if (r8 != r9) goto L4b
        L46:
            if (r5 == r3) goto L4b
            int r5 = r5 + 1
            goto L11
        L4b:
            r0.m5568a()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0248b.m695d():void");
    }
}
