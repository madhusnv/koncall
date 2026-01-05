package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import e1.C1903e;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xh.InterfaceC8379d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v5 implements InterfaceC8379d, z5 {

    /* renamed from: b */
    public static final g5 f6422b = new g5(3);

    /* renamed from: a */
    public final Object f6423a;

    public /* synthetic */ v5(Object obj) {
        this.f6423a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    /* renamed from: a */
    public boolean mo3295a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((z5[]) this.f6423a)[i10].mo3295a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    /* renamed from: b */
    public h6 mo3296b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            z5 z5Var = ((z5[]) this.f6423a)[i10];
            if (z5Var.mo3295a(cls)) {
                return z5Var.mo3296b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: c */
    public Object m3727c() {
        g4 g4Var = (g4) this.f6423a;
        ContentResolver contentResolver = g4Var.f6205a;
        Uri uri = g4Var.f6206b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, g4.f6204j, null, null, null);
            try {
                if (cursorQuery == null) {
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map c1903e = count <= 256 ? new C1903e(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    c1903e.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return c1903e;
                }
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException unused) {
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    /* renamed from: d */
    public void m3728d(int i10, Object obj, i6 i6Var) {
        t4 t4Var = (t4) obj;
        a5 a5Var = (a5) this.f6423a;
        a5Var.m3123l((i10 << 3) | 2);
        a5Var.m3123l(t4Var.mo3334b(i6Var));
        i6Var.mo3167e(t4Var, a5Var.f6059a);
    }

    /* renamed from: e */
    public void m3729e(int i10, Object obj, i6 i6Var) {
        a5 a5Var = (a5) this.f6423a;
        a5Var.m3114c(i10, 3);
        i6Var.mo3167e((t4) obj, a5Var.f6059a);
        a5Var.m3114c(i10, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[Catch: all -> 0x0028, TryCatch #3 {all -> 0x0028, all -> 0x006f, blocks: (B:6:0x000d, B:8:0x0011, B:10:0x001f, B:20:0x003c, B:72:0x0143, B:15:0x002b, B:17:0x0033, B:21:0x0041, B:23:0x0047, B:24:0x004b, B:71:0x013f, B:73:0x0146, B:74:0x0149, B:75:0x014a, B:25:0x004f, B:27:0x0053, B:28:0x0060, B:30:0x0066, B:35:0x0074, B:37:0x007a, B:38:0x0080, B:58:0x0123, B:59:0x0126, B:67:0x0136, B:66:0x0133, B:68:0x0137, B:69:0x013c, B:70:0x013d, B:31:0x006c, B:34:0x0072), top: B:86:0x000d }] */
    @Override // xh.InterfaceC8379d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v5.get():java.lang.Object");
    }

    public v5(int i10) {
        switch (i10) {
            case 1:
                this.f6423a = new HashMap();
                break;
            default:
                f6 f6Var = f6.f6193c;
                v5 v5Var = new v5(new z5[]{g5.f6213b, f6422b});
                Charset charset = p5.f6342a;
                this.f6423a = v5Var;
                break;
        }
    }

    public v5(a5 a5Var) {
        Charset charset = p5.f6342a;
        this.f6423a = a5Var;
        a5Var.f6059a = this;
    }
}
