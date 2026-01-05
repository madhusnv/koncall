package wd;

import a9.C0073l;
import ae.C0120a;
import ae.C0129j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ay.C0496f;
import be.C0653h;
import c9.C0917l;
import ce.C0960a;
import ce.C0962c;
import de.C1701a;
import ge.C2571c;
import ge.C2573e;
import ge.C2577i;
import ie.InterfaceC3244a;
import iz.C3391x;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.C3992m;
import ke.C4069j;
import ke.ComponentCallbacks2C4071l;
import pg.h9;
import pg.x5;
import qw.C6361k;
import qw.C6366p;
import rw.AbstractC6663m;
import tx.c0;
import tx.m0;
import tx.u1;
import xd.AbstractC8340k;
import yd.C8619b;
import yx.AbstractC8819m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wd.f */
/* loaded from: classes.dex */
public final class C7998f {

    /* renamed from: a */
    public final Context f38446a;

    /* renamed from: b */
    public final C2571c f38447b;

    /* renamed from: c */
    public final C6366p f38448c;

    /* renamed from: d */
    public final C4069j f38449d;

    /* renamed from: e */
    public final C0917l f38450e;

    /* renamed from: f */
    public final C7994b f38451f;

    /* renamed from: g */
    public final ArrayList f38452g;

    public C7998f(Context context, C2571c c2571c, C6366p c6366p, C6366p c6366p2, C6366p c6366p3, C7994b c7994b, C4069j c4069j) {
        this.f38446a = context;
        this.f38447b = c2571c;
        this.f38448c = c6366p;
        this.f38449d = c4069j;
        u1 u1VarM13481d = c0.m13481d();
        C0496f c0496f = m0.f34659a;
        c0.m13479b(x5.m11928d(u1VarM13481d, AbstractC8819m.f42514a.f36446f).t0(new C3992m(this)));
        ComponentCallbacks2C4071l componentCallbacks2C4071l = new ComponentCallbacks2C4071l(this);
        C0917l c0917l = new C0917l(this, componentCallbacks2C4071l);
        this.f38450e = c0917l;
        C0073l c0073l = new C0073l();
        c0073l.f264a = AbstractC6663m.d0(c7994b.f38430a);
        c0073l.f265b = AbstractC6663m.d0(c7994b.f38431b);
        c0073l.f266c = AbstractC6663m.d0(c7994b.f38432c);
        c0073l.f267d = AbstractC6663m.d0(c7994b.f38433d);
        c0073l.f268e = AbstractC6663m.d0(c7994b.f38434e);
        c0073l.m216h(new C1701a(2), C3391x.class);
        int i10 = 5;
        c0073l.m216h(new C1701a(i10), String.class);
        c0073l.m216h(new C1701a(1), Uri.class);
        int i11 = 4;
        c0073l.m216h(new C1701a(i11), Uri.class);
        int i12 = 3;
        c0073l.m216h(new C1701a(i12), Integer.class);
        int i13 = 0;
        c0073l.m216h(new C1701a(i13), byte[].class);
        C0962c c0962c = new C0962c();
        ArrayList arrayList = (ArrayList) c0073l.f266c;
        arrayList.add(new C6361k(c0962c, Uri.class));
        arrayList.add(new C6361k(new C0960a(c4069j.f20928a), File.class));
        c0073l.m215g(new C0129j(c6366p3, c6366p2, c4069j.f20930c), Uri.class);
        c0073l.m215g(new C0120a(i10), File.class);
        c0073l.m215g(new C0120a(i13), Uri.class);
        c0073l.m215g(new C0120a(i12), Uri.class);
        c0073l.m215g(new C0120a(6), Uri.class);
        c0073l.m215g(new C0120a(i11), Drawable.class);
        c0073l.m215g(new C0120a(1), Bitmap.class);
        c0073l.m215g(new C0120a(2), ByteBuffer.class);
        C8619b c8619b = new C8619b(c4069j.f20931d, c4069j.f20932e);
        ArrayList arrayList2 = (ArrayList) c0073l.f268e;
        arrayList2.add(c8619b);
        List listM11688b = h9.m11688b((ArrayList) c0073l.f264a);
        this.f38451f = new C7994b(listM11688b, h9.m11688b((ArrayList) c0073l.f265b), h9.m11688b(arrayList), h9.m11688b((ArrayList) c0073l.f267d), h9.m11688b(arrayList2));
        this.f38452g = AbstractC6663m.m12753Q(new C0653h(this, componentCallbacks2C4071l, c0917l), listM11688b);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (pg.j9.m11720e(r0, r2) == r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: all -> 0x00d4, TryCatch #4 {all -> 0x00d4, blocks: (B:43:0x00c6, B:45:0x00d0, B:48:0x00d9, B:50:0x00e4, B:51:0x00e7), top: B:99:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4 A[Catch: all -> 0x00d4, TryCatch #4 {all -> 0x00d4, blocks: (B:43:0x00c6, B:45:0x00d0, B:48:0x00d9, B:50:0x00e4, B:51:0x00e7), top: B:99:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134 A[Catch: all -> 0x0152, TryCatch #2 {all -> 0x0152, blocks: (B:61:0x012e, B:63:0x0134, B:67:0x0148, B:66:0x0143, B:72:0x0154, B:74:0x0158, B:77:0x0169, B:78:0x016e), top: B:96:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154 A[Catch: all -> 0x0152, TryCatch #2 {all -> 0x0152, blocks: (B:61:0x012e, B:63:0x0134, B:67:0x0148, B:66:0x0143, B:72:0x0154, B:74:0x0158, B:77:0x0169, B:78:0x016e), top: B:96:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181 A[Catch: all -> 0x0190, TryCatch #1 {all -> 0x0190, blocks: (B:85:0x017d, B:87:0x0181, B:90:0x0192, B:91:0x019b), top: B:95:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192 A[Catch: all -> 0x0190, TryCatch #1 {all -> 0x0190, blocks: (B:85:0x017d, B:87:0x0181, B:90:0x0192, B:91:0x019b), top: B:95:0x017d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15166a(wd.C7998f r20, ge.C2577i r21, int r22, ww.AbstractC8193c r23) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.C7998f.m15166a(wd.f, ge.i, int, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public static void m15167b(C2573e c2573e, InterfaceC3244a interfaceC3244a, C7995c c7995c) {
        C2577i c2577i = c2573e.f13998b;
        if (interfaceC3244a instanceof AbstractC8340k) {
            c2577i.f14024g.getClass();
        }
        c7995c.getClass();
        c2577i.getClass();
    }
}
