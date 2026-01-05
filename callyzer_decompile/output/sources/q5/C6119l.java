package q5;

import android.app.Notification;
import android.os.Parcel;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p002c.C0805a;
import p002c.InterfaceC0807c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.l */
/* loaded from: classes.dex */
public final class C6119l {

    /* renamed from: a */
    public final String f29854a;

    /* renamed from: b */
    public final int f29855b;

    /* renamed from: c */
    public final Notification f29856c;

    public C6119l(String str, int i10, Notification notification) {
        this.f29854a = str;
        this.f29855b = i10;
        this.f29856c = notification;
    }

    /* renamed from: a */
    public final void m12155a(InterfaceC0807c interfaceC0807c) {
        String str = this.f29854a;
        int i10 = this.f29855b;
        Notification notification = this.f29856c;
        C0805a c0805a = (C0805a) interfaceC0807c;
        c0805a.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0807c.f5030a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(null);
            parcelObtain.writeInt(1);
            notification.writeToParcel(parcelObtain, 0);
            c0805a.f5028e.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f29854a);
        sb2.append(", id:");
        return AbstractC5601a.m11233d(this.f29855b, ", tag:null]", sb2);
    }
}
