package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p001o.g6i;
import p001o.na8;
import p001o.oa8;

/* loaded from: classes2.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: a */
    public oa8.AbstractBinderC15742a f7157a = new BinderC2027a();

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    public class BinderC2027a extends oa8.AbstractBinderC15742a {
        public BinderC2027a() {
        }

        @Override // p001o.oa8
        public void B0(na8 na8Var) {
            if (na8Var == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.m5849a(new g6i(na8Var));
        }
    }

    /* renamed from: a */
    public abstract void m5849a(g6i g6iVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7157a;
    }
}
