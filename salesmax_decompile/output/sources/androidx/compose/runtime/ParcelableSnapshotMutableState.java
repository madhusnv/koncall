package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p001o.id5;
import p001o.oxf;
import p001o.pxf;
import p001o.qxf;
import p001o.sq8;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableState<T> extends oxf implements Parcelable {

    /* renamed from: c */
    public static final C1924b f6234c = new C1924b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C1923a();

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    public static final class C1923a implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            pxf pxfVarM45955f;
            sq8.m48649h(parcel, "parcel");
            if (classLoader == null) {
                classLoader = C1923a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                pxfVarM45955f = qxf.m45955f();
            } else if (i == 1) {
                pxfVarM45955f = qxf.m45957h();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i + " was restored");
                }
                pxfVarM45955f = qxf.m45956g();
            }
            return new ParcelableSnapshotMutableState(value, pxfVarM45955f);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    }

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$b */
    public static final class C1924b {
        public C1924b() {
        }

        public /* synthetic */ C1924b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(Object obj, pxf pxfVar) {
        super(obj, pxfVar);
        sq8.m48649h(pxfVar, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        sq8.m48649h(parcel, "parcel");
        parcel.writeValue(getValue());
        pxf pxfVarMo34661a = mo34661a();
        if (sq8.m48644c(pxfVarMo34661a, qxf.m45955f())) {
            i2 = 0;
        } else if (sq8.m48644c(pxfVarMo34661a, qxf.m45957h())) {
            i2 = 1;
        } else {
            if (!sq8.m48644c(pxfVarMo34661a, qxf.m45956g())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
