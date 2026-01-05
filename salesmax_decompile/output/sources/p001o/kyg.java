package p001o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kyg implements Iterable {

    /* renamed from: a */
    public final ArrayList f32836a = new ArrayList();

    /* renamed from: b */
    public final Context f32837b;

    /* renamed from: o.kyg$a */
    public interface InterfaceC14934a {
        Intent getSupportParentActivityIntent();
    }

    public kyg(Context context) {
        this.f32837b = context;
    }

    /* renamed from: j */
    public static kyg m36329j(Context context) {
        return new kyg(context);
    }

    /* renamed from: b */
    public kyg m36330b(Intent intent) {
        this.f32836a.add(intent);
        return this;
    }

    /* renamed from: d */
    public kyg m36331d(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f32837b.getPackageManager());
        }
        if (component != null) {
            m36333i(component);
        }
        m36330b(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public kyg m36332e(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof InterfaceC14934a ? ((InterfaceC14934a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = dsb.m23763a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f32837b.getPackageManager());
            }
            m36333i(component);
            m36330b(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: i */
    public kyg m36333i(ComponentName componentName) {
        int size = this.f32836a.size();
        try {
            Intent intentM23764b = dsb.m23764b(this.f32837b, componentName);
            while (intentM23764b != null) {
                this.f32836a.add(size, intentM23764b);
                intentM23764b = dsb.m23764b(this.f32837b, intentM23764b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f32836a.iterator();
    }

    /* renamed from: l */
    public Intent m36334l(int i) {
        return (Intent) this.f32836a.get(i);
    }

    /* renamed from: m */
    public int m36335m() {
        return this.f32836a.size();
    }

    /* renamed from: n */
    public PendingIntent m36336n(int i, int i2) {
        return m36337o(i, i2, null);
    }

    /* renamed from: o */
    public PendingIntent m36337o(int i, int i2, Bundle bundle) {
        if (this.f32836a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f32836a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f32837b, i, intentArr, i2, bundle);
    }

    /* renamed from: p */
    public void m36338p() {
        m36339q(null);
    }

    /* renamed from: q */
    public void m36339q(Bundle bundle) {
        if (this.f32836a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f32836a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (c64.startActivities(this.f32837b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f32837b.startActivity(intent);
    }
}
