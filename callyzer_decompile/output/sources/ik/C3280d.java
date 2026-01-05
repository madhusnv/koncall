package ik;

import dy.AbstractC1856d;
import dy.C1855c;
import fk.C2296b;
import fk.m1;
import kotlin.jvm.internal.AbstractC4154l;
import nx.C5176n;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import rj.InterfaceC6558d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.d */
/* loaded from: classes.dex */
public final class C3280d implements InterfaceC3292p {

    /* renamed from: g */
    public static final int f17482g;

    /* renamed from: h */
    public static final C5176n f17483h;

    /* renamed from: a */
    public final m1 f17484a;

    /* renamed from: b */
    public final InterfaceC6558d f17485b;

    /* renamed from: c */
    public final C2296b f17486c;

    /* renamed from: d */
    public final C3281e f17487d;

    /* renamed from: e */
    public final C3291o f17488e;

    /* renamed from: f */
    public final C1855c f17489f;

    static {
        int i10 = C5770a.f28335d;
        f17482g = (int) C5770a.m11302m(bb.m10551g(24, EnumC5772c.HOURS), EnumC5772c.SECONDS);
        f17483h = new C5176n("/");
    }

    public C3280d(m1 timeProvider, InterfaceC6558d firebaseInstallationsApi, C2296b appInfo, C3281e configsFetcher, C3291o settingsCache) {
        AbstractC4154l.m8923f(timeProvider, "timeProvider");
        AbstractC4154l.m8923f(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC4154l.m8923f(appInfo, "appInfo");
        AbstractC4154l.m8923f(configsFetcher, "configsFetcher");
        AbstractC4154l.m8923f(settingsCache, "settingsCache");
        this.f17484a = timeProvider;
        this.f17485b = firebaseInstallationsApi;
        this.f17486c = appInfo;
        this.f17487d = configsFetcher;
        this.f17488e = settingsCache;
        this.f17489f = AbstractC1856d.m5490a();
    }

    @Override // ik.InterfaceC3292p
    /* renamed from: a */
    public final Boolean mo7628a() {
        return this.f17488e.m7635a().f17493a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:42:0x00a2, B:46:0x00b0, B:35:0x0084, B:39:0x0090), top: B:57:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v8, types: [dy.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [dy.a] */
    @Override // ik.InterfaceC3292p
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo7629b(uw.InterfaceC7559c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.C3280d.mo7629b(uw.c):java.lang.Object");
    }

    @Override // ik.InterfaceC3292p
    /* renamed from: c */
    public final C5770a mo7630c() {
        Integer num = this.f17488e.m7635a().f17495c;
        if (num == null) {
            return null;
        }
        int i10 = C5770a.f28335d;
        return new C5770a(bb.m10551g(num.intValue(), EnumC5772c.SECONDS));
    }

    @Override // ik.InterfaceC3292p
    /* renamed from: d */
    public final Double mo7631d() {
        return this.f17488e.m7635a().f17494b;
    }
}
