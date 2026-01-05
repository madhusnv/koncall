package q3;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.c3;
import com.sun.mail.imap.IMAPStore;
import i0.EnumC3089t;
import i0.EnumC3090u;
import i0.EnumC3091v;
import i0.EnumC3092w;
import i0.InterfaceC3093x;
import i0.r2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sf.AbstractC6840z;
import ug.C7441l;
import ug.C7443n;
import ug.n1;
import ug.v0;
import ug.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q3.e */
/* loaded from: classes.dex */
public final class C6105e implements InterfaceC3093x {

    /* renamed from: a */
    public long f29810a;

    /* renamed from: b */
    public final Object f29811b;

    /* renamed from: c */
    public final Object f29812c;

    public C6105e(C7443n c7443n, String str) {
        this.f29812c = c7443n;
        AbstractC6840z.m13033d(str);
        this.f29811b = str;
        this.f29810a = -1L;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: a */
    public r2 mo7424a() {
        return (r2) this.f29812c;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: b */
    public EnumC3092w mo7425b() {
        InterfaceC3093x interfaceC3093x = (InterfaceC3093x) this.f29811b;
        return interfaceC3093x != null ? interfaceC3093x.mo7425b() : EnumC3092w.UNKNOWN;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: c */
    public long mo7426c() {
        InterfaceC3093x interfaceC3093x = (InterfaceC3093x) this.f29811b;
        if (interfaceC3093x != null) {
            return interfaceC3093x.mo7426c();
        }
        long j6 = this.f29810a;
        if (j6 != -1) {
            return j6;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* renamed from: d */
    public List m12141d() {
        ArrayList arrayList;
        C7443n c7443n = (C7443n) this.f29812c;
        ArrayList arrayList2 = new ArrayList();
        String str = (String) this.f29811b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c7443n.B0().query("raw_events", new String[]{"rowid", IMAPStore.ID_NAME, "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f29810a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j6 = cursorQuery.getLong(0);
                        long j10 = cursorQuery.getLong(3);
                        boolean z6 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j6 > this.f29810a) {
                            this.f29810a = j6;
                        }
                        try {
                            b3 b3Var = (b3) y0.z0(c3.m3187z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            b3Var.m3303b();
                            ((c3) b3Var.f6231b).m3193F(string);
                            long j11 = cursorQuery.getLong(2);
                            b3Var.m3303b();
                            ((c3) b3Var.f6231b).m3194G(j11);
                            arrayList2.add(new C7441l(j6, j10, z6, (c3) b3Var.m3306e()));
                        } catch (IOException e2) {
                            v0 v0Var = ((n1) c7443n.f482a).f35669f;
                            n1.m14085m(v0Var);
                            v0Var.f35862f.m14142c("Data loss. Failed to merge raw event. appId", v0.m14157U(str), e2);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e10) {
                v0 v0Var2 = ((n1) c7443n.f482a).f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35862f.m14142c("Data loss. Error querying raw events batch. appId", v0.m14157U(str), e10);
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: e */
    public EnumC3091v mo7427e() {
        InterfaceC3093x interfaceC3093x = (InterfaceC3093x) this.f29811b;
        return interfaceC3093x != null ? interfaceC3093x.mo7427e() : EnumC3091v.UNKNOWN;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: l */
    public EnumC3089t mo7428l() {
        InterfaceC3093x interfaceC3093x = (InterfaceC3093x) this.f29811b;
        return interfaceC3093x != null ? interfaceC3093x.mo7428l() : EnumC3089t.UNKNOWN;
    }

    @Override // i0.InterfaceC3093x
    /* renamed from: o */
    public EnumC3090u mo7430o() {
        InterfaceC3093x interfaceC3093x = (InterfaceC3093x) this.f29811b;
        return interfaceC3093x != null ? interfaceC3093x.mo7430o() : EnumC3090u.UNKNOWN;
    }

    public C6105e(C7443n c7443n, String str, long j6) {
        this.f29812c = c7443n;
        AbstractC6840z.m13033d(str);
        this.f29811b = str;
        this.f29810a = c7443n.x0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j6)}, -1L);
    }

    public C6105e() {
        EnumC6102b enumC6102b = EnumC6102b.Lsq2;
        this.f29811b = new C6104d(false, enumC6102b);
        this.f29812c = new C6104d(false, enumC6102b);
    }

    public C6105e(InterfaceC3093x interfaceC3093x, r2 r2Var, long j6) {
        this.f29811b = interfaceC3093x;
        this.f29812c = r2Var;
        this.f29810a = j6;
    }
}
