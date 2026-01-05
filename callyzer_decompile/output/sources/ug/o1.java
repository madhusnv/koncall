package ug;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35727a;

    /* renamed from: b */
    public final /* synthetic */ n4 f35728b;

    /* renamed from: c */
    public final /* synthetic */ s1 f35729c;

    public /* synthetic */ o1(s1 s1Var, n4 n4Var, int i10) {
        this.f35727a = i10;
        this.f35728b = n4Var;
        this.f35729c = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f35727a) {
            case 0:
                s1 s1Var = this.f35729c;
                s1Var.f35819e.m13947B();
                s1Var.f35819e.m13962Y(this.f35728b);
                break;
            case 1:
                s1 s1Var2 = this.f35729c;
                s1Var2.f35819e.m13947B();
                h4 h4Var = s1Var2.f35819e;
                if (h4Var.f35474C != null) {
                    ArrayList arrayList = new ArrayList();
                    h4Var.f35475D = arrayList;
                    arrayList.addAll(h4Var.f35474C);
                }
                C7443n c7443n = h4Var.f35488c;
                h4.m13944U(c7443n);
                n1 n1Var = (n1) c7443n.f482a;
                n4 n4Var = this.f35728b;
                String str = n4Var.f35697a;
                AbstractC6840z.m13036g(str);
                AbstractC6840z.m13033d(str);
                c7443n.mo325M();
                c7443n.m13858N();
                try {
                    SQLiteDatabase sQLiteDatabaseB0 = c7443n.B0();
                    String[] strArr = {str};
                    int iDelete = sQLiteDatabaseB0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseB0.delete("events", "app_id=?", strArr) + sQLiteDatabaseB0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseB0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseB0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseB0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseB0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseB0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseB0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseB0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseB0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseB0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseB0.delete("upload_queue", "app_id=?", strArr);
                    if (n1Var.f35667d.m13889W(null, f0.f44813h1)) {
                        iDelete += sQLiteDatabaseB0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        v0 v0Var = n1Var.f35669f;
                        n1.m14085m(v0Var);
                        v0Var.f35870p.m14142c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e2) {
                    v0 v0Var2 = n1Var.f35669f;
                    n1.m14085m(v0Var2);
                    v0Var2.f35862f.m14142c("Error resetting analytics data. appId, error", v0.m14157U(str), e2);
                }
                if (n4Var.f35704h) {
                    h4Var.m13962Y(n4Var);
                    break;
                }
                break;
            default:
                h4 h4Var2 = this.f35729c.f35819e;
                h4Var2.m13947B();
                h4Var2.n0(this.f35728b);
                break;
        }
    }
}
