package xm;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import fn.C2336i;
import hn.C2987d;
import kotlin.jvm.internal.AbstractC4154l;
import um.C7474a;
import vt.C7773d;
import vt.C7774e;
import vw.EnumC7794a;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j4 {

    /* renamed from: f */
    public static final wx.b1 f40458f;

    /* renamed from: g */
    public static final wx.b1 f40459g;

    /* renamed from: a */
    public final gn.x2 f40460a;

    /* renamed from: b */
    public final C2336i f40461b;

    /* renamed from: c */
    public final C2987d f40462c;

    /* renamed from: d */
    public final Context f40463d;

    /* renamed from: e */
    public final C8805t f40464e;

    static {
        wx.b1 b1VarM15371b = wx.c1.m15371b(0, 1, null, 4);
        f40458f = b1VarM15371b;
        f40459g = b1VarM15371b;
    }

    public j4(gn.x2 localDataSource, C2336i dataStoreSource, C2987d remoteDataSource, Context context, C8805t c8805t) {
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        this.f40460a = localDataSource;
        this.f40461b = dataStoreSource;
        this.f40462c = remoteDataSource;
        this.f40463d = context;
        this.f40464e = c8805t;
    }

    /* renamed from: e */
    public static Object m15578e(String str, g4 g4Var) throws Throwable {
        Object objEmit = f40458f.emit(new C7774e(false, str), g4Var);
        return objEmit == EnumC7794a.COROUTINE_SUSPENDED ? objEmit : qw.a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15579a(java.util.ArrayList r18, java.lang.String r19, mm.C4802m r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.j4.m15579a(java.util.ArrayList, java.lang.String, mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15580b(java.lang.String r11, ww.AbstractC8193c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof xm.f4
            if (r0 == 0) goto L13
            r0 = r12
            xm.f4 r0 = (xm.f4) r0
            int r1 = r0.f40299e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40299e = r1
            goto L18
        L13:
            xm.f4 r0 = new xm.f4
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f40297c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40299e
            qw.a0 r3 = qw.a0.f30746a
            gn.x2 r4 = r10.f40460a
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L46
            if (r2 == r8) goto L40
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            og.od.m10798c(r12)
            return r3
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            java.lang.String r11 = r0.f40296b
            og.od.m10798c(r12)
            goto L66
        L40:
            java.lang.String r11 = r0.f40295a
            og.od.m10798c(r12)
            goto L54
        L46:
            og.od.m10798c(r12)
            r0.f40295a = r11
            r0.f40299e = r8
            java.lang.Object r12 = r4.m6706z(r11, r0)
            if (r12 != r1) goto L54
            goto L81
        L54:
            java.lang.String r12 = (java.lang.String) r12
            r0.f40295a = r7
            r0.f40296b = r12
            r0.f40299e = r6
            java.lang.Object r11 = r4.m6691k(r11, r0)
            if (r11 != r1) goto L63
            goto L81
        L63:
            r9 = r12
            r12 = r11
            r11 = r9
        L66:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L82
            vt.e r12 = new vt.e
            r12.<init>(r8, r11)
            r0.f40295a = r7
            r0.f40296b = r7
            r0.f40299e = r5
            wx.b1 r11 = xm.j4.f40458f
            java.lang.Object r11 = r11.emit(r12, r0)
            if (r11 != r1) goto L82
        L81:
            return r1
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.j4.m15580b(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15581c(java.lang.String r9, java.lang.String r10, mm.C4802m r11, ww.AbstractC8193c r12) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.j4.m15581c(java.lang.String, java.lang.String, mm.m, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public final Object m15582d(e4 e4Var) throws Throwable {
        String string = this.f40463d.getString(R.string.google_chrome);
        AbstractC4154l.m8922e(string, "getString(...)");
        Object objEmit = f40458f.emit(new C7773d(new C7474a(false, string)), e4Var);
        return objEmit == EnumC7794a.COROUTINE_SUSPENDED ? objEmit : qw.a0.f30746a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (xm.j4.f40458f.emit(r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15583f(java.util.ArrayList r11, mm.C4802m r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.j4.m15583f(java.util.ArrayList, mm.m, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r14 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r3.m6691k(r14, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ab -> B:31:0x00ae). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15584g(java.util.Set r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.j4.m15584g(java.util.Set, ww.c):java.lang.Object");
    }
}
