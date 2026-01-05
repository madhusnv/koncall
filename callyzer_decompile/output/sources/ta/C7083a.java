package ta;

import ac.C0088a;
import dc.InterfaceC1681a;
import ea.C1973c;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import l4.C4367l;
import og.nd;
import og.pe;
import qw.C6366p;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import sq.n2;
import ud.C7410n;
import ud.InterfaceC7411o;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ta.a */
/* loaded from: classes.dex */
public final class C7083a implements Closeable, InterfaceC1681a {

    /* renamed from: a */
    public final InterfaceC1681a[] f34186a;

    /* renamed from: b */
    public final C4367l f34187b;

    public C7083a(InterfaceC7411o platformProvider, C4367l profile, int i10) {
        if ((i10 & 1) != 0) {
            InterfaceC7411o.f35200a.getClass();
            platformProvider = C7410n.f35199b;
        }
        C6366p c6366pM10782c = nd.m10782c(new n2(2));
        profile = (i10 & 4) != 0 ? new C4367l(new C1973c(platformProvider, null, 5)) : profile;
        AbstractC4154l.m8923f(platformProvider, "platformProvider");
        AbstractC4154l.m8923f(profile, "profile");
        this.f34186a = new InterfaceC1681a[]{new C7086d(), new C7084b(0, platformProvider), new C7084b(1, profile), new C7085c(c6366pM10782c, platformProvider)};
        this.f34187b = new C4367l(new C0088a(1, this, C7083a.class, "resolveRegion", "resolveRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:12:0x0033, B:26:0x0077, B:28:0x007b, B:29:0x0087, B:23:0x0064), top: B:37:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #0 {Exception -> 0x0037, blocks: (B:12:0x0033, B:26:0x0077, B:28:0x007b, B:29:0x0087, B:23:0x0064), top: B:37:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0074 -> B:26:0x0077). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13373j(ta.C7083a r10, uw.InterfaceC7559c r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof dc.C1682b
            if (r0 == 0) goto L16
            r0 = r11
            dc.b r0 = (dc.C1682b) r0
            int r1 = r0.f8228h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8228h = r1
            goto L1b
        L16:
            dc.b r0 = new dc.b
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f8226f
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f8228h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            int r10 = r0.f8225e
            int r2 = r0.f8224d
            dc.a r5 = r0.f8223c
            java.lang.Object[] r6 = r0.f8222b
            dc.a[] r6 = (dc.InterfaceC1681a[]) r6
            nd.g r7 = r0.f8221a
            og.od.m10798c(r11)     // Catch: java.lang.Exception -> L37
            goto L77
        L37:
            r11 = move-exception
            goto L91
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            og.od.m10798c(r11)
            uw.h r11 = r0.getContext()
            java.lang.Class<ta.a> r2 = ta.C7083a.class
            kotlin.jvm.internal.e r2 = kotlin.jvm.internal.a0.m8901a(r2)
            java.lang.String r2 = r2.m8913b()
            if (r2 == 0) goto L9f
            l4.l r11 = og.u1.m10949h(r11, r2)
            dc.a[] r10 = r10.f34186a
            int r2 = r10.length
            r5 = 0
            r6 = r10
            r7 = r11
            r10 = r2
            r2 = r5
        L60:
            if (r2 >= r10) goto L9d
            r5 = r6[r2]
            r0.f8221a = r7     // Catch: java.lang.Exception -> L37
            r0.f8222b = r6     // Catch: java.lang.Exception -> L37
            r0.f8223c = r5     // Catch: java.lang.Exception -> L37
            r0.f8224d = r2     // Catch: java.lang.Exception -> L37
            r0.f8225e = r10     // Catch: java.lang.Exception -> L37
            r0.f8228h = r3     // Catch: java.lang.Exception -> L37
            java.lang.Object r11 = r5.mo5383h(r0)     // Catch: java.lang.Exception -> L37
            if (r11 != r1) goto L77
            goto L9e
        L77:
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L37
            if (r11 == 0) goto L87
            bt.i0 r8 = new bt.i0     // Catch: java.lang.Exception -> L37
            r9 = 8
            r8.<init>(r9, r11, r5)     // Catch: java.lang.Exception -> L37
            r7.mo332i(r4, r8)     // Catch: java.lang.Exception -> L37
            r1 = r11
            goto L9e
        L87:
            aw.e r11 = new aw.e     // Catch: java.lang.Exception -> L37
            r8 = 7
            r11.<init>(r8, r5)     // Catch: java.lang.Exception -> L37
            r7.mo332i(r4, r11)     // Catch: java.lang.Exception -> L37
            goto L9b
        L91:
            bt.i0 r8 = new bt.i0
            r9 = 9
            r8.<init>(r9, r5, r11)
            r7.mo332i(r4, r8)
        L9b:
            int r2 = r2 + r3
            goto L60
        L9d:
            r1 = r4
        L9e:
            return r1
        L9f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "logger<T> cannot be used on an anonymous object"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.C7083a.m13373j(ta.a, uw.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        for (InterfaceC1681a interfaceC1681a : this.f34186a) {
            if (interfaceC1681a instanceof Closeable) {
                ((Closeable) interfaceC1681a).close();
            }
        }
    }

    @Override // dc.InterfaceC1681a
    /* renamed from: h */
    public final Object mo5383h(AbstractC8193c abstractC8193c) {
        return this.f34187b.m9139s(abstractC8193c);
    }

    public final String toString() {
        List listM10833h = pe.m10833h(this);
        InterfaceC1681a[] elements = this.f34186a;
        AbstractC4154l.m8923f(elements, "elements");
        ArrayList arrayList = new ArrayList(listM10833h.size() + elements.length);
        arrayList.addAll(listM10833h);
        arrayList.addAll(AbstractC6662l.m12711a(elements));
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(a0.m8901a(((InterfaceC1681a) obj).getClass()).m8914c());
        }
        return AbstractC6663m.m12748L(arrayList2, " -> ", null, null, null, 62);
    }
}
