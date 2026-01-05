package p001o;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: classes5.dex */
public final class rwc implements ioe {

    /* renamed from: a */
    public final sx5 f44154a;

    public rwc(sx5 sx5Var) {
        this.f44154a = sx5Var;
    }

    @Override // p001o.ioe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zne mo16416b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, rec recVar) {
        return this.f44154a.m49061d(parcelFileDescriptor, i, i2, recVar);
    }

    @Override // p001o.ioe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(ParcelFileDescriptor parcelFileDescriptor, rec recVar) {
        return m47212e(parcelFileDescriptor) && this.f44154a.m49066o(parcelFileDescriptor);
    }

    /* renamed from: e */
    public final boolean m47212e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }
}
