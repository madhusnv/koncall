package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p001o.j68;

/* loaded from: classes2.dex */
public abstract class ii4 implements ServiceConnection {
    private Context mApplicationContext;

    /* renamed from: o.ii4$a */
    public class C14299a extends fi4 {
        public C14299a(j68 j68Var, ComponentName componentName, Context context) {
            super(j68Var, componentName, context);
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, fi4 fi4Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new C14299a(j68.AbstractBinderC14459a.L0(iBinder), componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
