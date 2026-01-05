package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes2.dex */
public interface InterfaceC1733a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    public static abstract class a extends Binder implements InterfaceC1733a {

        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        public static class C19550a implements InterfaceC1733a {

            /* renamed from: a */
            public IBinder f5236a;

            public C19550a(IBinder iBinder) {
                this.f5236a = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            /* renamed from: I */
            public void mo3536I() {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f5236a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            /* renamed from: K */
            public void mo3537K(MediaMetadataCompat mediaMetadataCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.m3696d(parcelObtain, mediaMetadataCompat, 0);
                    this.f5236a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void K0(PlaybackStateCompat playbackStateCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.m3696d(parcelObtain, playbackStateCompat, 0);
                    this.f5236a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void a0(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.m3696d(parcelObtain, parcelableVolumeInfo, 0);
                    this.f5236a.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5236a;
            }

            @Override // android.support.v4.media.session.InterfaceC1733a
            public void j0(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.m3696d(parcelObtain, bundle, 0);
                    this.f5236a.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static InterfaceC1733a L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1733a)) ? new C19550a(iBinder) : (InterfaceC1733a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    onEvent(parcel.readString(), (Bundle) b.m3695c(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    mo3536I();
                    return true;
                case 3:
                    K0((PlaybackStateCompat) b.m3695c(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    mo3537K((MediaMetadataCompat) b.m3695c(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    mo3538x(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    t0((CharSequence) b.m3695c(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    j0((Bundle) b.m3695c(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    a0((ParcelableVolumeInfo) b.m3695c(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                case 9:
                    mo3554v(parcel.readInt());
                    return true;
                case 10:
                    r0(parcel.readInt() != 0);
                    return true;
                case 11:
                    p0(parcel.readInt() != 0);
                    return true;
                case 12:
                    mo3553R(parcel.readInt());
                    return true;
                case 13:
                    mo3555w();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.a$b */
    public static class b {
        /* renamed from: c */
        public static Object m3695c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static void m3696d(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: I */
    void mo3536I();

    /* renamed from: K */
    void mo3537K(MediaMetadataCompat mediaMetadataCompat);

    void K0(PlaybackStateCompat playbackStateCompat);

    /* renamed from: R */
    void mo3553R(int i);

    void a0(ParcelableVolumeInfo parcelableVolumeInfo);

    void j0(Bundle bundle);

    void onEvent(String str, Bundle bundle);

    void p0(boolean z);

    void r0(boolean z);

    void t0(CharSequence charSequence);

    /* renamed from: v */
    void mo3554v(int i);

    /* renamed from: w */
    void mo3555w();

    /* renamed from: x */
    void mo3538x(List list);
}
