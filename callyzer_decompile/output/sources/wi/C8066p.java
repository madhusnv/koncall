package wi;

import a9.C0073l;
import android.content.Context;
import android.util.Log;
import cj.C0979e;
import io.C3328c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import ji.C3773g;
import l1.C4327p;
import si.C6845a;
import tb.C7105p;
import ti.C7162b;
import xi.C8386d;
import yg.C8650g;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.p */
/* loaded from: classes.dex */
public final class C8066p {

    /* renamed from: a */
    public final Context f38624a;

    /* renamed from: b */
    public final C0073l f38625b;

    /* renamed from: c */
    public final C8849i f38626c;

    /* renamed from: d */
    public final long f38627d;

    /* renamed from: e */
    public C7105p f38628e;

    /* renamed from: f */
    public C7105p f38629f;

    /* renamed from: g */
    public C8062l f38630g;

    /* renamed from: h */
    public final C8072v f38631h;

    /* renamed from: i */
    public final C0979e f38632i;

    /* renamed from: j */
    public final C6845a f38633j;

    /* renamed from: k */
    public final C6845a f38634k;

    /* renamed from: l */
    public final C8059i f38635l;

    /* renamed from: m */
    public final C7162b f38636m;

    /* renamed from: n */
    public final C4327p f38637n;

    /* renamed from: o */
    public final C8386d f38638o;

    public C8066p(C3773g c3773g, C8072v c8072v, C7162b c7162b, C0073l c0073l, C6845a c6845a, C6845a c6845a2, C0979e c0979e, C8059i c8059i, C4327p c4327p, C8386d c8386d) {
        this.f38625b = c0073l;
        c3773g.m8293a();
        this.f38624a = c3773g.f19662a;
        this.f38631h = c8072v;
        this.f38636m = c7162b;
        this.f38633j = c6845a;
        this.f38634k = c6845a2;
        this.f38632i = c0979e;
        this.f38635l = c8059i;
        this.f38637n = c4327p;
        this.f38638o = c8386d;
        this.f38627d = System.currentTimeMillis();
        this.f38626c = new C8849i(22);
    }

    /* renamed from: a */
    public final void m15204a(C3328c c3328c) throws IOException {
        File file;
        C8386d.m15552a();
        C8386d.m15552a();
        C7105p c7105p = this.f38628e;
        c7105p.getClass();
        try {
            C0979e c0979e = (C0979e) c7105p.f34291c;
            String str = (String) c7105p.f34290b;
            c0979e.getClass();
            new File((File) c0979e.f5804c, str).createNewFile();
        } catch (IOException unused) {
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            try {
                try {
                    this.f38633j.mo13043f(new C8065o(this));
                    this.f38630g.m15202f();
                } catch (Exception unused2) {
                    C8386d.m15552a();
                    C7105p c7105p2 = this.f38628e;
                    C0979e c0979e2 = (C0979e) c7105p2.f34291c;
                    String str2 = (String) c7105p2.f34290b;
                    c0979e2.getClass();
                    file = new File((File) c0979e2.f5804c, str2);
                }
                if (!c3328c.m7651f().f9645b.f9641a) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                C8062l c8062l = this.f38630g;
                c8062l.getClass();
                C8386d.m15552a();
                C8068r c8068r = c8062l.f38612n;
                if (!(c8068r != null && c8068r.f38650e.get())) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    try {
                        c8062l.m15198b(true, c3328c, true);
                        Log.isLoggable("FirebaseCrashlytics", 2);
                    } catch (Exception unused3) {
                    }
                }
                this.f38630g.m15203g(((C8650g) ((AtomicReference) c3328c.f17617i).get()).f41930a);
                C7105p c7105p3 = this.f38628e;
                C0979e c0979e3 = (C0979e) c7105p3.f34291c;
                String str3 = (String) c7105p3.f34290b;
                c0979e3.getClass();
                file = new File((File) c0979e3.f5804c, str3);
                file.delete();
            } finally {
                C8386d.m15552a();
                try {
                    C7105p c7105p4 = this.f38628e;
                    C0979e c0979e4 = (C0979e) c7105p4.f34291c;
                    String str4 = (String) c7105p4.f34290b;
                    c0979e4.getClass();
                    new File((File) c0979e4.f5804c, str4).delete();
                } catch (Exception unused4) {
                }
            }
        } catch (Exception unused5) {
        }
    }
}
