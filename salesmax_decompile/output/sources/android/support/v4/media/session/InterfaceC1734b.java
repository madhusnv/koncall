package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.InterfaceC1733a;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.api.Service;
import java.util.List;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.um5;
import p001o.wm5;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes2.dex */
public interface InterfaceC1734b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class a extends Binder implements InterfaceC1734b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        public static class C19551a implements InterfaceC1734b {

            /* renamed from: a */
            public IBinder f5237a;

            public C19551a(IBinder iBinder) {
                this.f5237a = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: F */
            public boolean mo3617F(KeyEvent keyEvent) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    b.m3702f(parcelObtain, keyEvent, 0);
                    this.f5237a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5237a;
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void b0(InterfaceC1733a interfaceC1733a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1733a);
                    this.f5237a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: c */
            public PlaybackStateCompat mo3629c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f5237a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PlaybackStateCompat) b.m3700d(parcelObtain2, PlaybackStateCompat.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: g */
            public void mo3631g() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f5237a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public MediaMetadataCompat getMetadata() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f5237a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (MediaMetadataCompat) b.m3700d(parcelObtain2, MediaMetadataCompat.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void n0(InterfaceC1733a interfaceC1733a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1733a);
                    this.f5237a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            /* renamed from: p */
            public PendingIntent mo3640p() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f5237a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PendingIntent) b.m3700d(parcelObtain2, PendingIntent.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void pause() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f5237a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC1734b
            public void stop() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f5237a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static InterfaceC1734b L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1734b)) ? new C19551a(iBinder) : (InterfaceC1734b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i) {
                case 1:
                    mo3623S(parcel.readString(), (Bundle) b.m3700d(parcel, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper) b.m3700d(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean zMo3617F = mo3617F((KeyEvent) b.m3700d(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo3617F ? 1 : 0);
                    return true;
                case 3:
                    b0(InterfaceC1733a.a.L0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    n0(InterfaceC1733a.a.L0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean zF0 = f0();
                    parcel2.writeNoException();
                    parcel2.writeInt(zF0 ? 1 : 0);
                    return true;
                case 6:
                    String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    String strMo3628b = mo3628b();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo3628b);
                    return true;
                case 8:
                    PendingIntent pendingIntentMo3640p = mo3640p();
                    parcel2.writeNoException();
                    b.m3702f(parcel2, pendingIntentMo3640p, 1);
                    return true;
                case 9:
                    long jMo3635k = mo3635k();
                    parcel2.writeNoException();
                    parcel2.writeLong(jMo3635k);
                    return true;
                case 10:
                    ParcelableVolumeInfo parcelableVolumeInfoE0 = E0();
                    parcel2.writeNoException();
                    b.m3702f(parcel2, parcelableVolumeInfoE0, 1);
                    return true;
                case 11:
                    u0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    d0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    mo3631g();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    mo3644z(parcel.readString(), (Bundle) b.m3700d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    mo3615A(parcel.readString(), (Bundle) b.m3700d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    mo3616E((Uri) b.m3700d(parcel, Uri.CREATOR), (Bundle) b.m3700d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    mo3625W(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    o0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    mo3624T();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    mo3632h(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    c0((RatingCompat) b.m3700d(parcel, RatingCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    mo3637m(parcel.readString(), (Bundle) b.m3700d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    b.m3702f(parcel2, metadata, 1);
                    return true;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    PlaybackStateCompat playbackStateCompatMo3629c = mo3629c();
                    parcel2.writeNoException();
                    b.m3702f(parcel2, playbackStateCompatMo3629c, 1);
                    return true;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    List listD0 = D0();
                    parcel2.writeNoException();
                    b.m3701e(parcel2, listD0, 1);
                    return true;
                case 30:
                    CharSequence charSequenceM0 = m0();
                    parcel2.writeNoException();
                    if (charSequenceM0 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceM0, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    b.m3702f(parcel2, extras, 1);
                    return true;
                case 32:
                    int iMo3641q = mo3641q();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo3641q);
                    return true;
                case 33:
                    mo3630f();
                    parcel2.writeNoException();
                    return true;
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    mo3642r(parcel.readString(), (Bundle) b.m3700d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    i0(parcel.readString(), (Bundle) b.m3700d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    mo3639o((Uri) b.m3700d(parcel, Uri.CREATOR), (Bundle) b.m3700d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    int iMo3636l = mo3636l();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo3636l);
                    return true;
                case 38:
                    boolean zMo3638n = mo3638n();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo3638n ? 1 : 0);
                    return true;
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    mo3634j(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    mo3626X(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    g0((MediaDescriptionCompat) b.m3700d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    mo3619J((MediaDescriptionCompat) b.m3700d(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case SignatureVisitor.EXTENDS /* 43 */:
                    e0((MediaDescriptionCompat) b.m3700d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    mo3621O(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    boolean zMo3622P = mo3622P();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo3622P ? 1 : 0);
                    return true;
                case 46:
                    y0(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    int iMo3620N = mo3620N();
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo3620N);
                    return true;
                case 48:
                    mo3627Y(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    mo3633i(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    Bundle bundleMo3643t = mo3643t();
                    parcel2.writeNoException();
                    b.m3702f(parcel2, bundleMo3643t, 1);
                    return true;
                case 51:
                    mo3618G((RatingCompat) b.m3700d(parcel, RatingCompat.CREATOR), (Bundle) b.m3700d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.b$b */
    public static class b {
        /* renamed from: d */
        public static Object m3700d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: e */
        public static void m3701e(Parcel parcel, List list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                m3702f(parcel, (Parcelable) list.get(i2), i);
            }
        }

        /* renamed from: f */
        public static void m3702f(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: A */
    void mo3615A(String str, Bundle bundle);

    List D0();

    /* renamed from: E */
    void mo3616E(Uri uri, Bundle bundle);

    ParcelableVolumeInfo E0();

    /* renamed from: F */
    boolean mo3617F(KeyEvent keyEvent);

    /* renamed from: G */
    void mo3618G(RatingCompat ratingCompat, Bundle bundle);

    /* renamed from: J */
    void mo3619J(MediaDescriptionCompat mediaDescriptionCompat, int i);

    /* renamed from: N */
    int mo3620N();

    /* renamed from: O */
    void mo3621O(int i);

    /* renamed from: P */
    boolean mo3622P();

    /* renamed from: S */
    void mo3623S(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    /* renamed from: T */
    void mo3624T();

    /* renamed from: W */
    void mo3625W(long j);

    /* renamed from: X */
    void mo3626X(boolean z);

    /* renamed from: Y */
    void mo3627Y(int i);

    /* renamed from: b */
    String mo3628b();

    void b0(InterfaceC1733a interfaceC1733a);

    /* renamed from: c */
    PlaybackStateCompat mo3629c();

    void c0(RatingCompat ratingCompat);

    void d0(int i, int i2, String str);

    void e0(MediaDescriptionCompat mediaDescriptionCompat);

    /* renamed from: f */
    void mo3630f();

    boolean f0();

    /* renamed from: g */
    void mo3631g();

    void g0(MediaDescriptionCompat mediaDescriptionCompat);

    Bundle getExtras();

    MediaMetadataCompat getMetadata();

    String getPackageName();

    /* renamed from: h */
    void mo3632h(long j);

    /* renamed from: i */
    void mo3633i(float f);

    void i0(String str, Bundle bundle);

    /* renamed from: j */
    void mo3634j(int i);

    /* renamed from: k */
    long mo3635k();

    /* renamed from: l */
    int mo3636l();

    /* renamed from: m */
    void mo3637m(String str, Bundle bundle);

    CharSequence m0();

    /* renamed from: n */
    boolean mo3638n();

    void n0(InterfaceC1733a interfaceC1733a);

    void next();

    /* renamed from: o */
    void mo3639o(Uri uri, Bundle bundle);

    void o0();

    /* renamed from: p */
    PendingIntent mo3640p();

    void pause();

    void previous();

    /* renamed from: q */
    int mo3641q();

    /* renamed from: r */
    void mo3642r(String str, Bundle bundle);

    void stop();

    /* renamed from: t */
    Bundle mo3643t();

    void u0(int i, int i2, String str);

    void y0(boolean z);

    /* renamed from: z */
    void mo3644z(String str, Bundle bundle);
}
