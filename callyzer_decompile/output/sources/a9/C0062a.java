package a9;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c9.C0914i;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a9.a */
/* loaded from: classes.dex */
public final class C0062a extends AbstractC0067f {

    /* renamed from: f */
    public final C0065d f244f;

    /* renamed from: g */
    public final /* synthetic */ int f245g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0062a(Context context, C0914i c0914i, int i10) {
        super(context, c0914i);
        this.f245g = i10;
        this.f244f = new C0065d(0, this);
    }

    @Override // a9.AbstractC0067f
    /* renamed from: c */
    public final Object mo182c() {
        int i10 = this.f245g;
        Object obj = this.f252b;
        boolean z6 = true;
        switch (i10) {
            case 0:
                Intent intentRegisterReceiver = ((Context) obj).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    C7077w c7077wM13371a = C7077w.m13371a();
                    int i11 = AbstractC0063b.f246a;
                    c7077wM13371a.getClass();
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) obj).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    C7077w c7077wM13371a2 = C7077w.m13371a();
                    int i12 = AbstractC0064c.f247a;
                    c7077wM13371a2.getClass();
                    return Boolean.FALSE;
                }
                float intExtra2 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intentRegisterReceiver2.getIntExtra("status", -1) != 1 && intExtra2 <= 0.15f) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                Intent intentRegisterReceiver3 = ((Context) obj).registerReceiver(null, m185g());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z6 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z6 = false;
                    }
                }
                return Boolean.valueOf(z6);
        }
    }

    @Override // a9.AbstractC0067f
    /* renamed from: e */
    public final void mo183e() {
        C7077w c7077wM13371a = C7077w.m13371a();
        int i10 = AbstractC0066e.f250a;
        c7077wM13371a.getClass();
        ((Context) this.f252b).registerReceiver(this.f244f, m185g());
    }

    @Override // a9.AbstractC0067f
    /* renamed from: f */
    public final void mo184f() {
        C7077w c7077wM13371a = C7077w.m13371a();
        int i10 = AbstractC0066e.f250a;
        c7077wM13371a.getClass();
        ((Context) this.f252b).unregisterReceiver(this.f244f);
    }

    /* renamed from: g */
    public final IntentFilter m185g() {
        switch (this.f245g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
