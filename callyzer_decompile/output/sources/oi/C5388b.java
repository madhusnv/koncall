package oi;

import android.os.Bundle;
import c9.C0917l;
import com.sun.mail.imap.IMAPStore;
import java.util.HashSet;
import k4.C4001v;
import tb.C7105p;
import ug.a2;
import ug.z1;
import yh.AbstractC8662f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oi.b */
/* loaded from: classes.dex */
public final class C5388b implements a2 {

    /* renamed from: a */
    public final /* synthetic */ int f27067a;

    /* renamed from: b */
    public final /* synthetic */ Object f27068b;

    public /* synthetic */ C5388b(int i10, Object obj) {
        this.f27067a = i10;
        this.f27068b = obj;
    }

    @Override // ug.a2
    /* renamed from: a */
    public final void mo11106a(long j6, Bundle bundle, String str, String str2) {
        int i10 = this.f27067a;
        Object obj = this.f27068b;
        switch (i10) {
            case 0:
                C0917l c0917l = (C0917l) obj;
                if (((HashSet) c0917l.f5594b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    AbstractC8662f abstractC8662f = AbstractC5387a.f27061a;
                    String strM14269g = z1.m14269g(z1.f36027c, str2, z1.f36025a);
                    if (strM14269g != null) {
                        str2 = strM14269g;
                    }
                    bundle2.putString("events", str2);
                    ((C7105p) c0917l.f5595c).m13387k(bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !AbstractC5387a.f27061a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(IMAPStore.ID_NAME, str2);
                    bundle3.putLong("timestampInMillis", j6);
                    bundle3.putBundle("params", bundle);
                    ((C7105p) ((C4001v) obj).f20704b).m13387k(bundle3);
                    break;
                }
                break;
        }
    }
}
