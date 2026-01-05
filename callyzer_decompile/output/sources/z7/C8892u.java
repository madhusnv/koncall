package z7;

import android.content.Context;
import d8.AbstractC1655a;
import ge.C2581m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.u */
/* loaded from: classes.dex */
public final class C8892u {

    /* renamed from: a */
    public final C4147e f42813a;

    /* renamed from: b */
    public final Context f42814b;

    /* renamed from: c */
    public final String f42815c;

    /* renamed from: f */
    public Executor f42818f;

    /* renamed from: g */
    public Executor f42819g;

    /* renamed from: h */
    public a1.c0 f42820h;

    /* renamed from: i */
    public boolean f42821i;

    /* renamed from: q */
    public boolean f42829q;

    /* renamed from: d */
    public final ArrayList f42816d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f42817e = new ArrayList();

    /* renamed from: j */
    public final EnumC8893v f42822j = EnumC8893v.AUTOMATIC;

    /* renamed from: k */
    public final long f42823k = -1;

    /* renamed from: l */
    public final C2581m f42824l = new C2581m();

    /* renamed from: m */
    public final LinkedHashSet f42825m = new LinkedHashSet();

    /* renamed from: n */
    public final LinkedHashSet f42826n = new LinkedHashSet();

    /* renamed from: o */
    public final ArrayList f42827o = new ArrayList();

    /* renamed from: p */
    public boolean f42828p = true;

    /* renamed from: r */
    public final boolean f42830r = true;

    public C8892u(Context context, Class cls, String str) {
        this.f42813a = kotlin.jvm.internal.a0.m8901a(cls);
        this.f42814b = context;
        this.f42815c = str;
    }

    /* renamed from: a */
    public final void m16385a(AbstractC1655a... abstractC1655aArr) {
        for (AbstractC1655a abstractC1655a : abstractC1655aArr) {
            Integer numValueOf = Integer.valueOf(abstractC1655a.f8164a);
            LinkedHashSet linkedHashSet = this.f42826n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(abstractC1655a.f8165b));
        }
        AbstractC1655a[] migrations = (AbstractC1655a[]) Arrays.copyOf(abstractC1655aArr, abstractC1655aArr.length);
        C2581m c2581m = this.f42824l;
        c2581m.getClass();
        AbstractC4154l.m8923f(migrations, "migrations");
        for (AbstractC1655a abstractC1655a2 : migrations) {
            c2581m.m6576a(abstractC1655a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f8, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z7.AbstractC8894w m16386b() throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.C8892u.m16386b():z7.w");
    }
}
