package qk;

import java.sql.Date;
import java.sql.Timestamp;
import qk.C6238a;
import qk.C6239b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qk.f */
/* loaded from: classes.dex */
public abstract class AbstractC6243f {

    /* renamed from: a */
    public static final boolean f30262a;

    /* renamed from: b */
    public static final C6242e f30263b;

    /* renamed from: c */
    public static final C6242e f30264c;

    /* renamed from: d */
    public static final C6238a.a f30265d;

    /* renamed from: e */
    public static final C6239b.a f30266e;

    /* renamed from: f */
    public static final C6240c f30267f;

    static {
        boolean z6;
        try {
            Class.forName("java.sql.Date");
            z6 = true;
        } catch (ClassNotFoundException unused) {
            z6 = false;
        }
        f30262a = z6;
        if (z6) {
            f30263b = new C6242e(Date.class, 0);
            f30264c = new C6242e(Timestamp.class, 1);
            f30265d = C6238a.f30255b;
            f30266e = C6239b.f30257b;
            f30267f = C6241d.f30259b;
            return;
        }
        f30263b = null;
        f30264c = null;
        f30265d = null;
        f30266e = null;
        f30267f = null;
    }
}
