package k2;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 implements Parcelable.ClassLoaderCreator {
    /* renamed from: a */
    public static e1 m8533a(Parcel parcel, ClassLoader classLoader) {
        s0 s0Var;
        if (classLoader == null) {
            classLoader = d1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            s0Var = s0.f20544c;
        } else if (i10 == 1) {
            s0Var = s0.f20547f;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(AbstractC5601a.m11232c(i10, "Unsupported MutableState policy ", " was restored"));
            }
            s0Var = s0.f20545d;
        }
        return new e1(value, s0Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m8533a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new e1[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m8533a(parcel, null);
    }
}
