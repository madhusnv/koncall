package q6;

import android.content.Context;
import ex.InterfaceC2137a;
import java.util.Set;
import lu.C4525k;
import mq.z0;
import og.nd;
import qw.C6366p;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q6.c */
/* loaded from: classes.dex */
public final class C6131c {

    /* renamed from: a */
    public final C4525k f29881a;

    /* renamed from: b */
    public final z0 f29882b;

    /* renamed from: c */
    public final Context f29883c;

    /* renamed from: d */
    public final String f29884d;

    /* renamed from: e */
    public final C6366p f29885e;

    /* renamed from: f */
    public final Set f29886f;

    public C6131c(InterfaceC2137a interfaceC2137a, Set set, C4525k c4525k, z0 z0Var, Context context, String str) {
        this.f29881a = c4525k;
        this.f29882b = z0Var;
        this.f29883c = context;
        this.f29884d = str;
        this.f29885e = nd.m10782c(interfaceC2137a);
        this.f29886f = set == AbstractC6132d.f29887a ? null : AbstractC6663m.f0(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12162a(java.lang.Object r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q6.C6130b
            if (r0 == 0) goto L13
            r0 = r6
            q6.b r0 = (q6.C6130b) r0
            int r1 = r0.f29880d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29880d = r1
            goto L18
        L13:
            q6.b r0 = new q6.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f29878b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f29880d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            q6.c r5 = r0.f29877a
            og.od.m10798c(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f29877a = r4
            r0.f29880d = r3
            lu.k r6 = r4.f29881a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            java.util.Set r6 = r5.f29886f
            qw.p r5 = r5.f29885e
            r0 = 0
            if (r6 != 0) goto L6c
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6a
            goto L98
        L6a:
            r3 = r0
            goto L98
        L6c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6a
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L86
        L98:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.C6131c.m12162a(java.lang.Object, ww.c):java.lang.Object");
    }
}
