package q5;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import og.vc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.u */
/* loaded from: classes.dex */
public final class C6128u implements Iterable {

    /* renamed from: a */
    public final ArrayList f29875a = new ArrayList();

    /* renamed from: b */
    public final Context f29876b;

    public C6128u(Context context) {
        this.f29876b = context;
    }

    /* renamed from: a */
    public final void m12158a(Intent intent) {
        ComponentName component = intent.getComponent();
        Context context = this.f29876b;
        if (component == null) {
            component = intent.resolveActivity(context.getPackageManager());
        }
        ArrayList arrayList = this.f29875a;
        if (component != null) {
            int size = arrayList.size();
            try {
                for (Intent intentM11015b = vc.m11015b(context, component); intentM11015b != null; intentM11015b = vc.m11015b(context, intentM11015b.getComponent())) {
                    arrayList.add(size, intentM11015b);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        arrayList.add(intent);
    }

    /* renamed from: b */
    public final PendingIntent m12159b(int i10) {
        ArrayList arrayList = this.f29875a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f29876b, i10, intentArr, 1140850688, null);
    }

    /* renamed from: c */
    public final void m12160c() {
        ArrayList arrayList = this.f29875a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f29876b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f29875a.iterator();
    }
}
