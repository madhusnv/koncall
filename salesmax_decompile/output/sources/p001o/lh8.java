package p001o;

import ai.salesmax.services.model.ActiveCall;
import androidx.lifecycle.AbstractC2145n;

/* loaded from: classes.dex */
public class lh8 {

    /* renamed from: c */
    public static lh8 f33813c;

    /* renamed from: a */
    public hpb f33814a = new hpb();

    /* renamed from: b */
    public final hpb f33815b = new hpb();

    /* renamed from: c */
    public static synchronized lh8 m37214c() {
        if (f33813c == null) {
            f33813c = new lh8();
        }
        return f33813c;
    }

    /* renamed from: a */
    public void m37215a(ActiveCall activeCall) {
        this.f33815b.setValue(activeCall);
    }

    /* renamed from: b */
    public AbstractC2145n m37216b() {
        return this.f33815b;
    }
}
