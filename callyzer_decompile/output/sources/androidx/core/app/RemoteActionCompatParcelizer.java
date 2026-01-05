package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import r8.AbstractC6484a;
import r8.C6485b;
import r8.InterfaceC6486c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC6484a abstractC6484a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC6486c interfaceC6486cM12492h = remoteActionCompat.f2189a;
        boolean z6 = true;
        if (abstractC6484a.mo12489e(1)) {
            interfaceC6486cM12492h = abstractC6484a.m12492h();
        }
        remoteActionCompat.f2189a = (IconCompat) interfaceC6486cM12492h;
        CharSequence charSequence = remoteActionCompat.f2190b;
        if (abstractC6484a.mo12489e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C6485b) abstractC6484a).f31155e);
        }
        remoteActionCompat.f2190b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2191c;
        if (abstractC6484a.mo12489e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C6485b) abstractC6484a).f31155e);
        }
        remoteActionCompat.f2191c = charSequence2;
        remoteActionCompat.f2192d = (PendingIntent) abstractC6484a.m12491g(remoteActionCompat.f2192d, 4);
        boolean z10 = remoteActionCompat.f2193e;
        if (abstractC6484a.mo12489e(5)) {
            z10 = ((C6485b) abstractC6484a).f31155e.readInt() != 0;
        }
        remoteActionCompat.f2193e = z10;
        boolean z11 = remoteActionCompat.f2194f;
        if (!abstractC6484a.mo12489e(6)) {
            z6 = z11;
        } else if (((C6485b) abstractC6484a).f31155e.readInt() == 0) {
            z6 = false;
        }
        remoteActionCompat.f2194f = z6;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC6484a abstractC6484a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC6484a.getClass();
        IconCompat iconCompat = remoteActionCompat.f2189a;
        abstractC6484a.mo12493i(1);
        abstractC6484a.m12495k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2190b;
        abstractC6484a.mo12493i(2);
        Parcel parcel = ((C6485b) abstractC6484a).f31155e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2191c;
        abstractC6484a.mo12493i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2192d;
        abstractC6484a.mo12493i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z6 = remoteActionCompat.f2193e;
        abstractC6484a.mo12493i(5);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z10 = remoteActionCompat.f2194f;
        abstractC6484a.mo12493i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
